package com.nf147.ssm.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

public class Pet {

    private Integer petId;

    private Integer categoryId;

    @NotBlank
    private String petName;

    private BigDecimal petPrice;

    private String petStatus;

    private Category category;

    private List<Photo> photoList;

    private List<Tag> tagList;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_id
     *
     * @return the value of pet.pet_id
     *
     * @mbg.generated
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_id
     *
     * @param petId the value for pet.pet_id
     *
     * @mbg.generated
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.category_id
     *
     * @return the value of pet.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.category_id
     *
     * @param categoryId the value for pet.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_name
     *
     * @return the value of pet.pet_name
     *
     * @mbg.generated
     */
    public String getPetName() {
        return petName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_name
     *
     * @param petName the value for pet.pet_name
     *
     * @mbg.generated
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_price
     *
     * @return the value of pet.pet_price
     *
     * @mbg.generated
     */
    public BigDecimal getPetPrice() {
        return petPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_price
     *
     * @param petPrice the value for pet.pet_price
     *
     * @mbg.generated
     */
    public void setPetPrice(BigDecimal petPrice) {
        this.petPrice = petPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_status
     *
     * @return the value of pet.pet_status
     *
     * @mbg.generated
     */
    public String getPetStatus() {
        return petStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_status
     *
     * @param petStatus the value for pet.pet_status
     *
     * @mbg.generated
     */
    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus == null ? null : petStatus.trim();
    }
}