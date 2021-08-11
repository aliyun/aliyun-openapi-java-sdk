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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.GetDirectoryOrFilePropertiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDirectoryOrFilePropertiesResponse extends AcsResponse {

	private String requestId;

	private Entry entry;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Entry getEntry() {
		return this.entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public static class Entry {

		private String type;

		private String inode;

		private String storageType;

		private String aTime;

		private Long size;

		private Boolean hasInfrequentAccessFile;

		private String cTime;

		private String retrieveTime;

		private String mTime;

		private String name;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getInode() {
			return this.inode;
		}

		public void setInode(String inode) {
			this.inode = inode;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getATime() {
			return this.aTime;
		}

		public void setATime(String aTime) {
			this.aTime = aTime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Boolean getHasInfrequentAccessFile() {
			return this.hasInfrequentAccessFile;
		}

		public void setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
			this.hasInfrequentAccessFile = hasInfrequentAccessFile;
		}

		public String getCTime() {
			return this.cTime;
		}

		public void setCTime(String cTime) {
			this.cTime = cTime;
		}

		public String getRetrieveTime() {
			return this.retrieveTime;
		}

		public void setRetrieveTime(String retrieveTime) {
			this.retrieveTime = retrieveTime;
		}

		public String getMTime() {
			return this.mTime;
		}

		public void setMTime(String mTime) {
			this.mTime = mTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public GetDirectoryOrFilePropertiesResponse getInstance(UnmarshallerContext context) {
		return	GetDirectoryOrFilePropertiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
