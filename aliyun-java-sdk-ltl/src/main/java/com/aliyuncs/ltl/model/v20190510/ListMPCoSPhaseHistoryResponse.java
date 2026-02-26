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
import com.aliyuncs.ltl.transform.v20190510.ListMPCoSPhaseHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMPCoSPhaseHistoryResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer num;

		private Integer total;

		private Integer size;

		private List<HistoryDataInfo> pageData;

		public Integer getNum() {
			return this.num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public List<HistoryDataInfo> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<HistoryDataInfo> pageData) {
			this.pageData = pageData;
		}

		public static class HistoryDataInfo {

			private String productKey;

			private String previousHash;

			private String dataHash;

			private String dataSeq;

			private String dataValue;

			private Long timestamp;

			private String transactionHash;

			private String blockHash;

			private Long blockNumber;

			private String iotId;

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getPreviousHash() {
				return this.previousHash;
			}

			public void setPreviousHash(String previousHash) {
				this.previousHash = previousHash;
			}

			public String getDataHash() {
				return this.dataHash;
			}

			public void setDataHash(String dataHash) {
				this.dataHash = dataHash;
			}

			public String getDataSeq() {
				return this.dataSeq;
			}

			public void setDataSeq(String dataSeq) {
				this.dataSeq = dataSeq;
			}

			public String getDataValue() {
				return this.dataValue;
			}

			public void setDataValue(String dataValue) {
				this.dataValue = dataValue;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getTransactionHash() {
				return this.transactionHash;
			}

			public void setTransactionHash(String transactionHash) {
				this.transactionHash = transactionHash;
			}

			public String getBlockHash() {
				return this.blockHash;
			}

			public void setBlockHash(String blockHash) {
				this.blockHash = blockHash;
			}

			public Long getBlockNumber() {
				return this.blockNumber;
			}

			public void setBlockNumber(Long blockNumber) {
				this.blockNumber = blockNumber;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}
		}
	}

	@Override
	public ListMPCoSPhaseHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListMPCoSPhaseHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
