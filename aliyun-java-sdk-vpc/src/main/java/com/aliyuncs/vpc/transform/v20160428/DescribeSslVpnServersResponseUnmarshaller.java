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

import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnServersResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnServersResponse.SslVpnServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSslVpnServersResponseUnmarshaller {

	public static DescribeSslVpnServersResponse unmarshall(DescribeSslVpnServersResponse describeSslVpnServersResponse, UnmarshallerContext context) {
		
		describeSslVpnServersResponse.setRequestId(context.stringValue("DescribeSslVpnServersResponse.RequestId"));
		describeSslVpnServersResponse.setTotalCount(context.integerValue("DescribeSslVpnServersResponse.TotalCount"));
		describeSslVpnServersResponse.setPageNumber(context.integerValue("DescribeSslVpnServersResponse.PageNumber"));
		describeSslVpnServersResponse.setPageSize(context.integerValue("DescribeSslVpnServersResponse.PageSize"));

		List<SslVpnServer> sslVpnServers = new ArrayList<SslVpnServer>();
		for (int i = 0; i < context.lengthValue("DescribeSslVpnServersResponse.SslVpnServers.Length"); i++) {
			SslVpnServer sslVpnServer = new SslVpnServer();
			sslVpnServer.setRegionId(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].RegionId"));
			sslVpnServer.setSslVpnServerId(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].SslVpnServerId"));
			sslVpnServer.setVpnGatewayId(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].VpnGatewayId"));
			sslVpnServer.setName(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Name"));
			sslVpnServer.setLocalSubnet(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].LocalSubnet"));
			sslVpnServer.setClientIpPool(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].ClientIpPool"));
			sslVpnServer.setCreateTime(context.longValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].CreateTime"));
			sslVpnServer.setCipher(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Cipher"));
			sslVpnServer.setProto(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Proto"));
			sslVpnServer.setPort(context.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Port"));
			sslVpnServer.setCompress(context.booleanValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Compress"));
			sslVpnServer.setConnections(context.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Connections"));
			sslVpnServer.setMaxConnections(context.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].MaxConnections"));
			sslVpnServer.setInternetIp(context.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].InternetIp"));

			sslVpnServers.add(sslVpnServer);
		}
		describeSslVpnServersResponse.setSslVpnServers(sslVpnServers);
	 
	 	return describeSslVpnServersResponse;
	}
}