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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GenerateTemplateByScratchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateTemplateByScratchResponse extends AcsResponse {

	private String requestId;

	private String templateBody;

	private List<ResourceToImport> resourcesToImport;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}

	public List<ResourceToImport> getResourcesToImport() {
		return this.resourcesToImport;
	}

	public void setResourcesToImport(List<ResourceToImport> resourcesToImport) {
		this.resourcesToImport = resourcesToImport;
	}

	public static class ResourceToImport {

		private String resourceType;

		private String logicalResourceId;

		private Map<Object,Object> resourceIdentifier;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getLogicalResourceId() {
			return this.logicalResourceId;
		}

		public void setLogicalResourceId(String logicalResourceId) {
			this.logicalResourceId = logicalResourceId;
		}

		public Map<Object,Object> getResourceIdentifier() {
			return this.resourceIdentifier;
		}

		public void setResourceIdentifier(Map<Object,Object> resourceIdentifier) {
			this.resourceIdentifier = resourceIdentifier;
		}
	}

	@Override
	public GenerateTemplateByScratchResponse getInstance(UnmarshallerContext context) {
		return	GenerateTemplateByScratchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
