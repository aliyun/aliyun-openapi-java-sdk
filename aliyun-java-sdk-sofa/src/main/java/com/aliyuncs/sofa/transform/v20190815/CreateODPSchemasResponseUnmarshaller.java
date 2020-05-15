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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateODPSchemasResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateODPSchemasResponseUnmarshaller {

	public static CreateODPSchemasResponse unmarshall(CreateODPSchemasResponse createODPSchemasResponse, UnmarshallerContext _ctx) {
		
		createODPSchemasResponse.setRequestId(_ctx.stringValue("CreateODPSchemasResponse.RequestId"));
		createODPSchemasResponse.setResultCode(_ctx.stringValue("CreateODPSchemasResponse.ResultCode"));
		createODPSchemasResponse.setResultMessage(_ctx.stringValue("CreateODPSchemasResponse.ResultMessage"));
		createODPSchemasResponse.setData(_ctx.longValue("CreateODPSchemasResponse.Data"));
	 
	 	return createODPSchemasResponse;
	}
}