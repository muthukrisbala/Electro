package com.electro;


import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

public class ProductSearchAction extends ActionSupport implements ServletRequestAware{
	HttpServletRequest request;
	
	
	       String fp_title="";
	       String fp_listPrice=""; 
	       String fp_offerPrice=""; 
	       String fp_memory=""; 
	       String fp_storage=""; 
	       String fp_display=""; 
	       String fp_frontCamera=""; 
	       String fp_rearCamera=""; 
	       String fp_battery="";
	       String fp_image2=""; 
	       
	       String am_title="";
	       String am_listPrice=""; 
	       String am_offerPrice=""; 
	       String am_memory=""; 
	       String am_storage=""; 
	       String am_display=""; 
	       String am_frontCamera=""; 
	       String am_rearCamera=""; 
	       String am_battery="";
	       String am_image2=""; 
	    

	//business logic
	public String execute() {
		
		String productName = getServletRequest().getParameter("name");
		
		 OSPdao dao=new OSPdao();
		 ProductDo productdo=new ProductDo();
		 productdo=dao.main(productName);
		 fp_title=productdo.getFp_Title();
		 System.out.println("Title from Action Class: "+fp_title);
		 fp_listPrice=productdo.getFp_MaximumRetailPrice(); 
		 fp_offerPrice=productdo.getFp_SellingPrice(); 
		 fp_memory=productdo.getFp_RAM(); 
		 fp_storage=productdo.getFp_Storage(); 
		 fp_display=productdo.getFp_Display(); 
		 fp_frontCamera=productdo.getFp_FrontCamera(); 
		 fp_rearCamera=productdo.getFp_RearCamera(); 
		 fp_battery=productdo.getFp_Battery();
		 fp_image2=productdo.getFp_Image2();   
		 
		 am_title=productdo.getAm_Title();
		 System.out.println("Title from Action Class: "+am_title);
		 am_listPrice=productdo.getAm_MaximumRetailPrice(); 
		 am_offerPrice=productdo.getAm_SellingPrice(); 
		 am_memory=productdo.getAm_RAM(); 
		 am_storage=productdo.getAm_Storage(); 
		 am_display=productdo.getAm_Display(); 
		 am_frontCamera=productdo.getAm_FrontCamera(); 
		 am_rearCamera=productdo.getAm_RearCamera(); 
		 am_battery=productdo.getAm_Battery();
		 am_image2=productdo.getAm_Image2();   

		return "SUCCESS";

	}
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getServletRequest() {
		return this.request;
	}


	public String getFp_title() {
		return fp_title;
	}


	public void setFp_title(String fp_title) {
		this.fp_title = fp_title;
	}


	public String getFp_listPrice() {
		return fp_listPrice;
	}


	public void setFp_listPrice(String fp_listPrice) {
		this.fp_listPrice = fp_listPrice;
	}


	public String getFp_offerPrice() {
		return fp_offerPrice;
	}


	public void setFp_offerPrice(String fp_offerPrice) {
		this.fp_offerPrice = fp_offerPrice;
	}


	public String getFp_memory() {
		return fp_memory;
	}


	public void setFp_memory(String fp_memory) {
		this.fp_memory = fp_memory;
	}


	public String getFp_storage() {
		return fp_storage;
	}


	public void setFp_storage(String fp_storage) {
		this.fp_storage = fp_storage;
	}


	public String getFp_display() {
		return fp_display;
	}


	public void setFp_display(String fp_display) {
		this.fp_display = fp_display;
	}


	public String getFp_frontCamera() {
		return fp_frontCamera;
	}


	public void setFp_frontCamera(String fp_frontCamera) {
		this.fp_frontCamera = fp_frontCamera;
	}


	public String getFp_rearCamera() {
		return fp_rearCamera;
	}


	public void setFp_rearCamera(String fp_rearCamera) {
		this.fp_rearCamera = fp_rearCamera;
	}


	public String getFp_battery() {
		return fp_battery;
	}


	public void setFp_battery(String fp_battery) {
		this.fp_battery = fp_battery;
	}


	public String getFp_image2() {
		return fp_image2;
	}


	public void setFp_image2(String fp_image2) {
		this.fp_image2 = fp_image2;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getAm_title() {
		return am_title;
	}

	public void setAm_title(String am_title) {
		this.am_title = am_title;
	}

	public String getAm_listPrice() {
		return am_listPrice;
	}

	public void setAm_listPrice(String am_listPrice) {
		this.am_listPrice = am_listPrice;
	}

	public String getAm_offerPrice() {
		return am_offerPrice;
	}

	public void setAm_offerPrice(String am_offerPrice) {
		this.am_offerPrice = am_offerPrice;
	}

	public String getAm_memory() {
		return am_memory;
	}

	public void setAm_memory(String am_memory) {
		this.am_memory = am_memory;
	}

	public String getAm_storage() {
		return am_storage;
	}

	public void setAm_storage(String am_storage) {
		this.am_storage = am_storage;
	}

	public String getAm_display() {
		return am_display;
	}

	public void setAm_display(String am_display) {
		this.am_display = am_display;
	}

	public String getAm_frontCamera() {
		return am_frontCamera;
	}

	public void setAm_frontCamera(String am_frontCamera) {
		this.am_frontCamera = am_frontCamera;
	}

	public String getAm_rearCamera() {
		return am_rearCamera;
	}

	public void setAm_rearCamera(String am_rearCamera) {
		this.am_rearCamera = am_rearCamera;
	}

	public String getAm_battery() {
		return am_battery;
	}

	public void setAm_battery(String am_battery) {
		this.am_battery = am_battery;
	}

	public String getAm_image2() {
		return am_image2;
	}

	public void setAm_image2(String am_image2) {
		this.am_image2 = am_image2;
	}

	

    
}