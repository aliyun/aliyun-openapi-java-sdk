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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DescribePayAsYouGoPriceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePayAsYouGoPriceResponseUnmarshaller {

	public static DescribePayAsYouGoPriceResponse unmarshall(DescribePayAsYouGoPriceResponse describePayAsYouGoPriceResponse, UnmarshallerContext _ctx) {
		
		describePayAsYouGoPriceResponse.setRequestId(_ctx.stringValue("DescribePayAsYouGoPriceResponse.RequestId"));
		describePayAsYouGoPriceResponse.setSuccess(_ctx.booleanValue("DescribePayAsYouGoPriceResponse.Success"));
		describePayAsYouGoPriceResponse.setCode(_ctx.stringValue("DescribePayAsYouGoPriceResponse.Code"));
		describePayAsYouGoPriceResponse.setMessage(_ctx.stringValue("DescribePayAsYouGoPriceResponse.Message"));
		describePayAsYouGoPriceResponse.setCurrency(_ctx.stringValue("DescribePayAsYouGoPriceResponse.Currency"));
		describePayAsYouGoPriceResponse.setGatewayClassPrice(_ctx.floatValue("DescribePayAsYouGoPriceResponse.GatewayClassPrice"));
		describePayAsYouGoPriceResponse.setCacheCloudEfficiencySizePrice(_ctx.floatValue("DescribePayAsYouGoPriceResponse.CacheCloudEfficiencySizePrice"));
		describePayAsYouGoPriceResponse.setCacheCloudSSDSizePrice(_ctx.floatValue("DescribePayAsYouGoPriceResponse.CacheCloudSSDSizePrice"));
	 
	 	return describePayAsYouGoPriceResponse;
	}
}