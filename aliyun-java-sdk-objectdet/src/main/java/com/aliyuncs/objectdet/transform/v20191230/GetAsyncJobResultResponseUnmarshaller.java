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

package com.aliyuncs.objectdet.transform.v20191230;

import com.aliyuncs.objectdet.model.v20191230.GetAsyncJobResultResponse;
import com.aliyuncs.objectdet.model.v20191230.GetAsyncJobResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncJobResultResponseUnmarshaller {

	public static GetAsyncJobResultResponse unmarshall(GetAsyncJobResultResponse getAsyncJobResultResponse, UnmarshallerContext _ctx) {
		
		getAsyncJobResultResponse.setRequestId(_ctx.stringValue("GetAsyncJobResultResponse.RequestId"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetAsyncJobResultResponse.Data.Status"));
		data.setErrorCode(_ctx.stringValue("GetAsyncJobResultResponse.Data.ErrorCode"));
		data.setErrorMessage(_ctx.stringValue("GetAsyncJobResultResponse.Data.ErrorMessage"));
		data.setJobId(_ctx.stringValue("GetAsyncJobResultResponse.Data.JobId"));
		data.setResult(_ctx.stringValue("GetAsyncJobResultResponse.Data.Result"));
		getAsyncJobResultResponse.setData(data);
	 
	 	return getAsyncJobResultResponse;
	}
}