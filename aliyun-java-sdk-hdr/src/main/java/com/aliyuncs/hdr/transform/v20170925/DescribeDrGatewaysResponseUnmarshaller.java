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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeDrGatewaysResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeDrGatewaysResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrGatewaysResponseUnmarshaller {

	public static DescribeDrGatewaysResponse unmarshall(DescribeDrGatewaysResponse describeDrGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeDrGatewaysResponse.setRequestId(_ctx.stringValue("DescribeDrGatewaysResponse.RequestId"));
		describeDrGatewaysResponse.setSuccess(_ctx.booleanValue("DescribeDrGatewaysResponse.Success"));
		describeDrGatewaysResponse.setCode(_ctx.stringValue("DescribeDrGatewaysResponse.Code"));
		describeDrGatewaysResponse.setMessage(_ctx.stringValue("DescribeDrGatewaysResponse.Message"));
		describeDrGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeDrGatewaysResponse.TotalCount"));
		describeDrGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeDrGatewaysResponse.PageNumber"));
		describeDrGatewaysResponse.setPageSize(_ctx.integerValue("DescribeDrGatewaysResponse.PageSize"));

		List<Gateway> drGateways = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrGatewaysResponse.DrGateways.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGatewayId(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].GatewayId"));
			gateway.setSiteId(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].SiteId"));
			gateway.setName(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].Name"));
			gateway.setDescription(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].Description"));
			gateway.setVersion(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].Version"));
			gateway.setIpAddress(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].IpAddress"));
			gateway.setGatewayClass(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].GatewayClass"));
			gateway.setStatus(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].Status"));
			gateway.setImageType(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].ImageType"));
			gateway.setUpstreamSpeed(_ctx.longValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].UpstreamSpeed"));
			gateway.setDownstreamSpeed(_ctx.longValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].DownstreamSpeed"));
			gateway.setOperations(_ctx.stringValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].Operations"));
			gateway.setCreatedTime(_ctx.longValue("DescribeDrGatewaysResponse.DrGateways["+ i +"].CreatedTime"));

			drGateways.add(gateway);
		}
		describeDrGatewaysResponse.setDrGateways(drGateways);
	 
	 	return describeDrGatewaysResponse;
	}
}