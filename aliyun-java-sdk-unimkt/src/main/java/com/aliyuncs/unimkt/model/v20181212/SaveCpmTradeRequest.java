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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveCpmTradeRequest extends RpcAcsRequest<SaveCpmTradeResponse> {
	   

	private String taskType;

	private String realCostAmount;

	private String sex;

	private String costDetail;

	private String taskTag;

	private String bizType;

	private String deviceCode;

	private String v;

	private String applyPrice;

	private String chargeType;

	private String holdId;

	private String extendString;

	private String channelId;

	private Integer age;

	private String taskId;

	private String advertType;

	private String outerCode;

	private Long tradeTime;
	public SaveCpmTradeRequest() {
		super("UniMkt", "2018-12-12", "SaveCpmTrade", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRealCostAmount() {
		return this.realCostAmount;
	}

	public void setRealCostAmount(String realCostAmount) {
		this.realCostAmount = realCostAmount;
		if(realCostAmount != null){
			putQueryParameter("RealCostAmount", realCostAmount);
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

	public String getCostDetail() {
		return this.costDetail;
	}

	public void setCostDetail(String costDetail) {
		this.costDetail = costDetail;
		if(costDetail != null){
			putQueryParameter("CostDetail", costDetail);
		}
	}

	public String getTaskTag() {
		return this.taskTag;
	}

	public void setTaskTag(String taskTag) {
		this.taskTag = taskTag;
		if(taskTag != null){
			putQueryParameter("TaskTag", taskTag);
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

	public String getDeviceCode() {
		return this.deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
		if(deviceCode != null){
			putQueryParameter("DeviceCode", deviceCode);
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

	public String getApplyPrice() {
		return this.applyPrice;
	}

	public void setApplyPrice(String applyPrice) {
		this.applyPrice = applyPrice;
		if(applyPrice != null){
			putQueryParameter("ApplyPrice", applyPrice);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getHoldId() {
		return this.holdId;
	}

	public void setHoldId(String holdId) {
		this.holdId = holdId;
		if(holdId != null){
			putQueryParameter("HoldId", holdId);
		}
	}

	public String getExtendString() {
		return this.extendString;
	}

	public void setExtendString(String extendString) {
		this.extendString = extendString;
		if(extendString != null){
			putQueryParameter("ExtendString", extendString);
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

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
		if(age != null){
			putQueryParameter("Age", age.toString());
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

	public String getAdvertType() {
		return this.advertType;
	}

	public void setAdvertType(String advertType) {
		this.advertType = advertType;
		if(advertType != null){
			putQueryParameter("AdvertType", advertType);
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

	public Long getTradeTime() {
		return this.tradeTime;
	}

	public void setTradeTime(Long tradeTime) {
		this.tradeTime = tradeTime;
		if(tradeTime != null){
			putQueryParameter("TradeTime", tradeTime.toString());
		}
	}

	@Override
	public Class<SaveCpmTradeResponse> getResponseClass() {
		return SaveCpmTradeResponse.class;
	}

}
