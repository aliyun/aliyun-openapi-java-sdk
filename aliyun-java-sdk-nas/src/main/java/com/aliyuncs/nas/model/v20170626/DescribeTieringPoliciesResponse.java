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
import com.aliyuncs.nas.transform.v20170626.DescribeTieringPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTieringPoliciesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<TieringPolicy> tieringPolicies;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<TieringPolicy> getTieringPolicies() {
		return this.tieringPolicies;
	}

	public void setTieringPolicies(List<TieringPolicy> tieringPolicies) {
		this.tieringPolicies = tieringPolicies;
	}

	public static class TieringPolicy {

		private String name;

		private String description;

		private Integer refCount;

		private Long mtime;

		private Long atime;

		private Long ctime;

		private Long size;

		private String fileName;

		private Long recallTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getRefCount() {
			return this.refCount;
		}

		public void setRefCount(Integer refCount) {
			this.refCount = refCount;
		}

		public Long getMtime() {
			return this.mtime;
		}

		public void setMtime(Long mtime) {
			this.mtime = mtime;
		}

		public Long getAtime() {
			return this.atime;
		}

		public void setAtime(Long atime) {
			this.atime = atime;
		}

		public Long getCtime() {
			return this.ctime;
		}

		public void setCtime(Long ctime) {
			this.ctime = ctime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Long getRecallTime() {
			return this.recallTime;
		}

		public void setRecallTime(Long recallTime) {
			this.recallTime = recallTime;
		}
	}

	@Override
	public DescribeTieringPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTieringPoliciesResponseUnmarshaller.unmarshall(this, context);
	}
}
