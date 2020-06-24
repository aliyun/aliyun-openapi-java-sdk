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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderCommissionRateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderCommissionRateResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<CommissionModel> commissionModels;

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

	public List<CommissionModel> getCommissionModels() {
		return this.commissionModels;
	}

	public void setCommissionModels(List<CommissionModel> commissionModels) {
		this.commissionModels = commissionModels;
	}

	public static class CommissionModel {

		private Long lmOrderId;

		private CommissionInfo commissionInfo;

		public Long getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(Long lmOrderId) {
			this.lmOrderId = lmOrderId;
		}

		public CommissionInfo getCommissionInfo() {
			return this.commissionInfo;
		}

		public void setCommissionInfo(CommissionInfo commissionInfo) {
			this.commissionInfo = commissionInfo;
		}

		public static class CommissionInfo {

			private String rateType;

			private RateConfig rateConfig;

			public String getRateType() {
				return this.rateType;
			}

			public void setRateType(String rateType) {
				this.rateType = rateType;
			}

			public RateConfig getRateConfig() {
				return this.rateConfig;
			}

			public void setRateConfig(RateConfig rateConfig) {
				this.rateConfig = rateConfig;
			}

			public static class RateConfig {

				private List<ConfigsItem> configs;

				public List<ConfigsItem> getConfigs() {
					return this.configs;
				}

				public void setConfigs(List<ConfigsItem> configs) {
					this.configs = configs;
				}

				public static class ConfigsItem {

					private Long value;

					private String valueUnit;

					public Long getValue() {
						return this.value;
					}

					public void setValue(Long value) {
						this.value = value;
					}

					public String getValueUnit() {
						return this.valueUnit;
					}

					public void setValueUnit(String valueUnit) {
						this.valueUnit = valueUnit;
					}
				}
			}
		}
	}

	@Override
	public QueryOrderCommissionRateResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderCommissionRateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
