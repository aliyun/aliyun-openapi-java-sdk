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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.UpdateSynonymsDictsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateSynonymsDictsResponse extends AcsResponse {

	private String requestId;

	private List<DictList> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DictList> getResult() {
		return this.result;
	}

	public void setResult(List<DictList> result) {
		this.result = result;
	}

	public static class DictList {

		private String name;

		private Long fileSize;

		private String type;

		private String sourceType;

		private OssObject ossObject;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public OssObject getOssObject() {
			return this.ossObject;
		}

		public void setOssObject(OssObject ossObject) {
			this.ossObject = ossObject;
		}

		public static class OssObject {

			private String bucketName;

			private String key;

			private String etag;

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getEtag() {
				return this.etag;
			}

			public void setEtag(String etag) {
				this.etag = etag;
			}
		}
	}

	@Override
	public UpdateSynonymsDictsResponse getInstance(UnmarshallerContext context) {
		return	UpdateSynonymsDictsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
