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
import com.aliyuncs.ecsops.transform.v20160401.OpsFailureInjectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsFailureInjectionResponse extends AcsResponse {

	private String status;

	private Boolean finished;

	private Integer validMachineIdCount;

	private String requestId;

	private String token;

	private List<FailedMachine> failedMachines;

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

	public Integer getValidMachineIdCount() {
		return this.validMachineIdCount;
	}

	public void setValidMachineIdCount(Integer validMachineIdCount) {
		this.validMachineIdCount = validMachineIdCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<FailedMachine> getFailedMachines() {
		return this.failedMachines;
	}

	public void setFailedMachines(List<FailedMachine> failedMachines) {
		this.failedMachines = failedMachines;
	}

	public static class FailedMachine {

		private String machineId;

		private String info;

		private String failedReason;

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getInfo() {
			return this.info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		public String getFailedReason() {
			return this.failedReason;
		}

		public void setFailedReason(String failedReason) {
			this.failedReason = failedReason;
		}
	}

	@Override
	public OpsFailureInjectionResponse getInstance(UnmarshallerContext context) {
		return	OpsFailureInjectionResponseUnmarshaller.unmarshall(this, context);
	}
}
