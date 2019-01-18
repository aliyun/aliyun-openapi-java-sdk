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

import com.aliyuncs.linkwan.model.v20181230.GetGatewayStatusStatResponse;
import com.aliyuncs.linkwan.model.v20181230.GetGatewayStatusStatResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayStatusStatResponseUnmarshaller {

	public static GetGatewayStatusStatResponse unmarshall(GetGatewayStatusStatResponse getGatewayStatusStatResponse, UnmarshallerContext context) {
		
		getGatewayStatusStatResponse.setRequestId(context.stringValue("GetGatewayStatusStatResponse.RequestId"));
		getGatewayStatusStatResponse.setSuccess(context.booleanValue("GetGatewayStatusStatResponse.Success"));

		Data data = new Data();
		data.setGwEui(context.stringValue("GetGatewayStatusStatResponse.Data.GwEui"));
		data.setCpuRadio(context.floatValue("GetGatewayStatusStatResponse.Data.CpuRadio"));
		data.setMemoryRadio(context.floatValue("GetGatewayStatusStatResponse.Data.MemoryRadio"));
		data.setRxCount(context.longValue("GetGatewayStatusStatResponse.Data.RxCount"));
		data.setTxCount(context.longValue("GetGatewayStatusStatResponse.Data.TxCount"));
		data.setOnlineState(context.stringValue("GetGatewayStatusStatResponse.Data.OnlineState"));
		data.setOnlineHour(context.longValue("GetGatewayStatusStatResponse.Data.OnlineHour"));
		data.setEnabled(context.booleanValue("GetGatewayStatusStatResponse.Data.Enabled"));
		getGatewayStatusStatResponse.setData(data);
	 
	 	return getGatewayStatusStatResponse;
	}
}