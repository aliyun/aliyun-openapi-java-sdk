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
public class UpdateOTAJobRequest extends RpcAcsRequest<UpdateOTAJobResponse> {
	   

	private String upgradeType;

	private Integer timeoutInMinutes;

	private String jobId;

	private String iotInstanceId;

	private List<String> srcVersionLists;

	private String targetSelection;

	private List<Tags> tagss;

	private Integer maximumPerMinute;
	public UpdateOTAJobRequest() {
		super("Iot", "2018-01-20", "UpdateOTAJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(String upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putQueryParameter("UpgradeType", upgradeType);
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

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
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

	public List<String> getSrcVersionLists() {
		return this.srcVersionLists;
	}

	public void setSrcVersionLists(List<String> srcVersionLists) {
		this.srcVersionLists = srcVersionLists;	
		if (srcVersionLists != null) {
			for (int i = 0; i < srcVersionLists.size(); i++) {
				putQueryParameter("SrcVersionList." + (i + 1) , srcVersionLists.get(i));
			}
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
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

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<UpdateOTAJobResponse> getResponseClass() {
		return UpdateOTAJobResponse.class;
	}

}
