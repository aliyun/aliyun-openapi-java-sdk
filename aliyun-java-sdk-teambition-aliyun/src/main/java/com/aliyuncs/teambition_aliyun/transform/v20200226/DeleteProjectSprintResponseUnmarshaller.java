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

import com.aliyuncs.teambition_aliyun.model.v20200226.DeleteProjectSprintResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProjectSprintResponseUnmarshaller {

	public static DeleteProjectSprintResponse unmarshall(DeleteProjectSprintResponse deleteProjectSprintResponse, UnmarshallerContext _ctx) {
		
		deleteProjectSprintResponse.setRequestId(_ctx.stringValue("DeleteProjectSprintResponse.RequestId"));
		deleteProjectSprintResponse.setSuccessful(_ctx.booleanValue("DeleteProjectSprintResponse.Successful"));
		deleteProjectSprintResponse.setErrorCode(_ctx.stringValue("DeleteProjectSprintResponse.ErrorCode"));
		deleteProjectSprintResponse.setErrorMsg(_ctx.stringValue("DeleteProjectSprintResponse.ErrorMsg"));
		deleteProjectSprintResponse.setObject(_ctx.booleanValue("DeleteProjectSprintResponse.Object"));
	 
	 	return deleteProjectSprintResponse;
	}
}