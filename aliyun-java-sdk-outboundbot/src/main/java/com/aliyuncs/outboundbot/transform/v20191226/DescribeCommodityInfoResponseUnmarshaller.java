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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeCommodityInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityInfoResponseUnmarshaller {

	public static DescribeCommodityInfoResponse unmarshall(DescribeCommodityInfoResponse describeCommodityInfoResponse, UnmarshallerContext _ctx) {
		
		describeCommodityInfoResponse.setRequestId(_ctx.stringValue("DescribeCommodityInfoResponse.RequestId"));
		describeCommodityInfoResponse.setSuccess(_ctx.booleanValue("DescribeCommodityInfoResponse.Success"));
		describeCommodityInfoResponse.setCode(_ctx.stringValue("DescribeCommodityInfoResponse.Code"));
		describeCommodityInfoResponse.setMessage(_ctx.stringValue("DescribeCommodityInfoResponse.Message"));
		describeCommodityInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeCommodityInfoResponse.HttpStatusCode"));
		describeCommodityInfoResponse.setCommodityCode(_ctx.stringValue("DescribeCommodityInfoResponse.CommodityCode"));
		describeCommodityInfoResponse.setCommodityInstanceId(_ctx.stringValue("DescribeCommodityInfoResponse.CommodityInstanceId"));
	 
	 	return describeCommodityInfoResponse;
	}
}