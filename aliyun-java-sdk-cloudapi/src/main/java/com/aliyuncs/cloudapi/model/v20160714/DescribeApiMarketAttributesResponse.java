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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiMarketAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiMarketAttributesResponse extends AcsResponse {

	private String apiId;

	private String requestId;

	private String marketChargingMode;

	private String needCharging;

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMarketChargingMode() {
		return this.marketChargingMode;
	}

	public void setMarketChargingMode(String marketChargingMode) {
		this.marketChargingMode = marketChargingMode;
	}

	public String getNeedCharging() {
		return this.needCharging;
	}

	public void setNeedCharging(String needCharging) {
		this.needCharging = needCharging;
	}

	@Override
	public DescribeApiMarketAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiMarketAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
