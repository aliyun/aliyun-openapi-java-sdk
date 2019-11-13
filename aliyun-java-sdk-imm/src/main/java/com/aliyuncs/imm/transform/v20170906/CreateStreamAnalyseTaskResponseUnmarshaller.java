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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.CreateStreamAnalyseTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStreamAnalyseTaskResponseUnmarshaller {

	public static CreateStreamAnalyseTaskResponse unmarshall(CreateStreamAnalyseTaskResponse createStreamAnalyseTaskResponse, UnmarshallerContext _ctx) {
		
		createStreamAnalyseTaskResponse.setRequestId(_ctx.stringValue("CreateStreamAnalyseTaskResponse.RequestId"));
		createStreamAnalyseTaskResponse.setTaskId(_ctx.stringValue("CreateStreamAnalyseTaskResponse.TaskId"));
		createStreamAnalyseTaskResponse.setTaskType(_ctx.stringValue("CreateStreamAnalyseTaskResponse.TaskType"));
	 
	 	return createStreamAnalyseTaskResponse;
	}
}