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
public class CreateOTADynamicUpgradeJobRequest extends RpcAcsRequest<CreateOTADynamicUpgradeJobResponse> {
	   

	private Integer retryCount;

	private String firmwareId;

	private String productKey;

	private Integer timeoutInMinutes;

	private Integer retryInterval;

	private List<String> srcVersions;

	private String iotInstanceId;

	private Integer maximumPerMinute;
	public CreateOTADynamicUpgradeJobRequest() {
		super("Iot", "2018-01-20", "CreateOTADynamicUpgradeJob", "Iot");
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

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
		if(timeoutInMinutes != null){
			putQueryParameter("TimeoutInMinutes", timeoutInMinutes.toString());
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	@Override
	public Class<CreateOTADynamicUpgradeJobResponse> getResponseClass() {
		return CreateOTADynamicUpgradeJobResponse.class;
	}

}
