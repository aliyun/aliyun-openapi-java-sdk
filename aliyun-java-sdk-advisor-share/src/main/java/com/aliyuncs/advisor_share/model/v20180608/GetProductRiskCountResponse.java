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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetProductRiskCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProductRiskCountResponse extends AcsResponse {

	private String requestId;

	private List<ProductRisksCountDTO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProductRisksCountDTO> getData() {
		return this.data;
	}

	public void setData(List<ProductRisksCountDTO> data) {
		this.data = data;
	}

	public static class ProductRisksCountDTO {

		private Long riskTotal;

		private List<ProductCountDTO> productCountDTOList;

		public Long getRiskTotal() {
			return this.riskTotal;
		}

		public void setRiskTotal(Long riskTotal) {
			this.riskTotal = riskTotal;
		}

		public List<ProductCountDTO> getProductCountDTOList() {
			return this.productCountDTOList;
		}

		public void setProductCountDTOList(List<ProductCountDTO> productCountDTOList) {
			this.productCountDTOList = productCountDTOList;
		}

		public static class ProductCountDTO {

			private String product;

			private Long riskNumber;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public Long getRiskNumber() {
				return this.riskNumber;
			}

			public void setRiskNumber(Long riskNumber) {
				this.riskNumber = riskNumber;
			}
		}
	}

	@Override
	public GetProductRiskCountResponse getInstance(UnmarshallerContext context) {
		return	GetProductRiskCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
