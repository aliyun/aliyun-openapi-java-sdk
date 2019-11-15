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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAvailableInstancesRequest extends RpcAcsRequest<QueryAvailableInstancesResponse> {
	   

	private String productCode;

	private String subscriptionType;

	private Integer pageNum;

	private String productType;

	private Integer pageSize;

	private String renewStatus;

	private Long ownerId;

	private String endTimeStart;

	private String createTimeEnd;

	private String instanceIDs;

	private String endTimeEnd;

	private String createTimeStart;

	private String region;
	public QueryAvailableInstancesRequest() {
		super("BssOpenApi", "2017-12-14", "QueryAvailableInstances");
		setMethod(MethodType.POST);
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRenewStatus() {
		return this.renewStatus;
	}

	public void setRenewStatus(String renewStatus) {
		this.renewStatus = renewStatus;
		if(renewStatus != null){
			putQueryParameter("RenewStatus", renewStatus);
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

	public String getEndTimeStart() {
		return this.endTimeStart;
	}

	public void setEndTimeStart(String endTimeStart) {
		this.endTimeStart = endTimeStart;
		if(endTimeStart != null){
			putQueryParameter("EndTimeStart", endTimeStart);
		}
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
		if(createTimeEnd != null){
			putQueryParameter("CreateTimeEnd", createTimeEnd);
		}
	}

	public String getInstanceIDs() {
		return this.instanceIDs;
	}

	public void setInstanceIDs(String instanceIDs) {
		this.instanceIDs = instanceIDs;
		if(instanceIDs != null){
			putQueryParameter("InstanceIDs", instanceIDs);
		}
	}

	public String getEndTimeEnd() {
		return this.endTimeEnd;
	}

	public void setEndTimeEnd(String endTimeEnd) {
		this.endTimeEnd = endTimeEnd;
		if(endTimeEnd != null){
			putQueryParameter("EndTimeEnd", endTimeEnd);
		}
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
		if(createTimeStart != null){
			putQueryParameter("CreateTimeStart", createTimeStart);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<QueryAvailableInstancesResponse> getResponseClass() {
		return QueryAvailableInstancesResponse.class;
	}

}
