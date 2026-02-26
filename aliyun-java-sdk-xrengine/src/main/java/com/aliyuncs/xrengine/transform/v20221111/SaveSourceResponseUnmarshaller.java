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

import com.aliyuncs.xrengine.model.v20221111.SaveSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveSourceResponseUnmarshaller {

	public static SaveSourceResponse unmarshall(SaveSourceResponse saveSourceResponse, UnmarshallerContext _ctx) {
		
		saveSourceResponse.setRequestId(_ctx.stringValue("SaveSourceResponse.RequestId"));
		saveSourceResponse.setSuccess(_ctx.booleanValue("SaveSourceResponse.Success"));
		saveSourceResponse.setCode(_ctx.stringValue("SaveSourceResponse.Code"));
		saveSourceResponse.setMessage(_ctx.stringValue("SaveSourceResponse.Message"));
		saveSourceResponse.setErrorName(_ctx.stringValue("SaveSourceResponse.ErrorName"));
		saveSourceResponse.setHttpCode(_ctx.integerValue("SaveSourceResponse.HttpCode"));
	 
	 	return saveSourceResponse;
	}
}