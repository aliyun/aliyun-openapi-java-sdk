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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMaliceEcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMaliceEcsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer totalCount;

	private Integer pageNo;

	private Integer pageSize;

	private List<MaliceInstance> maliceInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<MaliceInstance> getMaliceInstances() {
		return this.maliceInstances;
	}

	public void setMaliceInstances(List<MaliceInstance> maliceInstances) {
		this.maliceInstances = maliceInstances;
	}

	public static class MaliceInstance {

		private Long id;

		private String instanceId;

		private String internetIp;

		private Integer bandWidth;

		private Boolean isLock;

		private Boolean status;

		private String operator;

		private String reason;

		private String proof;

		private String lockType;

		private String gmtCreated;

		private String gmtUnlocked;

		private String gmtModified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Integer getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Integer bandWidth) {
			this.bandWidth = bandWidth;
		}

		public Boolean getIsLock() {
			return this.isLock;
		}

		public void setIsLock(Boolean isLock) {
			this.isLock = isLock;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getProof() {
			return this.proof;
		}

		public void setProof(String proof) {
			this.proof = proof;
		}

		public String getLockType() {
			return this.lockType;
		}

		public void setLockType(String lockType) {
			this.lockType = lockType;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtUnlocked() {
			return this.gmtUnlocked;
		}

		public void setGmtUnlocked(String gmtUnlocked) {
			this.gmtUnlocked = gmtUnlocked;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public OpsDescribeMaliceEcsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMaliceEcsResponseUnmarshaller.unmarshall(this, context);
	}
}
