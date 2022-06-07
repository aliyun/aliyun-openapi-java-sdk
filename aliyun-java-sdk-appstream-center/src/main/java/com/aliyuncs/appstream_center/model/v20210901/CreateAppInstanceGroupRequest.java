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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppInstanceGroupRequest extends RpcAcsRequest<CreateAppInstanceGroupResponse> {
	   

	private String bizRegionId;

	private String productType;

	private Integer sessionTimeout;

	private String chargeResourceMode;

	private String appCenterImageId;

	@SerializedName("userInfo")
	private UserInfo userInfo;

	private Integer period;

	private Boolean autoPay;

	@SerializedName("nodePool")
	private NodePool nodePool;

	private String promotionId;

	private List<String> userss;

	private String appInstanceGroupName;

	private String periodUnit;

	private Boolean autoRenew;

	private String chargeType;
	public CreateAppInstanceGroupRequest() {
		super("appstream-center", "2021-09-01", "CreateAppInstanceGroup");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putBodyParameter("BizRegionId", bizRegionId);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public Integer getSessionTimeout() {
		return this.sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
		if(sessionTimeout != null){
			putBodyParameter("SessionTimeout", sessionTimeout.toString());
		}
	}

	public String getChargeResourceMode() {
		return this.chargeResourceMode;
	}

	public void setChargeResourceMode(String chargeResourceMode) {
		this.chargeResourceMode = chargeResourceMode;
		if(chargeResourceMode != null){
			putBodyParameter("ChargeResourceMode", chargeResourceMode);
		}
	}

	public String getAppCenterImageId() {
		return this.appCenterImageId;
	}

	public void setAppCenterImageId(String appCenterImageId) {
		this.appCenterImageId = appCenterImageId;
		if(appCenterImageId != null){
			putBodyParameter("AppCenterImageId", appCenterImageId);
		}
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;	
		if (userInfo != null) {
			putBodyParameter("UserInfo" , new Gson().toJson(userInfo));
		}	
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putBodyParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putBodyParameter("AutoPay", autoPay.toString());
		}
	}

	public NodePool getNodePool() {
		return this.nodePool;
	}

	public void setNodePool(NodePool nodePool) {
		this.nodePool = nodePool;	
		if (nodePool != null) {
			putBodyParameter("NodePool" , new Gson().toJson(nodePool));
		}	
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putBodyParameter("PromotionId", promotionId);
		}
	}

	public List<String> getUserss() {
		return this.userss;
	}

	public void setUserss(List<String> userss) {
		this.userss = userss;	
		if (userss != null) {
			for (int i = 0; i < userss.size(); i++) {
				putBodyParameter("Users." + (i + 1) , userss.get(i));
			}
		}	
	}

	public String getAppInstanceGroupName() {
		return this.appInstanceGroupName;
	}

	public void setAppInstanceGroupName(String appInstanceGroupName) {
		this.appInstanceGroupName = appInstanceGroupName;
		if(appInstanceGroupName != null){
			putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putBodyParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putBodyParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putBodyParameter("ChargeType", chargeType);
		}
	}

	public static class UserInfo {

		@SerializedName("Type")
		private String type;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class NodePool {

		@SerializedName("NodeAmount")
		private Integer nodeAmount;

		@SerializedName("NodeInstanceType")
		private String nodeInstanceType;

		@SerializedName("NodeCapacity")
		private Integer nodeCapacity;

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getNodeInstanceType() {
			return this.nodeInstanceType;
		}

		public void setNodeInstanceType(String nodeInstanceType) {
			this.nodeInstanceType = nodeInstanceType;
		}

		public Integer getNodeCapacity() {
			return this.nodeCapacity;
		}

		public void setNodeCapacity(Integer nodeCapacity) {
			this.nodeCapacity = nodeCapacity;
		}
	}

	@Override
	public Class<CreateAppInstanceGroupResponse> getResponseClass() {
		return CreateAppInstanceGroupResponse.class;
	}

}
