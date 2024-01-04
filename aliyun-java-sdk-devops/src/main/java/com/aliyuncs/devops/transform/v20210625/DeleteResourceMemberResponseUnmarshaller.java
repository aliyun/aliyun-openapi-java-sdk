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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.DeleteResourceMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResourceMemberResponseUnmarshaller {

	public static DeleteResourceMemberResponse unmarshall(DeleteResourceMemberResponse deleteResourceMemberResponse, UnmarshallerContext _ctx) {
		
		deleteResourceMemberResponse.setRequestId(_ctx.stringValue("DeleteResourceMemberResponse.requestId"));
		deleteResourceMemberResponse.setErrorMessage(_ctx.stringValue("DeleteResourceMemberResponse.errorMessage"));
		deleteResourceMemberResponse.setErrorCode(_ctx.stringValue("DeleteResourceMemberResponse.errorCode"));
		deleteResourceMemberResponse.setSuccess(_ctx.booleanValue("DeleteResourceMemberResponse.success"));
	 
	 	return deleteResourceMemberResponse;
	}
}