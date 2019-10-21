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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainTransactionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainTransactionResponse extends AcsResponse {

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

		private Long createTime;

		private Long blockHeight;

		private String blockHash;

		private String blockVersion;

		private Transaction transaction;

		public String getHash() {
			return this.hash;
		}

		public void setHash(String hash) {
			this.hash = hash;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getBlockHeight() {
			return this.blockHeight;
		}

		public void setBlockHeight(Long blockHeight) {
			this.blockHeight = blockHeight;
		}

		public String getBlockHash() {
			return this.blockHash;
		}

		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}

		public String getBlockVersion() {
			return this.blockVersion;
		}

		public void setBlockVersion(String blockVersion) {
			this.blockVersion = blockVersion;
		}

		public Transaction getTransaction() {
			return this.transaction;
		}

		public void setTransaction(Transaction transaction) {
			this.transaction = transaction;
		}

		public static class Transaction {

			private String txType;

			private String data;

			private String hash;

			private String from;

			private String to;

			private Long timestamp;

			private Long period;

			private String nonce;

			private String gas;

			private String value;

			private List<String> signatures;

			private List<String> extentions;

			public String getTxType() {
				return this.txType;
			}

			public void setTxType(String txType) {
				this.txType = txType;
			}

			public String getData() {
				return this.data;
			}

			public void setData(String data) {
				this.data = data;
			}

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

			public String getTo() {
				return this.to;
			}

			public void setTo(String to) {
				this.to = to;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Long getPeriod() {
				return this.period;
			}

			public void setPeriod(Long period) {
				this.period = period;
			}

			public String getNonce() {
				return this.nonce;
			}

			public void setNonce(String nonce) {
				this.nonce = nonce;
			}

			public String getGas() {
				return this.gas;
			}

			public void setGas(String gas) {
				this.gas = gas;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public List<String> getSignatures() {
				return this.signatures;
			}

			public void setSignatures(List<String> signatures) {
				this.signatures = signatures;
			}

			public List<String> getExtentions() {
				return this.extentions;
			}

			public void setExtentions(List<String> extentions) {
				this.extentions = extentions;
			}
		}
	}

	@Override
	public DescribeAntChainTransactionResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainTransactionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
