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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.ListProtectedResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProtectedResourcesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<ProtectedResource> protectedResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ProtectedResource> getProtectedResources() {
		return this.protectedResources;
	}

	public void setProtectedResources(List<ProtectedResource> protectedResources) {
		this.protectedResources = protectedResources;
	}

	public static class ProtectedResource {

		private Long snapshotCount;

		private String resourceId;

		private String protectedResourceId;

		private String sourceType;

		private Long protectedDataSize;

		private String createdByProduct;

		private Long resourceOwnerId;

		public Long getSnapshotCount() {
			return this.snapshotCount;
		}

		public void setSnapshotCount(Long snapshotCount) {
			this.snapshotCount = snapshotCount;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getProtectedResourceId() {
			return this.protectedResourceId;
		}

		public void setProtectedResourceId(String protectedResourceId) {
			this.protectedResourceId = protectedResourceId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Long getProtectedDataSize() {
			return this.protectedDataSize;
		}

		public void setProtectedDataSize(Long protectedDataSize) {
			this.protectedDataSize = protectedDataSize;
		}

		public String getCreatedByProduct() {
			return this.createdByProduct;
		}

		public void setCreatedByProduct(String createdByProduct) {
			this.createdByProduct = createdByProduct;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}
	}

	@Override
	public ListProtectedResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListProtectedResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
