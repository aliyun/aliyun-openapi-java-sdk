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

import com.aliyuncs.rsimganalys.model.v20190801.CreateTaskResponse;
import com.aliyuncs.rsimganalys.model.v20190801.CreateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskResponseUnmarshaller {

	public static CreateTaskResponse unmarshall(CreateTaskResponse createTaskResponse, UnmarshallerContext _ctx) {
		
		createTaskResponse.setRequestId(_ctx.stringValue("CreateTaskResponse.RequestId"));
		createTaskResponse.setResultCode(_ctx.integerValue("CreateTaskResponse.ResultCode"));
		createTaskResponse.setResultMessage(_ctx.stringValue("CreateTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setAppkey(_ctx.stringValue("CreateTaskResponse.Data.Appkey"));
		data.setUserId(_ctx.stringValue("CreateTaskResponse.Data.UserId"));
		data.setJobId(_ctx.stringValue("CreateTaskResponse.Data.JobId"));
		data.setStatus(_ctx.stringValue("CreateTaskResponse.Data.Status"));
		data.setRequest(_ctx.stringValue("CreateTaskResponse.Data.Request"));
		data.setProgress(_ctx.integerValue("CreateTaskResponse.Data.Progress"));
		data.setNamespace(_ctx.stringValue("CreateTaskResponse.Data.Namespace"));
		data.setVersion(_ctx.stringValue("CreateTaskResponse.Data.Version"));
		createTaskResponse.setData(data);
	 
	 	return createTaskResponse;
	}
}