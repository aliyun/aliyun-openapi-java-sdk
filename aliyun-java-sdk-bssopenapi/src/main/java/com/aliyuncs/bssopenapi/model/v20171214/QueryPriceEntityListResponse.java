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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryPriceEntityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceEntityListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private List<PriceEntityInfoDTO> priceEntityInfoList;

		public List<PriceEntityInfoDTO> getPriceEntityInfoList() {
			return this.priceEntityInfoList;
		}

		public void setPriceEntityInfoList(List<PriceEntityInfoDTO> priceEntityInfoList) {
			this.priceEntityInfoList = priceEntityInfoList;
		}

		public static class PriceEntityInfoDTO {

			private String priceEntityCode;

			private String priceEntityName;

			private List<PriceFactorDTO> priceFactorList;

			public String getPriceEntityCode() {
				return this.priceEntityCode;
			}

			public void setPriceEntityCode(String priceEntityCode) {
				this.priceEntityCode = priceEntityCode;
			}

			public String getPriceEntityName() {
				return this.priceEntityName;
			}

			public void setPriceEntityName(String priceEntityName) {
				this.priceEntityName = priceEntityName;
			}

			public List<PriceFactorDTO> getPriceFactorList() {
				return this.priceFactorList;
			}

			public void setPriceFactorList(List<PriceFactorDTO> priceFactorList) {
				this.priceFactorList = priceFactorList;
			}

			public static class PriceFactorDTO {

				private String priceFactorCode;

				private String priceFactorName;

				private List<String> priceFactorValueList;

				public String getPriceFactorCode() {
					return this.priceFactorCode;
				}

				public void setPriceFactorCode(String priceFactorCode) {
					this.priceFactorCode = priceFactorCode;
				}

				public String getPriceFactorName() {
					return this.priceFactorName;
				}

				public void setPriceFactorName(String priceFactorName) {
					this.priceFactorName = priceFactorName;
				}

				public List<String> getPriceFactorValueList() {
					return this.priceFactorValueList;
				}

				public void setPriceFactorValueList(List<String> priceFactorValueList) {
					this.priceFactorValueList = priceFactorValueList;
				}
			}
		}
	}

	@Override
	public QueryPriceEntityListResponse getInstance(UnmarshallerContext context) {
		return	QueryPriceEntityListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
