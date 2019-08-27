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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeStacksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStacksResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Stack> stacks;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<Stack> getStacks() {
		return this.stacks;
	}

	public void setStacks(List<Stack> stacks) {
		this.stacks = stacks;
	}

	public static class Stack {

		private String stackId;

		private String stackName;

		private String categoryName;

		private Boolean recommendedStack;

		private Boolean latestStack;

		private Integer versionCode;

		private Long createTime;

		private Long updateTime;

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Boolean getRecommendedStack() {
			return this.recommendedStack;
		}

		public void setRecommendedStack(Boolean recommendedStack) {
			this.recommendedStack = recommendedStack;
		}

		public Boolean getLatestStack() {
			return this.latestStack;
		}

		public void setLatestStack(Boolean latestStack) {
			this.latestStack = latestStack;
		}

		public Integer getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(Integer versionCode) {
			this.versionCode = versionCode;
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
	public DescribeStacksResponse getInstance(UnmarshallerContext context) {
		return	DescribeStacksResponseUnmarshaller.unmarshall(this, context);
	}
}
