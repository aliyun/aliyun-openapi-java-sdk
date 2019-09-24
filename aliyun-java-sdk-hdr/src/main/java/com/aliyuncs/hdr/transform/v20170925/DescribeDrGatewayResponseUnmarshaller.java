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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeDrGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrGatewayResponseUnmarshaller {

	public static DescribeDrGatewayResponse unmarshall(DescribeDrGatewayResponse describeDrGatewayResponse, UnmarshallerContext _ctx) {
		
		describeDrGatewayResponse.setRequestId(_ctx.stringValue("DescribeDrGatewayResponse.RequestId"));
		describeDrGatewayResponse.setSuccess(_ctx.booleanValue("DescribeDrGatewayResponse.Success"));
		describeDrGatewayResponse.setCode(_ctx.stringValue("DescribeDrGatewayResponse.Code"));
		describeDrGatewayResponse.setMessage(_ctx.stringValue("DescribeDrGatewayResponse.Message"));
		describeDrGatewayResponse.setGatewayId(_ctx.stringValue("DescribeDrGatewayResponse.GatewayId"));
		describeDrGatewayResponse.setSiteId(_ctx.stringValue("DescribeDrGatewayResponse.SiteId"));
		describeDrGatewayResponse.setName(_ctx.stringValue("DescribeDrGatewayResponse.Name"));
		describeDrGatewayResponse.setDescription(_ctx.stringValue("DescribeDrGatewayResponse.Description"));
		describeDrGatewayResponse.setVersion(_ctx.stringValue("DescribeDrGatewayResponse.Version"));
		describeDrGatewayResponse.setIpAddress(_ctx.stringValue("DescribeDrGatewayResponse.IpAddress"));
		describeDrGatewayResponse.setGatewayClass(_ctx.stringValue("DescribeDrGatewayResponse.GatewayClass"));
		describeDrGatewayResponse.setStatus(_ctx.stringValue("DescribeDrGatewayResponse.Status"));
		describeDrGatewayResponse.setImageType(_ctx.stringValue("DescribeDrGatewayResponse.ImageType"));
		describeDrGatewayResponse.setUpstreamSpeed(_ctx.longValue("DescribeDrGatewayResponse.UpstreamSpeed"));
		describeDrGatewayResponse.setDownstreamSpeed(_ctx.longValue("DescribeDrGatewayResponse.DownstreamSpeed"));
		describeDrGatewayResponse.setOperations(_ctx.stringValue("DescribeDrGatewayResponse.Operations"));
		describeDrGatewayResponse.setCreatedTime(_ctx.longValue("DescribeDrGatewayResponse.CreatedTime"));
	 
	 	return describeDrGatewayResponse;
	}
}