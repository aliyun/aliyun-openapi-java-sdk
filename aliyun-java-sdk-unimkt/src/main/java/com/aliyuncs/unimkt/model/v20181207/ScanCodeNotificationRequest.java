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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScanCodeNotificationRequest extends RpcAcsRequest<ScanCodeNotificationResponse> {
	   

	private String realCostAmount;

	private Integer salePrice;

	private String commodityId;

	private String holderId;

	private String deviceType;

	private String deviceCode;

	private Integer applyPrice;

	private String taskId;

	private String outerCode;

	private String queryStr;

	private String phase;

	private String bizResult;

	private String taskType;

	private String brandUserId;

	private String sex;

	private String proxyUserId;

	private String alipayOpenId;

	private String bizType;

	private String brandNick;

	private String v;

	private String chargeTag;

	private Integer age;

	private String channelId;

	private String cid;
	public ScanCodeNotificationRequest() {
		super("UniMkt", "2018-12-07", "ScanCodeNotification", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRealCostAmount() {
		return this.realCostAmount;
	}

	public void setRealCostAmount(String realCostAmount) {
		this.realCostAmount = realCostAmount;
		if(realCostAmount != null){
			putQueryParameter("RealCostAmount", realCostAmount);
		}
	}

	public Integer getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
		if(salePrice != null){
			putQueryParameter("SalePrice", salePrice.toString());
		}
	}

	public String getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
		if(commodityId != null){
			putQueryParameter("CommodityId", commodityId);
		}
	}

	public String getHolderId() {
		return this.holderId;
	}

	public void setHolderId(String holderId) {
		this.holderId = holderId;
		if(holderId != null){
			putQueryParameter("HolderId", holderId);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
		}
	}

	public String getDeviceCode() {
		return this.deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
		if(deviceCode != null){
			putQueryParameter("DeviceCode", deviceCode);
		}
	}

	public Integer getApplyPrice() {
		return this.applyPrice;
	}

	public void setApplyPrice(Integer applyPrice) {
		this.applyPrice = applyPrice;
		if(applyPrice != null){
			putQueryParameter("ApplyPrice", applyPrice.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
		if(outerCode != null){
			putQueryParameter("OuterCode", outerCode);
		}
	}

	public String getQueryStr() {
		return this.queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
		if(queryStr != null){
			putQueryParameter("QueryStr", queryStr);
		}
	}

	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
		if(phase != null){
			putQueryParameter("Phase", phase);
		}
	}

	public String getBizResult() {
		return this.bizResult;
	}

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
		if(bizResult != null){
			putQueryParameter("BizResult", bizResult);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public String getBrandUserId() {
		return this.brandUserId;
	}

	public void setBrandUserId(String brandUserId) {
		this.brandUserId = brandUserId;
		if(brandUserId != null){
			putQueryParameter("BrandUserId", brandUserId);
		}
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
		if(sex != null){
			putQueryParameter("Sex", sex);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId);
		}
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
		if(alipayOpenId != null){
			putQueryParameter("AlipayOpenId", alipayOpenId);
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

	public String getBrandNick() {
		return this.brandNick;
	}

	public void setBrandNick(String brandNick) {
		this.brandNick = brandNick;
		if(brandNick != null){
			putQueryParameter("BrandNick", brandNick);
		}
	}

	public String getV() {
		return this.v;
	}

	public void setV(String v) {
		this.v = v;
		if(v != null){
			putQueryParameter("V", v);
		}
	}

	public String getChargeTag() {
		return this.chargeTag;
	}

	public void setChargeTag(String chargeTag) {
		this.chargeTag = chargeTag;
		if(chargeTag != null){
			putQueryParameter("ChargeTag", chargeTag);
		}
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
		if(age != null){
			putQueryParameter("Age", age.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
		if(cid != null){
			putQueryParameter("Cid", cid);
		}
	}

	@Override
	public Class<ScanCodeNotificationResponse> getResponseClass() {
		return ScanCodeNotificationResponse.class;
	}

}
