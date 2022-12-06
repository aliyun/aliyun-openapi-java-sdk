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
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySavingsPlansDiscountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingsPlansDiscountResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private String hostId;

		private List<SavingsPlansDiscountResponse> items;

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public List<SavingsPlansDiscountResponse> getItems() {
			return this.items;
		}

		public void setItems(List<SavingsPlansDiscountResponse> items) {
			this.items = items;
		}

		public static class SavingsPlansDiscountResponse {

			private String commodityName;

			private String moduleName;

			private String spnType;

			private String payMode;

			private String cycle;

			private String region;

			private String spec;

			private String discountRate;

			private String contractDiscountRate;

			public String getCommodityName() {
				return this.commodityName;
			}

			public void setCommodityName(String commodityName) {
				this.commodityName = commodityName;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public String getSpnType() {
				return this.spnType;
			}

			public void setSpnType(String spnType) {
				this.spnType = spnType;
			}

			public String getPayMode() {
				return this.payMode;
			}

			public void setPayMode(String payMode) {
				this.payMode = payMode;
			}

			public String getCycle() {
				return this.cycle;
			}

			public void setCycle(String cycle) {
				this.cycle = cycle;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getDiscountRate() {
				return this.discountRate;
			}

			public void setDiscountRate(String discountRate) {
				this.discountRate = discountRate;
			}

			public String getContractDiscountRate() {
				return this.contractDiscountRate;
			}

			public void setContractDiscountRate(String contractDiscountRate) {
				this.contractDiscountRate = contractDiscountRate;
			}
		}
	}

	@Override
	public QuerySavingsPlansDiscountResponse getInstance(UnmarshallerContext context) {
		return	QuerySavingsPlansDiscountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
