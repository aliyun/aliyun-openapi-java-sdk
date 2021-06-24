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
import com.aliyuncs.ecsops.transform.v20160401.OpsEcsStatusDiagnoseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEcsStatusDiagnoseResponse extends AcsResponse {

	private String requestId;

	private List<EcsStatusDiagnose> ecsStatusDiagnoseSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsStatusDiagnose> getEcsStatusDiagnoseSet() {
		return this.ecsStatusDiagnoseSet;
	}

	public void setEcsStatusDiagnoseSet(List<EcsStatusDiagnose> ecsStatusDiagnoseSet) {
		this.ecsStatusDiagnoseSet = ecsStatusDiagnoseSet;
	}

	public static class EcsStatusDiagnose {

		private String status;

		private Boolean houyiConsistent;

		private String syncResult;

		private String houyiStatus;

		private String statusOnNc;

		private String instanceId;

		private Boolean yaochiConsistent;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getHouyiConsistent() {
			return this.houyiConsistent;
		}

		public void setHouyiConsistent(Boolean houyiConsistent) {
			this.houyiConsistent = houyiConsistent;
		}

		public String getSyncResult() {
			return this.syncResult;
		}

		public void setSyncResult(String syncResult) {
			this.syncResult = syncResult;
		}

		public String getHouyiStatus() {
			return this.houyiStatus;
		}

		public void setHouyiStatus(String houyiStatus) {
			this.houyiStatus = houyiStatus;
		}

		public String getStatusOnNc() {
			return this.statusOnNc;
		}

		public void setStatusOnNc(String statusOnNc) {
			this.statusOnNc = statusOnNc;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getYaochiConsistent() {
			return this.yaochiConsistent;
		}

		public void setYaochiConsistent(Boolean yaochiConsistent) {
			this.yaochiConsistent = yaochiConsistent;
		}
	}

	@Override
	public OpsEcsStatusDiagnoseResponse getInstance(UnmarshallerContext context) {
		return	OpsEcsStatusDiagnoseResponseUnmarshaller.unmarshall(this, context);
	}
}
