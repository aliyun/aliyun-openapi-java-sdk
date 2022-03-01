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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainBlockV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainBlockV2Response extends AcsResponse {

	private String httpStatusCode;

	private String requestId;

	private Boolean success;

	private String resultMessage;

	private String code;

	private String message;

	private String resultCode;

	private Result result;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String previousHash;

		private Long version;

		private String rootTxHash;

		private Long createTime;

		private Integer transactionSize;

		private Integer height;

		private String blockHash;

		private String antChainId;

		private List<TransSummaryListItem> transSummaryList;

		public String getPreviousHash() {
			return this.previousHash;
		}

		public void setPreviousHash(String previousHash) {
			this.previousHash = previousHash;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public String getRootTxHash() {
			return this.rootTxHash;
		}

		public void setRootTxHash(String rootTxHash) {
			this.rootTxHash = rootTxHash;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getTransactionSize() {
			return this.transactionSize;
		}

		public void setTransactionSize(Integer transactionSize) {
			this.transactionSize = transactionSize;
		}

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public String getBlockHash() {
			return this.blockHash;
		}

		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public List<TransSummaryListItem> getTransSummaryList() {
			return this.transSummaryList;
		}

		public void setTransSummaryList(List<TransSummaryListItem> transSummaryList) {
			this.transSummaryList = transSummaryList;
		}

		public static class TransSummaryListItem {

			private String hash;

			private String from;

			private String transTypeV10;

			private Long createTime;

			private String transTypeV6;

			private Long height;

			private String to;

			private Long gasUsed;

			private String blockHash;

			private Integer referenceCount;

			private Integer category;

			private String alias;

			public String getHash() {
				return this.hash;
			}

			public void setHash(String hash) {
				this.hash = hash;
			}

			public String getFrom() {
				return this.from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getTransTypeV10() {
				return this.transTypeV10;
			}

			public void setTransTypeV10(String transTypeV10) {
				this.transTypeV10 = transTypeV10;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getTransTypeV6() {
				return this.transTypeV6;
			}

			public void setTransTypeV6(String transTypeV6) {
				this.transTypeV6 = transTypeV6;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public String getTo() {
				return this.to;
			}

			public void setTo(String to) {
				this.to = to;
			}

			public Long getGasUsed() {
				return this.gasUsed;
			}

			public void setGasUsed(Long gasUsed) {
				this.gasUsed = gasUsed;
			}

			public String getBlockHash() {
				return this.blockHash;
			}

			public void setBlockHash(String blockHash) {
				this.blockHash = blockHash;
			}

			public Integer getReferenceCount() {
				return this.referenceCount;
			}

			public void setReferenceCount(Integer referenceCount) {
				this.referenceCount = referenceCount;
			}

			public Integer getCategory() {
				return this.category;
			}

			public void setCategory(Integer category) {
				this.category = category;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}
		}
	}

	@Override
	public DescribeAntChainBlockV2Response getInstance(UnmarshallerContext context) {
		return	DescribeAntChainBlockV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
