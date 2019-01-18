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

import com.aliyuncs.linkwan.model.v20181230.GetLabNodeJoinAcceptConfigResponse;
import com.aliyuncs.linkwan.model.v20181230.GetLabNodeJoinAcceptConfigResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabNodeJoinAcceptConfigResponseUnmarshaller {

	public static GetLabNodeJoinAcceptConfigResponse unmarshall(GetLabNodeJoinAcceptConfigResponse getLabNodeJoinAcceptConfigResponse, UnmarshallerContext context) {
		
		getLabNodeJoinAcceptConfigResponse.setRequestId(context.stringValue("GetLabNodeJoinAcceptConfigResponse.RequestId"));
		getLabNodeJoinAcceptConfigResponse.setSuccess(context.booleanValue("GetLabNodeJoinAcceptConfigResponse.Success"));

		Data data = new Data();
		data.setMType(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.MType"));
		data.setRfu(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Rfu"));
		data.setMajor(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Major"));
		data.setAppNonce(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.AppNonce"));
		data.setNetId(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.NetId"));
		data.setDevAddr(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.DevAddr"));
		data.setRxDelay(context.integerValue("GetLabNodeJoinAcceptConfigResponse.Data.RxDelay"));
		data.setCfList(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.CfList"));
		data.setMic(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.Mic"));

		DownlinkSetting downlinkSetting = new DownlinkSetting();
		downlinkSetting.setRfu(context.stringValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rfu"));
		downlinkSetting.setRx1DrOffset(context.floatValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rx1DrOffset"));
		downlinkSetting.setRx2DataRate(context.floatValue("GetLabNodeJoinAcceptConfigResponse.Data.DownlinkSetting.Rx2DataRate"));
		data.setDownlinkSetting(downlinkSetting);
		getLabNodeJoinAcceptConfigResponse.setData(data);
	 
	 	return getLabNodeJoinAcceptConfigResponse;
	}
}