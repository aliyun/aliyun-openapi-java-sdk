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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayInfoResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayInfoResponse.GatewayInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayInfoResponseUnmarshaller {

	public static DescribeGatewayInfoResponse unmarshall(DescribeGatewayInfoResponse describeGatewayInfoResponse, UnmarshallerContext _ctx) {
		
		describeGatewayInfoResponse.setRequestId(_ctx.stringValue("DescribeGatewayInfoResponse.RequestId"));
		describeGatewayInfoResponse.setSuccess(_ctx.booleanValue("DescribeGatewayInfoResponse.Success"));
		describeGatewayInfoResponse.setCode(_ctx.stringValue("DescribeGatewayInfoResponse.Code"));
		describeGatewayInfoResponse.setMessage(_ctx.stringValue("DescribeGatewayInfoResponse.Message"));

		List<GatewayInfo> gatewayInfos = new ArrayList<GatewayInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayInfoResponse.GatewayInfos.Length"); i++) {
			GatewayInfo gatewayInfo = new GatewayInfo();
			gatewayInfo.setTime(_ctx.longValue("DescribeGatewayInfoResponse.GatewayInfos["+ i +"].Time"));
			gatewayInfo.setInfo(_ctx.stringValue("DescribeGatewayInfoResponse.GatewayInfos["+ i +"].Info"));

			gatewayInfos.add(gatewayInfo);
		}
		describeGatewayInfoResponse.setGatewayInfos(gatewayInfos);
	 
	 	return describeGatewayInfoResponse;
	}
}