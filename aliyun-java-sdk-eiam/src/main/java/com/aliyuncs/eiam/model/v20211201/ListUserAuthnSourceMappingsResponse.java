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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListUserAuthnSourceMappingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserAuthnSourceMappingsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private String previousToken;

	private Integer maxResults;

	private List<UserAuthnSourceMapping> userAuthnSourceMappings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<UserAuthnSourceMapping> getUserAuthnSourceMappings() {
		return this.userAuthnSourceMappings;
	}

	public void setUserAuthnSourceMappings(List<UserAuthnSourceMapping> userAuthnSourceMappings) {
		this.userAuthnSourceMappings = userAuthnSourceMappings;
	}

	public static class UserAuthnSourceMapping {

		private String instanceId;

		private String userId;

		private String userExternalId;

		private String authnSourceType;

		private String identityProviderId;

		private Long createTime;

		private Long updateTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserExternalId() {
			return this.userExternalId;
		}

		public void setUserExternalId(String userExternalId) {
			this.userExternalId = userExternalId;
		}

		public String getAuthnSourceType() {
			return this.authnSourceType;
		}

		public void setAuthnSourceType(String authnSourceType) {
			this.authnSourceType = authnSourceType;
		}

		public String getIdentityProviderId() {
			return this.identityProviderId;
		}

		public void setIdentityProviderId(String identityProviderId) {
			this.identityProviderId = identityProviderId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public ListUserAuthnSourceMappingsResponse getInstance(UnmarshallerContext context) {
		return	ListUserAuthnSourceMappingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
