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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeAuthorizedApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuthorizedApisResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<AuthorizedApi> authorizedApis;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuthorizedApi> getAuthorizedApis() {
		return this.authorizedApis;
	}

	public void setAuthorizedApis(List<AuthorizedApi> authorizedApis) {
		this.authorizedApis = authorizedApis;
	}

	public static class AuthorizedApi {

		private String apiId;

		private String authorizationSource;

		private String authVaildTime;

		private String description;

		private String groupName;

		private String groupId;

		private String authorizedTime;

		private String operator;

		private String stageName;

		private String apiName;

		private String regionId;

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getAuthorizationSource() {
			return this.authorizationSource;
		}

		public void setAuthorizationSource(String authorizationSource) {
			this.authorizationSource = authorizationSource;
		}

		public String getAuthVaildTime() {
			return this.authVaildTime;
		}

		public void setAuthVaildTime(String authVaildTime) {
			this.authVaildTime = authVaildTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getAuthorizedTime() {
			return this.authorizedTime;
		}

		public void setAuthorizedTime(String authorizedTime) {
			this.authorizedTime = authorizedTime;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeAuthorizedApisResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuthorizedApisResponseUnmarshaller.unmarshall(this, context);
	}
}
