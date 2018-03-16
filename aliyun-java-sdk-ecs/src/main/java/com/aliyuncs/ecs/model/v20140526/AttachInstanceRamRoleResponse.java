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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.AttachInstanceRamRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AttachInstanceRamRoleResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer failCount;

	private String ramRoleName;

	private List<AttachInstanceRamRoleResult> attachInstanceRamRoleResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getFailCount() {
		return this.failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
	}

	public List<AttachInstanceRamRoleResult> getAttachInstanceRamRoleResults() {
		return this.attachInstanceRamRoleResults;
	}

	public void setAttachInstanceRamRoleResults(List<AttachInstanceRamRoleResult> attachInstanceRamRoleResults) {
		this.attachInstanceRamRoleResults = attachInstanceRamRoleResults;
	}

	public static class AttachInstanceRamRoleResult {

		private String instanceId;

		private Boolean success;

		private String code;

		private String message;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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
	}

	@Override
	public AttachInstanceRamRoleResponse getInstance(UnmarshallerContext context) {
		return	AttachInstanceRamRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
