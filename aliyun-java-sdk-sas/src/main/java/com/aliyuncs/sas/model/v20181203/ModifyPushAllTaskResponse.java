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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ModifyPushAllTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyPushAllTaskResponse extends AcsResponse {

	private String requestId;

	private PushTaskRsp pushTaskRsp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PushTaskRsp getPushTaskRsp() {
		return this.pushTaskRsp;
	}

	public void setPushTaskRsp(PushTaskRsp pushTaskRsp) {
		this.pushTaskRsp = pushTaskRsp;
	}

	public static class PushTaskRsp {

		private List<PushTaskResult> pushTaskResultList;

		public List<PushTaskResult> getPushTaskResultList() {
			return this.pushTaskResultList;
		}

		public void setPushTaskResultList(List<PushTaskResult> pushTaskResultList) {
			this.pushTaskResultList = pushTaskResultList;
		}

		public static class PushTaskResult {

			private String instanceId;

			private String osVersion;

			private String instanceName;

			private Boolean success;

			private Long groupId;

			private String ip;

			private Boolean online;

			private String message;

			private String region;

			private String uuid;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOsVersion() {
				return this.osVersion;
			}

			public void setOsVersion(String osVersion) {
				this.osVersion = osVersion;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Boolean getOnline() {
				return this.online;
			}

			public void setOnline(Boolean online) {
				this.online = online;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}
		}
	}

	@Override
	public ModifyPushAllTaskResponse getInstance(UnmarshallerContext context) {
		return	ModifyPushAllTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
