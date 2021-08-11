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
import com.aliyuncs.nas.transform.v20170626.ListDirectoriesAndFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDirectoriesAndFilesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Entry> entries;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Entry> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public static class Entry {

		private String type;

		private Boolean hasInfrequentAccessFile;

		private String ctime;

		private String mtime;

		private Long size;

		private String storageType;

		private String atime;

		private String name;

		private String retrieveTime;

		private String inode;

		private String fileId;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getHasInfrequentAccessFile() {
			return this.hasInfrequentAccessFile;
		}

		public void setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
			this.hasInfrequentAccessFile = hasInfrequentAccessFile;
		}

		public String getCtime() {
			return this.ctime;
		}

		public void setCtime(String ctime) {
			this.ctime = ctime;
		}

		public String getMtime() {
			return this.mtime;
		}

		public void setMtime(String mtime) {
			this.mtime = mtime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getAtime() {
			return this.atime;
		}

		public void setAtime(String atime) {
			this.atime = atime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRetrieveTime() {
			return this.retrieveTime;
		}

		public void setRetrieveTime(String retrieveTime) {
			this.retrieveTime = retrieveTime;
		}

		public String getInode() {
			return this.inode;
		}

		public void setInode(String inode) {
			this.inode = inode;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
	}

	@Override
	public ListDirectoriesAndFilesResponse getInstance(UnmarshallerContext context) {
		return	ListDirectoriesAndFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
