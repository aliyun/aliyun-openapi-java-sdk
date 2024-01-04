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

import com.aliyuncs.devops.model.v20210625.UpdatePushReviewOnOffResponse;
import com.aliyuncs.devops.model.v20210625.UpdatePushReviewOnOffResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePushReviewOnOffResponseUnmarshaller {

	public static UpdatePushReviewOnOffResponse unmarshall(UpdatePushReviewOnOffResponse updatePushReviewOnOffResponse, UnmarshallerContext _ctx) {
		
		updatePushReviewOnOffResponse.setRequestId(_ctx.stringValue("UpdatePushReviewOnOffResponse.requestId"));
		updatePushReviewOnOffResponse.setErrorCode(_ctx.stringValue("UpdatePushReviewOnOffResponse.errorCode"));
		updatePushReviewOnOffResponse.setErrorMessage(_ctx.stringValue("UpdatePushReviewOnOffResponse.errorMessage"));
		updatePushReviewOnOffResponse.setSuccess(_ctx.booleanValue("UpdatePushReviewOnOffResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("UpdatePushReviewOnOffResponse.result.result"));
		updatePushReviewOnOffResponse.setResult(result);
	 
	 	return updatePushReviewOnOffResponse;
	}
}