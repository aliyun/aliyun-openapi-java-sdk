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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.ListSupportResourceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSupportResourceTypesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<SupportResourceType> supportResourceTypes;

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

	public List<SupportResourceType> getSupportResourceTypes() {
		return this.supportResourceTypes;
	}

	public void setSupportResourceTypes(List<SupportResourceType> supportResourceTypes) {
		this.supportResourceTypes = supportResourceTypes;
	}

	public static class SupportResourceType {

		private String productCode;

		private String resourceType;

		private List<SupportItemsItem> supportItems;

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<SupportItemsItem> getSupportItems() {
			return this.supportItems;
		}

		public void setSupportItems(List<SupportItemsItem> supportItems) {
			this.supportItems = supportItems;
		}

		public static class SupportItemsItem {

			private String supportCode;

			private Boolean support;

			public String getSupportCode() {
				return this.supportCode;
			}

			public void setSupportCode(String supportCode) {
				this.supportCode = supportCode;
			}

			public Boolean getSupport() {
				return this.support;
			}

			public void setSupport(Boolean support) {
				this.support = support;
			}
		}
	}

	@Override
	public ListSupportResourceTypesResponse getInstance(UnmarshallerContext context) {
		return	ListSupportResourceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
