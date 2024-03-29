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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSceneResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String description;

	private List<FlowsItem> flows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FlowsItem> getFlows() {
		return this.flows;
	}

	public void setFlows(List<FlowsItem> flows) {
		this.flows = flows;
	}

	public static class FlowsItem {

		private String flowName;

		private String flowCode;

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public String getFlowCode() {
			return this.flowCode;
		}

		public void setFlowCode(String flowCode) {
			this.flowCode = flowCode;
		}
	}

	@Override
	public GetSceneResponse getInstance(UnmarshallerContext context) {
		return	GetSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
