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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagWifiResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagWifiResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagWifiResponseUnmarshaller {

	public static DescribeSagWifiResponse unmarshall(DescribeSagWifiResponse describeSagWifiResponse, UnmarshallerContext _ctx) {
		
		describeSagWifiResponse.setRequestId(_ctx.stringValue("DescribeSagWifiResponse.RequestId"));
		describeSagWifiResponse.setIsEnable(_ctx.stringValue("DescribeSagWifiResponse.IsEnable"));
		describeSagWifiResponse.setSsid(_ctx.stringValue("DescribeSagWifiResponse.Ssid"));
		describeSagWifiResponse.setIsBroadcast(_ctx.stringValue("DescribeSagWifiResponse.IsBroadcast"));
		describeSagWifiResponse.setChannel(_ctx.stringValue("DescribeSagWifiResponse.Channel"));
		describeSagWifiResponse.setBandwidth(_ctx.stringValue("DescribeSagWifiResponse.Bandwidth"));
		describeSagWifiResponse.setIsAuth(_ctx.stringValue("DescribeSagWifiResponse.IsAuth"));
		describeSagWifiResponse.setAuthenticationType(_ctx.stringValue("DescribeSagWifiResponse.AuthenticationType"));
		describeSagWifiResponse.setEncryptAlgorithm(_ctx.stringValue("DescribeSagWifiResponse.EncryptAlgorithm"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagWifiResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagWifiResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagWifiResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagWifiResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagWifiResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagWifiResponse.setTaskStates(taskStates);
	 
	 	return describeSagWifiResponse;
	}
}