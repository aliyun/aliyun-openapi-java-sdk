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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.DeleteChatappTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteChatappTemplateResponseUnmarshaller {

	public static DeleteChatappTemplateResponse unmarshall(DeleteChatappTemplateResponse deleteChatappTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteChatappTemplateResponse.setRequestId(_ctx.stringValue("DeleteChatappTemplateResponse.RequestId"));
		deleteChatappTemplateResponse.setCode(_ctx.stringValue("DeleteChatappTemplateResponse.Code"));
		deleteChatappTemplateResponse.setMessage(_ctx.stringValue("DeleteChatappTemplateResponse.Message"));
		deleteChatappTemplateResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteChatappTemplateResponse.AccessDeniedDetail"));
	 
	 	return deleteChatappTemplateResponse;
	}
}