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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryTaskResponse;
import com.aliyuncs.iot.model.v20180120.QueryTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskResponseUnmarshaller {

	public static QueryTaskResponse unmarshall(QueryTaskResponse queryTaskResponse, UnmarshallerContext _ctx) {
		
		queryTaskResponse.setRequestId(_ctx.stringValue("QueryTaskResponse.RequestId"));
		queryTaskResponse.setCode(_ctx.stringValue("QueryTaskResponse.Code"));
		queryTaskResponse.setErrorMessage(_ctx.stringValue("QueryTaskResponse.ErrorMessage"));
		queryTaskResponse.setSuccess(_ctx.booleanValue("QueryTaskResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("QueryTaskResponse.Data.Status"));
		data.setProgress(_ctx.stringValue("QueryTaskResponse.Data.Progress"));
		data.setDeviceName(_ctx.stringValue("QueryTaskResponse.Data.DeviceName"));
		data.setMessage(_ctx.stringValue("QueryTaskResponse.Data.Message"));
		data.setUtcQueueTime(_ctx.stringValue("QueryTaskResponse.Data.UtcQueueTime"));
		data.setProductKey(_ctx.stringValue("QueryTaskResponse.Data.ProductKey"));
		data.setJobName(_ctx.stringValue("QueryTaskResponse.Data.JobName"));
		data.setUtcModified(_ctx.stringValue("QueryTaskResponse.Data.UtcModified"));
		data.setJobId(_ctx.stringValue("QueryTaskResponse.Data.JobId"));
		data.setStatusDetail(_ctx.stringValue("QueryTaskResponse.Data.StatusDetail"));
		data.setTaskId(_ctx.stringValue("QueryTaskResponse.Data.TaskId"));
		data.setIotId(_ctx.stringValue("QueryTaskResponse.Data.IotId"));
		queryTaskResponse.setData(data);
	 
	 	return queryTaskResponse;
	}
}