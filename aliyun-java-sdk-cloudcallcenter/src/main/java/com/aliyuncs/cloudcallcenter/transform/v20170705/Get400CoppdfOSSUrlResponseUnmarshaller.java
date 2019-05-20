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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.Get400CoppdfOSSUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Get400CoppdfOSSUrlResponseUnmarshaller {

	public static Get400CoppdfOSSUrlResponse unmarshall(Get400CoppdfOSSUrlResponse get400CoppdfOSSUrlResponse, UnmarshallerContext context) {
		
		get400CoppdfOSSUrlResponse.setRequestId(context.stringValue("Get400CoppdfOSSUrlResponse.RequestId"));
		get400CoppdfOSSUrlResponse.setSuccess(context.booleanValue("Get400CoppdfOSSUrlResponse.Success"));
		get400CoppdfOSSUrlResponse.setCode(context.stringValue("Get400CoppdfOSSUrlResponse.Code"));
		get400CoppdfOSSUrlResponse.setMessage(context.stringValue("Get400CoppdfOSSUrlResponse.Message"));
		get400CoppdfOSSUrlResponse.setHttpStatusCode(context.integerValue("Get400CoppdfOSSUrlResponse.HttpStatusCode"));
		get400CoppdfOSSUrlResponse.setData(context.stringValue("Get400CoppdfOSSUrlResponse.Data"));
	 
	 	return get400CoppdfOSSUrlResponse;
	}
}