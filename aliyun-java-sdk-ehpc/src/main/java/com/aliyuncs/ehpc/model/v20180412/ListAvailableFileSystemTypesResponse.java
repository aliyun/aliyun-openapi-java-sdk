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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListAvailableFileSystemTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableFileSystemTypesResponse extends AcsResponse {

	private String requestId;

	private List<FileSystemTypes> fileSystemTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FileSystemTypes> getFileSystemTypeList() {
		return this.fileSystemTypeList;
	}

	public void setFileSystemTypeList(List<FileSystemTypes> fileSystemTypeList) {
		this.fileSystemTypeList = fileSystemTypeList;
	}

	public static class FileSystemTypes {

		private String fileSystemType;

		private Boolean available;

		private String protocolType;

		private List<String> storageTypes;

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public List<String> getStorageTypes() {
			return this.storageTypes;
		}

		public void setStorageTypes(List<String> storageTypes) {
			this.storageTypes = storageTypes;
		}
	}

	@Override
	public ListAvailableFileSystemTypesResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableFileSystemTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
