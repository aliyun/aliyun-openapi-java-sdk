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

import com.aliyuncs.sofa.model.v20190815.CreateDTXAppsConfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDTXAppsConfigsResponseUnmarshaller {

	public static CreateDTXAppsConfigsResponse unmarshall(CreateDTXAppsConfigsResponse createDTXAppsConfigsResponse, UnmarshallerContext _ctx) {
		
		createDTXAppsConfigsResponse.setRequestId(_ctx.stringValue("CreateDTXAppsConfigsResponse.RequestId"));
		createDTXAppsConfigsResponse.setResultCode(_ctx.stringValue("CreateDTXAppsConfigsResponse.ResultCode"));
		createDTXAppsConfigsResponse.setResultMessage(_ctx.stringValue("CreateDTXAppsConfigsResponse.ResultMessage"));
		createDTXAppsConfigsResponse.setMsg(_ctx.stringValue("CreateDTXAppsConfigsResponse.Msg"));
		createDTXAppsConfigsResponse.setSuccess(_ctx.booleanValue("CreateDTXAppsConfigsResponse.Success"));
	 
	 	return createDTXAppsConfigsResponse;
	}
}