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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListGatewaysPacketStatResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewaysPacketStatResponse.GatewayPacketStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaysPacketStatResponseUnmarshaller {

	public static ListGatewaysPacketStatResponse unmarshall(ListGatewaysPacketStatResponse listGatewaysPacketStatResponse, UnmarshallerContext _ctx) {
		
		listGatewaysPacketStatResponse.setRequestId(_ctx.stringValue("ListGatewaysPacketStatResponse.RequestId"));
		listGatewaysPacketStatResponse.setSuccess(_ctx.booleanValue("ListGatewaysPacketStatResponse.Success"));

		List<GatewayPacketStat> data = new ArrayList<GatewayPacketStat>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewaysPacketStatResponse.Data.Length"); i++) {
			GatewayPacketStat gatewayPacketStat = new GatewayPacketStat();
			gatewayPacketStat.setGwEui(_ctx.stringValue("ListGatewaysPacketStatResponse.Data["+ i +"].GwEui"));
			gatewayPacketStat.setUplinkCount(_ctx.integerValue("ListGatewaysPacketStatResponse.Data["+ i +"].UplinkCount"));
			gatewayPacketStat.setDownlinkCount(_ctx.integerValue("ListGatewaysPacketStatResponse.Data["+ i +"].DownlinkCount"));

			data.add(gatewayPacketStat);
		}
		listGatewaysPacketStatResponse.setData(data);
	 
	 	return listGatewaysPacketStatResponse;
	}
}