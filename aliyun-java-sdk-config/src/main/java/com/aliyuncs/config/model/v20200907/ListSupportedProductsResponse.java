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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListSupportedProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSupportedProductsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private List<Data> products;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public List<Data> getProducts() {
		return this.products;
	}

	public void setProducts(List<Data> products) {
		this.products = products;
	}

	public static class Data {

		private String productNameEn;

		private String productNameZh;

		private String productCode;

		private List<ResourceType> resourceTypeList;

		public String getProductNameEn() {
			return this.productNameEn;
		}

		public void setProductNameEn(String productNameEn) {
			this.productNameEn = productNameEn;
		}

		public String getProductNameZh() {
			return this.productNameZh;
		}

		public void setProductNameZh(String productNameZh) {
			this.productNameZh = productNameZh;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<ResourceType> getResourceTypeList() {
			return this.resourceTypeList;
		}

		public void setResourceTypeList(List<ResourceType> resourceTypeList) {
			this.resourceTypeList = resourceTypeList;
		}

		public static class ResourceType {

			private String resourceType;

			private String typeNameEn;

			private String typeNameZh;

			private String typePageLink;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getTypeNameEn() {
				return this.typeNameEn;
			}

			public void setTypeNameEn(String typeNameEn) {
				this.typeNameEn = typeNameEn;
			}

			public String getTypeNameZh() {
				return this.typeNameZh;
			}

			public void setTypeNameZh(String typeNameZh) {
				this.typeNameZh = typeNameZh;
			}

			public String getTypePageLink() {
				return this.typePageLink;
			}

			public void setTypePageLink(String typePageLink) {
				this.typePageLink = typePageLink;
			}
		}
	}

	@Override
	public ListSupportedProductsResponse getInstance(UnmarshallerContext context) {
		return	ListSupportedProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
