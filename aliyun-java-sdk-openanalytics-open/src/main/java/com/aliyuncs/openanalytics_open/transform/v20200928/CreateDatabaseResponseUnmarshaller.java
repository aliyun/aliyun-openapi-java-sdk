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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import com.aliyuncs.openanalytics_open.model.v20200928.CreateDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatabaseResponseUnmarshaller {

	public static CreateDatabaseResponse unmarshall(CreateDatabaseResponse createDatabaseResponse, UnmarshallerContext _ctx) {
		
		createDatabaseResponse.setRequestId(_ctx.stringValue("CreateDatabaseResponse.RequestId"));
		createDatabaseResponse.setMessage(_ctx.stringValue("CreateDatabaseResponse.Message"));
		createDatabaseResponse.setData(_ctx.longValue("CreateDatabaseResponse.Data"));
		createDatabaseResponse.setCode(_ctx.stringValue("CreateDatabaseResponse.Code"));
		createDatabaseResponse.setSuccess(_ctx.booleanValue("CreateDatabaseResponse.Success"));
	 
	 	return createDatabaseResponse;
	}
}