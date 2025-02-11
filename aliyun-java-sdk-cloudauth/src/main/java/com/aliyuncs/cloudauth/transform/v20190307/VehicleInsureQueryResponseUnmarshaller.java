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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.VehicleInsureQueryResponse;
import com.aliyuncs.cloudauth.model.v20190307.VehicleInsureQueryResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VehicleInsureQueryResponseUnmarshaller {

	public static VehicleInsureQueryResponse unmarshall(VehicleInsureQueryResponse vehicleInsureQueryResponse, UnmarshallerContext _ctx) {
		
		vehicleInsureQueryResponse.setRequestId(_ctx.stringValue("VehicleInsureQueryResponse.RequestId"));
		vehicleInsureQueryResponse.setMessage(_ctx.stringValue("VehicleInsureQueryResponse.Message"));
		vehicleInsureQueryResponse.setCode(_ctx.stringValue("VehicleInsureQueryResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("VehicleInsureQueryResponse.ResultObject.BizCode"));
		resultObject.setVehicleInfo(_ctx.stringValue("VehicleInsureQueryResponse.ResultObject.VehicleInfo"));
		vehicleInsureQueryResponse.setResultObject(resultObject);
	 
	 	return vehicleInsureQueryResponse;
	}
}