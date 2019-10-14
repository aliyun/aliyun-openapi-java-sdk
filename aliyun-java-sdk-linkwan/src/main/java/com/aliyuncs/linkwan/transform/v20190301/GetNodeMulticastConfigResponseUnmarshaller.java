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

import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse.Data.Slot0;
import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse.Data.Slot1;
import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse.Data.Slot2;
import com.aliyuncs.linkwan.model.v20190301.GetNodeMulticastConfigResponse.Data.Slot3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeMulticastConfigResponseUnmarshaller {

	public static GetNodeMulticastConfigResponse unmarshall(GetNodeMulticastConfigResponse getNodeMulticastConfigResponse, UnmarshallerContext _ctx) {
		
		getNodeMulticastConfigResponse.setRequestId(_ctx.stringValue("GetNodeMulticastConfigResponse.RequestId"));
		getNodeMulticastConfigResponse.setSuccess(_ctx.booleanValue("GetNodeMulticastConfigResponse.Success"));

		Data data = new Data();
		data.setDevEui(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.DevEui"));
		data.setMcAddress1(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.McAddress1"));
		data.setMcAddress2(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.McAddress2"));
		data.setMcAddress3(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.McAddress3"));
		data.setMcAddress4(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.McAddress4"));

		Slot0 slot0 = new Slot0();
		slot0.setToBeSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot0.ToBeSynchronizedMcAddress"));
		slot0.setSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot0.SynchronizedMcAddress"));
		slot0.setSyncState(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot0.SyncState"));
		slot0.setSyncAction(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot0.SyncAction"));
		data.setSlot0(slot0);

		Slot1 slot1 = new Slot1();
		slot1.setToBeSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot1.ToBeSynchronizedMcAddress"));
		slot1.setSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot1.SynchronizedMcAddress"));
		slot1.setSyncState(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot1.SyncState"));
		slot1.setSyncAction(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot1.SyncAction"));
		data.setSlot1(slot1);

		Slot2 slot2 = new Slot2();
		slot2.setToBeSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot2.ToBeSynchronizedMcAddress"));
		slot2.setSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot2.SynchronizedMcAddress"));
		slot2.setSyncState(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot2.SyncState"));
		slot2.setSyncAction(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot2.SyncAction"));
		data.setSlot2(slot2);

		Slot3 slot3 = new Slot3();
		slot3.setToBeSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot3.ToBeSynchronizedMcAddress"));
		slot3.setSynchronizedMcAddress(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot3.SynchronizedMcAddress"));
		slot3.setSyncState(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot3.SyncState"));
		slot3.setSyncAction(_ctx.stringValue("GetNodeMulticastConfigResponse.Data.Slot3.SyncAction"));
		data.setSlot3(slot3);
		getNodeMulticastConfigResponse.setData(data);
	 
	 	return getNodeMulticastConfigResponse;
	}
}