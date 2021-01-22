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

import com.aliyuncs.dg.model.v20190327.AddDatabaseListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDatabaseListResponseUnmarshaller {

	public static AddDatabaseListResponse unmarshall(AddDatabaseListResponse addDatabaseListResponse, UnmarshallerContext _ctx) {
		
		addDatabaseListResponse.setRequestId(_ctx.stringValue("AddDatabaseListResponse.RequestId"));
		addDatabaseListResponse.setSuccess(_ctx.booleanValue("AddDatabaseListResponse.Success"));
		addDatabaseListResponse.setCode(_ctx.stringValue("AddDatabaseListResponse.Code"));
		addDatabaseListResponse.setErrorMsg(_ctx.stringValue("AddDatabaseListResponse.ErrorMsg"));
		addDatabaseListResponse.setData(_ctx.stringValue("AddDatabaseListResponse.Data"));
	 
	 	return addDatabaseListResponse;
	}
}