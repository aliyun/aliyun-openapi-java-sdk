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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsTopicListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsTopicListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<PublishInfoDo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<PublishInfoDo> getData() {
		return this.data;
	}

	public void setData(List<PublishInfoDo> data) {
		this.data = data;
	}

	public static class PublishInfoDo {

		private Integer messageType;

		private String relationName;

		private String owner;

		private Boolean independentNaming;

		private String remark;

		private Integer relation;

		private Long createTime;

		private String topic;

		private String instanceId;

		private Integer serviceStatus;

		private List<Tag> tags;

		public Integer getMessageType() {
			return this.messageType;
		}

		public void setMessageType(Integer messageType) {
			this.messageType = messageType;
		}

		public String getRelationName() {
			return this.relationName;
		}

		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Boolean getIndependentNaming() {
			return this.independentNaming;
		}

		public void setIndependentNaming(Boolean independentNaming) {
			this.independentNaming = independentNaming;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Integer getRelation() {
			return this.relation;
		}

		public void setRelation(Integer relation) {
			this.relation = relation;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(Integer serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
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
	public OnsTopicListResponse getInstance(UnmarshallerContext context) {
		return	OnsTopicListResponseUnmarshaller.unmarshall(this, context);
	}
}
