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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestCommentResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestCommentResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMergeRequestCommentResponseUnmarshaller {

	public static UpdateMergeRequestCommentResponse unmarshall(UpdateMergeRequestCommentResponse updateMergeRequestCommentResponse, UnmarshallerContext _ctx) {
		
		updateMergeRequestCommentResponse.setRequestId(_ctx.stringValue("UpdateMergeRequestCommentResponse.RequestId"));
		updateMergeRequestCommentResponse.setErrorCode(_ctx.stringValue("UpdateMergeRequestCommentResponse.ErrorCode"));
		updateMergeRequestCommentResponse.setErrorMessage(_ctx.stringValue("UpdateMergeRequestCommentResponse.ErrorMessage"));
		updateMergeRequestCommentResponse.setSuccess(_ctx.booleanValue("UpdateMergeRequestCommentResponse.Success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("UpdateMergeRequestCommentResponse.Result.Result"));
		updateMergeRequestCommentResponse.setResult(result);
	 
	 	return updateMergeRequestCommentResponse;
	}
}