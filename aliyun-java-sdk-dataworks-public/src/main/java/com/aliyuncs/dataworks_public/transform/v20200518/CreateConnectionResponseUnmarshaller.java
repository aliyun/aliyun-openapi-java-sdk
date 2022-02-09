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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConnectionResponseUnmarshaller {

	public static CreateConnectionResponse unmarshall(CreateConnectionResponse createConnectionResponse, UnmarshallerContext _ctx) {
		
		createConnectionResponse.setRequestId(_ctx.stringValue("CreateConnectionResponse.RequestId"));
		createConnectionResponse.setHttpStatusCode(_ctx.stringValue("CreateConnectionResponse.HttpStatusCode"));
		createConnectionResponse.setData(_ctx.longValue("CreateConnectionResponse.Data"));
		createConnectionResponse.setSuccess(_ctx.booleanValue("CreateConnectionResponse.Success"));
	 
	 	return createConnectionResponse;
	}
}