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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryCommodityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCommodityListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Boolean success;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<CommodityDTO> commodityList;

		public List<CommodityDTO> getCommodityList() {
			return this.commodityList;
		}

		public void setCommodityList(List<CommodityDTO> commodityList) {
			this.commodityList = commodityList;
		}

		public static class CommodityDTO {

			private String commodityCode;

			private String commodityName;

			private String chargeType;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getCommodityName() {
				return this.commodityName;
			}

			public void setCommodityName(String commodityName) {
				this.commodityName = commodityName;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}
		}
	}

	@Override
	public QueryCommodityListResponse getInstance(UnmarshallerContext context) {
		return	QueryCommodityListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
