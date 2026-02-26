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

import com.aliyuncs.cloudauth.model.v20190307.VehicleQueryResponse;
import com.aliyuncs.cloudauth.model.v20190307.VehicleQueryResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VehicleQueryResponseUnmarshaller {

	public static VehicleQueryResponse unmarshall(VehicleQueryResponse vehicleQueryResponse, UnmarshallerContext _ctx) {
		
		vehicleQueryResponse.setRequestId(_ctx.stringValue("VehicleQueryResponse.RequestId"));
		vehicleQueryResponse.setMessage(_ctx.stringValue("VehicleQueryResponse.Message"));
		vehicleQueryResponse.setCode(_ctx.stringValue("VehicleQueryResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("VehicleQueryResponse.ResultObject.BizCode"));
		resultObject.setVehicleInfo(_ctx.stringValue("VehicleQueryResponse.ResultObject.VehicleInfo"));
		vehicleQueryResponse.setResultObject(resultObject);
	 
	 	return vehicleQueryResponse;
	}
}