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

package com.aliyuncs.ltl.model.v20190510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ltl.transform.v20190510.DescribeMPCoSPhaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMPCoSPhaseInfoResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String productKey;

		private String iotId;

		private String dataValue;

		private Long blockNumber;

		private String previousHash;

		private String blockHash;

		private String transactionHash;

		private String dataHash;

		private Long timestamp;

		private List<RelatedData> relatedDataList;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getDataValue() {
			return this.dataValue;
		}

		public void setDataValue(String dataValue) {
			this.dataValue = dataValue;
		}

		public Long getBlockNumber() {
			return this.blockNumber;
		}

		public void setBlockNumber(Long blockNumber) {
			this.blockNumber = blockNumber;
		}

		public String getPreviousHash() {
			return this.previousHash;
		}

		public void setPreviousHash(String previousHash) {
			this.previousHash = previousHash;
		}

		public String getBlockHash() {
			return this.blockHash;
		}

		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}

		public String getTransactionHash() {
			return this.transactionHash;
		}

		public void setTransactionHash(String transactionHash) {
			this.transactionHash = transactionHash;
		}

		public String getDataHash() {
			return this.dataHash;
		}

		public void setDataHash(String dataHash) {
			this.dataHash = dataHash;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public List<RelatedData> getRelatedDataList() {
			return this.relatedDataList;
		}

		public void setRelatedDataList(List<RelatedData> relatedDataList) {
			this.relatedDataList = relatedDataList;
		}

		public static class RelatedData {

			private String relatedPhaseId;

			private String relatedPhaseName;

			private String relatedDataKey;

			private String relatedDataSeq;

			private String relatedPhaseDataHash;

			public String getRelatedPhaseId() {
				return this.relatedPhaseId;
			}

			public void setRelatedPhaseId(String relatedPhaseId) {
				this.relatedPhaseId = relatedPhaseId;
			}

			public String getRelatedPhaseName() {
				return this.relatedPhaseName;
			}

			public void setRelatedPhaseName(String relatedPhaseName) {
				this.relatedPhaseName = relatedPhaseName;
			}

			public String getRelatedDataKey() {
				return this.relatedDataKey;
			}

			public void setRelatedDataKey(String relatedDataKey) {
				this.relatedDataKey = relatedDataKey;
			}

			public String getRelatedDataSeq() {
				return this.relatedDataSeq;
			}

			public void setRelatedDataSeq(String relatedDataSeq) {
				this.relatedDataSeq = relatedDataSeq;
			}

			public String getRelatedPhaseDataHash() {
				return this.relatedPhaseDataHash;
			}

			public void setRelatedPhaseDataHash(String relatedPhaseDataHash) {
				this.relatedPhaseDataHash = relatedPhaseDataHash;
			}
		}
	}

	@Override
	public DescribeMPCoSPhaseInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMPCoSPhaseInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
