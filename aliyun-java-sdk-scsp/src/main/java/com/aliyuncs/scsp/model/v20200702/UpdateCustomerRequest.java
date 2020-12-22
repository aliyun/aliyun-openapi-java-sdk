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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomerRequest extends RpcAcsRequest<UpdateCustomerResponse> {
	   

	private String industry;

	private Integer outerIdType;

	private String dingding;

	private String bizType;

	private String typeCode;

	private String instanceId;

	private String contacter;

	private Long prodLineId;

	private String phone;

	private String name;

	private Long customerId;

	private String managerName;

	private String outerId;

	private String position;

	private String email;
	public UpdateCustomerRequest() {
		super("scsp", "2020-07-02", "UpdateCustomer", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putQueryParameter("Industry", industry);
		}
	}

	public Integer getOuterIdType() {
		return this.outerIdType;
	}

	public void setOuterIdType(Integer outerIdType) {
		this.outerIdType = outerIdType;
		if(outerIdType != null){
			putQueryParameter("OuterIdType", outerIdType.toString());
		}
	}

	public String getDingding() {
		return this.dingding;
	}

	public void setDingding(String dingding) {
		this.dingding = dingding;
		if(dingding != null){
			putQueryParameter("Dingding", dingding);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
		if(typeCode != null){
			putQueryParameter("TypeCode", typeCode);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getContacter() {
		return this.contacter;
	}

	public void setContacter(String contacter) {
		this.contacter = contacter;
		if(contacter != null){
			putQueryParameter("Contacter", contacter);
		}
	}

	public Long getProdLineId() {
		return this.prodLineId;
	}

	public void setProdLineId(Long prodLineId) {
		this.prodLineId = prodLineId;
		if(prodLineId != null){
			putQueryParameter("ProdLineId", prodLineId.toString());
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId.toString());
		}
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
		if(managerName != null){
			putQueryParameter("ManagerName", managerName);
		}
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
		if(outerId != null){
			putQueryParameter("OuterId", outerId);
		}
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
		if(position != null){
			putQueryParameter("Position", position);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	@Override
	public Class<UpdateCustomerResponse> getResponseClass() {
		return UpdateCustomerResponse.class;
	}

}
