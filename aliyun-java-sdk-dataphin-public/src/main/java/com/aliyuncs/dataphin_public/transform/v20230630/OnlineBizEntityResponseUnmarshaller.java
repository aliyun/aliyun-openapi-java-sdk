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

import com.aliyuncs.dataphin_public.model.v20230630.OnlineBizEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnlineBizEntityResponseUnmarshaller {

	public static OnlineBizEntityResponse unmarshall(OnlineBizEntityResponse onlineBizEntityResponse, UnmarshallerContext _ctx) {
		
		onlineBizEntityResponse.setRequestId(_ctx.stringValue("OnlineBizEntityResponse.RequestId"));
		onlineBizEntityResponse.setSuccess(_ctx.booleanValue("OnlineBizEntityResponse.Success"));
		onlineBizEntityResponse.setHttpStatusCode(_ctx.integerValue("OnlineBizEntityResponse.HttpStatusCode"));
		onlineBizEntityResponse.setCode(_ctx.stringValue("OnlineBizEntityResponse.Code"));
		onlineBizEntityResponse.setMessage(_ctx.stringValue("OnlineBizEntityResponse.Message"));
	 
	 	return onlineBizEntityResponse;
	}
}