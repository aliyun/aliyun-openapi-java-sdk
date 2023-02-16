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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.GetRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String eventBusName;

		private String ruleARN;

		private String description;

		private String filterPattern;

		private Long createdTimestamp;

		private String ruleName;

		private List<TargetsItem> targets;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEventBusName() {
			return this.eventBusName;
		}

		public void setEventBusName(String eventBusName) {
			this.eventBusName = eventBusName;
		}

		public String getRuleARN() {
			return this.ruleARN;
		}

		public void setRuleARN(String ruleARN) {
			this.ruleARN = ruleARN;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFilterPattern() {
			return this.filterPattern;
		}

		public void setFilterPattern(String filterPattern) {
			this.filterPattern = filterPattern;
		}

		public Long getCreatedTimestamp() {
			return this.createdTimestamp;
		}

		public void setCreatedTimestamp(Long createdTimestamp) {
			this.createdTimestamp = createdTimestamp;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public List<TargetsItem> getTargets() {
			return this.targets;
		}

		public void setTargets(List<TargetsItem> targets) {
			this.targets = targets;
		}

		public static class TargetsItem {

			private Map<Object,Object> detailMap;

			private String type;

			private String endpoint;

			private String pushSelector;

			private String id;

			private String pushRetryStrategy;

			private List<ParamListItem> paramList;

			private DeadLetterQueue deadLetterQueue;

			public Map<Object,Object> getDetailMap() {
				return this.detailMap;
			}

			public void setDetailMap(Map<Object,Object> detailMap) {
				this.detailMap = detailMap;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getPushSelector() {
				return this.pushSelector;
			}

			public void setPushSelector(String pushSelector) {
				this.pushSelector = pushSelector;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
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

			public DeadLetterQueue getDeadLetterQueue() {
				return this.deadLetterQueue;
			}

			public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
				this.deadLetterQueue = deadLetterQueue;
			}

			public static class ParamListItem {

				private String value;

				private String template;

				private String form;

				private String resourceKey;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getResourceKey() {
					return this.resourceKey;
				}

				public void setResourceKey(String resourceKey) {
					this.resourceKey = resourceKey;
				}
			}

			public static class DeadLetterQueue {

				private String arn;

				public String getArn() {
					return this.arn;
				}

				public void setArn(String arn) {
					this.arn = arn;
				}
			}
		}
	}

	@Override
	public GetRuleResponse getInstance(UnmarshallerContext context) {
		return	GetRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
