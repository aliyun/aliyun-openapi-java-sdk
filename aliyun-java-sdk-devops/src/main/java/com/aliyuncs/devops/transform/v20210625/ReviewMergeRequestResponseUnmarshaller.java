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

import com.aliyuncs.devops.model.v20210625.ReviewMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.ReviewMergeRequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReviewMergeRequestResponseUnmarshaller {

	public static ReviewMergeRequestResponse unmarshall(ReviewMergeRequestResponse reviewMergeRequestResponse, UnmarshallerContext _ctx) {
		
		reviewMergeRequestResponse.setRequestId(_ctx.stringValue("ReviewMergeRequestResponse.requestId"));
		reviewMergeRequestResponse.setErrorCode(_ctx.stringValue("ReviewMergeRequestResponse.errorCode"));
		reviewMergeRequestResponse.setErrorMessage(_ctx.stringValue("ReviewMergeRequestResponse.errorMessage"));
		reviewMergeRequestResponse.setSuccess(_ctx.booleanValue("ReviewMergeRequestResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("ReviewMergeRequestResponse.result.result"));
		reviewMergeRequestResponse.setResult(result);
	 
	 	return reviewMergeRequestResponse;
	}
}