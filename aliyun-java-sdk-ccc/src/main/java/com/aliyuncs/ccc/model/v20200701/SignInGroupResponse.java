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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.SignInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SignInGroupResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<String> params;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String breakCode;

		private String deviceId;

		private String extension;

		private String instanceId;

		private String jobId;

		private Boolean outboundScenario;

		private String userId;

		private String userState;

		private String workMode;

		private List<String> signedSkillGroupIdList;

		public String getBreakCode() {
			return this.breakCode;
		}

		public void setBreakCode(String breakCode) {
			this.breakCode = breakCode;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Boolean getOutboundScenario() {
			return this.outboundScenario;
		}

		public void setOutboundScenario(Boolean outboundScenario) {
			this.outboundScenario = outboundScenario;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserState() {
			return this.userState;
		}

		public void setUserState(String userState) {
			this.userState = userState;
		}

		public String getWorkMode() {
			return this.workMode;
		}

		public void setWorkMode(String workMode) {
			this.workMode = workMode;
		}

		public List<String> getSignedSkillGroupIdList() {
			return this.signedSkillGroupIdList;
		}

		public void setSignedSkillGroupIdList(List<String> signedSkillGroupIdList) {
			this.signedSkillGroupIdList = signedSkillGroupIdList;
		}
	}

	@Override
	public SignInGroupResponse getInstance(UnmarshallerContext context) {
		return	SignInGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
