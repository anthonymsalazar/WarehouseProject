package com.skillstorm.controllers;

import java.util.LinkedList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.OldNavy;
import com.skillstorm.repositories.OldNavyRepository;
import com.skillstorm.services.OldNavyServices;

@RestController
@RequestMapping("/oldnavy")
@CrossOrigin("*")
public class OldNavyController {

	@Autowired
	private OldNavyRepository repo;

	@Autowired
	private OldNavyServices serv;

	@GetMapping
	public Iterable<OldNavy> getAllOldNavyItems(@RequestParam(name = "sizeSearch", required = false) String sizeSearchString,
												   		 @RequestParam(name = "colorSearch", required = false) String colorSearchString) {
		if (sizeSearchString != null) {
			return repo.findBySizeSearchString(sizeSearchString);
		} else if (colorSearchString != null) {
			return repo.findByColorSearchString(colorSearchString);
		} else {
			return repo.findAll();
		}
	}
	@GetMapping("/{id}")
	public OldNavy getItemById(@PathVariable int id) {
		Optional<OldNavy> result = repo.findById(id);
		if (result.isPresent())
			return result.get();
		else
			return null;
	}

	@PostMapping
	public ResponseEntity<String> addItem(@RequestBody OldNavy item){
		if (repo.existsById(item.getClothingId())) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Item with clothing ID " + item.getClothingId() + "already exists");
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(item).getClothingId() + " has been inserted");
		}
	}

	@PostMapping("/multiple")
	public ResponseEntity<LinkedList[]> addMultipleItems(@RequestBody OldNavy[] items){
		LinkedList[] temp = {new LinkedList<Integer>(), new LinkedList<Integer>()};
		if (items == null || items.length == 0) {
			return ResponseEntity.status(400).body(null);
		} else {
			for (OldNavy item : items) {
				if (repo.findById(item.getClothingId()).isPresent()) {
					temp[1].add(item.getClothingId());
				} else {
					temp[0].add(serv.oldNavyCheck(item).getClothingId());
				}
			}
			return ResponseEntity.status(200).body(temp);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateItem(@RequestBody int id,
											  @RequestParam(name = "color", required = false) String color,
											  @RequestParam(name = "size", required = false) String size,
											  @RequestParam(name = "style", required = false) String style,
											  @RequestParam(name = "quantity", required = false) String quantity,
											  @RequestParam(name = "price", required = false) String price){
		if(repo.findById(id).isPresent()) {

			OldNavy temp = repo.findById(id).get();
			if(color != null) {
				temp.setColor(color);
			}
			if(size != null) {
				temp.setSize(size);
			}
			if(style != null) {
				temp.setStyle(style);
			}
			if(quantity != null) {
				temp.setQuantity(Integer.valueOf(quantity));
			}
			if(price != null) {
				temp.setPrice(Double.valueOf(price));
			}
			repo.save(temp);
			return ResponseEntity.status(HttpStatus.OK).body("Item with clothing ID " + repo.save(temp).getClothingId() + " has been updated");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Item with clothing ID " + id + "already exists");
		}
	}

	@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItemByPathId(@PathVariable int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Item with clothing ID of " + id + " was successfully deleted");
        } else { 
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Item with clothing ID of " + id + " does not exist");
        }
	}

	@DeleteMapping
    public ResponseEntity<String> deleteItemByBodyContent(@RequestBody OldNavy item) {
        if (repo.findById(item.getClothingId()).isPresent() &&
                item.equals(repo.findById(item.getClothingId()).get())) {
            repo.delete(item);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Item sent was successfully deleted");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Item sent does not exist");
        }
    }
}
