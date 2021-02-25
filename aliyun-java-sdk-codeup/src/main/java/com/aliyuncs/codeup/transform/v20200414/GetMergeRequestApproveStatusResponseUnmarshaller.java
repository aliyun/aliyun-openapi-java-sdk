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

import com.aliyuncs.codeup.model.v20200414.GetMergeRequestApproveStatusResponse;
import com.aliyuncs.codeup.model.v20200414.GetMergeRequestApproveStatusResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMergeRequestApproveStatusResponseUnmarshaller {

	public static GetMergeRequestApproveStatusResponse unmarshall(GetMergeRequestApproveStatusResponse getMergeRequestApproveStatusResponse, UnmarshallerContext _ctx) {
		
		getMergeRequestApproveStatusResponse.setRequestId(_ctx.stringValue("GetMergeRequestApproveStatusResponse.RequestId"));
		getMergeRequestApproveStatusResponse.setErrorCode(_ctx.stringValue("GetMergeRequestApproveStatusResponse.ErrorCode"));
		getMergeRequestApproveStatusResponse.setErrorMessage(_ctx.stringValue("GetMergeRequestApproveStatusResponse.ErrorMessage"));
		getMergeRequestApproveStatusResponse.setSuccess(_ctx.booleanValue("GetMergeRequestApproveStatusResponse.Success"));

		Result result = new Result();
		result.setApproveStatus(_ctx.stringValue("GetMergeRequestApproveStatusResponse.Result.ApproveStatus"));
		result.setMessage(_ctx.stringValue("GetMergeRequestApproveStatusResponse.Result.Message"));
		getMergeRequestApproveStatusResponse.setResult(result);
	 
	 	return getMergeRequestApproveStatusResponse;
	}
}