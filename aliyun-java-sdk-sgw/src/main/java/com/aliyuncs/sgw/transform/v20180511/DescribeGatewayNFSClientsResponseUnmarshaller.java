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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayNFSClientsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayNFSClientsResponse.ClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayNFSClientsResponseUnmarshaller {

	public static DescribeGatewayNFSClientsResponse unmarshall(DescribeGatewayNFSClientsResponse describeGatewayNFSClientsResponse, UnmarshallerContext _ctx) {
		
		describeGatewayNFSClientsResponse.setRequestId(_ctx.stringValue("DescribeGatewayNFSClientsResponse.RequestId"));
		describeGatewayNFSClientsResponse.setSuccess(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.Success"));
		describeGatewayNFSClientsResponse.setCode(_ctx.stringValue("DescribeGatewayNFSClientsResponse.Code"));
		describeGatewayNFSClientsResponse.setMessage(_ctx.stringValue("DescribeGatewayNFSClientsResponse.Message"));
		describeGatewayNFSClientsResponse.setTotalCount(_ctx.integerValue("DescribeGatewayNFSClientsResponse.TotalCount"));
		describeGatewayNFSClientsResponse.setPageNumber(_ctx.integerValue("DescribeGatewayNFSClientsResponse.PageNumber"));
		describeGatewayNFSClientsResponse.setPageSize(_ctx.integerValue("DescribeGatewayNFSClientsResponse.PageSize"));
		describeGatewayNFSClientsResponse.setVersion3Enabled(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.Version3Enabled"));
		describeGatewayNFSClientsResponse.setVersion40Enabled(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.Version40Enabled"));
		describeGatewayNFSClientsResponse.setVersion41Enabled(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.Version41Enabled"));

		List<ClientInfo> clientInfoList = new ArrayList<ClientInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayNFSClientsResponse.ClientInfoList.Length"); i++) {
			ClientInfo clientInfo = new ClientInfo();
			clientInfo.setClientIpAddr(_ctx.stringValue("DescribeGatewayNFSClientsResponse.ClientInfoList["+ i +"].ClientIpAddr"));
			clientInfo.setHasNFSv3(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.ClientInfoList["+ i +"].HasNFSv3"));
			clientInfo.setHasNFSv40(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.ClientInfoList["+ i +"].HasNFSv40"));
			clientInfo.setHasNFSv41(_ctx.booleanValue("DescribeGatewayNFSClientsResponse.ClientInfoList["+ i +"].HasNFSv41"));

			clientInfoList.add(clientInfo);
		}
		describeGatewayNFSClientsResponse.setClientInfoList(clientInfoList);
	 
	 	return describeGatewayNFSClientsResponse;
	}
}