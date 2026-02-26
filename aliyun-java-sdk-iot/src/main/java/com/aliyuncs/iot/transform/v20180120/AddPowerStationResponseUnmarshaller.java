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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.AddPowerStationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPowerStationResponseUnmarshaller {

	public static AddPowerStationResponse unmarshall(AddPowerStationResponse addPowerStationResponse, UnmarshallerContext _ctx) {
		
		addPowerStationResponse.setRequestId(_ctx.stringValue("AddPowerStationResponse.RequestId"));
		addPowerStationResponse.setSuccess(_ctx.booleanValue("AddPowerStationResponse.Success"));
		addPowerStationResponse.setCode(_ctx.stringValue("AddPowerStationResponse.Code"));
		addPowerStationResponse.setErrorMessage(_ctx.stringValue("AddPowerStationResponse.ErrorMessage"));
		addPowerStationResponse.setData(_ctx.stringValue("AddPowerStationResponse.Data"));
	 
	 	return addPowerStationResponse;
	}
}