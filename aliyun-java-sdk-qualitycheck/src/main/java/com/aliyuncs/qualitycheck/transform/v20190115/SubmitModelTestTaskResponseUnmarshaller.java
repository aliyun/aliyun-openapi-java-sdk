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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.SubmitModelTestTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.SubmitModelTestTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitModelTestTaskResponseUnmarshaller {

	public static SubmitModelTestTaskResponse unmarshall(SubmitModelTestTaskResponse submitModelTestTaskResponse, UnmarshallerContext _ctx) {
		
		submitModelTestTaskResponse.setRequestId(_ctx.stringValue("SubmitModelTestTaskResponse.RequestId"));
		submitModelTestTaskResponse.setSuccess(_ctx.booleanValue("SubmitModelTestTaskResponse.Success"));
		submitModelTestTaskResponse.setCode(_ctx.stringValue("SubmitModelTestTaskResponse.Code"));
		submitModelTestTaskResponse.setMessage(_ctx.stringValue("SubmitModelTestTaskResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("SubmitModelTestTaskResponse.Data.TaskId"));
		data.setTaskType(_ctx.integerValue("SubmitModelTestTaskResponse.Data.TaskType"));
		submitModelTestTaskResponse.setData(data);
	 
	 	return submitModelTestTaskResponse;
	}
}