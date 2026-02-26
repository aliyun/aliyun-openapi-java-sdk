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

import com.aliyuncs.cloudauth.model.v20190307.VehicleMetaVerifyV2Response;
import com.aliyuncs.cloudauth.model.v20190307.VehicleMetaVerifyV2Response.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VehicleMetaVerifyV2ResponseUnmarshaller {

	public static VehicleMetaVerifyV2Response unmarshall(VehicleMetaVerifyV2Response vehicleMetaVerifyV2Response, UnmarshallerContext _ctx) {
		
		vehicleMetaVerifyV2Response.setRequestId(_ctx.stringValue("VehicleMetaVerifyV2Response.RequestId"));
		vehicleMetaVerifyV2Response.setCode(_ctx.stringValue("VehicleMetaVerifyV2Response.Code"));
		vehicleMetaVerifyV2Response.setMessage(_ctx.stringValue("VehicleMetaVerifyV2Response.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("VehicleMetaVerifyV2Response.ResultObject.BizCode"));
		resultObject.setVehicleInfo(_ctx.stringValue("VehicleMetaVerifyV2Response.ResultObject.VehicleInfo"));
		vehicleMetaVerifyV2Response.setResultObject(resultObject);
	 
	 	return vehicleMetaVerifyV2Response;
	}
}