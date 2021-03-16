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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFeaturePriorityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFeaturePriorityResponse extends AcsResponse {

	private String requestId;

	private Integer page;

	private Integer pageSize;

	private Integer totalCount;

	private Integer count;

	private List<FeaturePriority> featurePriorities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<FeaturePriority> getFeaturePriorities() {
		return this.featurePriorities;
	}

	public void setFeaturePriorities(List<FeaturePriority> featurePriorities) {
		this.featurePriorities = featurePriorities;
	}

	public static class FeaturePriority {

		private String gmtCreate;

		private String gmtModified;

		private Boolean deleted;

		private String problemClassification;

		private String featureName;

		private Integer priorityLevel;

		private String createUserName;

		private String lastModifiedUserName;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getProblemClassification() {
			return this.problemClassification;
		}

		public void setProblemClassification(String problemClassification) {
			this.problemClassification = problemClassification;
		}

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public Integer getPriorityLevel() {
			return this.priorityLevel;
		}

		public void setPriorityLevel(Integer priorityLevel) {
			this.priorityLevel = priorityLevel;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getLastModifiedUserName() {
			return this.lastModifiedUserName;
		}

		public void setLastModifiedUserName(String lastModifiedUserName) {
			this.lastModifiedUserName = lastModifiedUserName;
		}
	}

	@Override
	public OpsDescribeFeaturePriorityResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFeaturePriorityResponseUnmarshaller.unmarshall(this, context);
	}
}
