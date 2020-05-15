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

	public static DescribeSslVpnServersResponse unmarshall(DescribeSslVpnServersResponse describeSslVpnServersResponse, UnmarshallerContext _ctx) {
		
		describeSslVpnServersResponse.setRequestId(_ctx.stringValue("DescribeSslVpnServersResponse.RequestId"));
		describeSslVpnServersResponse.setTotalCount(_ctx.integerValue("DescribeSslVpnServersResponse.TotalCount"));
		describeSslVpnServersResponse.setPageNumber(_ctx.integerValue("DescribeSslVpnServersResponse.PageNumber"));
		describeSslVpnServersResponse.setPageSize(_ctx.integerValue("DescribeSslVpnServersResponse.PageSize"));

		List<SslVpnServer> sslVpnServers = new ArrayList<SslVpnServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSslVpnServersResponse.SslVpnServers.Length"); i++) {
			SslVpnServer sslVpnServer = new SslVpnServer();
			sslVpnServer.setRegionId(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].RegionId"));
			sslVpnServer.setSslVpnServerId(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].SslVpnServerId"));
			sslVpnServer.setVpnGatewayId(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].VpnGatewayId"));
			sslVpnServer.setName(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Name"));
			sslVpnServer.setLocalSubnet(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].LocalSubnet"));
			sslVpnServer.setClientIpPool(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].ClientIpPool"));
			sslVpnServer.setCreateTime(_ctx.longValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].CreateTime"));
			sslVpnServer.setCipher(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Cipher"));
			sslVpnServer.setProto(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Proto"));
			sslVpnServer.setPort(_ctx.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Port"));
			sslVpnServer.setCompress(_ctx.booleanValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Compress"));
			sslVpnServer.setConnections(_ctx.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].Connections"));
			sslVpnServer.setMaxConnections(_ctx.integerValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].MaxConnections"));
			sslVpnServer.setInternetIp(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].InternetIp"));
			sslVpnServer.setEnableMultiFactorAuth(_ctx.booleanValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].EnableMultiFactorAuth"));
			sslVpnServer.setIDaaSInstanceId(_ctx.stringValue("DescribeSslVpnServersResponse.SslVpnServers["+ i +"].IDaaSInstanceId"));

			sslVpnServers.add(sslVpnServer);
		}
		describeSslVpnServersResponse.setSslVpnServers(sslVpnServers);
	 
	 	return describeSslVpnServersResponse;
	}
}