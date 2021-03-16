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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryGroupDispatchInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryGroupDispatchInfoResponse extends AcsResponse {

	private String requestId;

	private List<DispatchInfo> dispatchInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DispatchInfo> getDispatchInfos() {
		return this.dispatchInfos;
	}

	public void setDispatchInfos(List<DispatchInfo> dispatchInfos) {
		this.dispatchInfos = dispatchInfos;
	}

	public static class DispatchInfo {

		private String instanceId;

		private Boolean dispatched;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getDispatched() {
			return this.dispatched;
		}

		public void setDispatched(Boolean dispatched) {
			this.dispatched = dispatched;
		}
	}

	@Override
	public OpsQueryGroupDispatchInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryGroupDispatchInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
