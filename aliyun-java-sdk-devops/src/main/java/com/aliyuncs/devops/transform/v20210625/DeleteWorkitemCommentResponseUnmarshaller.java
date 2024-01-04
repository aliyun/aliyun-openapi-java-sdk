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

import com.aliyuncs.devops.model.v20210625.DeleteWorkitemCommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWorkitemCommentResponseUnmarshaller {

	public static DeleteWorkitemCommentResponse unmarshall(DeleteWorkitemCommentResponse deleteWorkitemCommentResponse, UnmarshallerContext _ctx) {
		
		deleteWorkitemCommentResponse.setRequestId(_ctx.stringValue("DeleteWorkitemCommentResponse.requestId"));
		deleteWorkitemCommentResponse.setErrorMsg(_ctx.stringValue("DeleteWorkitemCommentResponse.errorMsg"));
		deleteWorkitemCommentResponse.setErrorCode(_ctx.stringValue("DeleteWorkitemCommentResponse.errorCode"));
		deleteWorkitemCommentResponse.setSuccess(_ctx.stringValue("DeleteWorkitemCommentResponse.success"));
		deleteWorkitemCommentResponse.setDeleteFlag(_ctx.booleanValue("DeleteWorkitemCommentResponse.deleteFlag"));
	 
	 	return deleteWorkitemCommentResponse;
	}
}