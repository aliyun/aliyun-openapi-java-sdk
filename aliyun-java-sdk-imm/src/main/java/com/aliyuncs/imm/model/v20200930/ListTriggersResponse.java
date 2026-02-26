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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.ListTriggersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTriggersResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<TriggersItem> triggers;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TriggersItem> getTriggers() {
		return this.triggers;
	}

	public void setTriggers(List<TriggersItem> triggers) {
		this.triggers = triggers;
	}

	public static class TriggersItem {

		private String id;

		private String state;

		private String marker;

		private String createTime;

		private String updateTime;

		private Map<Object,Object> tags;

		private String error;

		private List<ActionsItem> actions;

		private Input input;

		private Notification notification;

		private Statistic statistic;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMarker() {
			return this.marker;
		}

		public void setMarker(String marker) {
			this.marker = marker;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public List<ActionsItem> getActions() {
			return this.actions;
		}

		public void setActions(List<ActionsItem> actions) {
			this.actions = actions;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public Notification getNotification() {
			return this.notification;
		}

		public void setNotification(Notification notification) {
			this.notification = notification;
		}

		public Statistic getStatistic() {
			return this.statistic;
		}

		public void setStatistic(Statistic statistic) {
			this.statistic = statistic;
		}

		public static class ActionsItem {

			private String name;

			private List<String> parameters;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getParameters() {
				return this.parameters;
			}

			public void setParameters(List<String> parameters) {
				this.parameters = parameters;
			}
		}

		public static class Input {

			private OSS oSS;

			public OSS getOSS() {
				return this.oSS;
			}

			public void setOSS(OSS oSS) {
				this.oSS = oSS;
			}

			public static class OSS {

				private String bucket;

				private String prefix;

				private List<String> matchExpressions;

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}

				public String getPrefix() {
					return this.prefix;
				}

				public void setPrefix(String prefix) {
					this.prefix = prefix;
				}

				public List<String> getMatchExpressions() {
					return this.matchExpressions;
				}

				public void setMatchExpressions(List<String> matchExpressions) {
					this.matchExpressions = matchExpressions;
				}
			}
		}

		public static class Notification {

			private String endpoint;

			private String topic;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}

		public static class Statistic {

			private Long submitSuccess;

			private Long submitFailure;

			public Long getSubmitSuccess() {
				return this.submitSuccess;
			}

			public void setSubmitSuccess(Long submitSuccess) {
				this.submitSuccess = submitSuccess;
			}

			public Long getSubmitFailure() {
				return this.submitFailure;
			}

			public void setSubmitFailure(Long submitFailure) {
				this.submitFailure = submitFailure;
			}
		}
	}

	@Override
	public ListTriggersResponse getInstance(UnmarshallerContext context) {
		return	ListTriggersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
