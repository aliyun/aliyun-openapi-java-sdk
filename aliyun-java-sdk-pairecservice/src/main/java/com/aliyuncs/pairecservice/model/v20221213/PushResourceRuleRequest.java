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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushResourceRuleRequest extends RoaAcsRequest<PushResourceRuleResponse> {
	   

	private String resourceRuleId;

	private String instanceId;

	private String metricInfo;
	public PushResourceRuleRequest() {
		super("PaiRecService", "2022-12-13", "PushResourceRule");
		setUriPattern("/api/v1/resourcerules/[ResourceRuleId]/action/push");
		setMethod(MethodType.POST);
	}

	public String getResourceRuleId() {
		return this.resourceRuleId;
	}

	public void setResourceRuleId(String resourceRuleId) {
		this.resourceRuleId = resourceRuleId;
		if(resourceRuleId != null){
			putPathParameter("ResourceRuleId", resourceRuleId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getMetricInfo() {
		return this.metricInfo;
	}

	public void setMetricInfo(String metricInfo) {
		this.metricInfo = metricInfo;
		if(metricInfo != null){
			putQueryParameter("MetricInfo", metricInfo);
		}
	}

	@Override
	public Class<PushResourceRuleResponse> getResponseClass() {
		return PushResourceRuleResponse.class;
	}

}
