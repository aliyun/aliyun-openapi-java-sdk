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
import com.aliyuncs.nas.transform.v20170626.ListDataInsightDirectoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataInsightDirectoriesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private String fileSystemId;

	private String parentDir;

	private Directory directory;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
	}

	public String getParentDir() {
		return this.parentDir;
	}

	public void setParentDir(String parentDir) {
		this.parentDir = parentDir;
	}

	public Directory getDirectory() {
		return this.directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public static class Directory {

		private Long dirCapacity;

		private Long dirCapacityOnline;

		private Long fileCount;

		private Long fileCountOnline;

		private Long fileCountOffline;

		private Long dirCapacityOffline;

		private List<SubDirectoriesItem> subDirectories;

		public Long getDirCapacity() {
			return this.dirCapacity;
		}

		public void setDirCapacity(Long dirCapacity) {
			this.dirCapacity = dirCapacity;
		}

		public Long getDirCapacityOnline() {
			return this.dirCapacityOnline;
		}

		public void setDirCapacityOnline(Long dirCapacityOnline) {
			this.dirCapacityOnline = dirCapacityOnline;
		}

		public Long getFileCount() {
			return this.fileCount;
		}

		public void setFileCount(Long fileCount) {
			this.fileCount = fileCount;
		}

		public Long getFileCountOnline() {
			return this.fileCountOnline;
		}

		public void setFileCountOnline(Long fileCountOnline) {
			this.fileCountOnline = fileCountOnline;
		}

		public Long getFileCountOffline() {
			return this.fileCountOffline;
		}

		public void setFileCountOffline(Long fileCountOffline) {
			this.fileCountOffline = fileCountOffline;
		}

		public Long getDirCapacityOffline() {
			return this.dirCapacityOffline;
		}

		public void setDirCapacityOffline(Long dirCapacityOffline) {
			this.dirCapacityOffline = dirCapacityOffline;
		}

		public List<SubDirectoriesItem> getSubDirectories() {
			return this.subDirectories;
		}

		public void setSubDirectories(List<SubDirectoriesItem> subDirectories) {
			this.subDirectories = subDirectories;
		}

		public static class SubDirectoriesItem {

			private Long dirCapacity;

			private Long dirCapacityOnline;

			private Integer dirLevel;

			private Long fileCount;

			private String dirName;

			private Long fileCountOnline;

			private Long fileCountOffline;

			private String createdAt;

			private Long dirCapacityOffline;

			private String fileSystemId;

			private String lastAccessTime;

			private String updatedAt;

			public Long getDirCapacity() {
				return this.dirCapacity;
			}

			public void setDirCapacity(Long dirCapacity) {
				this.dirCapacity = dirCapacity;
			}

			public Long getDirCapacityOnline() {
				return this.dirCapacityOnline;
			}

			public void setDirCapacityOnline(Long dirCapacityOnline) {
				this.dirCapacityOnline = dirCapacityOnline;
			}

			public Integer getDirLevel() {
				return this.dirLevel;
			}

			public void setDirLevel(Integer dirLevel) {
				this.dirLevel = dirLevel;
			}

			public Long getFileCount() {
				return this.fileCount;
			}

			public void setFileCount(Long fileCount) {
				this.fileCount = fileCount;
			}

			public String getDirName() {
				return this.dirName;
			}

			public void setDirName(String dirName) {
				this.dirName = dirName;
			}

			public Long getFileCountOnline() {
				return this.fileCountOnline;
			}

			public void setFileCountOnline(Long fileCountOnline) {
				this.fileCountOnline = fileCountOnline;
			}

			public Long getFileCountOffline() {
				return this.fileCountOffline;
			}

			public void setFileCountOffline(Long fileCountOffline) {
				this.fileCountOffline = fileCountOffline;
			}

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}

			public Long getDirCapacityOffline() {
				return this.dirCapacityOffline;
			}

			public void setDirCapacityOffline(Long dirCapacityOffline) {
				this.dirCapacityOffline = dirCapacityOffline;
			}

			public String getFileSystemId() {
				return this.fileSystemId;
			}

			public void setFileSystemId(String fileSystemId) {
				this.fileSystemId = fileSystemId;
			}

			public String getLastAccessTime() {
				return this.lastAccessTime;
			}

			public void setLastAccessTime(String lastAccessTime) {
				this.lastAccessTime = lastAccessTime;
			}

			public String getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(String updatedAt) {
				this.updatedAt = updatedAt;
			}
		}
	}

	@Override
	public ListDataInsightDirectoriesResponse getInstance(UnmarshallerContext context) {
		return	ListDataInsightDirectoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
