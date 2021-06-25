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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeIntentStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIntentStatisticsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String instanceId;

	private String groupId;

	private Integer processIntentNum;

	private Integer globalIntentNum;

	private List<IntentStatisticsItem> processIntents;

	private List<IntentStatisticsItem> globalIntents;

	private List<IntentStatisticsItem1> intentsAfterNoAnswer;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Integer getProcessIntentNum() {
		return this.processIntentNum;
	}

	public void setProcessIntentNum(Integer processIntentNum) {
		this.processIntentNum = processIntentNum;
	}

	public Integer getGlobalIntentNum() {
		return this.globalIntentNum;
	}

	public void setGlobalIntentNum(Integer globalIntentNum) {
		this.globalIntentNum = globalIntentNum;
	}

	public List<IntentStatisticsItem> getProcessIntents() {
		return this.processIntents;
	}

	public void setProcessIntents(List<IntentStatisticsItem> processIntents) {
		this.processIntents = processIntents;
	}

	public List<IntentStatisticsItem> getGlobalIntents() {
		return this.globalIntents;
	}

	public void setGlobalIntents(List<IntentStatisticsItem> globalIntents) {
		this.globalIntents = globalIntents;
	}

	public List<IntentStatisticsItem1> getIntentsAfterNoAnswer() {
		return this.intentsAfterNoAnswer;
	}

	public void setIntentsAfterNoAnswer(List<IntentStatisticsItem1> intentsAfterNoAnswer) {
		this.intentsAfterNoAnswer = intentsAfterNoAnswer;
	}

	public static class IntentStatisticsItem {

		private String instanceId;

		private String groupId;

		private String intentId;

		private String intentName;

		private String type;

		private Integer hitNum;

		private Integer hitAfterNoAnswer;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getIntentId() {
			return this.intentId;
		}

		public void setIntentId(String intentId) {
			this.intentId = intentId;
		}

		public String getIntentName() {
			return this.intentName;
		}

		public void setIntentName(String intentName) {
			this.intentName = intentName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getHitNum() {
			return this.hitNum;
		}

		public void setHitNum(Integer hitNum) {
			this.hitNum = hitNum;
		}

		public Integer getHitAfterNoAnswer() {
			return this.hitAfterNoAnswer;
		}

		public void setHitAfterNoAnswer(Integer hitAfterNoAnswer) {
			this.hitAfterNoAnswer = hitAfterNoAnswer;
		}
	}

	public static class IntentStatisticsItem1 {

		private String instanceId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeIntentStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIntentStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
