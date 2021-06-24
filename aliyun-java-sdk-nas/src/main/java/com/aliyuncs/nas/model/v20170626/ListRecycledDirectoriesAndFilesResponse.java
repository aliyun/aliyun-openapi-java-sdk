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
import com.aliyuncs.nas.transform.v20170626.ListRecycledDirectoriesAndFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecycledDirectoriesAndFilesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Entry> entries;

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

	public List<Entry> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public static class Entry {

		private String fileId;

		private String type;

		private String name;

		private String deleteTime;

		private String inode;

		private String aTime;

		private String mTime;

		private String cTime;

		private Long size;

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDeleteTime() {
			return this.deleteTime;
		}

		public void setDeleteTime(String deleteTime) {
			this.deleteTime = deleteTime;
		}

		public String getInode() {
			return this.inode;
		}

		public void setInode(String inode) {
			this.inode = inode;
		}

		public String getATime() {
			return this.aTime;
		}

		public void setATime(String aTime) {
			this.aTime = aTime;
		}

		public String getMTime() {
			return this.mTime;
		}

		public void setMTime(String mTime) {
			this.mTime = mTime;
		}

		public String getCTime() {
			return this.cTime;
		}

		public void setCTime(String cTime) {
			this.cTime = cTime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}
	}

	@Override
	public ListRecycledDirectoriesAndFilesResponse getInstance(UnmarshallerContext context) {
		return	ListRecycledDirectoriesAndFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
