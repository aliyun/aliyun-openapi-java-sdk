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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryConfigResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private Integer code;

	private Integer httpStatusCode;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String maxClientCnxns;

		private Boolean configAuthSupported;

		private String initLimit;

		private Boolean mCPEnabled;

		private Boolean openSuperAcl;

		private Boolean restartFlag;

		private String jvmFlagsCustom;

		private String autopurgePurgeInterval;

		private String autopurgeSnapRetainCount;

		private String syncLimit;

		private Boolean configAuthEnabled;

		private String clusterName;

		private Boolean mCPSupported;

		private String juteMaxbuffer;

		private String tickTime;

		private String passWord;

		private String userName;

		private Boolean configSecretSupported;

		private Boolean configSecretEnabled;

		public String getMaxClientCnxns() {
			return this.maxClientCnxns;
		}

		public void setMaxClientCnxns(String maxClientCnxns) {
			this.maxClientCnxns = maxClientCnxns;
		}

		public Boolean getConfigAuthSupported() {
			return this.configAuthSupported;
		}

		public void setConfigAuthSupported(Boolean configAuthSupported) {
			this.configAuthSupported = configAuthSupported;
		}

		public String getInitLimit() {
			return this.initLimit;
		}

		public void setInitLimit(String initLimit) {
			this.initLimit = initLimit;
		}

		public Boolean getMCPEnabled() {
			return this.mCPEnabled;
		}

		public void setMCPEnabled(Boolean mCPEnabled) {
			this.mCPEnabled = mCPEnabled;
		}

		public Boolean getOpenSuperAcl() {
			return this.openSuperAcl;
		}

		public void setOpenSuperAcl(Boolean openSuperAcl) {
			this.openSuperAcl = openSuperAcl;
		}

		public Boolean getRestartFlag() {
			return this.restartFlag;
		}

		public void setRestartFlag(Boolean restartFlag) {
			this.restartFlag = restartFlag;
		}

		public String getJvmFlagsCustom() {
			return this.jvmFlagsCustom;
		}

		public void setJvmFlagsCustom(String jvmFlagsCustom) {
			this.jvmFlagsCustom = jvmFlagsCustom;
		}

		public String getAutopurgePurgeInterval() {
			return this.autopurgePurgeInterval;
		}

		public void setAutopurgePurgeInterval(String autopurgePurgeInterval) {
			this.autopurgePurgeInterval = autopurgePurgeInterval;
		}

		public String getAutopurgeSnapRetainCount() {
			return this.autopurgeSnapRetainCount;
		}

		public void setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
			this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
		}

		public String getSyncLimit() {
			return this.syncLimit;
		}

		public void setSyncLimit(String syncLimit) {
			this.syncLimit = syncLimit;
		}

		public Boolean getConfigAuthEnabled() {
			return this.configAuthEnabled;
		}

		public void setConfigAuthEnabled(Boolean configAuthEnabled) {
			this.configAuthEnabled = configAuthEnabled;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Boolean getMCPSupported() {
			return this.mCPSupported;
		}

		public void setMCPSupported(Boolean mCPSupported) {
			this.mCPSupported = mCPSupported;
		}

		public String getJuteMaxbuffer() {
			return this.juteMaxbuffer;
		}

		public void setJuteMaxbuffer(String juteMaxbuffer) {
			this.juteMaxbuffer = juteMaxbuffer;
		}

		public String getTickTime() {
			return this.tickTime;
		}

		public void setTickTime(String tickTime) {
			this.tickTime = tickTime;
		}

		public String getPassWord() {
			return this.passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getConfigSecretSupported() {
			return this.configSecretSupported;
		}

		public void setConfigSecretSupported(Boolean configSecretSupported) {
			this.configSecretSupported = configSecretSupported;
		}

		public Boolean getConfigSecretEnabled() {
			return this.configSecretEnabled;
		}

		public void setConfigSecretEnabled(Boolean configSecretEnabled) {
			this.configSecretEnabled = configSecretEnabled;
		}
	}

	@Override
	public QueryConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
