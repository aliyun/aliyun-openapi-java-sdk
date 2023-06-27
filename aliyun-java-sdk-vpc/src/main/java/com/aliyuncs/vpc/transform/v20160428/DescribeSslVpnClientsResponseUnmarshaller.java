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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnClientsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnClientsResponse.ClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSslVpnClientsResponseUnmarshaller {

	public static DescribeSslVpnClientsResponse unmarshall(DescribeSslVpnClientsResponse describeSslVpnClientsResponse, UnmarshallerContext _ctx) {
		
		describeSslVpnClientsResponse.setRequestId(_ctx.stringValue("DescribeSslVpnClientsResponse.RequestId"));
		describeSslVpnClientsResponse.setVpnGatewayId(_ctx.stringValue("DescribeSslVpnClientsResponse.VpnGatewayId"));
		describeSslVpnClientsResponse.setPageNumber(_ctx.integerValue("DescribeSslVpnClientsResponse.PageNumber"));
		describeSslVpnClientsResponse.setPageSize(_ctx.integerValue("DescribeSslVpnClientsResponse.PageSize"));
		describeSslVpnClientsResponse.setTotalCount(_ctx.integerValue("DescribeSslVpnClientsResponse.TotalCount"));
		describeSslVpnClientsResponse.setRegionId(_ctx.stringValue("DescribeSslVpnClientsResponse.RegionId"));

		List<ClientInfo> clientInfoList = new ArrayList<ClientInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSslVpnClientsResponse.ClientInfoList.Length"); i++) {
			ClientInfo clientInfo = new ClientInfo();
			clientInfo.setStatus(_ctx.stringValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].Status"));
			clientInfo.setPrivateIp(_ctx.stringValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].PrivateIp"));
			clientInfo.setSendBytes(_ctx.longValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].SendBytes"));
			clientInfo.setConnectedTime(_ctx.longValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].ConnectedTime"));
			clientInfo.setCommonName(_ctx.stringValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].CommonName"));
			clientInfo.setIp(_ctx.stringValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].Ip"));
			clientInfo.setReceiveBytes(_ctx.longValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].ReceiveBytes"));
			clientInfo.setPort(_ctx.stringValue("DescribeSslVpnClientsResponse.ClientInfoList["+ i +"].Port"));

			clientInfoList.add(clientInfo);
		}
		describeSslVpnClientsResponse.setClientInfoList(clientInfoList);
	 
	 	return describeSslVpnClientsResponse;
	}
}