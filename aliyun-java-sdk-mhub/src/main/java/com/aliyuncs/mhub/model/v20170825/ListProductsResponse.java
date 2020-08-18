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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.ListProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private String ubsmsStatus;

	private List<ProductInfo> productInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getUbsmsStatus() {
		return this.ubsmsStatus;
	}

	public void setUbsmsStatus(String ubsmsStatus) {
		this.ubsmsStatus = ubsmsStatus;
	}

	public List<ProductInfo> getProductInfos() {
		return this.productInfos;
	}

	public void setProductInfos(List<ProductInfo> productInfos) {
		this.productInfos = productInfos;
	}

	public static class ProductInfo {

		private String productId;

		private String name;

		private String encodedIcon;

		private String platforms;

		private Boolean readonly;

		private Integer industryId;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEncodedIcon() {
			return this.encodedIcon;
		}

		public void setEncodedIcon(String encodedIcon) {
			this.encodedIcon = encodedIcon;
		}

		public String getPlatforms() {
			return this.platforms;
		}

		public void setPlatforms(String platforms) {
			this.platforms = platforms;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public Integer getIndustryId() {
			return this.industryId;
		}

		public void setIndustryId(Integer industryId) {
			this.industryId = industryId;
		}
	}

	@Override
	public ListProductsResponse getInstance(UnmarshallerContext context) {
		return	ListProductsResponseUnmarshaller.unmarshall(this, context);
	}
}
