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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.finance_rule.transform.v20180808.QueryOuNationalRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOuNationalRuleResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String remark;

	private Boolean success;

	private List<FinanceRuleOuNationalRuleDTO> resultObj;

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

	public List<FinanceRuleOuNationalRuleDTO> getResultObj() {
		return this.resultObj;
	}

	public void setResultObj(List<FinanceRuleOuNationalRuleDTO> resultObj) {
		this.resultObj = resultObj;
	}

	public ExtendInfo getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(ExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public static class FinanceRuleOuNationalRuleDTO {

		private String countryCode;

		private String countryNameCn;

		private String bid;

		private String countryNameEn;

		private List<FinanceRuleOuDTO> ouRuleDTOS;

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCountryNameCn() {
			return this.countryNameCn;
		}

		public void setCountryNameCn(String countryNameCn) {
			this.countryNameCn = countryNameCn;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getCountryNameEn() {
			return this.countryNameEn;
		}

		public void setCountryNameEn(String countryNameEn) {
			this.countryNameEn = countryNameEn;
		}

		public List<FinanceRuleOuDTO> getOuRuleDTOS() {
			return this.ouRuleDTOS;
		}

		public void setOuRuleDTOS(List<FinanceRuleOuDTO> ouRuleDTOS) {
			this.ouRuleDTOS = ouRuleDTOS;
		}

		public static class FinanceRuleOuDTO {

			private String ouCode;

			private Float preChargeRate;

			private Integer isPrePayTaxes;

			private String ouName;

			private Float preChargeMinPrice;

			private String companyEntity;

			private String minCurrency;

			private List<String> settlementCurrencyList;

			private List<String> priceCurrencyList;

			public String getOuCode() {
				return this.ouCode;
			}

			public void setOuCode(String ouCode) {
				this.ouCode = ouCode;
			}

			public Float getPreChargeRate() {
				return this.preChargeRate;
			}

			public void setPreChargeRate(Float preChargeRate) {
				this.preChargeRate = preChargeRate;
			}

			public Integer getIsPrePayTaxes() {
				return this.isPrePayTaxes;
			}

			public void setIsPrePayTaxes(Integer isPrePayTaxes) {
				this.isPrePayTaxes = isPrePayTaxes;
			}

			public String getOuName() {
				return this.ouName;
			}

			public void setOuName(String ouName) {
				this.ouName = ouName;
			}

			public Float getPreChargeMinPrice() {
				return this.preChargeMinPrice;
			}

			public void setPreChargeMinPrice(Float preChargeMinPrice) {
				this.preChargeMinPrice = preChargeMinPrice;
			}

			public String getCompanyEntity() {
				return this.companyEntity;
			}

			public void setCompanyEntity(String companyEntity) {
				this.companyEntity = companyEntity;
			}

			public String getMinCurrency() {
				return this.minCurrency;
			}

			public void setMinCurrency(String minCurrency) {
				this.minCurrency = minCurrency;
			}

			public List<String> getSettlementCurrencyList() {
				return this.settlementCurrencyList;
			}

			public void setSettlementCurrencyList(List<String> settlementCurrencyList) {
				this.settlementCurrencyList = settlementCurrencyList;
			}

			public List<String> getPriceCurrencyList() {
				return this.priceCurrencyList;
			}

			public void setPriceCurrencyList(List<String> priceCurrencyList) {
				this.priceCurrencyList = priceCurrencyList;
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
	public QueryOuNationalRuleResponse getInstance(UnmarshallerContext context) {
		return	QueryOuNationalRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
