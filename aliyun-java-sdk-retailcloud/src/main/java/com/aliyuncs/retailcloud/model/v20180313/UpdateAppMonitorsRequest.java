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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppMonitorsRequest extends RpcAcsRequest<UpdateAppMonitorsResponse> {
	   

	private Long mainUserId;

	private String silenceTime;

	private List<Long> monitorIdss;

	private Long templateId;
	public UpdateAppMonitorsRequest() {
		super("retailcloud", "2018-03-13", "UpdateAppMonitors", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMainUserId() {
		return this.mainUserId;
	}

	public void setMainUserId(Long mainUserId) {
		this.mainUserId = mainUserId;
		if(mainUserId != null){
			putBodyParameter("MainUserId", mainUserId.toString());
		}
	}

	public String getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(String silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putBodyParameter("SilenceTime", silenceTime);
		}
	}

	public List<Long> getMonitorIdss() {
		return this.monitorIdss;
	}

	public void setMonitorIdss(List<Long> monitorIdss) {
		this.monitorIdss = monitorIdss;	
		if (monitorIdss != null) {
			for (int i = 0; i < monitorIdss.size(); i++) {
				putBodyParameter("MonitorIds." + (i + 1) , monitorIdss.get(i));
			}
		}	
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	@Override
	public Class<UpdateAppMonitorsResponse> getResponseClass() {
		return UpdateAppMonitorsResponse.class;
	}

}
