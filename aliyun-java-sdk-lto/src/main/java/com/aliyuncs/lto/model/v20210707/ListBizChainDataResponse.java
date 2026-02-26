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

package com.aliyuncs.lto.model.v20210707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.ListBizChainDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBizChainDataResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private List<BizChainDataInfo> pageData;

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

		public List<BizChainDataInfo> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<BizChainDataInfo> pageData) {
			this.pageData = pageData;
		}

		public static class BizChainDataInfo {

			private String blockNum;

			private String productKey;

			private String memberName;

			private String deviceName;

			private String blockHash;

			private String txHash;

			private Long timestamp;

			private String iotDataDID;

			public String getBlockNum() {
				return this.blockNum;
			}

			public void setBlockNum(String blockNum) {
				this.blockNum = blockNum;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getBlockHash() {
				return this.blockHash;
			}

			public void setBlockHash(String blockHash) {
				this.blockHash = blockHash;
			}

			public String getTxHash() {
				return this.txHash;
			}

			public void setTxHash(String txHash) {
				this.txHash = txHash;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getIotDataDID() {
				return this.iotDataDID;
			}

			public void setIotDataDID(String iotDataDID) {
				this.iotDataDID = iotDataDID;
			}
		}
	}

	@Override
	public ListBizChainDataResponse getInstance(UnmarshallerContext context) {
		return	ListBizChainDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
