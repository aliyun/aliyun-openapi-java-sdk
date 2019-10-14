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

import com.aliyuncs.linkwan.model.v20190301.GetLabNodeDownlinkConfigResponse;
import com.aliyuncs.linkwan.model.v20190301.GetLabNodeDownlinkConfigResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetLabNodeDownlinkConfigResponse.Data.FCtrl;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabNodeDownlinkConfigResponseUnmarshaller {

	public static GetLabNodeDownlinkConfigResponse unmarshall(GetLabNodeDownlinkConfigResponse getLabNodeDownlinkConfigResponse, UnmarshallerContext _ctx) {
		
		getLabNodeDownlinkConfigResponse.setRequestId(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.RequestId"));
		getLabNodeDownlinkConfigResponse.setSuccess(_ctx.booleanValue("GetLabNodeDownlinkConfigResponse.Success"));

		Data data = new Data();
		data.setMType(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.Data.MType"));
		data.setRfu(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.Data.Rfu"));
		data.setMajor(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.Data.Major"));
		data.setDevAddr(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.Data.DevAddr"));
		data.setFCnt(_ctx.floatValue("GetLabNodeDownlinkConfigResponse.Data.FCnt"));
		data.setFPort(_ctx.floatValue("GetLabNodeDownlinkConfigResponse.Data.FPort"));
		data.setMic(_ctx.stringValue("GetLabNodeDownlinkConfigResponse.Data.Mic"));

		FCtrl fCtrl = new FCtrl();
		fCtrl.setAdr(_ctx.booleanValue("GetLabNodeDownlinkConfigResponse.Data.FCtrl.Adr"));
		fCtrl.setRfuAdrAckReq(_ctx.booleanValue("GetLabNodeDownlinkConfigResponse.Data.FCtrl.RfuAdrAckReq"));
		fCtrl.setAck(_ctx.booleanValue("GetLabNodeDownlinkConfigResponse.Data.FCtrl.Ack"));
		fCtrl.setFPendingRfu(_ctx.booleanValue("GetLabNodeDownlinkConfigResponse.Data.FCtrl.FPendingRfu"));
		fCtrl.setFOptsLen(_ctx.floatValue("GetLabNodeDownlinkConfigResponse.Data.FCtrl.FOptsLen"));
		data.setFCtrl(fCtrl);
		getLabNodeDownlinkConfigResponse.setData(data);
	 
	 	return getLabNodeDownlinkConfigResponse;
	}
}