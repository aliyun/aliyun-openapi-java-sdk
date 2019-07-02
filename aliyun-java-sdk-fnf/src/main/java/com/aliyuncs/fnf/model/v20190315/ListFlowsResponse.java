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

package com.aliyuncs.fnf.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.fnf.transform.v20190315.ListFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<FlowsItem> flows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<FlowsItem> getFlows() {
		return this.flows;
	}

	public void setFlows(List<FlowsItem> flows) {
		this.flows = flows;
	}

	public static class FlowsItem {

		private String name;

		private String description;

		private String definition;

		private String id;

		private String type;

		private String roleArn;

		private String createdTime;

		private String lastModifiedTime;

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

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRoleArn() {
			return this.roleArn;
		}

		public void setRoleArn(String roleArn) {
			this.roleArn = roleArn;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}
	}

	@Override
	public ListFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListFlowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
