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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.ListObjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListObjectsResponse extends AcsResponse {

	private String requestId;

	private String bucketName;

	private String prefix;

	private Integer maxKeys;

	private Integer keyCount;

	private String delimiter;

	private String encodingType;

	private Boolean isTruncated;

	private String continuationToken;

	private String nextContinuationToken;

	private String marker;

	private String nextMarker;

	private List<Content> contents;

	private List<String> commonPrefixes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Integer getMaxKeys() {
		return this.maxKeys;
	}

	public void setMaxKeys(Integer maxKeys) {
		this.maxKeys = maxKeys;
	}

	public Integer getKeyCount() {
		return this.keyCount;
	}

	public void setKeyCount(Integer keyCount) {
		this.keyCount = keyCount;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getEncodingType() {
		return this.encodingType;
	}

	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getContinuationToken() {
		return this.continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public String getNextContinuationToken() {
		return this.nextContinuationToken;
	}

	public void setNextContinuationToken(String nextContinuationToken) {
		this.nextContinuationToken = nextContinuationToken;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public List<String> getCommonPrefixes() {
		return this.commonPrefixes;
	}

	public void setCommonPrefixes(List<String> commonPrefixes) {
		this.commonPrefixes = commonPrefixes;
	}

	public static class Content {

		private String key;

		private String lastModified;

		private String eTag;

		private Long size;

		private String storageClass;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(String lastModified) {
			this.lastModified = lastModified;
		}

		public String getETag() {
			return this.eTag;
		}

		public void setETag(String eTag) {
			this.eTag = eTag;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}
	}

	@Override
	public ListObjectsResponse getInstance(UnmarshallerContext context) {
		return	ListObjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
