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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetNisNetworkRankingResponse;
import com.aliyuncs.nis.model.v20211216.GetNisNetworkRankingResponse.Rankings;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNisNetworkRankingResponseUnmarshaller {

	public static GetNisNetworkRankingResponse unmarshall(GetNisNetworkRankingResponse getNisNetworkRankingResponse, UnmarshallerContext _ctx) {
		
		getNisNetworkRankingResponse.setRequestId(_ctx.stringValue("GetNisNetworkRankingResponse.RequestId"));

		List<Rankings> data = new ArrayList<Rankings>();
		for (int i = 0; i < _ctx.lengthValue("GetNisNetworkRankingResponse.Data.Length"); i++) {
			Rankings rankings = new Rankings();
			rankings.setRegionNo(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].RegionNo"));
			rankings.setInstanceId(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].InstanceId"));
			rankings.setBandwidthPackageId(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].BandwidthPackageId"));
			rankings.setSourceIp(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].SourceIp"));
			rankings.setSourcePort(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].SourcePort"));
			rankings.setSourceIsp(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].SourceIsp"));
			rankings.setDestinationIp(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].DestinationIp"));
			rankings.setDestinationPort(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].DestinationPort"));
			rankings.setDestinationIsp(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].DestinationIsp"));
			rankings.setBizProtocol(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].Protocol"));
			rankings.setCountry(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].Country"));
			rankings.setProvince(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].Province"));
			rankings.setCity(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].City"));
			rankings.setIsp(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].Isp"));
			rankings.setAsn(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].Asn"));
			rankings.setIP(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].IP"));
			rankings.setDestinationRegionNo(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].DestinationRegionNo"));
			rankings.setVbrId(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].VbrId"));
			rankings.setAttachmentId(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].AttachmentId"));
			rankings.setSourceZone(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].SourceZone"));
			rankings.setDestinationZone(_ctx.stringValue("GetNisNetworkRankingResponse.Data["+ i +"].DestinationZone"));
			rankings.setByteCount(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].ByteCount"));
			rankings.setPacketCount(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].PacketCount"));
			rankings.setRTT(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].RTT"));
			rankings.setRetransmitRate(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].RetransmitRate"));
			rankings.setInBps(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].InBps"));
			rankings.setInPps(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].InPps"));
			rankings.setOutBps(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].OutBps"));
			rankings.setOutPps(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].OutPps"));
			rankings.setNewSessionPerSecond(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].NewSessionPerSecond"));
			rankings.setActiveSessionCount(_ctx.doubleValue("GetNisNetworkRankingResponse.Data["+ i +"].ActiveSessionCount"));

			data.add(rankings);
		}
		getNisNetworkRankingResponse.setData(data);
	 
	 	return getNisNetworkRankingResponse;
	}
}