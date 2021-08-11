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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeLifecyclePoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecyclePoliciesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<LifecyclePolicy> lifecyclePolicies;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<LifecyclePolicy> getLifecyclePolicies() {
		return this.lifecyclePolicies;
	}

	public void setLifecyclePolicies(List<LifecyclePolicy> lifecyclePolicies) {
		this.lifecyclePolicies = lifecyclePolicies;
	}

	public static class LifecyclePolicy {

		private String path;

		private String lifecyclePolicyName;

		private String storageType;

		private String lifecycleRuleName;

		private String createTime;

		private String fileSystemId;

		private List<String> paths;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getLifecyclePolicyName() {
			return this.lifecyclePolicyName;
		}

		public void setLifecyclePolicyName(String lifecyclePolicyName) {
			this.lifecyclePolicyName = lifecyclePolicyName;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getLifecycleRuleName() {
			return this.lifecycleRuleName;
		}

		public void setLifecycleRuleName(String lifecycleRuleName) {
			this.lifecycleRuleName = lifecycleRuleName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}
	}

	@Override
	public DescribeLifecyclePoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLifecyclePoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
