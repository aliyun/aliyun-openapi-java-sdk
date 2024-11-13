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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.GetXConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetXConfigResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private String sequenceStartTime;

		private String smsAbility;

		private String gNFlag;

		private String smsSignMode;

		private String callAbility;

		private String sequenceEndTime;

		private List<SequenceCallsItem> sequenceCalls;

		private List<ReachJsonsItem> reachJsons;

		public String getSequenceStartTime() {
			return this.sequenceStartTime;
		}

		public void setSequenceStartTime(String sequenceStartTime) {
			this.sequenceStartTime = sequenceStartTime;
		}

		public String getSmsAbility() {
			return this.smsAbility;
		}

		public void setSmsAbility(String smsAbility) {
			this.smsAbility = smsAbility;
		}

		public String getGNFlag() {
			return this.gNFlag;
		}

		public void setGNFlag(String gNFlag) {
			this.gNFlag = gNFlag;
		}

		public String getSmsSignMode() {
			return this.smsSignMode;
		}

		public void setSmsSignMode(String smsSignMode) {
			this.smsSignMode = smsSignMode;
		}

		public String getCallAbility() {
			return this.callAbility;
		}

		public void setCallAbility(String callAbility) {
			this.callAbility = callAbility;
		}

		public String getSequenceEndTime() {
			return this.sequenceEndTime;
		}

		public void setSequenceEndTime(String sequenceEndTime) {
			this.sequenceEndTime = sequenceEndTime;
		}

		public List<SequenceCallsItem> getSequenceCalls() {
			return this.sequenceCalls;
		}

		public void setSequenceCalls(List<SequenceCallsItem> sequenceCalls) {
			this.sequenceCalls = sequenceCalls;
		}

		public List<ReachJsonsItem> getReachJsons() {
			return this.reachJsons;
		}

		public void setReachJsons(List<ReachJsonsItem> reachJsons) {
			this.reachJsons = reachJsons;
		}

		public static class SequenceCallsItem {

			private String sequenceCallNoPlayCode;

			private String sequenceCalledNo;

			private String sequenceCalledPlayCode;

			public String getSequenceCallNoPlayCode() {
				return this.sequenceCallNoPlayCode;
			}

			public void setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
				this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
			}

			public String getSequenceCalledNo() {
				return this.sequenceCalledNo;
			}

			public void setSequenceCalledNo(String sequenceCalledNo) {
				this.sequenceCalledNo = sequenceCalledNo;
			}

			public String getSequenceCalledPlayCode() {
				return this.sequenceCalledPlayCode;
			}

			public void setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
				this.sequenceCalledPlayCode = sequenceCalledPlayCode;
			}
		}

		public static class ReachJsonsItem {

			private String receiveDir;

			private String callDir;

			private String tempId;

			private String ruleId;

			private String callStatus;

			private String ruleType;

			private String ruleName;

			public String getReceiveDir() {
				return this.receiveDir;
			}

			public void setReceiveDir(String receiveDir) {
				this.receiveDir = receiveDir;
			}

			public String getCallDir() {
				return this.callDir;
			}

			public void setCallDir(String callDir) {
				this.callDir = callDir;
			}

			public String getTempId() {
				return this.tempId;
			}

			public void setTempId(String tempId) {
				this.tempId = tempId;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getCallStatus() {
				return this.callStatus;
			}

			public void setCallStatus(String callStatus) {
				this.callStatus = callStatus;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public GetXConfigResponse getInstance(UnmarshallerContext context) {
		return	GetXConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
