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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsSaleControlStockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsSaleControlStockResponse extends AcsResponse {

	private String requestId;

	private List<SaleControlItem> saleControl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SaleControlItem> getSaleControl() {
		return this.saleControl;
	}

	public void setSaleControl(List<SaleControlItem> saleControl) {
		this.saleControl = saleControl;
	}

	public static class SaleControlItem {

		private String commodityCode;

		private String orderType;

		private List<SaleControlItemsItem> saleControlItems;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public List<SaleControlItemsItem> getSaleControlItems() {
			return this.saleControlItems;
		}

		public void setSaleControlItems(List<SaleControlItemsItem> saleControlItems) {
			this.saleControlItems = saleControlItems;
		}

		public static class SaleControlItemsItem {

			private String moduleCode;

			private SaleControlItem1 saleControlItem1;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public SaleControlItem1 getSaleControlItem1() {
				return this.saleControlItem1;
			}

			public void setSaleControlItem1(SaleControlItem1 saleControlItem1) {
				this.saleControlItem1 = saleControlItem1;
			}

			public static class SaleControlItem1 {

				private List<ConditionSaleControlItem> conditionSaleControl;

				private BasicSaleControl basicSaleControl;

				public List<ConditionSaleControlItem> getConditionSaleControl() {
					return this.conditionSaleControl;
				}

				public void setConditionSaleControl(List<ConditionSaleControlItem> conditionSaleControl) {
					this.conditionSaleControl = conditionSaleControl;
				}

				public BasicSaleControl getBasicSaleControl() {
					return this.basicSaleControl;
				}

				public void setBasicSaleControl(BasicSaleControl basicSaleControl) {
					this.basicSaleControl = basicSaleControl;
				}

				public static class ConditionSaleControlItem {

					private String stockValue;

					private ConditionControl conditionControl;

					private ModuleValue moduleValue;

					public String getStockValue() {
						return this.stockValue;
					}

					public void setStockValue(String stockValue) {
						this.stockValue = stockValue;
					}

					public ConditionControl getConditionControl() {
						return this.conditionControl;
					}

					public void setConditionControl(ConditionControl conditionControl) {
						this.conditionControl = conditionControl;
					}

					public ModuleValue getModuleValue() {
						return this.moduleValue;
					}

					public void setModuleValue(ModuleValue moduleValue) {
						this.moduleValue = moduleValue;
					}

					public static class ConditionControl {

						private String conditionControlModuleCode;

						private String conditionControlModuleValue;

						public String getConditionControlModuleCode() {
							return this.conditionControlModuleCode;
						}

						public void setConditionControlModuleCode(String conditionControlModuleCode) {
							this.conditionControlModuleCode = conditionControlModuleCode;
						}

						public String getConditionControlModuleValue() {
							return this.conditionControlModuleValue;
						}

						public void setConditionControlModuleValue(String conditionControlModuleValue) {
							this.conditionControlModuleValue = conditionControlModuleValue;
						}
					}

					public static class ModuleValue {

						private String moduleMinValue;

						private String moduleMaxValue;

						public String getModuleMinValue() {
							return this.moduleMinValue;
						}

						public void setModuleMinValue(String moduleMinValue) {
							this.moduleMinValue = moduleMinValue;
						}

						public String getModuleMaxValue() {
							return this.moduleMaxValue;
						}

						public void setModuleMaxValue(String moduleMaxValue) {
							this.moduleMaxValue = moduleMaxValue;
						}
					}
				}

				public static class BasicSaleControl {

					private String stockValue;

					private ModuleValue2 moduleValue2;

					public String getStockValue() {
						return this.stockValue;
					}

					public void setStockValue(String stockValue) {
						this.stockValue = stockValue;
					}

					public ModuleValue2 getModuleValue2() {
						return this.moduleValue2;
					}

					public void setModuleValue2(ModuleValue2 moduleValue2) {
						this.moduleValue2 = moduleValue2;
					}

					public static class ModuleValue2 {

						private String moduleMinValue;

						private String moduleMaxValue;

						public String getModuleMinValue() {
							return this.moduleMinValue;
						}

						public void setModuleMinValue(String moduleMinValue) {
							this.moduleMinValue = moduleMinValue;
						}

						public String getModuleMaxValue() {
							return this.moduleMaxValue;
						}

						public void setModuleMaxValue(String moduleMaxValue) {
							this.moduleMaxValue = moduleMaxValue;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeEnsSaleControlStockResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsSaleControlStockResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
