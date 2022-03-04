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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListCollectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCollectionsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Data> result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String workspaceId;

		private String worksType;

		private Integer favoriteId;

		private String worksId;

		private String worksName;

		private String workspaceName;

		private String ownerId;

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getWorksType() {
			return this.worksType;
		}

		public void setWorksType(String worksType) {
			this.worksType = worksType;
		}

		public Integer getFavoriteId() {
			return this.favoriteId;
		}

		public void setFavoriteId(Integer favoriteId) {
			this.favoriteId = favoriteId;
		}

		public String getWorksId() {
			return this.worksId;
		}

		public void setWorksId(String worksId) {
			this.worksId = worksId;
		}

		public String getWorksName() {
			return this.worksName;
		}

		public void setWorksName(String worksName) {
			this.worksName = worksName;
		}

		public String getWorkspaceName() {
			return this.workspaceName;
		}

		public void setWorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}
	}

	@Override
	public ListCollectionsResponse getInstance(UnmarshallerContext context) {
		return	ListCollectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
