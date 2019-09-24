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

import com.aliyuncs.hdr.model.v20170925.DescribeSitePairStatisticsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairStatisticsResponse.PrimarySiteGatewayInfo;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairStatisticsResponse.SecondarySiteGatewayInfo;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairStatisticsResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSitePairStatisticsResponseUnmarshaller {

	public static DescribeSitePairStatisticsResponse unmarshall(DescribeSitePairStatisticsResponse describeSitePairStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeSitePairStatisticsResponse.setRequestId(_ctx.stringValue("DescribeSitePairStatisticsResponse.RequestId"));
		describeSitePairStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeSitePairStatisticsResponse.Success"));
		describeSitePairStatisticsResponse.setCode(_ctx.stringValue("DescribeSitePairStatisticsResponse.Code"));
		describeSitePairStatisticsResponse.setMessage(_ctx.stringValue("DescribeSitePairStatisticsResponse.Message"));

		PrimarySiteGatewayInfo primarySiteGatewayInfo = new PrimarySiteGatewayInfo();
		primarySiteGatewayInfo.setGatewayId(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteGatewayInfo.GatewayId"));
		primarySiteGatewayInfo.setVersion(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteGatewayInfo.Version"));
		primarySiteGatewayInfo.setStatus(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteGatewayInfo.Status"));
		primarySiteGatewayInfo.setHeartbeatedTime(_ctx.longValue("DescribeSitePairStatisticsResponse.PrimarySiteGatewayInfo.HeartbeatedTime"));
		describeSitePairStatisticsResponse.setPrimarySiteGatewayInfo(primarySiteGatewayInfo);

		SecondarySiteGatewayInfo secondarySiteGatewayInfo = new SecondarySiteGatewayInfo();
		secondarySiteGatewayInfo.setGatewayId(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteGatewayInfo.GatewayId"));
		secondarySiteGatewayInfo.setVersion(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteGatewayInfo.Version"));
		secondarySiteGatewayInfo.setStatus(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteGatewayInfo.Status"));
		secondarySiteGatewayInfo.setHeartbeatedTime(_ctx.longValue("DescribeSitePairStatisticsResponse.SecondarySiteGatewayInfo.HeartbeatedTime"));
		describeSitePairStatisticsResponse.setSecondarySiteGatewayInfo(secondarySiteGatewayInfo);

		List<Server> primarySiteServers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSitePairStatisticsResponse.PrimarySiteServers.Length"); i++) {
			Server server = new Server();
			server.setServerId(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteServers["+ i +"].ServerId"));
			server.setIpAddress(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteServers["+ i +"].IpAddress"));
			server.setAgentVersion(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteServers["+ i +"].AgentVersion"));
			server.setConnectionStatus(_ctx.stringValue("DescribeSitePairStatisticsResponse.PrimarySiteServers["+ i +"].ConnectionStatus"));

			primarySiteServers.add(server);
		}
		describeSitePairStatisticsResponse.setPrimarySiteServers(primarySiteServers);

		List<Server> secondarySiteServers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSitePairStatisticsResponse.SecondarySiteServers.Length"); i++) {
			Server server_ = new Server();
			server_.setServerId(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteServers["+ i +"].ServerId"));
			server_.setIpAddress(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteServers["+ i +"].IpAddress"));
			server_.setAgentVersion(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteServers["+ i +"].AgentVersion"));
			server_.setConnectionStatus(_ctx.stringValue("DescribeSitePairStatisticsResponse.SecondarySiteServers["+ i +"].ConnectionStatus"));

			secondarySiteServers.add(server_);
		}
		describeSitePairStatisticsResponse.setSecondarySiteServers(secondarySiteServers);
	 
	 	return describeSitePairStatisticsResponse;
	}
}