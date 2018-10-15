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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetInstanceStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceStateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private RealTimeInstanceState realTimeInstanceState;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public RealTimeInstanceState getRealTimeInstanceState() {
		return this.realTimeInstanceState;
	}

	public void setRealTimeInstanceState(RealTimeInstanceState realTimeInstanceState) {
		this.realTimeInstanceState = realTimeInstanceState;
	}

	public static class RealTimeInstanceState {

		private List<AgentStateCount> agentStateDistributions;

		public List<AgentStateCount> getAgentStateDistributions() {
			return this.agentStateDistributions;
		}

		public void setAgentStateDistributions(List<AgentStateCount> agentStateDistributions) {
			this.agentStateDistributions = agentStateDistributions;
		}

		public static class AgentStateCount {

			private String state;

			private Long count;

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public GetInstanceStateResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceStateResponseUnmarshaller.unmarshall(this, context);
	}
}
