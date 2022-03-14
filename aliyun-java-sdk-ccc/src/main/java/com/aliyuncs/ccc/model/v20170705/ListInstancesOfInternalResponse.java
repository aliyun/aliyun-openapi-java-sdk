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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListInstancesOfInternalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesOfInternalResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<BriefInstance> instances;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<BriefInstance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<BriefInstance> instances) {
		this.instances = instances;
	}

	public static class BriefInstance {

		private String aliyunUid;

		private String tenantId;

		private String instanceId;

		private String instanceName;

		private String status;

		private String consoleUrl;

		private Integer maxStorageTtl;

		private Integer maxStorageSize;

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConsoleUrl() {
			return this.consoleUrl;
		}

		public void setConsoleUrl(String consoleUrl) {
			this.consoleUrl = consoleUrl;
		}

		public Integer getMaxStorageTtl() {
			return this.maxStorageTtl;
		}

		public void setMaxStorageTtl(Integer maxStorageTtl) {
			this.maxStorageTtl = maxStorageTtl;
		}

		public Integer getMaxStorageSize() {
			return this.maxStorageSize;
		}

		public void setMaxStorageSize(Integer maxStorageSize) {
			this.maxStorageSize = maxStorageSize;
		}
	}

	@Override
	public ListInstancesOfInternalResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesOfInternalResponseUnmarshaller.unmarshall(this, context);
	}
}
