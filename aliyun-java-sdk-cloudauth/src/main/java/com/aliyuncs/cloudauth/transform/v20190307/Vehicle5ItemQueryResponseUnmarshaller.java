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

import com.aliyuncs.cloudauth.model.v20190307.Vehicle5ItemQueryResponse;
import com.aliyuncs.cloudauth.model.v20190307.Vehicle5ItemQueryResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Vehicle5ItemQueryResponseUnmarshaller {

	public static Vehicle5ItemQueryResponse unmarshall(Vehicle5ItemQueryResponse vehicle5ItemQueryResponse, UnmarshallerContext _ctx) {
		
		vehicle5ItemQueryResponse.setRequestId(_ctx.stringValue("Vehicle5ItemQueryResponse.RequestId"));
		vehicle5ItemQueryResponse.setMessage(_ctx.stringValue("Vehicle5ItemQueryResponse.Message"));
		vehicle5ItemQueryResponse.setCode(_ctx.stringValue("Vehicle5ItemQueryResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Vehicle5ItemQueryResponse.ResultObject.BizCode"));
		resultObject.setVehicleInfo(_ctx.stringValue("Vehicle5ItemQueryResponse.ResultObject.VehicleInfo"));
		vehicle5ItemQueryResponse.setResultObject(resultObject);
	 
	 	return vehicle5ItemQueryResponse;
	}
}