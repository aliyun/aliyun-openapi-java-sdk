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

import com.aliyuncs.itag.model.v20210517.UnpassFeedbackResponse;
import com.aliyuncs.itag.model.v20210517.UnpassFeedbackResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnpassFeedbackResponseUnmarshaller {

	public static UnpassFeedbackResponse unmarshall(UnpassFeedbackResponse unpassFeedbackResponse, UnmarshallerContext _ctx) {
		
		unpassFeedbackResponse.setRequestId(_ctx.stringValue("UnpassFeedbackResponse.RequestId"));
		unpassFeedbackResponse.setCode(_ctx.stringValue("UnpassFeedbackResponse.Code"));
		unpassFeedbackResponse.setErrInfo(_ctx.stringValue("UnpassFeedbackResponse.ErrInfo"));
		unpassFeedbackResponse.setMsg(_ctx.stringValue("UnpassFeedbackResponse.Msg"));
		unpassFeedbackResponse.setSucc(_ctx.booleanValue("UnpassFeedbackResponse.Succ"));
		unpassFeedbackResponse.setErrorCode(_ctx.stringValue("UnpassFeedbackResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("UnpassFeedbackResponse.Result.Success"));
		result.setFailCount(_ctx.longValue("UnpassFeedbackResponse.Result.FailCount"));
		result.setTotalCount(_ctx.longValue("UnpassFeedbackResponse.Result.TotalCount"));
		unpassFeedbackResponse.setResult(result);
	 
	 	return unpassFeedbackResponse;
	}
}