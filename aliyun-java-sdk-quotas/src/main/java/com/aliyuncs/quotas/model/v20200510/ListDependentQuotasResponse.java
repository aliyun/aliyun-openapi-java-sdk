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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListDependentQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDependentQuotasResponse extends AcsResponse {

	private String requestId;

	private List<QuotasItem> quotas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QuotasItem> getQuotas() {
		return this.quotas;
	}

	public void setQuotas(List<QuotasItem> quotas) {
		this.quotas = quotas;
	}

	public static class QuotasItem {

		private String quotaActionCode;

		private String productCode;

		private Float scale;

		private List<DimensionsItem> dimensions;

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Float getScale() {
			return this.scale;
		}

		public void setScale(Float scale) {
			this.scale = scale;
		}

		public List<DimensionsItem> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(List<DimensionsItem> dimensions) {
			this.dimensions = dimensions;
		}

		public static class DimensionsItem {

			private String dimensionKey;

			private List<String> dimensionValues;

			private List<String> dependentDimension;

			public String getDimensionKey() {
				return this.dimensionKey;
			}

			public void setDimensionKey(String dimensionKey) {
				this.dimensionKey = dimensionKey;
			}

			public List<String> getDimensionValues() {
				return this.dimensionValues;
			}

			public void setDimensionValues(List<String> dimensionValues) {
				this.dimensionValues = dimensionValues;
			}

			public List<String> getDependentDimension() {
				return this.dependentDimension;
			}

			public void setDependentDimension(List<String> dependentDimension) {
				this.dependentDimension = dependentDimension;
			}
		}
	}

	@Override
	public ListDependentQuotasResponse getInstance(UnmarshallerContext context) {
		return	ListDependentQuotasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
