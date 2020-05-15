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

package com.aliyuncs.workorder.model.v20200326;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.workorder.transform.v20200326.ListProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductsResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<TechMoreItem> techMore;

		private List<HotConsultationItem> hotConsultation;

		private List<ConsultationMoreItem> consultationMore;

		private List<HotTechItem> hotTech;

		public List<TechMoreItem> getTechMore() {
			return this.techMore;
		}

		public void setTechMore(List<TechMoreItem> techMore) {
			this.techMore = techMore;
		}

		public List<HotConsultationItem> getHotConsultation() {
			return this.hotConsultation;
		}

		public void setHotConsultation(List<HotConsultationItem> hotConsultation) {
			this.hotConsultation = hotConsultation;
		}

		public List<ConsultationMoreItem> getConsultationMore() {
			return this.consultationMore;
		}

		public void setConsultationMore(List<ConsultationMoreItem> consultationMore) {
			this.consultationMore = consultationMore;
		}

		public List<HotTechItem> getHotTech() {
			return this.hotTech;
		}

		public void setHotTech(List<HotTechItem> hotTech) {
			this.hotTech = hotTech;
		}

		public static class TechMoreItem {

			private String groupName;

			private List<ProductListItem> productList;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public List<ProductListItem> getProductList() {
				return this.productList;
			}

			public void setProductList(List<ProductListItem> productList) {
				this.productList = productList;
			}

			public static class ProductListItem {

				private String name;

				private String productCode;

				private String description;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getProductCode() {
					return this.productCode;
				}

				public void setProductCode(String productCode) {
					this.productCode = productCode;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}
		}

		public static class HotConsultationItem {

			private String name;

			private String productCode;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class ConsultationMoreItem {

			private String name;

			private String productCode;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class HotTechItem {

			private String name;

			private String productCode;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public ListProductsResponse getInstance(UnmarshallerContext context) {
		return	ListProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
