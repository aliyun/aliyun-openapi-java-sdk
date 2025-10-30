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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.AddRegisterLineageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRegisterLineageResponseUnmarshaller {

	public static AddRegisterLineageResponse unmarshall(AddRegisterLineageResponse addRegisterLineageResponse, UnmarshallerContext _ctx) {
		
		addRegisterLineageResponse.setRequestId(_ctx.stringValue("AddRegisterLineageResponse.RequestId"));
		addRegisterLineageResponse.setMessage(_ctx.stringValue("AddRegisterLineageResponse.Message"));
		addRegisterLineageResponse.setHttpStatusCode(_ctx.integerValue("AddRegisterLineageResponse.HttpStatusCode"));
		addRegisterLineageResponse.setCode(_ctx.stringValue("AddRegisterLineageResponse.Code"));
		addRegisterLineageResponse.setSuccess(_ctx.booleanValue("AddRegisterLineageResponse.Success"));
	 
	 	return addRegisterLineageResponse;
	}
}