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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListGatewayTransferPacketsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayTransferPacketsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayTransferPacketsResponse.Data.Packet;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayTransferPacketsResponseUnmarshaller {

	public static ListGatewayTransferPacketsResponse unmarshall(ListGatewayTransferPacketsResponse listGatewayTransferPacketsResponse, UnmarshallerContext context) {
		
		listGatewayTransferPacketsResponse.setRequestId(context.stringValue("ListGatewayTransferPacketsResponse.RequestId"));
		listGatewayTransferPacketsResponse.setSuccess(context.booleanValue("ListGatewayTransferPacketsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListGatewayTransferPacketsResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < context.lengthValue("ListGatewayTransferPacketsResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].DevEui"));
			packet.setLogMillis(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].LogMillis"));
			packet.setDevAddr(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].DevAddr"));
			packet.setFreq(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(context.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(context.integerValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Rssi"));
			packet.setLsnr(context.floatValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Lsnr"));
			packet.setFPort(context.integerValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].FPort"));

			list.add(packet);
		}
		data.setList(list);
		listGatewayTransferPacketsResponse.setData(data);
	 
	 	return listGatewayTransferPacketsResponse;
	}
}