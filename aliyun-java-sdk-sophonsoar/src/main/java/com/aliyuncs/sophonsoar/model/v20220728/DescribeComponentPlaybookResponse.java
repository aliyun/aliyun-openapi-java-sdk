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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeComponentPlaybookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeComponentPlaybookResponse extends AcsResponse {

	private String requestId;

	private List<Data> playbooks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPlaybooks() {
		return this.playbooks;
	}

	public void setPlaybooks(List<Data> playbooks) {
		this.playbooks = playbooks;
	}

	public static class Data {

		private String displayName;

		private String playbookUuid;

		private String ownType;

		private String inputParams;

		private String outputParams;

		private String description;

		private String tenantId;

		private String paramType;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getPlaybookUuid() {
			return this.playbookUuid;
		}

		public void setPlaybookUuid(String playbookUuid) {
			this.playbookUuid = playbookUuid;
		}

		public String getOwnType() {
			return this.ownType;
		}

		public void setOwnType(String ownType) {
			this.ownType = ownType;
		}

		public String getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(String inputParams) {
			this.inputParams = inputParams;
		}

		public String getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(String outputParams) {
			this.outputParams = outputParams;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}
	}

	@Override
	public DescribeComponentPlaybookResponse getInstance(UnmarshallerContext context) {
		return	DescribeComponentPlaybookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
