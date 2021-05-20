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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.CheckConnectivityResponse;
import com.aliyuncs.datalake.model.v20200710.CheckConnectivityResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectivityResponseUnmarshaller {

	public static CheckConnectivityResponse unmarshall(CheckConnectivityResponse checkConnectivityResponse, UnmarshallerContext _ctx) {
		
		checkConnectivityResponse.setRequestId(_ctx.stringValue("CheckConnectivityResponse.RequestId"));
		checkConnectivityResponse.setSuccess(_ctx.booleanValue("CheckConnectivityResponse.Success"));

		Data data = new Data();
		data.setIsValid(_ctx.booleanValue("CheckConnectivityResponse.Data.IsValid"));
		data.setCode(_ctx.stringValue("CheckConnectivityResponse.Data.Code"));
		data.setMsg(_ctx.stringValue("CheckConnectivityResponse.Data.Msg"));
		checkConnectivityResponse.setData(data);
	 
	 	return checkConnectivityResponse;
	}
}