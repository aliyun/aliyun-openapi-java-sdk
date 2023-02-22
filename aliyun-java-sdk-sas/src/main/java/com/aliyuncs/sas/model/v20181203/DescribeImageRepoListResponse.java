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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageRepoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageRepoListResponse extends AcsResponse {

	private Integer allTargetCount;

	private String requestId;

	private Integer addTargetCount;

	private Integer delTargetCount;

	private List<ImageRepo> imageRepoList;

	private PageInfo pageInfo;

	public Integer getAllTargetCount() {
		return this.allTargetCount;
	}

	public void setAllTargetCount(Integer allTargetCount) {
		this.allTargetCount = allTargetCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAddTargetCount() {
		return this.addTargetCount;
	}

	public void setAddTargetCount(Integer addTargetCount) {
		this.addTargetCount = addTargetCount;
	}

	public Integer getDelTargetCount() {
		return this.delTargetCount;
	}

	public void setDelTargetCount(Integer delTargetCount) {
		this.delTargetCount = delTargetCount;
	}

	public List<ImageRepo> getImageRepoList() {
		return this.imageRepoList;
	}

	public void setImageRepoList(List<ImageRepo> imageRepoList) {
		this.imageRepoList = imageRepoList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ImageRepo {

		private String flag;

		private String repoName;

		private String repoNamespace;

		public String getFlag() {
			return this.flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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
	}

	@Override
	public DescribeImageRepoListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageRepoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
