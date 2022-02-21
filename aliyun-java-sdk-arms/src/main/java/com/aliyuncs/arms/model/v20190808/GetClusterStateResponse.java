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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetClusterStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterStateResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean isFlink;

		private Boolean agentState;

		private String clusterState;

		public Boolean getIsFlink() {
			return this.isFlink;
		}

		public void setIsFlink(Boolean isFlink) {
			this.isFlink = isFlink;
		}

		public Boolean getAgentState() {
			return this.agentState;
		}

		public void setAgentState(Boolean agentState) {
			this.agentState = agentState;
		}

		public String getClusterState() {
			return this.clusterState;
		}

		public void setClusterState(String clusterState) {
			this.clusterState = clusterState;
		}
	}

	@Override
	public GetClusterStateResponse getInstance(UnmarshallerContext context) {
		return	GetClusterStateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
