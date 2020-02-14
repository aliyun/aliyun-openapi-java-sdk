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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateStoreRequest extends RpcAcsRequest<CreateStoreResponse> {
	   

	private String storeName;

	private String parentId;

	private String companyId;

	private String brand;

	private String comments;

	private String groups;

	private String phone;

	private String outId;
	public CreateStoreRequest() {
		super("cloudesl", "2019-08-01", "CreateStore", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putBodyParameter("StoreName", storeName);
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putBodyParameter("ParentId", parentId);
		}
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
		if(companyId != null){
			putBodyParameter("CompanyId", companyId);
		}
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		if(brand != null){
			putBodyParameter("Brand", brand);
		}
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
		if(comments != null){
			putBodyParameter("Comments", comments);
		}
	}

	public String getGroups() {
		return this.groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
		if(groups != null){
			putBodyParameter("Groups", groups);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putBodyParameter("Phone", phone);
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putBodyParameter("OutId", outId);
		}
	}

	@Override
	public Class<CreateStoreResponse> getResponseClass() {
		return CreateStoreResponse.class;
	}

}
