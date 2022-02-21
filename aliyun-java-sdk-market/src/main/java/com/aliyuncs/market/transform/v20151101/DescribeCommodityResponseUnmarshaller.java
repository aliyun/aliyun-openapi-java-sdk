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

package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.DescribeCommodityResponse;
import com.aliyuncs.market.model.v20151101.DescribeCommodityResponse.Commodity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityResponseUnmarshaller {

	public static DescribeCommodityResponse unmarshall(DescribeCommodityResponse describeCommodityResponse, UnmarshallerContext _ctx) {
		
		describeCommodityResponse.setRequestId(_ctx.stringValue("DescribeCommodityResponse.RequestId"));
		describeCommodityResponse.setSuccess(_ctx.booleanValue("DescribeCommodityResponse.Success"));

		Commodity commodity = new Commodity();
		commodity.setCommoditySpecs(_ctx.stringValue("DescribeCommodityResponse.Commodity.CommoditySpecs"));
		commodity.setApplicationId(_ctx.stringValue("DescribeCommodityResponse.Commodity.ApplicationId"));
		commodity.setCommodityId(_ctx.stringValue("DescribeCommodityResponse.Commodity.CommodityId"));
		commodity.setProperties(_ctx.stringValue("DescribeCommodityResponse.Commodity.Properties"));
		describeCommodityResponse.setCommodity(commodity);
	 
	 	return describeCommodityResponse;
	}
}