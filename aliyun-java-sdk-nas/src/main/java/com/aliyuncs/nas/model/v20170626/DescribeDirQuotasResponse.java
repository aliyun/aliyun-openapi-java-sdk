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
import com.aliyuncs.nas.transform.v20170626.DescribeDirQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDirQuotasResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<DirQuotaInfo> dirQuotaInfos;

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

	public List<DirQuotaInfo> getDirQuotaInfos() {
		return this.dirQuotaInfos;
	}

	public void setDirQuotaInfos(List<DirQuotaInfo> dirQuotaInfos) {
		this.dirQuotaInfos = dirQuotaInfos;
	}

	public static class DirQuotaInfo {

		private String path;

		private String dirInode;

		private String status;

		private List<UserQuotaInfo> userQuotaInfos;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getDirInode() {
			return this.dirInode;
		}

		public void setDirInode(String dirInode) {
			this.dirInode = dirInode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<UserQuotaInfo> getUserQuotaInfos() {
			return this.userQuotaInfos;
		}

		public void setUserQuotaInfos(List<UserQuotaInfo> userQuotaInfos) {
			this.userQuotaInfos = userQuotaInfos;
		}

		public static class UserQuotaInfo {

			private String userType;

			private String userId;

			private String quotaType;

			private Long sizeLimit;

			private Long sizeReal;

			private Long fileCountLimit;

			private Long fileCountReal;

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getQuotaType() {
				return this.quotaType;
			}

			public void setQuotaType(String quotaType) {
				this.quotaType = quotaType;
			}

			public Long getSizeLimit() {
				return this.sizeLimit;
			}

			public void setSizeLimit(Long sizeLimit) {
				this.sizeLimit = sizeLimit;
			}

			public Long getSizeReal() {
				return this.sizeReal;
			}

			public void setSizeReal(Long sizeReal) {
				this.sizeReal = sizeReal;
			}

			public Long getFileCountLimit() {
				return this.fileCountLimit;
			}

			public void setFileCountLimit(Long fileCountLimit) {
				this.fileCountLimit = fileCountLimit;
			}

			public Long getFileCountReal() {
				return this.fileCountReal;
			}

			public void setFileCountReal(Long fileCountReal) {
				this.fileCountReal = fileCountReal;
			}
		}
	}

	@Override
	public DescribeDirQuotasResponse getInstance(UnmarshallerContext context) {
		return	DescribeDirQuotasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
