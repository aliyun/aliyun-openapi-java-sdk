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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private RuleInfo ruleInfo;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public RuleInfo getRuleInfo() {
		return this.ruleInfo;
	}

	public void setRuleInfo(RuleInfo ruleInfo) {
		this.ruleInfo = ruleInfo;
	}

	public static class RuleInfo {

		private String modified;

		private String status;

		private String dataType;

		private String select;

		private String utcCreated;

		private Integer topicType;

		private Long createUserId;

		private String where;

		private String productKey;

		private String utcModified;

		private String topic;

		private String shortTopic;

		private String ruleDesc;

		private String name;

		private String created;

		private Long id;

		public String getModified() {
			return this.modified;
		}

		public void setModified(String modified) {
			this.modified = modified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getSelect() {
			return this.select;
		}

		public void setSelect(String select) {
			this.select = select;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}

		public Integer getTopicType() {
			return this.topicType;
		}

		public void setTopicType(Integer topicType) {
			this.topicType = topicType;
		}

		public Long getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(Long createUserId) {
			this.createUserId = createUserId;
		}

		public String getWhere() {
			return this.where;
		}

		public void setWhere(String where) {
			this.where = where;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getShortTopic() {
			return this.shortTopic;
		}

		public void setShortTopic(String shortTopic) {
			this.shortTopic = shortTopic;
		}

		public String getRuleDesc() {
			return this.ruleDesc;
		}

		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public GetRuleResponse getInstance(UnmarshallerContext context) {
		return	GetRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
