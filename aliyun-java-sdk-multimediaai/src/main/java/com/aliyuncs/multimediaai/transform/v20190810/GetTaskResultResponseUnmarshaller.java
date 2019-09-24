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

package com.aliyuncs.multimediaai.transform.v20190810;

import com.aliyuncs.multimediaai.model.v20190810.GetTaskResultResponse;
import com.aliyuncs.multimediaai.model.v20190810.GetTaskResultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResultResponseUnmarshaller {

	public static GetTaskResultResponse unmarshall(GetTaskResultResponse getTaskResultResponse, UnmarshallerContext _ctx) {
		
		getTaskResultResponse.setRequestId(_ctx.stringValue("GetTaskResultResponse.RequestId"));
		getTaskResultResponse.setStatus(_ctx.integerValue("GetTaskResultResponse.Status"));

		Result result = new Result();
		result.setApplicationId(_ctx.stringValue("GetTaskResultResponse.Result.ApplicationId"));
		result.setVideoName(_ctx.stringValue("GetTaskResultResponse.Result.VideoName"));
		result.setProcessResultUrl(_ctx.stringValue("GetTaskResultResponse.Result.ProcessResultUrl"));
		result.setAnalysisUseTime(_ctx.longValue("GetTaskResultResponse.Result.AnalysisUseTime"));
		getTaskResultResponse.setResult(result);
	 
	 	return getTaskResultResponse;
	}
}