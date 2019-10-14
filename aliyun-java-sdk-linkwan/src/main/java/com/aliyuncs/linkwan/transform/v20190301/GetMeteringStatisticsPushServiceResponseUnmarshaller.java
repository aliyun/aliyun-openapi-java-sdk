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

import com.aliyuncs.linkwan.model.v20190301.GetMeteringStatisticsPushServiceResponse;
import com.aliyuncs.linkwan.model.v20190301.GetMeteringStatisticsPushServiceResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetMeteringStatisticsPushServiceResponse.Data.DataOutlet;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMeteringStatisticsPushServiceResponseUnmarshaller {

	public static GetMeteringStatisticsPushServiceResponse unmarshall(GetMeteringStatisticsPushServiceResponse getMeteringStatisticsPushServiceResponse, UnmarshallerContext _ctx) {
		
		getMeteringStatisticsPushServiceResponse.setRequestId(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.RequestId"));
		getMeteringStatisticsPushServiceResponse.setSuccess(_ctx.booleanValue("GetMeteringStatisticsPushServiceResponse.Success"));

		Data data = new Data();
		data.setAliyunPk(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.AliyunPk"));
		data.setSubscribeId(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.SubscribeId"));
		data.setDevEui(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.DevEui"));
		data.setJoinPermissionId(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.JoinPermissionId"));
		data.setGwEui(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.GwEui"));

		DataOutlet dataOutlet = new DataOutlet();
		dataOutlet.setBizUrl(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.DataOutlet.BizUrl"));
		dataOutlet.setAuthInfo(_ctx.stringValue("GetMeteringStatisticsPushServiceResponse.Data.DataOutlet.AuthInfo"));
		data.setDataOutlet(dataOutlet);
		getMeteringStatisticsPushServiceResponse.setData(data);
	 
	 	return getMeteringStatisticsPushServiceResponse;
	}
}