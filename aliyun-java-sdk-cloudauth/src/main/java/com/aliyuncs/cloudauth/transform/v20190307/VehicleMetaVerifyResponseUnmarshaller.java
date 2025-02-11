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

import com.aliyuncs.cloudauth.model.v20190307.VehicleMetaVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.VehicleMetaVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VehicleMetaVerifyResponseUnmarshaller {

	public static VehicleMetaVerifyResponse unmarshall(VehicleMetaVerifyResponse vehicleMetaVerifyResponse, UnmarshallerContext _ctx) {
		
		vehicleMetaVerifyResponse.setRequestId(_ctx.stringValue("VehicleMetaVerifyResponse.RequestId"));
		vehicleMetaVerifyResponse.setCode(_ctx.stringValue("VehicleMetaVerifyResponse.Code"));
		vehicleMetaVerifyResponse.setMessage(_ctx.stringValue("VehicleMetaVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("VehicleMetaVerifyResponse.ResultObject.BizCode"));
		vehicleMetaVerifyResponse.setResultObject(resultObject);
	 
	 	return vehicleMetaVerifyResponse;
	}
}