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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateQuotaAlarmRequest extends RpcAcsRequest<UpdateQuotaAlarmResponse> {
	   

	private String webHook;

	private Float threshold;

	private String thresholdType;

	private Float thresholdPercent;

	private String alarmId;

	private String alarmName;
	public UpdateQuotaAlarmRequest() {
		super("quotas", "2020-05-10", "UpdateQuotaAlarm", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWebHook() {
		return this.webHook;
	}

	public void setWebHook(String webHook) {
		this.webHook = webHook;
		if(webHook != null){
			putBodyParameter("WebHook", webHook);
		}
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putBodyParameter("Threshold", threshold.toString());
		}
	}

	public String getThresholdType() {
		return this.thresholdType;
	}

	public void setThresholdType(String thresholdType) {
		this.thresholdType = thresholdType;
		if(thresholdType != null){
			putBodyParameter("ThresholdType", thresholdType);
		}
	}

	public Float getThresholdPercent() {
		return this.thresholdPercent;
	}

	public void setThresholdPercent(Float thresholdPercent) {
		this.thresholdPercent = thresholdPercent;
		if(thresholdPercent != null){
			putBodyParameter("ThresholdPercent", thresholdPercent.toString());
		}
	}

	public String getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
		if(alarmId != null){
			putBodyParameter("AlarmId", alarmId);
		}
	}

	public String getAlarmName() {
		return this.alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
		if(alarmName != null){
			putBodyParameter("AlarmName", alarmName);
		}
	}

	@Override
	public Class<UpdateQuotaAlarmResponse> getResponseClass() {
		return UpdateQuotaAlarmResponse.class;
	}

}
