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

package com.aliyuncs.rsimganalys.transform.v20190801;

import com.aliyuncs.rsimganalys.model.v20190801.GetTaskResponse;
import com.aliyuncs.rsimganalys.model.v20190801.GetTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setResultCode(_ctx.stringValue("GetTaskResponse.ResultCode"));
		getTaskResponse.setResultMessage(_ctx.stringValue("GetTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("GetTaskResponse.Data.JobId"));
		data.setStatus(_ctx.stringValue("GetTaskResponse.Data.Status"));
		data.setStatusCode(_ctx.stringValue("GetTaskResponse.Data.StatusCode"));
		data.setStatusMessage(_ctx.stringValue("GetTaskResponse.Data.StatusMessage"));
		data.setRequest(_ctx.stringValue("GetTaskResponse.Data.Request"));
		data.setResponse(_ctx.stringValue("GetTaskResponse.Data.Response"));
		data.setProgress(_ctx.integerValue("GetTaskResponse.Data.Progress"));
		data.setNamespace(_ctx.stringValue("GetTaskResponse.Data.Namespace"));
		data.setCreateTime(_ctx.longValue("GetTaskResponse.Data.CreateTime"));
		data.setLastUpdateTime(_ctx.longValue("GetTaskResponse.Data.LastUpdateTime"));
		data.setVersion(_ctx.integerValue("GetTaskResponse.Data.Version"));
		data.setAppkey(_ctx.stringValue("GetTaskResponse.Data.Appkey"));
		data.setUserId(_ctx.stringValue("GetTaskResponse.Data.UserId"));
		getTaskResponse.setData(data);
	 
	 	return getTaskResponse;
	}
}