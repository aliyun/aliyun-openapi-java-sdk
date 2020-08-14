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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.DeleteProjectMembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProjectMembersResponseUnmarshaller {

	public static DeleteProjectMembersResponse unmarshall(DeleteProjectMembersResponse deleteProjectMembersResponse, UnmarshallerContext _ctx) {
		
		deleteProjectMembersResponse.setRequestId(_ctx.stringValue("DeleteProjectMembersResponse.RequestId"));
		deleteProjectMembersResponse.setSuccessful(_ctx.booleanValue("DeleteProjectMembersResponse.Successful"));
		deleteProjectMembersResponse.setErrorCode(_ctx.stringValue("DeleteProjectMembersResponse.ErrorCode"));
		deleteProjectMembersResponse.setErrorMsg(_ctx.stringValue("DeleteProjectMembersResponse.ErrorMsg"));
		deleteProjectMembersResponse.setObject(_ctx.booleanValue("DeleteProjectMembersResponse.Object"));
	 
	 	return deleteProjectMembersResponse;
	}
}