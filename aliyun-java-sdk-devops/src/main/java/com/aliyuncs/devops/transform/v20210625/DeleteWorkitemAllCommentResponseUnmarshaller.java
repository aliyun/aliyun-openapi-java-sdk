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

import com.aliyuncs.devops.model.v20210625.DeleteWorkitemAllCommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWorkitemAllCommentResponseUnmarshaller {

	public static DeleteWorkitemAllCommentResponse unmarshall(DeleteWorkitemAllCommentResponse deleteWorkitemAllCommentResponse, UnmarshallerContext _ctx) {
		
		deleteWorkitemAllCommentResponse.setRequestId(_ctx.stringValue("DeleteWorkitemAllCommentResponse.requestId"));
		deleteWorkitemAllCommentResponse.setErrorMsg(_ctx.stringValue("DeleteWorkitemAllCommentResponse.errorMsg"));
		deleteWorkitemAllCommentResponse.setErrorCode(_ctx.stringValue("DeleteWorkitemAllCommentResponse.errorCode"));
		deleteWorkitemAllCommentResponse.setSuccess(_ctx.stringValue("DeleteWorkitemAllCommentResponse.success"));
		deleteWorkitemAllCommentResponse.setDeleteFlag(_ctx.booleanValue("DeleteWorkitemAllCommentResponse.deleteFlag"));
	 
	 	return deleteWorkitemAllCommentResponse;
	}
}