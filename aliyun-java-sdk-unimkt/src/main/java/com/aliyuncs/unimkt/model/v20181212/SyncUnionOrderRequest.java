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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SyncUnionOrderRequest extends RpcAcsRequest<SyncUnionOrderResponse> {
	   

	private String proxyChannelId;

	private String taskType;

	private Long realCostAmount;

	private String taskBizType;

	private String sex;

	private Long brandUserId;

	private String brandName;

	private Long proxyUserId;

	private String deviceId;

	private String holderId;

	private String bizSerialNumber;

	private String taskRuleType;

	private String v;

	private Integer industryLabelBagId;

	private Long applyPrice;

	private String extendInfo;

	private String channelId;

	private Integer age;

	private Long taskId;

	private String status;
	public SyncUnionOrderRequest() {
		super("UniMkt", "2018-12-12", "SyncUnionOrder", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyChannelId() {
		return this.proxyChannelId;
	}

	public void setProxyChannelId(String proxyChannelId) {
		this.proxyChannelId = proxyChannelId;
		if(proxyChannelId != null){
			putQueryParameter("ProxyChannelId", proxyChannelId);
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

	public Long getRealCostAmount() {
		return this.realCostAmount;
	}

	public void setRealCostAmount(Long realCostAmount) {
		this.realCostAmount = realCostAmount;
		if(realCostAmount != null){
			putQueryParameter("RealCostAmount", realCostAmount.toString());
		}
	}

	public String getTaskBizType() {
		return this.taskBizType;
	}

	public void setTaskBizType(String taskBizType) {
		this.taskBizType = taskBizType;
		if(taskBizType != null){
			putQueryParameter("TaskBizType", taskBizType);
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

	public Long getBrandUserId() {
		return this.brandUserId;
	}

	public void setBrandUserId(Long brandUserId) {
		this.brandUserId = brandUserId;
		if(brandUserId != null){
			putQueryParameter("BrandUserId", brandUserId.toString());
		}
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
		if(brandName != null){
			putQueryParameter("BrandName", brandName);
		}
	}

	public Long getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(Long proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId.toString());
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
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

	public String getBizSerialNumber() {
		return this.bizSerialNumber;
	}

	public void setBizSerialNumber(String bizSerialNumber) {
		this.bizSerialNumber = bizSerialNumber;
		if(bizSerialNumber != null){
			putQueryParameter("BizSerialNumber", bizSerialNumber);
		}
	}

	public String getTaskRuleType() {
		return this.taskRuleType;
	}

	public void setTaskRuleType(String taskRuleType) {
		this.taskRuleType = taskRuleType;
		if(taskRuleType != null){
			putQueryParameter("TaskRuleType", taskRuleType);
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

	public Integer getIndustryLabelBagId() {
		return this.industryLabelBagId;
	}

	public void setIndustryLabelBagId(Integer industryLabelBagId) {
		this.industryLabelBagId = industryLabelBagId;
		if(industryLabelBagId != null){
			putQueryParameter("IndustryLabelBagId", industryLabelBagId.toString());
		}
	}

	public Long getApplyPrice() {
		return this.applyPrice;
	}

	public void setApplyPrice(Long applyPrice) {
		this.applyPrice = applyPrice;
		if(applyPrice != null){
			putQueryParameter("ApplyPrice", applyPrice.toString());
		}
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
		if(extendInfo != null){
			putQueryParameter("ExtendInfo", extendInfo);
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<SyncUnionOrderResponse> getResponseClass() {
		return SyncUnionOrderResponse.class;
	}

}
