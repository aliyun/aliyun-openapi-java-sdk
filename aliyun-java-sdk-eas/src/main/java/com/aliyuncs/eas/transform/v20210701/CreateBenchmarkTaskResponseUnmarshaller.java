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

package com.aliyuncs.eas.transform.v20210701;

import com.aliyuncs.eas.model.v20210701.CreateBenchmarkTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBenchmarkTaskResponseUnmarshaller {

	public static CreateBenchmarkTaskResponse unmarshall(CreateBenchmarkTaskResponse createBenchmarkTaskResponse, UnmarshallerContext _ctx) {
		
		createBenchmarkTaskResponse.setRequestId(_ctx.stringValue("CreateBenchmarkTaskResponse.RequestId"));
		createBenchmarkTaskResponse.setTaskName(_ctx.stringValue("CreateBenchmarkTaskResponse.TaskName"));
		createBenchmarkTaskResponse.setRegion(_ctx.stringValue("CreateBenchmarkTaskResponse.Region"));
		createBenchmarkTaskResponse.setMessage(_ctx.stringValue("CreateBenchmarkTaskResponse.Message"));
	 
	 	return createBenchmarkTaskResponse;
	}
}