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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.DeleteFeedbackResponse;
import com.aliyuncs.itag.model.v20210517.DeleteFeedbackResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteFeedbackResponseUnmarshaller {

	public static DeleteFeedbackResponse unmarshall(DeleteFeedbackResponse deleteFeedbackResponse, UnmarshallerContext _ctx) {
		
		deleteFeedbackResponse.setRequestId(_ctx.stringValue("DeleteFeedbackResponse.RequestId"));
		deleteFeedbackResponse.setCode(_ctx.stringValue("DeleteFeedbackResponse.Code"));
		deleteFeedbackResponse.setErrInfo(_ctx.stringValue("DeleteFeedbackResponse.ErrInfo"));
		deleteFeedbackResponse.setMsg(_ctx.stringValue("DeleteFeedbackResponse.Msg"));
		deleteFeedbackResponse.setSucc(_ctx.booleanValue("DeleteFeedbackResponse.Succ"));
		deleteFeedbackResponse.setErrorCode(_ctx.stringValue("DeleteFeedbackResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("DeleteFeedbackResponse.Result.Success"));
		result.setFailCount(_ctx.longValue("DeleteFeedbackResponse.Result.FailCount"));
		result.setTotalCount(_ctx.longValue("DeleteFeedbackResponse.Result.TotalCount"));
		deleteFeedbackResponse.setResult(result);
	 
	 	return deleteFeedbackResponse;
	}
}