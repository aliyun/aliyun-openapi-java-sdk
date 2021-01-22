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

import com.aliyuncs.dg.model.v20190327.CreateDatabaseAccessPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatabaseAccessPointResponseUnmarshaller {

	public static CreateDatabaseAccessPointResponse unmarshall(CreateDatabaseAccessPointResponse createDatabaseAccessPointResponse, UnmarshallerContext _ctx) {
		
		createDatabaseAccessPointResponse.setRequestId(_ctx.stringValue("CreateDatabaseAccessPointResponse.RequestId"));
		createDatabaseAccessPointResponse.setSuccess(_ctx.booleanValue("CreateDatabaseAccessPointResponse.Success"));
		createDatabaseAccessPointResponse.setCode(_ctx.stringValue("CreateDatabaseAccessPointResponse.Code"));
		createDatabaseAccessPointResponse.setErrorMsg(_ctx.stringValue("CreateDatabaseAccessPointResponse.ErrorMsg"));
		createDatabaseAccessPointResponse.setData(_ctx.stringValue("CreateDatabaseAccessPointResponse.Data"));
	 
	 	return createDatabaseAccessPointResponse;
	}
}