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

import com.aliyuncs.linkwan.model.v20190301.ListTransferPacketResponse;
import com.aliyuncs.linkwan.model.v20190301.ListTransferPacketResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListTransferPacketResponse.Data.Packet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransferPacketResponseUnmarshaller {

	public static ListTransferPacketResponse unmarshall(ListTransferPacketResponse listTransferPacketResponse, UnmarshallerContext _ctx) {
		
		listTransferPacketResponse.setRequestId(_ctx.stringValue("ListTransferPacketResponse.RequestId"));
		listTransferPacketResponse.setSuccess(_ctx.booleanValue("ListTransferPacketResponse.Success"));
		listTransferPacketResponse.setCode(_ctx.stringValue("ListTransferPacketResponse.Code"));
		listTransferPacketResponse.setErrorMessage(_ctx.stringValue("ListTransferPacketResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListTransferPacketResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < _ctx.lengthValue("ListTransferPacketResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].DevEui"));
			packet.setDevAddr(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].DevAddr"));
			packet.setFreq(_ctx.floatValue("ListTransferPacketResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(_ctx.integerValue("ListTransferPacketResponse.Data.List["+ i +"].Rssi"));
			packet.setLsnr(_ctx.floatValue("ListTransferPacketResponse.Data.List["+ i +"].Lsnr"));
			packet.setFPort(_ctx.integerValue("ListTransferPacketResponse.Data.List["+ i +"].FPort"));
			packet.setFreqBandPlanGroupId(_ctx.longValue("ListTransferPacketResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			packet.setLogMillis(_ctx.longValue("ListTransferPacketResponse.Data.List["+ i +"].LogMillis"));
			packet.setHasMacCommand(_ctx.booleanValue("ListTransferPacketResponse.Data.List["+ i +"].HasMacCommand"));
			packet.setHasData(_ctx.booleanValue("ListTransferPacketResponse.Data.List["+ i +"].HasData"));
			packet.setBase64EncodedMacPayload(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].Base64EncodedMacPayload"));
			packet.setMacPayloadSize(_ctx.longValue("ListTransferPacketResponse.Data.List["+ i +"].MacPayloadSize"));
			packet.setProcessEvent(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].ProcessEvent"));
			packet.setMessageType(_ctx.stringValue("ListTransferPacketResponse.Data.List["+ i +"].MessageType"));
			packet.setFcntDown(_ctx.longValue("ListTransferPacketResponse.Data.List["+ i +"].FcntDown"));
			packet.setFcntUp(_ctx.longValue("ListTransferPacketResponse.Data.List["+ i +"].FcntUp"));

			list.add(packet);
		}
		data.setList(list);
		listTransferPacketResponse.setData(data);
	 
	 	return listTransferPacketResponse;
	}
}