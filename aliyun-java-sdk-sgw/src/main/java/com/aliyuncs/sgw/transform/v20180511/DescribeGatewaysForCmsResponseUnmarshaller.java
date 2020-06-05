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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysForCmsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysForCmsResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewaysForCmsResponseUnmarshaller {

	public static DescribeGatewaysForCmsResponse unmarshall(DescribeGatewaysForCmsResponse describeGatewaysForCmsResponse, UnmarshallerContext _ctx) {
		
		describeGatewaysForCmsResponse.setRequestId(_ctx.stringValue("DescribeGatewaysForCmsResponse.RequestId"));
		describeGatewaysForCmsResponse.setSuccess(_ctx.booleanValue("DescribeGatewaysForCmsResponse.Success"));
		describeGatewaysForCmsResponse.setCode(_ctx.stringValue("DescribeGatewaysForCmsResponse.Code"));
		describeGatewaysForCmsResponse.setMessage(_ctx.stringValue("DescribeGatewaysForCmsResponse.Message"));
		describeGatewaysForCmsResponse.setTotalCount(_ctx.integerValue("DescribeGatewaysForCmsResponse.TotalCount"));
		describeGatewaysForCmsResponse.setPageNumber(_ctx.integerValue("DescribeGatewaysForCmsResponse.PageNumber"));
		describeGatewaysForCmsResponse.setPageSize(_ctx.integerValue("DescribeGatewaysForCmsResponse.PageSize"));

		List<Gateway> gateways = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewaysForCmsResponse.Gateways.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGatewayId(_ctx.stringValue("DescribeGatewaysForCmsResponse.Gateways["+ i +"].GatewayId"));
			gateway.setName(_ctx.stringValue("DescribeGatewaysForCmsResponse.Gateways["+ i +"].Name"));
			gateway.setDescription(_ctx.stringValue("DescribeGatewaysForCmsResponse.Gateways["+ i +"].Description"));

			gateways.add(gateway);
		}
		describeGatewaysForCmsResponse.setGateways(gateways);
	 
	 	return describeGatewaysForCmsResponse;
	}
}