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

package com.aliyuncs.baas.model.v20180731;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.QueryTransactionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTransactionResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String hash;

		private Long blockHeight;

		private Integer blockVersion;

		private Long createTime;

		private Integer category;

		private Integer type;

		private Integer referenceCount;

		private String content;

		private String contentHash;

		private String keyWrap;

		private String nonce;

		private String keyName;

		private ReferenceList referenceList;

		public String getHash() {
			return this.hash;
		}

		public void setHash(String hash) {
			this.hash = hash;
		}

		public Long getBlockHeight() {
			return this.blockHeight;
		}

		public void setBlockHeight(Long blockHeight) {
			this.blockHeight = blockHeight;
		}

		public Integer getBlockVersion() {
			return this.blockVersion;
		}

		public void setBlockVersion(Integer blockVersion) {
			this.blockVersion = blockVersion;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getCategory() {
			return this.category;
		}

		public void setCategory(Integer category) {
			this.category = category;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getReferenceCount() {
			return this.referenceCount;
		}

		public void setReferenceCount(Integer referenceCount) {
			this.referenceCount = referenceCount;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContentHash() {
			return this.contentHash;
		}

		public void setContentHash(String contentHash) {
			this.contentHash = contentHash;
		}

		public String getKeyWrap() {
			return this.keyWrap;
		}

		public void setKeyWrap(String keyWrap) {
			this.keyWrap = keyWrap;
		}

		public String getNonce() {
			return this.nonce;
		}

		public void setNonce(String nonce) {
			this.nonce = nonce;
		}

		public String getKeyName() {
			return this.keyName;
		}

		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

		public ReferenceList getReferenceList() {
			return this.referenceList;
		}

		public void setReferenceList(ReferenceList referenceList) {
			this.referenceList = referenceList;
		}

		public static class ReferenceList {

			private Integer type;

			private Integer length;

			private String data;

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getLength() {
				return this.length;
			}

			public void setLength(Integer length) {
				this.length = length;
			}

			public String getData() {
				return this.data;
			}

			public void setData(String data) {
				this.data = data;
			}
		}
	}

	@Override
	public QueryTransactionResponse getInstance(UnmarshallerContext context) {
		return	QueryTransactionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
