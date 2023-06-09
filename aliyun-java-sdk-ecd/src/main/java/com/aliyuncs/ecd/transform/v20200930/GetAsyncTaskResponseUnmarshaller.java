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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.GetAsyncTaskResponse;
import com.aliyuncs.ecd.model.v20200930.GetAsyncTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncTaskResponseUnmarshaller {

	public static GetAsyncTaskResponse unmarshall(GetAsyncTaskResponse getAsyncTaskResponse, UnmarshallerContext _ctx) {
		
		getAsyncTaskResponse.setRequestId(_ctx.stringValue("GetAsyncTaskResponse.RequestId"));
		getAsyncTaskResponse.setSuccess(_ctx.stringValue("GetAsyncTaskResponse.Success"));
		getAsyncTaskResponse.setCode(_ctx.stringValue("GetAsyncTaskResponse.Code"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetAsyncTaskResponse.Data.Status"));
		data.setTotalProcess(_ctx.longValue("GetAsyncTaskResponse.Data.TotalProcess"));
		data.setUrl(_ctx.stringValue("GetAsyncTaskResponse.Data.Url"));
		data.setErrCode(_ctx.longValue("GetAsyncTaskResponse.Data.ErrCode"));
		data.setAsyncTaskId(_ctx.stringValue("GetAsyncTaskResponse.Data.AsyncTaskId"));
		data.setMessage(_ctx.stringValue("GetAsyncTaskResponse.Data.Message"));
		data.setConsumedProcess(_ctx.stringValue("GetAsyncTaskResponse.Data.ConsumedProcess"));
		getAsyncTaskResponse.setData(data);
	 
	 	return getAsyncTaskResponse;
	}
}