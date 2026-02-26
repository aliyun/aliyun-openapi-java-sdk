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
import com.aliyuncs.eventbridge.transform.v20200401.ListTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTargetsResponse extends AcsResponse {

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

		private String nextToken;

		private Integer total;

		private List<TargetsItem> targets;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
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

			private String errorsTolerance;

			private String id;

			private String eventBusName;

			private String ruleName;

			private List<ParamListItem> paramList;

			private ConcurrentConfig concurrentConfig;

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

			public String getErrorsTolerance() {
				return this.errorsTolerance;
			}

			public void setErrorsTolerance(String errorsTolerance) {
				this.errorsTolerance = errorsTolerance;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getEventBusName() {
				return this.eventBusName;
			}

			public void setEventBusName(String eventBusName) {
				this.eventBusName = eventBusName;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public List<ParamListItem> getParamList() {
				return this.paramList;
			}

			public void setParamList(List<ParamListItem> paramList) {
				this.paramList = paramList;
			}

			public ConcurrentConfig getConcurrentConfig() {
				return this.concurrentConfig;
			}

			public void setConcurrentConfig(ConcurrentConfig concurrentConfig) {
				this.concurrentConfig = concurrentConfig;
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

			public static class ConcurrentConfig {

				private Long concurrency;

				public Long getConcurrency() {
					return this.concurrency;
				}

				public void setConcurrency(Long concurrency) {
					this.concurrency = concurrency;
				}
			}
		}
	}

	@Override
	public ListTargetsResponse getInstance(UnmarshallerContext context) {
		return	ListTargetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
