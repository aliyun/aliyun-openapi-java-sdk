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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiMarketAttributesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiMarketAttributesResponseUnmarshaller {

	public static DescribeApiMarketAttributesResponse unmarshall(DescribeApiMarketAttributesResponse describeApiMarketAttributesResponse, UnmarshallerContext _ctx) {
		
		describeApiMarketAttributesResponse.setRequestId(_ctx.stringValue("DescribeApiMarketAttributesResponse.RequestId"));
		describeApiMarketAttributesResponse.setApiId(_ctx.stringValue("DescribeApiMarketAttributesResponse.ApiId"));
		describeApiMarketAttributesResponse.setMarketChargingMode(_ctx.stringValue("DescribeApiMarketAttributesResponse.MarketChargingMode"));
		describeApiMarketAttributesResponse.setNeedCharging(_ctx.stringValue("DescribeApiMarketAttributesResponse.NeedCharging"));
	 
	 	return describeApiMarketAttributesResponse;
	}
}