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

package com.aliyuncs.ons.model.v20180628;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180628.OnsTopicListResponseUnmarshaller;
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

		private String topic;

		private String owner;

		private Integer relation;

		private String relationName;

		private Long updateTime;

		private String remark;

		private Integer messageType;

		private String instanceId;

		private Boolean independentNaming;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getRelation() {
			return this.relation;
		}

		public void setRelation(Integer relation) {
			this.relation = relation;
		}

		public String getRelationName() {
			return this.relationName;
		}

		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Integer getMessageType() {
			return this.messageType;
		}

		public void setMessageType(Integer messageType) {
			this.messageType = messageType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getIndependentNaming() {
			return this.independentNaming;
		}

		public void setIndependentNaming(Boolean independentNaming) {
			this.independentNaming = independentNaming;
		}
	}

	@Override
	public OnsTopicListResponse getInstance(UnmarshallerContext context) {
		return	OnsTopicListResponseUnmarshaller.unmarshall(this, context);
	}
}
