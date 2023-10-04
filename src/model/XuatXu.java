/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ledin
 */
public class XuatXu {

    private Integer id;
    private String name;
    private boolean status;

    public XuatXu() {
    }

    public XuatXu(Integer id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String showStatu() {
        if (status == true) {
            return "Đang hoạt động";
        }
        return "Ngừng bán";
    }
}
