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

package com.aliyuncs.servicemesh.model.v20200111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.servicemesh.transform.v20200111.GetServiceMeshSlbResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceMeshSlbResponse extends AcsResponse {

	private String requestId;

	private List<SLBInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SLBInfo> getData() {
		return this.data;
	}

	public void setData(List<SLBInfo> data) {
		this.data = data;
	}

	public static class SLBInfo {

		private String loadBalancerId;

		private String status;

		private String serverHealthStatus;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getServerHealthStatus() {
			return this.serverHealthStatus;
		}

		public void setServerHealthStatus(String serverHealthStatus) {
			this.serverHealthStatus = serverHealthStatus;
		}
	}

	@Override
	public GetServiceMeshSlbResponse getInstance(UnmarshallerContext context) {
		return	GetServiceMeshSlbResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
