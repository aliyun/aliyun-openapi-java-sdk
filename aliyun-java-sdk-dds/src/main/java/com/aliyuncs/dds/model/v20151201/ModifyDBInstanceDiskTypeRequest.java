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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceDiskTypeRequest extends RpcAcsRequest<ModifyDBInstanceDiskTypeResponse> {
	   

	private Long resourceOwnerId;

	private String extraParam;

	private String couponNo;

	private String dBInstanceId;

	private String dbInstanceStorageType;

	private String businessInfo;

	private Boolean autoPay;

	private Long provisionedIops;

	private String autoRenew;

	private String orderType;
	public ModifyDBInstanceDiskTypeRequest() {
		super("Dds", "2015-12-01", "ModifyDBInstanceDiskType", "dds");
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

	public String getExtraParam() {
		return this.extraParam;
	}

	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
		if(extraParam != null){
			putQueryParameter("ExtraParam", extraParam);
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getDbInstanceStorageType() {
		return this.dbInstanceStorageType;
	}

	public void setDbInstanceStorageType(String dbInstanceStorageType) {
		this.dbInstanceStorageType = dbInstanceStorageType;
		if(dbInstanceStorageType != null){
			putQueryParameter("DbInstanceStorageType", dbInstanceStorageType);
		}
	}

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Long getProvisionedIops() {
		return this.provisionedIops;
	}

	public void setProvisionedIops(Long provisionedIops) {
		this.provisionedIops = provisionedIops;
		if(provisionedIops != null){
			putQueryParameter("ProvisionedIops", provisionedIops.toString());
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<ModifyDBInstanceDiskTypeResponse> getResponseClass() {
		return ModifyDBInstanceDiskTypeResponse.class;
	}

}
