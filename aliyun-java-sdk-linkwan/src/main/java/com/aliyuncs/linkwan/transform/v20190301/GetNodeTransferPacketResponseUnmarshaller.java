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

import com.aliyuncs.linkwan.model.v20190301.GetNodeTransferPacketResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNodeTransferPacketResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeTransferPacketResponseUnmarshaller {

	public static GetNodeTransferPacketResponse unmarshall(GetNodeTransferPacketResponse getNodeTransferPacketResponse, UnmarshallerContext _ctx) {
		
		getNodeTransferPacketResponse.setRequestId(_ctx.stringValue("GetNodeTransferPacketResponse.RequestId"));
		getNodeTransferPacketResponse.setSuccess(_ctx.booleanValue("GetNodeTransferPacketResponse.Success"));

		Data data = new Data();
		data.setLogMillis(_ctx.longValue("GetNodeTransferPacketResponse.Data.LogMillis"));
		data.setGwEui(_ctx.stringValue("GetNodeTransferPacketResponse.Data.GwEui"));
		data.setDevEui(_ctx.stringValue("GetNodeTransferPacketResponse.Data.DevEui"));
		data.setDevAddr(_ctx.stringValue("GetNodeTransferPacketResponse.Data.DevAddr"));
		data.setFreq(_ctx.floatValue("GetNodeTransferPacketResponse.Data.Freq"));
		data.setDatr(_ctx.stringValue("GetNodeTransferPacketResponse.Data.Datr"));
		data.setClassMode(_ctx.stringValue("GetNodeTransferPacketResponse.Data.ClassMode"));
		data.setRssi(_ctx.integerValue("GetNodeTransferPacketResponse.Data.Rssi"));
		data.setLsnr(_ctx.floatValue("GetNodeTransferPacketResponse.Data.Lsnr"));
		data.setFPort(_ctx.integerValue("GetNodeTransferPacketResponse.Data.FPort"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetNodeTransferPacketResponse.Data.FreqBandPlanGroupId"));
		data.setHasMacCommand(_ctx.booleanValue("GetNodeTransferPacketResponse.Data.HasMacCommand"));
		data.setHasData(_ctx.booleanValue("GetNodeTransferPacketResponse.Data.HasData"));
		data.setBase64EncodedMacPayload(_ctx.stringValue("GetNodeTransferPacketResponse.Data.Base64EncodedMacPayload"));
		data.setMacPayloadSize(_ctx.integerValue("GetNodeTransferPacketResponse.Data.MacPayloadSize"));
		data.setProcessEvent(_ctx.stringValue("GetNodeTransferPacketResponse.Data.ProcessEvent"));
		data.setMessageType(_ctx.stringValue("GetNodeTransferPacketResponse.Data.MessageType"));
		data.setGwOwnerAliyunId(_ctx.stringValue("GetNodeTransferPacketResponse.Data.GwOwnerAliyunId"));

		List<Map<Object, Object>> macCommandCIDs = _ctx.listMapValue("GetNodeTransferPacketResponse.Data.MacCommandCIDs");
		data.setMacCommandCIDs(macCommandCIDs);
		getNodeTransferPacketResponse.setData(data);
	 
	 	return getNodeTransferPacketResponse;
	}
}