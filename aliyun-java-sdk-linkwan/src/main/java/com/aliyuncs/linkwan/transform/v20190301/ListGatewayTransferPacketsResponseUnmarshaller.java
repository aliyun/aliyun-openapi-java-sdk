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

import com.aliyuncs.linkwan.model.v20190301.ListGatewayTransferPacketsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayTransferPacketsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayTransferPacketsResponse.Data.Packet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayTransferPacketsResponseUnmarshaller {

	public static ListGatewayTransferPacketsResponse unmarshall(ListGatewayTransferPacketsResponse listGatewayTransferPacketsResponse, UnmarshallerContext _ctx) {
		
		listGatewayTransferPacketsResponse.setRequestId(_ctx.stringValue("ListGatewayTransferPacketsResponse.RequestId"));
		listGatewayTransferPacketsResponse.setSuccess(_ctx.booleanValue("ListGatewayTransferPacketsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListGatewayTransferPacketsResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayTransferPacketsResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].DevEui"));
			packet.setLogMillis(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].LogMillis"));
			packet.setDevAddr(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].DevAddr"));
			packet.setFreq(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(_ctx.integerValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Rssi"));
			packet.setLsnr(_ctx.floatValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Lsnr"));
			packet.setFPort(_ctx.integerValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].FPort"));
			packet.setHasMacCommand(_ctx.booleanValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].HasMacCommand"));
			packet.setHasData(_ctx.booleanValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].HasData"));
			packet.setBase64EncodedMacPayload(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].Base64EncodedMacPayload"));
			packet.setMacPayloadSize(_ctx.longValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].MacPayloadSize"));
			packet.setProcessEvent(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].ProcessEvent"));
			packet.setMessageType(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].MessageType"));
			packet.setNodeOwnerAliyunId(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].NodeOwnerAliyunId"));

			List<String> macCommandCIDs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].MacCommandCIDs.Length"); j++) {
				macCommandCIDs.add(_ctx.stringValue("ListGatewayTransferPacketsResponse.Data.List["+ i +"].MacCommandCIDs["+ j +"]"));
			}
			packet.setMacCommandCIDs(macCommandCIDs);

			list.add(packet);
		}
		data.setList(list);
		listGatewayTransferPacketsResponse.setData(data);
	 
	 	return listGatewayTransferPacketsResponse;
	}
}