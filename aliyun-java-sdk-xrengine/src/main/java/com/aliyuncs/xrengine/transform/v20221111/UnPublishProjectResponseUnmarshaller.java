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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.UnPublishProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnPublishProjectResponseUnmarshaller {

	public static UnPublishProjectResponse unmarshall(UnPublishProjectResponse unPublishProjectResponse, UnmarshallerContext _ctx) {
		
		unPublishProjectResponse.setRequestId(_ctx.stringValue("UnPublishProjectResponse.RequestId"));
		unPublishProjectResponse.setSuccess(_ctx.booleanValue("UnPublishProjectResponse.Success"));
		unPublishProjectResponse.setCode(_ctx.stringValue("UnPublishProjectResponse.Code"));
		unPublishProjectResponse.setMessage(_ctx.stringValue("UnPublishProjectResponse.Message"));
		unPublishProjectResponse.setErrorName(_ctx.stringValue("UnPublishProjectResponse.ErrorName"));
		unPublishProjectResponse.setHttpCode(_ctx.integerValue("UnPublishProjectResponse.HttpCode"));
	 
	 	return unPublishProjectResponse;
	}
}