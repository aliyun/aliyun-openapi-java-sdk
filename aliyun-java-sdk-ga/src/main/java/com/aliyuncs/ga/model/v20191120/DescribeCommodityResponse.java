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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeCommodityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommodityResponse extends AcsResponse {

	private String commodityCode;

	private String commodityName;

	private String requestId;

	private List<ComponentsItem> components;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ComponentsItem> getComponents() {
		return this.components;
	}

	public void setComponents(List<ComponentsItem> components) {
		this.components = components;
	}

	public static class ComponentsItem {

		private String componentCode;

		private String componentName;

		private List<PropertiesItem> properties;

		public String getComponentCode() {
			return this.componentCode;
		}

		public void setComponentCode(String componentCode) {
			this.componentCode = componentCode;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public List<PropertiesItem> getProperties() {
			return this.properties;
		}

		public void setProperties(List<PropertiesItem> properties) {
			this.properties = properties;
		}

		public static class PropertiesItem {

			private String code;

			private String name;

			private List<PropertyValueListItem> propertyValueList;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<PropertyValueListItem> getPropertyValueList() {
				return this.propertyValueList;
			}

			public void setPropertyValueList(List<PropertyValueListItem> propertyValueList) {
				this.propertyValueList = propertyValueList;
			}

			public static class PropertyValueListItem {

				private String text;

				private String value;

				private String tips;

				private Long orderIndex;

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getTips() {
					return this.tips;
				}

				public void setTips(String tips) {
					this.tips = tips;
				}

				public Long getOrderIndex() {
					return this.orderIndex;
				}

				public void setOrderIndex(Long orderIndex) {
					this.orderIndex = orderIndex;
				}
			}
		}
	}

	@Override
	public DescribeCommodityResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommodityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
