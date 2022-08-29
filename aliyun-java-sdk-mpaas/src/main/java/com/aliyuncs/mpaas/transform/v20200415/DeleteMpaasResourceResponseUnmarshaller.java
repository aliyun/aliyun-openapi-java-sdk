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

package com.aliyuncs.mpaas.transform.v20200415;

import com.aliyuncs.mpaas.model.v20200415.DeleteMpaasResourceResponse;
import com.aliyuncs.mpaas.model.v20200415.DeleteMpaasResourceResponse.DeleteAssignResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMpaasResourceResponseUnmarshaller {

	public static DeleteMpaasResourceResponse unmarshall(DeleteMpaasResourceResponse deleteMpaasResourceResponse, UnmarshallerContext _ctx) {
		
		deleteMpaasResourceResponse.setRequestId(_ctx.stringValue("DeleteMpaasResourceResponse.RequestId"));
		deleteMpaasResourceResponse.setResultMessage(_ctx.stringValue("DeleteMpaasResourceResponse.ResultMessage"));
		deleteMpaasResourceResponse.setResultCode(_ctx.stringValue("DeleteMpaasResourceResponse.ResultCode"));

		DeleteAssignResult deleteAssignResult = new DeleteAssignResult();
		deleteAssignResult.setSuccess(_ctx.booleanValue("DeleteMpaasResourceResponse.DeleteAssignResult.Success"));
		deleteAssignResult.setResultMsg(_ctx.stringValue("DeleteMpaasResourceResponse.DeleteAssignResult.ResultMsg"));
		deleteMpaasResourceResponse.setDeleteAssignResult(deleteAssignResult);
	 
	 	return deleteMpaasResourceResponse;
	}
}