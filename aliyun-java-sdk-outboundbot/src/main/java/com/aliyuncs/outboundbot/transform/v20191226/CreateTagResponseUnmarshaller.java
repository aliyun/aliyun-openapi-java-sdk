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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTagResponseUnmarshaller {

	public static CreateTagResponse unmarshall(CreateTagResponse createTagResponse, UnmarshallerContext _ctx) {
		
		createTagResponse.setRequestId(_ctx.stringValue("CreateTagResponse.RequestId"));
		createTagResponse.setSuccess(_ctx.booleanValue("CreateTagResponse.Success"));
		createTagResponse.setCode(_ctx.stringValue("CreateTagResponse.Code"));
		createTagResponse.setMessage(_ctx.stringValue("CreateTagResponse.Message"));
		createTagResponse.setHttpStatusCode(_ctx.integerValue("CreateTagResponse.HttpStatusCode"));
		createTagResponse.setTagId(_ctx.stringValue("CreateTagResponse.TagId"));
	 
	 	return createTagResponse;
	}
}