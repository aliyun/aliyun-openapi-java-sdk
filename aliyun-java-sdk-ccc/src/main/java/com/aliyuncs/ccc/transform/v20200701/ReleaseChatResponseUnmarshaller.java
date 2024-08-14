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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.ReleaseChatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseChatResponseUnmarshaller {

	public static ReleaseChatResponse unmarshall(ReleaseChatResponse releaseChatResponse, UnmarshallerContext _ctx) {
		
		releaseChatResponse.setRequestId(_ctx.stringValue("ReleaseChatResponse.RequestId"));
		releaseChatResponse.setCode(_ctx.stringValue("ReleaseChatResponse.Code"));
		releaseChatResponse.setHttpStatusCode(_ctx.integerValue("ReleaseChatResponse.HttpStatusCode"));
		releaseChatResponse.setMessage(_ctx.stringValue("ReleaseChatResponse.Message"));
	 
	 	return releaseChatResponse;
	}
}