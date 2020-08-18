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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.QueryProductInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductInfoResponse extends AcsResponse {

	private String requestId;

	private ProductInfo productInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public static class ProductInfo {

		private String name;

		private Integer industryId;

		private String encodedIcon;

		private String iconName;

		private Boolean readonly;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getIndustryId() {
			return this.industryId;
		}

		public void setIndustryId(Integer industryId) {
			this.industryId = industryId;
		}

		public String getEncodedIcon() {
			return this.encodedIcon;
		}

		public void setEncodedIcon(String encodedIcon) {
			this.encodedIcon = encodedIcon;
		}

		public String getIconName() {
			return this.iconName;
		}

		public void setIconName(String iconName) {
			this.iconName = iconName;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}
	}

	@Override
	public QueryProductInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryProductInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
