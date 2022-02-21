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

package com.aliyuncs.finance_rule.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finance_rule.transform.v20180808.QueryFinanceRuleByCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFinanceRuleByCodeResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String remark;

	private Boolean success;

	private ResultObj resultObj;

	private ExtendInfo extendInfo;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResultObj getResultObj() {
		return this.resultObj;
	}

	public void setResultObj(ResultObj resultObj) {
		this.resultObj = resultObj;
	}

	public ExtendInfo getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(ExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public static class ResultObj {

		private FinanceRuleGoodsAddDTO financeRuleGoodsAddDTO;

		private FinanceGoodsRuleConditionDtlDTO financeGoodsRuleConditionDtlDTO;

		public FinanceRuleGoodsAddDTO getFinanceRuleGoodsAddDTO() {
			return this.financeRuleGoodsAddDTO;
		}

		public void setFinanceRuleGoodsAddDTO(FinanceRuleGoodsAddDTO financeRuleGoodsAddDTO) {
			this.financeRuleGoodsAddDTO = financeRuleGoodsAddDTO;
		}

		public FinanceGoodsRuleConditionDtlDTO getFinanceGoodsRuleConditionDtlDTO() {
			return this.financeGoodsRuleConditionDtlDTO;
		}

		public void setFinanceGoodsRuleConditionDtlDTO(FinanceGoodsRuleConditionDtlDTO financeGoodsRuleConditionDtlDTO) {
			this.financeGoodsRuleConditionDtlDTO = financeGoodsRuleConditionDtlDTO;
		}

		public static class FinanceRuleGoodsAddDTO {

			private String code;

			private String skuName;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSkuName() {
				return this.skuName;
			}

			public void setSkuName(String skuName) {
				this.skuName = skuName;
			}
		}

		public static class FinanceGoodsRuleConditionDtlDTO {

			private String invoiceContent;

			private String invoiceCountry;

			private String invoiceOu;

			private String invoiceRate;

			private String invoiceRateItem;

			private Integer invoiceContentType;

			public String getInvoiceContent() {
				return this.invoiceContent;
			}

			public void setInvoiceContent(String invoiceContent) {
				this.invoiceContent = invoiceContent;
			}

			public String getInvoiceCountry() {
				return this.invoiceCountry;
			}

			public void setInvoiceCountry(String invoiceCountry) {
				this.invoiceCountry = invoiceCountry;
			}

			public String getInvoiceOu() {
				return this.invoiceOu;
			}

			public void setInvoiceOu(String invoiceOu) {
				this.invoiceOu = invoiceOu;
			}

			public String getInvoiceRate() {
				return this.invoiceRate;
			}

			public void setInvoiceRate(String invoiceRate) {
				this.invoiceRate = invoiceRate;
			}

			public String getInvoiceRateItem() {
				return this.invoiceRateItem;
			}

			public void setInvoiceRateItem(String invoiceRateItem) {
				this.invoiceRateItem = invoiceRateItem;
			}

			public Integer getInvoiceContentType() {
				return this.invoiceContentType;
			}

			public void setInvoiceContentType(Integer invoiceContentType) {
				this.invoiceContentType = invoiceContentType;
			}
		}
	}

	public static class ExtendInfo {

		private String placeHolder1;

		public String getPlaceHolder1() {
			return this.placeHolder1;
		}

		public void setPlaceHolder1(String placeHolder1) {
			this.placeHolder1 = placeHolder1;
		}
	}

	@Override
	public QueryFinanceRuleByCodeResponse getInstance(UnmarshallerContext context) {
		return	QueryFinanceRuleByCodeResponseUnmarshaller.unmarshall(this, context);
	}
}
