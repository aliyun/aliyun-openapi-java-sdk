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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.PostCustomizeRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PostCustomizeRuleResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private Long aliuid;

		private String ruleName;

		private String ruleDesc;

		private String ruleType;

		private String threatLevel;

		private String alertType;

		private String alertTypeMds;

		private String logType;

		private String logTypeMds;

		private String logSource;

		private String logSourceMds;

		private String ruleCondition;

		private String ruleGroup;

		private String ruleThreshold;

		private String queryCycle;

		private Integer eventTransferSwitch;

		private String eventTransferType;

		private String eventTransferExt;

		private Integer status;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getAliuid() {
			return this.aliuid;
		}

		public void setAliuid(Long aliuid) {
			this.aliuid = aliuid;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleDesc() {
			return this.ruleDesc;
		}

		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public String getThreatLevel() {
			return this.threatLevel;
		}

		public void setThreatLevel(String threatLevel) {
			this.threatLevel = threatLevel;
		}

		public String getAlertType() {
			return this.alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public String getAlertTypeMds() {
			return this.alertTypeMds;
		}

		public void setAlertTypeMds(String alertTypeMds) {
			this.alertTypeMds = alertTypeMds;
		}

		public String getLogType() {
			return this.logType;
		}

		public void setLogType(String logType) {
			this.logType = logType;
		}

		public String getLogTypeMds() {
			return this.logTypeMds;
		}

		public void setLogTypeMds(String logTypeMds) {
			this.logTypeMds = logTypeMds;
		}

		public String getLogSource() {
			return this.logSource;
		}

		public void setLogSource(String logSource) {
			this.logSource = logSource;
		}

		public String getLogSourceMds() {
			return this.logSourceMds;
		}

		public void setLogSourceMds(String logSourceMds) {
			this.logSourceMds = logSourceMds;
		}

		public String getRuleCondition() {
			return this.ruleCondition;
		}

		public void setRuleCondition(String ruleCondition) {
			this.ruleCondition = ruleCondition;
		}

		public String getRuleGroup() {
			return this.ruleGroup;
		}

		public void setRuleGroup(String ruleGroup) {
			this.ruleGroup = ruleGroup;
		}

		public String getRuleThreshold() {
			return this.ruleThreshold;
		}

		public void setRuleThreshold(String ruleThreshold) {
			this.ruleThreshold = ruleThreshold;
		}

		public String getQueryCycle() {
			return this.queryCycle;
		}

		public void setQueryCycle(String queryCycle) {
			this.queryCycle = queryCycle;
		}

		public Integer getEventTransferSwitch() {
			return this.eventTransferSwitch;
		}

		public void setEventTransferSwitch(Integer eventTransferSwitch) {
			this.eventTransferSwitch = eventTransferSwitch;
		}

		public String getEventTransferType() {
			return this.eventTransferType;
		}

		public void setEventTransferType(String eventTransferType) {
			this.eventTransferType = eventTransferType;
		}

		public String getEventTransferExt() {
			return this.eventTransferExt;
		}

		public void setEventTransferExt(String eventTransferExt) {
			this.eventTransferExt = eventTransferExt;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public PostCustomizeRuleResponse getInstance(UnmarshallerContext context) {
		return	PostCustomizeRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
