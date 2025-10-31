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
public class PutTargetsRequest extends RpcAcsRequest<PutTargetsResponse> {
	   

	private String ruleName;

	private String eventBusName;

	@SerializedName("targets")
	private List<Targets> targets;
	public PutTargetsRequest() {
		super("eventbridge", "2020-04-01", "PutTargets");
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

		@SerializedName("DeadLetterQueue")
		private DeadLetterQueue deadLetterQueue;

		@SerializedName("Type")
		private String type;

		@SerializedName("ConcurrentConfig")
		private ConcurrentConfig concurrentConfig;

		@SerializedName("ErrorsTolerance")
		private String errorsTolerance;

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

		public DeadLetterQueue getDeadLetterQueue() {
			return this.deadLetterQueue;
		}

		public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
			this.deadLetterQueue = deadLetterQueue;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public ConcurrentConfig getConcurrentConfig() {
			return this.concurrentConfig;
		}

		public void setConcurrentConfig(ConcurrentConfig concurrentConfig) {
			this.concurrentConfig = concurrentConfig;
		}

		public String getErrorsTolerance() {
			return this.errorsTolerance;
		}

		public void setErrorsTolerance(String errorsTolerance) {
			this.errorsTolerance = errorsTolerance;
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

		public static class DeadLetterQueue {

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("Arn")
			private String arn;

			@SerializedName("Network")
			private String network;

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}
		}

		public static class ConcurrentConfig {

			@SerializedName("Concurrency")
			private Long concurrency;

			public Long getConcurrency() {
				return this.concurrency;
			}

			public void setConcurrency(Long concurrency) {
				this.concurrency = concurrency;
			}
		}
	}

	@Override
	public Class<PutTargetsResponse> getResponseClass() {
		return PutTargetsResponse.class;
	}

}
