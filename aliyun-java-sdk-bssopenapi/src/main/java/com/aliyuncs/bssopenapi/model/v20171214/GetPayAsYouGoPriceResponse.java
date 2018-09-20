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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.GetPayAsYouGoPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPayAsYouGoPriceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String currency;

		private List<ModuleDetail> moduleDetails;

		private List<PromotionDetail> promotionDetails;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public List<ModuleDetail> getModuleDetails() {
			return this.moduleDetails;
		}

		public void setModuleDetails(List<ModuleDetail> moduleDetails) {
			this.moduleDetails = moduleDetails;
		}

		public List<PromotionDetail> getPromotionDetails() {
			return this.promotionDetails;
		}

		public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
			this.promotionDetails = promotionDetails;
		}

		public static class ModuleDetail {

			private String moduleCode;

			private Float originalCost;

			private Float invoiceDiscount;

			private Float costAfterDiscount;

			private Float unitPrice;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public Float getOriginalCost() {
				return this.originalCost;
			}

			public void setOriginalCost(Float originalCost) {
				this.originalCost = originalCost;
			}

			public Float getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Float invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public Float getCostAfterDiscount() {
				return this.costAfterDiscount;
			}

			public void setCostAfterDiscount(Float costAfterDiscount) {
				this.costAfterDiscount = costAfterDiscount;
			}

			public Float getUnitPrice() {
				return this.unitPrice;
			}

			public void setUnitPrice(Float unitPrice) {
				this.unitPrice = unitPrice;
			}
		}

		public static class PromotionDetail {

			private String promotionName;

			private String promotionDesc;

			private Long promotionId;

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getPromotionDesc() {
				return this.promotionDesc;
			}

			public void setPromotionDesc(String promotionDesc) {
				this.promotionDesc = promotionDesc;
			}

			public Long getPromotionId() {
				return this.promotionId;
			}

			public void setPromotionId(Long promotionId) {
				this.promotionId = promotionId;
			}
		}
	}

	@Override
	public GetPayAsYouGoPriceResponse getInstance(UnmarshallerContext context) {
		return	GetPayAsYouGoPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
