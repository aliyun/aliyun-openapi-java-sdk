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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDiagnoseRequest extends RpcAcsRequest<CreateDiagnoseResponse> {
	   

	private Long resourceOwnerId;

	private String izNo;

	private String instanceTypeName;

	private String networkType;

	private Integer type;

	private String diagnoseRequestParams;

	private String diagnoseResponse;

	private String diskCategory;

	private String diagnoseRequestId;

	private List<Tag> tags;

	private String instanceChargeType;

	private String expireTime;

	private Integer amount;

	private Integer period;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String diagnoseAction;

	private String periodUnit;

	private String diagnoseErrorCode;

	private String diagnoseProduct;

	private String mark;
	public CreateDiagnoseRequest() {
		super("Ecs", "2016-03-14", "CreateDiagnose", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("IzNo", izNo);
		}
	}

	public String getInstanceTypeName() {
		return this.instanceTypeName;
	}

	public void setInstanceTypeName(String instanceTypeName) {
		this.instanceTypeName = instanceTypeName;
		if(instanceTypeName != null){
			putQueryParameter("InstanceTypeName", instanceTypeName);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getDiagnoseRequestParams() {
		return this.diagnoseRequestParams;
	}

	public void setDiagnoseRequestParams(String diagnoseRequestParams) {
		this.diagnoseRequestParams = diagnoseRequestParams;
		if(diagnoseRequestParams != null){
			putQueryParameter("DiagnoseRequestParams", diagnoseRequestParams);
		}
	}

	public String getDiagnoseResponse() {
		return this.diagnoseResponse;
	}

	public void setDiagnoseResponse(String diagnoseResponse) {
		this.diagnoseResponse = diagnoseResponse;
		if(diagnoseResponse != null){
			putQueryParameter("DiagnoseResponse", diagnoseResponse);
		}
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		if(diskCategory != null){
			putQueryParameter("DiskCategory", diskCategory);
		}
	}

	public String getDiagnoseRequestId() {
		return this.diagnoseRequestId;
	}

	public void setDiagnoseRequestId(String diagnoseRequestId) {
		this.diagnoseRequestId = diagnoseRequestId;
		if(diagnoseRequestId != null){
			putQueryParameter("DiagnoseRequestId", diagnoseRequestId);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDiagnoseAction() {
		return this.diagnoseAction;
	}

	public void setDiagnoseAction(String diagnoseAction) {
		this.diagnoseAction = diagnoseAction;
		if(diagnoseAction != null){
			putQueryParameter("DiagnoseAction", diagnoseAction);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getDiagnoseErrorCode() {
		return this.diagnoseErrorCode;
	}

	public void setDiagnoseErrorCode(String diagnoseErrorCode) {
		this.diagnoseErrorCode = diagnoseErrorCode;
		if(diagnoseErrorCode != null){
			putQueryParameter("DiagnoseErrorCode", diagnoseErrorCode);
		}
	}

	public String getDiagnoseProduct() {
		return this.diagnoseProduct;
	}

	public void setDiagnoseProduct(String diagnoseProduct) {
		this.diagnoseProduct = diagnoseProduct;
		if(diagnoseProduct != null){
			putQueryParameter("DiagnoseProduct", diagnoseProduct);
		}
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
		if(mark != null){
			putQueryParameter("Mark", mark);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateDiagnoseResponse> getResponseClass() {
		return CreateDiagnoseResponse.class;
	}

}
