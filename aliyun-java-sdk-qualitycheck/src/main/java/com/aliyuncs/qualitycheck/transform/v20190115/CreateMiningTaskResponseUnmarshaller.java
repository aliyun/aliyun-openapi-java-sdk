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

import com.aliyuncs.qualitycheck.model.v20190115.CreateMiningTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.CreateMiningTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMiningTaskResponseUnmarshaller {

	public static CreateMiningTaskResponse unmarshall(CreateMiningTaskResponse createMiningTaskResponse, UnmarshallerContext _ctx) {
		
		createMiningTaskResponse.setRequestId(_ctx.stringValue("CreateMiningTaskResponse.RequestId"));
		createMiningTaskResponse.setSuccess(_ctx.stringValue("CreateMiningTaskResponse.Success"));
		createMiningTaskResponse.setCode(_ctx.stringValue("CreateMiningTaskResponse.Code"));
		createMiningTaskResponse.setMessage(_ctx.stringValue("CreateMiningTaskResponse.Message"));
		createMiningTaskResponse.setHttpStatusCode(_ctx.stringValue("CreateMiningTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("CreateMiningTaskResponse.Data.TaskId"));
		createMiningTaskResponse.setData(data);
	 
	 	return createMiningTaskResponse;
	}
}