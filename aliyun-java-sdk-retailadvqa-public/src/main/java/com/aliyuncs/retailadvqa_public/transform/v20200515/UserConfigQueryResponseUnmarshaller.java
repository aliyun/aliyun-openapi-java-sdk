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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.UserConfigQueryResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.UserConfigQueryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UserConfigQueryResponseUnmarshaller {

	public static UserConfigQueryResponse unmarshall(UserConfigQueryResponse userConfigQueryResponse, UnmarshallerContext _ctx) {
		
		userConfigQueryResponse.setRequestId(_ctx.stringValue("UserConfigQueryResponse.RequestId"));
		userConfigQueryResponse.setErrorDesc(_ctx.stringValue("UserConfigQueryResponse.ErrorDesc"));
		userConfigQueryResponse.setTraceId(_ctx.stringValue("UserConfigQueryResponse.TraceId"));
		userConfigQueryResponse.setErrorCode(_ctx.stringValue("UserConfigQueryResponse.ErrorCode"));
		userConfigQueryResponse.setSuccess(_ctx.booleanValue("UserConfigQueryResponse.Success"));

		Data data = new Data();
		data.setLanguage(_ctx.stringValue("UserConfigQueryResponse.Data.Language"));
		data.setTheme(_ctx.longValue("UserConfigQueryResponse.Data.Theme"));
		userConfigQueryResponse.setData(data);
	 
	 	return userConfigQueryResponse;
	}
}