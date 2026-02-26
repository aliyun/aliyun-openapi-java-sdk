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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateTimingSyntheticTaskResponse;
import com.aliyuncs.arms.model.v20190808.CreateTimingSyntheticTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTimingSyntheticTaskResponseUnmarshaller {

	public static CreateTimingSyntheticTaskResponse unmarshall(CreateTimingSyntheticTaskResponse createTimingSyntheticTaskResponse, UnmarshallerContext _ctx) {
		
		createTimingSyntheticTaskResponse.setRequestId(_ctx.stringValue("CreateTimingSyntheticTaskResponse.RequestId"));
		createTimingSyntheticTaskResponse.setSuccess(_ctx.booleanValue("CreateTimingSyntheticTaskResponse.Success"));
		createTimingSyntheticTaskResponse.setCode(_ctx.longValue("CreateTimingSyntheticTaskResponse.Code"));
		createTimingSyntheticTaskResponse.setMessage(_ctx.stringValue("CreateTimingSyntheticTaskResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("CreateTimingSyntheticTaskResponse.Data.TaskId"));
		data.setStatus(_ctx.stringValue("CreateTimingSyntheticTaskResponse.Data.Status"));
		createTimingSyntheticTaskResponse.setData(data);
	 
	 	return createTimingSyntheticTaskResponse;
	}
}