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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListDpiGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDpiGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private List<DpiGroupItem> dpiGroup;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<DpiGroupItem> getDpiGroup() {
		return this.dpiGroup;
	}

	public void setDpiGroup(List<DpiGroupItem> dpiGroup) {
		this.dpiGroup = dpiGroup;
	}

	public static class DpiGroupItem {

		private String minEngineVersion;

		private String dpiGroupName;

		private String minSignatureDbVersion;

		private String dpiGroupId;

		public String getMinEngineVersion() {
			return this.minEngineVersion;
		}

		public void setMinEngineVersion(String minEngineVersion) {
			this.minEngineVersion = minEngineVersion;
		}

		public String getDpiGroupName() {
			return this.dpiGroupName;
		}

		public void setDpiGroupName(String dpiGroupName) {
			this.dpiGroupName = dpiGroupName;
		}

		public String getMinSignatureDbVersion() {
			return this.minSignatureDbVersion;
		}

		public void setMinSignatureDbVersion(String minSignatureDbVersion) {
			this.minSignatureDbVersion = minSignatureDbVersion;
		}

		public String getDpiGroupId() {
			return this.dpiGroupId;
		}

		public void setDpiGroupId(String dpiGroupId) {
			this.dpiGroupId = dpiGroupId;
		}
	}

	@Override
	public ListDpiGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListDpiGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
