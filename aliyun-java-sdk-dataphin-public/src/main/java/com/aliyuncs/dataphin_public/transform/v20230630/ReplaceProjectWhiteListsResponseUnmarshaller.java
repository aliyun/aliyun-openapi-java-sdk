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

import com.aliyuncs.dataphin_public.model.v20230630.ReplaceProjectWhiteListsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceProjectWhiteListsResponseUnmarshaller {

	public static ReplaceProjectWhiteListsResponse unmarshall(ReplaceProjectWhiteListsResponse replaceProjectWhiteListsResponse, UnmarshallerContext _ctx) {
		
		replaceProjectWhiteListsResponse.setRequestId(_ctx.stringValue("ReplaceProjectWhiteListsResponse.RequestId"));
		replaceProjectWhiteListsResponse.setSuccess(_ctx.booleanValue("ReplaceProjectWhiteListsResponse.Success"));
		replaceProjectWhiteListsResponse.setHttpStatusCode(_ctx.integerValue("ReplaceProjectWhiteListsResponse.HttpStatusCode"));
		replaceProjectWhiteListsResponse.setCode(_ctx.stringValue("ReplaceProjectWhiteListsResponse.Code"));
		replaceProjectWhiteListsResponse.setMessage(_ctx.stringValue("ReplaceProjectWhiteListsResponse.Message"));
	 
	 	return replaceProjectWhiteListsResponse;
	}
}