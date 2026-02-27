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

import com.aliyuncs.dataphin_public.model.v20230630.RemoveDataServiceAppMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveDataServiceAppMemberResponseUnmarshaller {

	public static RemoveDataServiceAppMemberResponse unmarshall(RemoveDataServiceAppMemberResponse removeDataServiceAppMemberResponse, UnmarshallerContext _ctx) {
		
		removeDataServiceAppMemberResponse.setRequestId(_ctx.stringValue("RemoveDataServiceAppMemberResponse.RequestId"));
		removeDataServiceAppMemberResponse.setMessage(_ctx.stringValue("RemoveDataServiceAppMemberResponse.Message"));
		removeDataServiceAppMemberResponse.setHttpStatusCode(_ctx.integerValue("RemoveDataServiceAppMemberResponse.HttpStatusCode"));
		removeDataServiceAppMemberResponse.setCode(_ctx.stringValue("RemoveDataServiceAppMemberResponse.Code"));
		removeDataServiceAppMemberResponse.setSuccess(_ctx.booleanValue("RemoveDataServiceAppMemberResponse.Success"));
	 
	 	return removeDataServiceAppMemberResponse;
	}
}