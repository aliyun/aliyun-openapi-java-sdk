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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.DeleteDevopsProjectTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevopsProjectTaskResponseUnmarshaller {

	public static DeleteDevopsProjectTaskResponse unmarshall(DeleteDevopsProjectTaskResponse deleteDevopsProjectTaskResponse, UnmarshallerContext _ctx) {
		
		deleteDevopsProjectTaskResponse.setRequestId(_ctx.stringValue("DeleteDevopsProjectTaskResponse.RequestId"));
		deleteDevopsProjectTaskResponse.setSuccessful(_ctx.booleanValue("DeleteDevopsProjectTaskResponse.Successful"));
		deleteDevopsProjectTaskResponse.setErrorCode(_ctx.stringValue("DeleteDevopsProjectTaskResponse.ErrorCode"));
		deleteDevopsProjectTaskResponse.setErrorMsg(_ctx.stringValue("DeleteDevopsProjectTaskResponse.ErrorMsg"));
		deleteDevopsProjectTaskResponse.setObject(_ctx.booleanValue("DeleteDevopsProjectTaskResponse.Object"));
	 
	 	return deleteDevopsProjectTaskResponse;
	}
}