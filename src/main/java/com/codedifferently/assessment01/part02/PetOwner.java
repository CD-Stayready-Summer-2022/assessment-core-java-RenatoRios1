package com.codedifferently.assessment01.part02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetOwner {
    private ArrayList<Pet> pets;
    private String name;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        ArrayList<Pet> tempArrList = new ArrayList<>();
        if(pets != null){
            Collections.addAll(tempArrList, pets);
        }

        this.pets = tempArrList;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet petToRemove = null;
        for (Pet element : pets) {
            if (element.getName().equals(pet.getName())) {
                petToRemove = element;
            }
        }
        pets.remove(petToRemove);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet element: pets ){
            if(element.equals(pet)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet[] arr = getPets();
        for(int i = 0; i <= arr.length -2; i++){
            for(int j = 0; j< arr.length-2-i; j++){
                if(arr[j+1].getAge()<arr[j].getAge()){
                    Pet tempPet = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempPet;
                }
            }
        }
        return arr[0].getAge();
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet[] arr = getPets();
        for(int i = 0; i <= arr.length -2; i++){
            for(int j = 0; j< arr.length-2-i; j++){
                if(arr[j+1].getAge()<arr[j].getAge()){
                    Pet tempPet = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempPet;
                }
            }
        }
        return arr[arr.length-1].getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Pet[] arr = getPets();
        Integer sum = 0;
        for(int i = 0; i < pets.size(); i++){
            sum += arr[i].getAge();
        }
        return (float)sum/(float)arr.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        //Transfer words to string array
        if(pets.size() != 0) {
            Pet[] arr = new Pet[pets.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = pets.get(i);
            }
            return arr;
        }
        return null;
    }
}
