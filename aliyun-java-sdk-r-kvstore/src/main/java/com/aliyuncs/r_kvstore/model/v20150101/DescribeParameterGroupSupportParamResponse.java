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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeParameterGroupSupportParamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupSupportParamResponse extends AcsResponse {

	private String requestId;

	private List<ResourceListItem> resourceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceListItem> getResourceList() {
		return this.resourceList;
	}

	public void setResourceList(List<ResourceListItem> resourceList) {
		this.resourceList = resourceList;
	}

	public static class ResourceListItem {

		private String dbType;

		private String dbVersion;

		private String category;

		private String paramName;

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDbVersion() {
			return this.dbVersion;
		}

		public void setDbVersion(String dbVersion) {
			this.dbVersion = dbVersion;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}
	}

	@Override
	public DescribeParameterGroupSupportParamResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterGroupSupportParamResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
