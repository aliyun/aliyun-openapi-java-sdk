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

import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupTransferPacketsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupTransferPacketsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupTransferPacketsResponse.Data.Packet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupTransferPacketsResponseUnmarshaller {

	public static ListNodeGroupTransferPacketsResponse unmarshall(ListNodeGroupTransferPacketsResponse listNodeGroupTransferPacketsResponse, UnmarshallerContext context) {
		
		listNodeGroupTransferPacketsResponse.setRequestId(context.stringValue("ListNodeGroupTransferPacketsResponse.RequestId"));
		listNodeGroupTransferPacketsResponse.setSuccess(context.booleanValue("ListNodeGroupTransferPacketsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodeGroupTransferPacketsResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < context.lengthValue("ListNodeGroupTransferPacketsResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].DevEui"));
			packet.setDevAddr(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].DevAddr"));
			packet.setFreq(context.floatValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(context.integerValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Rssi"));
			packet.setLsnr(context.floatValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Lsnr"));
			packet.setFPort(context.integerValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FPort"));
			packet.setGwOwnerAliyunId(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].GwOwnerAliyunId"));
			packet.setFreqBandPlanGroupId(context.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			packet.setLogMillis(context.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].LogMillis"));
			packet.setHasMacCommand(context.booleanValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].HasMacCommand"));
			packet.setHasData(context.booleanValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].HasData"));
			packet.setBase64EncodedMacPayload(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Base64EncodedMacPayload"));
			packet.setMacPayloadSize(context.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MacPayloadSize"));
			packet.setProcessEvent(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].ProcessEvent"));
			packet.setMessageType(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MessageType"));

			List<String> macCommandCIDs = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MacCommandCIDs.Length"); j++) {
				macCommandCIDs.add(context.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MacCommandCIDs["+ j +"]"));
			}
			packet.setMacCommandCIDs(macCommandCIDs);

			list.add(packet);
		}
		data.setList(list);
		listNodeGroupTransferPacketsResponse.setData(data);
	 
	 	return listNodeGroupTransferPacketsResponse;
	}
}