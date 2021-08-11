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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.CreateLakehouseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLakehouseResponseUnmarshaller {

	public static CreateLakehouseResponse unmarshall(CreateLakehouseResponse createLakehouseResponse, UnmarshallerContext _ctx) {
		
		createLakehouseResponse.setRequestId(_ctx.stringValue("CreateLakehouseResponse.RequestId"));
		createLakehouseResponse.setSuccess(_ctx.booleanValue("CreateLakehouseResponse.Success"));
		createLakehouseResponse.setCode(_ctx.stringValue("CreateLakehouseResponse.Code"));
		createLakehouseResponse.setMessage(_ctx.stringValue("CreateLakehouseResponse.Message"));
		createLakehouseResponse.setHttpStatusCode(_ctx.integerValue("CreateLakehouseResponse.HttpStatusCode"));
		createLakehouseResponse.setData(_ctx.stringValue("CreateLakehouseResponse.Data"));
	 
	 	return createLakehouseResponse;
	}
}