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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListFpShotFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFpShotFilesResponse extends AcsResponse {

	private String requestId;

	private String nextPageToken;

	private List<FpShotFile> fpShotFileList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<FpShotFile> getFpShotFileList() {
		return this.fpShotFileList;
	}

	public void setFpShotFileList(List<FpShotFile> fpShotFileList) {
		this.fpShotFileList = fpShotFileList;
	}

	public static class FpShotFile {

		private String primaryKey;

		private String fileId;

		private InputFile inputFile;

		public String getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(String primaryKey) {
			this.primaryKey = primaryKey;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public InputFile getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(InputFile inputFile) {
			this.inputFile = inputFile;
		}

		public static class InputFile {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}
	}

	@Override
	public ListFpShotFilesResponse getInstance(UnmarshallerContext context) {
		return	ListFpShotFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
