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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreateHanaRestoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHanaRestoreResponseUnmarshaller {

	public static CreateHanaRestoreResponse unmarshall(CreateHanaRestoreResponse createHanaRestoreResponse, UnmarshallerContext _ctx) {
		
		createHanaRestoreResponse.setRequestId(_ctx.stringValue("CreateHanaRestoreResponse.RequestId"));
		createHanaRestoreResponse.setCode(_ctx.stringValue("CreateHanaRestoreResponse.Code"));
		createHanaRestoreResponse.setMessage(_ctx.stringValue("CreateHanaRestoreResponse.Message"));
		createHanaRestoreResponse.setSuccess(_ctx.booleanValue("CreateHanaRestoreResponse.Success"));
		createHanaRestoreResponse.setRestoreId(_ctx.stringValue("CreateHanaRestoreResponse.RestoreId"));
	 
	 	return createHanaRestoreResponse;
	}
}