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
import com.aliyuncs.eventbridge.transform.v20200401.ListUserDefinedEventSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserDefinedEventSourcesResponse extends AcsResponse {

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

		private Float total;

		private List<EventSourceListItem> eventSourceList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Float getTotal() {
			return this.total;
		}

		public void setTotal(Float total) {
			this.total = total;
		}

		public List<EventSourceListItem> getEventSourceList() {
			return this.eventSourceList;
		}

		public void setEventSourceList(List<EventSourceListItem> eventSourceList) {
			this.eventSourceList = eventSourceList;
		}

		public static class EventSourceListItem {

			private String name;

			private String arn;

			private String status;

			private String type;

			private Float ctime;

			private String description;

			private Boolean linkedExternalSource;

			private String externalSourceType;

			private Map<Object,Object> externalSourceConfig;

			private String eventBusName;

			private SourceMNSParameters sourceMNSParameters;

			private SourceRocketMQParameters sourceRocketMQParameters;

			private SourceRabbitMQParameters sourceRabbitMQParameters;

			private SourceSLSParameters sourceSLSParameters;

			private SourceHttpEventParameters sourceHttpEventParameters;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Float getCtime() {
				return this.ctime;
			}

			public void setCtime(Float ctime) {
				this.ctime = ctime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getLinkedExternalSource() {
				return this.linkedExternalSource;
			}

			public void setLinkedExternalSource(Boolean linkedExternalSource) {
				this.linkedExternalSource = linkedExternalSource;
			}

			public String getExternalSourceType() {
				return this.externalSourceType;
			}

			public void setExternalSourceType(String externalSourceType) {
				this.externalSourceType = externalSourceType;
			}

			public Map<Object,Object> getExternalSourceConfig() {
				return this.externalSourceConfig;
			}

			public void setExternalSourceConfig(Map<Object,Object> externalSourceConfig) {
				this.externalSourceConfig = externalSourceConfig;
			}

			public String getEventBusName() {
				return this.eventBusName;
			}

			public void setEventBusName(String eventBusName) {
				this.eventBusName = eventBusName;
			}

			public SourceMNSParameters getSourceMNSParameters() {
				return this.sourceMNSParameters;
			}

			public void setSourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
				this.sourceMNSParameters = sourceMNSParameters;
			}

			public SourceRocketMQParameters getSourceRocketMQParameters() {
				return this.sourceRocketMQParameters;
			}

			public void setSourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
				this.sourceRocketMQParameters = sourceRocketMQParameters;
			}

			public SourceRabbitMQParameters getSourceRabbitMQParameters() {
				return this.sourceRabbitMQParameters;
			}

			public void setSourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
				this.sourceRabbitMQParameters = sourceRabbitMQParameters;
			}

			public SourceSLSParameters getSourceSLSParameters() {
				return this.sourceSLSParameters;
			}

			public void setSourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
				this.sourceSLSParameters = sourceSLSParameters;
			}

			public SourceHttpEventParameters getSourceHttpEventParameters() {
				return this.sourceHttpEventParameters;
			}

			public void setSourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
				this.sourceHttpEventParameters = sourceHttpEventParameters;
			}

			public static class SourceMNSParameters {

				private String regionId;

				private String queueName;

				private Boolean isBase64Decode;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getQueueName() {
					return this.queueName;
				}

				public void setQueueName(String queueName) {
					this.queueName = queueName;
				}

				public Boolean getIsBase64Decode() {
					return this.isBase64Decode;
				}

				public void setIsBase64Decode(Boolean isBase64Decode) {
					this.isBase64Decode = isBase64Decode;
				}
			}

			public static class SourceRocketMQParameters {

				private String regionId;

				private String instanceId;

				private String topic;

				private String tag;

				private String offset;

				private Float timestamp;

				private String groupId;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getTopic() {
					return this.topic;
				}

				public void setTopic(String topic) {
					this.topic = topic;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}

				public String getOffset() {
					return this.offset;
				}

				public void setOffset(String offset) {
					this.offset = offset;
				}

				public Float getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Float timestamp) {
					this.timestamp = timestamp;
				}

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}
			}

			public static class SourceRabbitMQParameters {

				private String regionId;

				private String instanceId;

				private String virtualHostName;

				private String queueName;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getVirtualHostName() {
					return this.virtualHostName;
				}

				public void setVirtualHostName(String virtualHostName) {
					this.virtualHostName = virtualHostName;
				}

				public String getQueueName() {
					return this.queueName;
				}

				public void setQueueName(String queueName) {
					this.queueName = queueName;
				}
			}

			public static class SourceSLSParameters {

				private String project;

				private String logStore;

				private String consumePosition;

				private String roleName;

				public String getProject() {
					return this.project;
				}

				public void setProject(String project) {
					this.project = project;
				}

				public String getLogStore() {
					return this.logStore;
				}

				public void setLogStore(String logStore) {
					this.logStore = logStore;
				}

				public String getConsumePosition() {
					return this.consumePosition;
				}

				public void setConsumePosition(String consumePosition) {
					this.consumePosition = consumePosition;
				}

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}
			}

			public static class SourceHttpEventParameters {

				private String type;

				private String securityConfig;

				private List<String> method;

				private List<String> ip;

				private List<String> referer;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getSecurityConfig() {
					return this.securityConfig;
				}

				public void setSecurityConfig(String securityConfig) {
					this.securityConfig = securityConfig;
				}

				public List<String> getBizMethod() {
					return this.method;
				}

				public void setBizMethod(List<String> method) {
					this.method = method;
				}

				public List<String> getIp() {
					return this.ip;
				}

				public void setIp(List<String> ip) {
					this.ip = ip;
				}

				public List<String> getReferer() {
					return this.referer;
				}

				public void setReferer(List<String> referer) {
					this.referer = referer;
				}
			}
		}
	}

	@Override
	public ListUserDefinedEventSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListUserDefinedEventSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
