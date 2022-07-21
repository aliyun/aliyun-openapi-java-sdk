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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyMetricRuleBlackListRequest extends RpcAcsRequest<ModifyMetricRuleBlackListResponse> {
	   

	private String scopeType;

	private List<String> instancess;

	private String enableEndTime;

	private String scopeValue;

	private String enableStartTime;

	private String effectiveTime;

	private String id;

	private String name;

	private String namespace;

	private List<Metrics> metricss;

	private String category;
	public ModifyMetricRuleBlackListRequest() {
		super("Cms", "2019-01-01", "ModifyMetricRuleBlackList", "cms");
		setMethod(MethodType.POST);
	}

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
		if(scopeType != null){
			putQueryParameter("ScopeType", scopeType);
		}
	}

	public List<String> getInstancess() {
		return this.instancess;
	}

	public void setInstancess(List<String> instancess) {
		this.instancess = instancess;	
		if (instancess != null) {
			for (int i = 0; i < instancess.size(); i++) {
				putQueryParameter("Instances." + (i + 1) , instancess.get(i));
			}
		}	
	}

	public String getEnableEndTime() {
		return this.enableEndTime;
	}

	public void setEnableEndTime(String enableEndTime) {
		this.enableEndTime = enableEndTime;
		if(enableEndTime != null){
			putQueryParameter("EnableEndTime", enableEndTime);
		}
	}

	public String getScopeValue() {
		return this.scopeValue;
	}

	public void setScopeValue(String scopeValue) {
		this.scopeValue = scopeValue;
		if(scopeValue != null){
			putQueryParameter("ScopeValue", scopeValue);
		}
	}

	public String getEnableStartTime() {
		return this.enableStartTime;
	}

	public void setEnableStartTime(String enableStartTime) {
		this.enableStartTime = enableStartTime;
		if(enableStartTime != null){
			putQueryParameter("EnableStartTime", enableStartTime);
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public List<Metrics> getMetricss() {
		return this.metricss;
	}

	public void setMetricss(List<Metrics> metricss) {
		this.metricss = metricss;	
		if (metricss != null) {
			for (int depth1 = 0; depth1 < metricss.size(); depth1++) {
				putQueryParameter("Metrics." + (depth1 + 1) + ".Resource" , metricss.get(depth1).getResource());
				putQueryParameter("Metrics." + (depth1 + 1) + ".MetricName" , metricss.get(depth1).getMetricName());
			}
		}	
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public static class Metrics {

		private String resource;

		private String metricName;

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}
	}

	@Override
	public Class<ModifyMetricRuleBlackListResponse> getResponseClass() {
		return ModifyMetricRuleBlackListResponse.class;
	}

}
