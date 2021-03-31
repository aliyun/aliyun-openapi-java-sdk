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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAlertRuleRequest extends RpcAcsRequest<UpdateAlertRuleResponse> {
	   

	private Boolean isAutoStart;

	private String contactGroupIds;

	private Long alertId;

	private String templageAlertConfig;
	public UpdateAlertRuleRequest() {
		super("ARMS", "2019-08-08", "UpdateAlertRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsAutoStart() {
		return this.isAutoStart;
	}

	public void setIsAutoStart(Boolean isAutoStart) {
		this.isAutoStart = isAutoStart;
		if(isAutoStart != null){
			putQueryParameter("IsAutoStart", isAutoStart.toString());
		}
	}

	public String getContactGroupIds() {
		return this.contactGroupIds;
	}

	public void setContactGroupIds(String contactGroupIds) {
		this.contactGroupIds = contactGroupIds;
		if(contactGroupIds != null){
			putQueryParameter("ContactGroupIds", contactGroupIds);
		}
	}

	public Long getAlertId() {
		return this.alertId;
	}

	public void setAlertId(Long alertId) {
		this.alertId = alertId;
		if(alertId != null){
			putQueryParameter("AlertId", alertId.toString());
		}
	}

	public String getTemplageAlertConfig() {
		return this.templageAlertConfig;
	}

	public void setTemplageAlertConfig(String templageAlertConfig) {
		this.templageAlertConfig = templageAlertConfig;
		if(templageAlertConfig != null){
			putQueryParameter("TemplageAlertConfig", templageAlertConfig);
		}
	}

	@Override
	public Class<UpdateAlertRuleResponse> getResponseClass() {
		return UpdateAlertRuleResponse.class;
	}

}
