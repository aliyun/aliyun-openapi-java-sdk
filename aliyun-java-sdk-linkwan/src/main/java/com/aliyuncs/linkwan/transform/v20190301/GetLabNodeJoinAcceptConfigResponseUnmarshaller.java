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

import com.aliyuncs.linkwan.model.v20190301.GetLabNodeJoinAcceptConfigResponse;
import com.aliyuncs.linkwan.model.v20190301.GetLabNodeJoinAcceptConfigResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabNodeJoinAcceptConfigResponseUnmarshaller {

	public static GetLabNodeJoinAcceptConfigResponse unmarshall(GetLabNodeJoinAcceptConfigResponse getLabNodeJoinAcceptConfigResponse, UnmarshallerContext _ctx) {
		
		getLabNodeJoinAcceptConfigResponse.setRequestId(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.RequestId"));
		getLabNodeJoinAcceptConfigResponse.setSuccess(_ctx.booleanValue("GetLabNodeJoinAcceptConfigResponse.Success"));

		Data data = new Data();
		data.setMType(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.MType"));
		data.setRfu(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Rfu"));
		data.setMajor(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Major"));
		data.setAppNonce(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.AppNonce"));
		data.setNetId(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.NetId"));
		data.setDevAddr(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.DevAddr"));
		data.setRxDelay(_ctx.integerValue("GetLabNodeJoinAcceptConfigResponse.Data.RxDelay"));
		data.setCfList(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.CfList"));
		data.setMic(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Mic"));

		DownlinkSetting downlinkSetting = new DownlinkSetting();
		downlinkSetting.setRfu(_ctx.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rfu"));
		downlinkSetting.setRx1DrOffset(_ctx.floatValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rx1DrOffset"));
		downlinkSetting.setRx2DataRate(_ctx.floatValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rx2DataRate"));
		data.setDownlinkSetting(downlinkSetting);
		getLabNodeJoinAcceptConfigResponse.setData(data);
	 
	 	return getLabNodeJoinAcceptConfigResponse;
	}
}