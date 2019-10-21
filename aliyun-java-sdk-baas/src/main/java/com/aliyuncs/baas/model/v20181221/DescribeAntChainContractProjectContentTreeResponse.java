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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainContractProjectContentTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainContractProjectContentTreeResponse extends AcsResponse {

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

		private String projectId;

		private String projectName;

		private String projectVersion;

		private String projectDescription;

		private List<Map<Object,Object>> children;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectVersion() {
			return this.projectVersion;
		}

		public void setProjectVersion(String projectVersion) {
			this.projectVersion = projectVersion;
		}

		public String getProjectDescription() {
			return this.projectDescription;
		}

		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}

		public List<Map<Object,Object>> getChildren() {
			return this.children;
		}

		public void setChildren(List<Map<Object,Object>> children) {
			this.children = children;
		}
	}

	@Override
	public DescribeAntChainContractProjectContentTreeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainContractProjectContentTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
