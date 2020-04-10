/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateWarehouseRequest extends RpcAcsRequest<CreateWarehouseResponse> {
	   

	private String code;

	private String phoneNumber;

	private String description;

	private String warehouseCategoryCode;

	private String businessModelCode;

	private String contact;

	private String address;

	private Integer disable;

	private String name;
	public CreateWarehouseRequest() {
		super("digitalstore", "2020-01-07", "CreateWarehouse", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putBodyParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getWarehouseCategoryCode() {
		return this.warehouseCategoryCode;
	}

	public void setWarehouseCategoryCode(String warehouseCategoryCode) {
		this.warehouseCategoryCode = warehouseCategoryCode;
		if(warehouseCategoryCode != null){
			putBodyParameter("WarehouseCategoryCode", warehouseCategoryCode);
		}
	}

	public String getBusinessModelCode() {
		return this.businessModelCode;
	}

	public void setBusinessModelCode(String businessModelCode) {
		this.businessModelCode = businessModelCode;
		if(businessModelCode != null){
			putBodyParameter("BusinessModelCode", businessModelCode);
		}
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
		if(contact != null){
			putBodyParameter("Contact", contact);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public Integer getDisable() {
		return this.disable;
	}

	public void setDisable(Integer disable) {
		this.disable = disable;
		if(disable != null){
			putBodyParameter("Disable", disable.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<CreateWarehouseResponse> getResponseClass() {
		return CreateWarehouseResponse.class;
	}

}
