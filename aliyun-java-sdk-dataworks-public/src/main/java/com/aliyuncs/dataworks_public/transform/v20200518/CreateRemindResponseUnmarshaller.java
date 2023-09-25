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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateRemindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRemindResponseUnmarshaller {

	public static CreateRemindResponse unmarshall(CreateRemindResponse createRemindResponse, UnmarshallerContext _ctx) {
		
		createRemindResponse.setRequestId(_ctx.stringValue("CreateRemindResponse.RequestId"));
		createRemindResponse.setHttpStatusCode(_ctx.integerValue("CreateRemindResponse.HttpStatusCode"));
		createRemindResponse.setData(_ctx.longValue("CreateRemindResponse.Data"));
		createRemindResponse.setErrorMessage(_ctx.stringValue("CreateRemindResponse.ErrorMessage"));
		createRemindResponse.setSuccess(_ctx.booleanValue("CreateRemindResponse.Success"));
		createRemindResponse.setErrorCode(_ctx.stringValue("CreateRemindResponse.ErrorCode"));
	 
	 	return createRemindResponse;
	}
}