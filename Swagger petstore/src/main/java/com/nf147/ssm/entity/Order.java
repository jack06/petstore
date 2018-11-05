package com.nf147.ssm.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pet_id
     *
     * @mbg.generated
     */
    private Integer petId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_quantity
     *
     * @mbg.generated
     */
    private Integer orderQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_shipDate
     *
     * @mbg.generated
     */
    private String orderShipdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_status
     *
     * @mbg.generated
     */
    @Enumerated(EnumType.STRING)
    private String orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_complete
     *
     * @mbg.generated
     */
    private byte[] orderComplete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderId the value for order.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pet_id
     *
     * @return the value of order.pet_id
     *
     * @mbg.generated
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pet_id
     *
     * @param petId the value for order.pet_id
     *
     * @mbg.generated
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_quantity
     *
     * @return the value of order.order_quantity
     *
     * @mbg.generated
     */
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_quantity
     *
     * @param orderQuantity the value for order.order_quantity
     *
     * @mbg.generated
     */
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_shipDate
     *
     * @return the value of order.order_shipDate
     *
     * @mbg.generated
     */
    public String getOrderShipdate() {
        return orderShipdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_shipDate
     *
     * @param orderShipdate the value for order.order_shipDate
     *
     * @mbg.generated
     */
    public void setOrderShipdate(String orderShipdate) {
        this.orderShipdate = orderShipdate == null ? null : orderShipdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_status
     *
     * @return the value of order.order_status
     *
     * @mbg.generated
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_status
     *
     * @param orderStatus the value for order.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_complete
     *
     * @return the value of order.order_complete
     *
     * @mbg.generated
     */
    public byte[] getOrderComplete() {
        return orderComplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_complete
     *
     * @param orderComplete the value for order.order_complete
     *
     * @mbg.generated
     */
    public void setOrderComplete(byte[] orderComplete) {
        this.orderComplete = orderComplete;
    }
}