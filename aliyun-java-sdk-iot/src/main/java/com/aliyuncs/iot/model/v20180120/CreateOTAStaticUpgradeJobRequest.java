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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOTAStaticUpgradeJobRequest extends RpcAcsRequest<CreateOTAStaticUpgradeJobResponse> {
	   

	private Integer retryCount;

	private Integer timeoutInMinutes;

	private String iotInstanceId;

	private String targetSelection;

	private String grayPercent;

	private String firmwareId;

	private String productKey;

	private Integer retryInterval;

	private List<String> srcVersions;

	private Long scheduleTime;

	private Integer maximumPerMinute;

	private List<String> targetDeviceNames;
	public CreateOTAStaticUpgradeJobRequest() {
		super("Iot", "2018-01-20", "CreateOTAStaticUpgradeJob", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
		if(retryCount != null){
			putQueryParameter("RetryCount", retryCount.toString());
		}
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
		if(timeoutInMinutes != null){
			putQueryParameter("TimeoutInMinutes", timeoutInMinutes.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getTargetSelection() {
		return this.targetSelection;
	}

	public void setTargetSelection(String targetSelection) {
		this.targetSelection = targetSelection;
		if(targetSelection != null){
			putQueryParameter("TargetSelection", targetSelection);
		}
	}

	public String getGrayPercent() {
		return this.grayPercent;
	}

	public void setGrayPercent(String grayPercent) {
		this.grayPercent = grayPercent;
		if(grayPercent != null){
			putQueryParameter("GrayPercent", grayPercent);
		}
	}

	public String getFirmwareId() {
		return this.firmwareId;
	}

	public void setFirmwareId(String firmwareId) {
		this.firmwareId = firmwareId;
		if(firmwareId != null){
			putQueryParameter("FirmwareId", firmwareId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Integer getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Integer retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
		}
	}

	public List<String> getSrcVersions() {
		return this.srcVersions;
	}

	public void setSrcVersions(List<String> srcVersions) {
		this.srcVersions = srcVersions;	
		if (srcVersions != null) {
			for (int i = 0; i < srcVersions.size(); i++) {
				putQueryParameter("SrcVersion." + (i + 1) , srcVersions.get(i));
			}
		}	
	}

	public Long getScheduleTime() {
		return this.scheduleTime;
	}

	public void setScheduleTime(Long scheduleTime) {
		this.scheduleTime = scheduleTime;
		if(scheduleTime != null){
			putQueryParameter("ScheduleTime", scheduleTime.toString());
		}
	}

	public Integer getMaximumPerMinute() {
		return this.maximumPerMinute;
	}

	public void setMaximumPerMinute(Integer maximumPerMinute) {
		this.maximumPerMinute = maximumPerMinute;
		if(maximumPerMinute != null){
			putQueryParameter("MaximumPerMinute", maximumPerMinute.toString());
		}
	}

	public List<String> getTargetDeviceNames() {
		return this.targetDeviceNames;
	}

	public void setTargetDeviceNames(List<String> targetDeviceNames) {
		this.targetDeviceNames = targetDeviceNames;	
		if (targetDeviceNames != null) {
			for (int i = 0; i < targetDeviceNames.size(); i++) {
				putQueryParameter("TargetDeviceName." + (i + 1) , targetDeviceNames.get(i));
			}
		}	
	}

	@Override
	public Class<CreateOTAStaticUpgradeJobResponse> getResponseClass() {
		return CreateOTAStaticUpgradeJobResponse.class;
	}

}
