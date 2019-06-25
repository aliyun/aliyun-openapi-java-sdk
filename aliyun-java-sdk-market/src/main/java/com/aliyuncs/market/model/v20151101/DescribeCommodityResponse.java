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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeCommodityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommodityResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Commodity commodity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public static class Commodity {

		private String commodityId;

		private String properties;

		private String commoditySpecs;

		public String getCommodityId() {
			return this.commodityId;
		}

		public void setCommodityId(String commodityId) {
			this.commodityId = commodityId;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}

		public String getCommoditySpecs() {
			return this.commoditySpecs;
		}

		public void setCommoditySpecs(String commoditySpecs) {
			this.commoditySpecs = commoditySpecs;
		}
	}

	@Override
	public DescribeCommodityResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommodityResponseUnmarshaller.unmarshall(this, context);
	}
}
