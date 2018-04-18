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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.PickLocalNumberResponse;
import com.aliyuncs.ccc.model.v20170705.PickLocalNumberResponse.Data;
import com.aliyuncs.ccc.model.v20170705.PickLocalNumberResponse.Data.Callee;
import com.aliyuncs.ccc.model.v20170705.PickLocalNumberResponse.Data.Caller;
import com.aliyuncs.transform.UnmarshallerContext;


public class PickLocalNumberResponseUnmarshaller {

	public static PickLocalNumberResponse unmarshall(PickLocalNumberResponse pickLocalNumberResponse, UnmarshallerContext context) {
		
		pickLocalNumberResponse.setRequestId(context.stringValue("PickLocalNumberResponse.RequestId"));
		pickLocalNumberResponse.setSuccess(context.booleanValue("PickLocalNumberResponse.Success"));
		pickLocalNumberResponse.setCode(context.stringValue("PickLocalNumberResponse.Code"));
		pickLocalNumberResponse.setMessage(context.stringValue("PickLocalNumberResponse.Message"));

		Data data = new Data();

		Callee callee = new Callee();
		callee.setNumber(context.stringValue("PickLocalNumberResponse.Data.Callee.Number"));
		callee.setProvince(context.stringValue("PickLocalNumberResponse.Data.Callee.Province"));
		callee.setCity(context.stringValue("PickLocalNumberResponse.Data.Callee.City"));
		data.setCallee(callee);

		Caller caller = new Caller();
		caller.setNumber(context.stringValue("PickLocalNumberResponse.Data.Caller.Number"));
		caller.setProvince(context.stringValue("PickLocalNumberResponse.Data.Caller.Province"));
		caller.setCity(context.stringValue("PickLocalNumberResponse.Data.Caller.City"));
		data.setCaller(caller);
		pickLocalNumberResponse.setData(data);
	 
	 	return pickLocalNumberResponse;
	}
}