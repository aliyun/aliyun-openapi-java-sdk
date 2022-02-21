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
import com.aliyuncs.market.transform.v20151101.CreateCommodityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCommodityResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Commodity commodity;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public static class Commodity {

		private String commodityId;

		public String getCommodityId() {
			return this.commodityId;
		}

		public void setCommodityId(String commodityId) {
			this.commodityId = commodityId;
		}
	}

	@Override
	public CreateCommodityResponse getInstance(UnmarshallerContext context) {
		return	CreateCommodityResponseUnmarshaller.unmarshall(this, context);
	}
}
