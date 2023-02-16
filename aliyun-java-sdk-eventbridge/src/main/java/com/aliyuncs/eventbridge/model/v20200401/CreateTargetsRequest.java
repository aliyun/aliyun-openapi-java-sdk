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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTargetsRequest extends RpcAcsRequest<CreateTargetsResponse> {
	   

	private String ruleName;

	private String eventBusName;

	@SerializedName("targets")
	private List<Targets> targets;
	public CreateTargetsRequest() {
		super("eventbridge", "2020-04-01", "CreateTargets");
		setMethod(MethodType.POST);
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putQueryParameter("EventBusName", eventBusName);
		}
	}

	public List<Targets> getTargets() {
		return this.targets;
	}

	public void setTargets(List<Targets> targets) {
		this.targets = targets;	
		if (targets != null) {
			putQueryParameter("Targets" , new Gson().toJson(targets));
		}	
	}

	public static class Targets {

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("PushRetryStrategy")
		private String pushRetryStrategy;

		@SerializedName("ParamList")
		private List<ParamListItem> paramList;

		@SerializedName("Id")
		private String id;

		@SerializedName("Type")
		private String type;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getPushRetryStrategy() {
			return this.pushRetryStrategy;
		}

		public void setPushRetryStrategy(String pushRetryStrategy) {
			this.pushRetryStrategy = pushRetryStrategy;
		}

		public List<ParamListItem> getParamList() {
			return this.paramList;
		}

		public void setParamList(List<ParamListItem> paramList) {
			this.paramList = paramList;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class ParamListItem {

			@SerializedName("Template")
			private String template;

			@SerializedName("ResourceKey")
			private String resourceKey;

			@SerializedName("Form")
			private String form;

			@SerializedName("Value")
			private String value;

			public String getTemplate() {
				return this.template;
			}

			public void setTemplate(String template) {
				this.template = template;
			}

			public String getResourceKey() {
				return this.resourceKey;
			}

			public void setResourceKey(String resourceKey) {
				this.resourceKey = resourceKey;
			}

			public String getForm() {
				return this.form;
			}

			public void setForm(String form) {
				this.form = form;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<CreateTargetsResponse> getResponseClass() {
		return CreateTargetsResponse.class;
	}

}
