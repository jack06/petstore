package com.nf147.ssm.entity;

public class Inventories {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventories.inventories_id
     *
     * @mbg.generated
     */
    private Integer inventoriesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventories.inventories_quantity
     *
     * @mbg.generated
     */
    private Integer inventoriesQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventories.pet_id
     *
     * @mbg.generated
     */
    private Integer petId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventories.inventories_id
     *
     * @return the value of inventories.inventories_id
     *
     * @mbg.generated
     */
    public Integer getInventoriesId() {
        return inventoriesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventories.inventories_id
     *
     * @param inventoriesId the value for inventories.inventories_id
     *
     * @mbg.generated
     */
    public void setInventoriesId(Integer inventoriesId) {
        this.inventoriesId = inventoriesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventories.inventories_quantity
     *
     * @return the value of inventories.inventories_quantity
     *
     * @mbg.generated
     */
    public Integer getInventoriesQuantity() {
        return inventoriesQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventories.inventories_quantity
     *
     * @param inventoriesQuantity the value for inventories.inventories_quantity
     *
     * @mbg.generated
     */
    public void setInventoriesQuantity(Integer inventoriesQuantity) {
        this.inventoriesQuantity = inventoriesQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventories.pet_id
     *
     * @return the value of inventories.pet_id
     *
     * @mbg.generated
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventories.pet_id
     *
     * @param petId the value for inventories.pet_id
     *
     * @mbg.generated
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}