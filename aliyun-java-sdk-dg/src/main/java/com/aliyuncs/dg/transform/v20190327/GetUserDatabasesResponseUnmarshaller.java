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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.GetUserDatabasesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserDatabasesResponseUnmarshaller {

	public static GetUserDatabasesResponse unmarshall(GetUserDatabasesResponse getUserDatabasesResponse, UnmarshallerContext _ctx) {
		
		getUserDatabasesResponse.setRequestId(_ctx.stringValue("GetUserDatabasesResponse.RequestId"));
		getUserDatabasesResponse.setSuccess(_ctx.stringValue("GetUserDatabasesResponse.Success"));
		getUserDatabasesResponse.setCode(_ctx.stringValue("GetUserDatabasesResponse.Code"));
		getUserDatabasesResponse.setErrorMsg(_ctx.stringValue("GetUserDatabasesResponse.ErrorMsg"));
		getUserDatabasesResponse.setData(_ctx.stringValue("GetUserDatabasesResponse.Data"));
		getUserDatabasesResponse.setCount(_ctx.integerValue("GetUserDatabasesResponse.Count"));
	 
	 	return getUserDatabasesResponse;
	}
}