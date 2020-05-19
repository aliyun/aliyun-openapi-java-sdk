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

import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupTransferPacketsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupTransferPacketsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupTransferPacketsResponse.Data.Packet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupTransferPacketsResponseUnmarshaller {

	public static ListNodeGroupTransferPacketsResponse unmarshall(ListNodeGroupTransferPacketsResponse listNodeGroupTransferPacketsResponse, UnmarshallerContext _ctx) {
		
		listNodeGroupTransferPacketsResponse.setRequestId(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.RequestId"));
		listNodeGroupTransferPacketsResponse.setSuccess(_ctx.booleanValue("ListNodeGroupTransferPacketsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeGroupTransferPacketsResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].DevEui"));
			packet.setDevAddr(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].DevAddr"));
			packet.setFreq(_ctx.floatValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(_ctx.integerValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Rssi"));
			packet.setLsnr(_ctx.floatValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Lsnr"));
			packet.setFPort(_ctx.integerValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FPort"));
			packet.setGwOwnerAliyunId(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].GwOwnerAliyunId"));
			packet.setFreqBandPlanGroupId(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			packet.setLogMillis(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].LogMillis"));
			packet.setHasMacCommand(_ctx.booleanValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].HasMacCommand"));
			packet.setHasData(_ctx.booleanValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].HasData"));
			packet.setBase64EncodedMacPayload(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].Base64EncodedMacPayload"));
			packet.setMacPayloadSize(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MacPayloadSize"));
			packet.setProcessEvent(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].ProcessEvent"));
			packet.setMessageType(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MessageType"));
			packet.setMacCommandCIDs(_ctx.stringValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].MacCommandCIDs"));
			packet.setFcntUp(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FcntUp"));
			packet.setFcntDown(_ctx.longValue("ListNodeGroupTransferPacketsResponse.Data.List["+ i +"].FcntDown"));

			list.add(packet);
		}
		data.setList(list);
		listNodeGroupTransferPacketsResponse.setData(data);
	 
	 	return listNodeGroupTransferPacketsResponse;
	}
}