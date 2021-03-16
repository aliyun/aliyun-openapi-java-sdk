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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSituationalAwareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSituationalAwareResponse extends AcsResponse {

	private String requestId;

	private String status;

	private Boolean finished;

	private String token;

	private Boolean iterationQuery;

	private Integer validMachineIdCount;

	private String errorInfo;

	private List<RootCause> rootCauseList;

	private List<String> iterationTokens;

	private List<String> validMachineIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIterationQuery() {
		return this.iterationQuery;
	}

	public void setIterationQuery(Boolean iterationQuery) {
		this.iterationQuery = iterationQuery;
	}

	public Integer getValidMachineIdCount() {
		return this.validMachineIdCount;
	}

	public void setValidMachineIdCount(Integer validMachineIdCount) {
		this.validMachineIdCount = validMachineIdCount;
	}

	public String getErrorInfo() {
		return this.errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public List<RootCause> getRootCauseList() {
		return this.rootCauseList;
	}

	public void setRootCauseList(List<RootCause> rootCauseList) {
		this.rootCauseList = rootCauseList;
	}

	public List<String> getIterationTokens() {
		return this.iterationTokens;
	}

	public void setIterationTokens(List<String> iterationTokens) {
		this.iterationTokens = iterationTokens;
	}

	public List<String> getValidMachineIds() {
		return this.validMachineIds;
	}

	public void setValidMachineIds(List<String> validMachineIds) {
		this.validMachineIds = validMachineIds;
	}

	public static class RootCause {

		private String additionalInfo;

		private String ncIp;

		private String exceptionTime;

		private Integer level;

		private String machineId;

		private String exceptionType;

		private String instanceType;

		private String reason;

		private String exceptionName;

		private String warningLevel;

		private String warningValue;

		private String message;

		private String desc;

		private List<String> supportTeams;

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getExceptionType() {
			return this.exceptionType;
		}

		public void setExceptionType(String exceptionType) {
			this.exceptionType = exceptionType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getExceptionName() {
			return this.exceptionName;
		}

		public void setExceptionName(String exceptionName) {
			this.exceptionName = exceptionName;
		}

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getWarningValue() {
			return this.warningValue;
		}

		public void setWarningValue(String warningValue) {
			this.warningValue = warningValue;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public List<String> getSupportTeams() {
			return this.supportTeams;
		}

		public void setSupportTeams(List<String> supportTeams) {
			this.supportTeams = supportTeams;
		}
	}

	@Override
	public OpsSituationalAwareResponse getInstance(UnmarshallerContext context) {
		return	OpsSituationalAwareResponseUnmarshaller.unmarshall(this, context);
	}
}
