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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.SmartqAuthorizeResponse;
import com.aliyuncs.quickbi_public.model.v20220101.SmartqAuthorizeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SmartqAuthorizeResponseUnmarshaller {

	public static SmartqAuthorizeResponse unmarshall(SmartqAuthorizeResponse smartqAuthorizeResponse, UnmarshallerContext _ctx) {
		
		smartqAuthorizeResponse.setRequestId(_ctx.stringValue("SmartqAuthorizeResponse.RequestId"));
		smartqAuthorizeResponse.setSuccess(_ctx.booleanValue("SmartqAuthorizeResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("SmartqAuthorizeResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setUserId(_ctx.stringValue("SmartqAuthorizeResponse.Result["+ i +"].UserId"));
			data.setLlmCube(_ctx.stringValue("SmartqAuthorizeResponse.Result["+ i +"].LlmCube"));
			data.setLlmCubeTheme(_ctx.stringValue("SmartqAuthorizeResponse.Result["+ i +"].LlmCubeTheme"));
			data.setDetailMessage(_ctx.stringValue("SmartqAuthorizeResponse.Result["+ i +"].DetailMessage"));

			result.add(data);
		}
		smartqAuthorizeResponse.setResult(result);
	 
	 	return smartqAuthorizeResponse;
	}
}