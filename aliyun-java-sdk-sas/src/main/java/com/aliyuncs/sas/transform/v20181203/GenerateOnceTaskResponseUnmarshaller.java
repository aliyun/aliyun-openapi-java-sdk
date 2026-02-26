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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GenerateOnceTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOnceTaskResponseUnmarshaller {

	public static GenerateOnceTaskResponse unmarshall(GenerateOnceTaskResponse generateOnceTaskResponse, UnmarshallerContext _ctx) {
		
		generateOnceTaskResponse.setRequestId(_ctx.stringValue("GenerateOnceTaskResponse.RequestId"));
		generateOnceTaskResponse.setCanCreate(_ctx.booleanValue("GenerateOnceTaskResponse.CanCreate"));
		generateOnceTaskResponse.setLastTask(_ctx.stringValue("GenerateOnceTaskResponse.LastTask"));
		generateOnceTaskResponse.setCollectTime(_ctx.longValue("GenerateOnceTaskResponse.CollectTime"));
		generateOnceTaskResponse.setTotalCount(_ctx.integerValue("GenerateOnceTaskResponse.TotalCount"));
		generateOnceTaskResponse.setTaskId(_ctx.stringValue("GenerateOnceTaskResponse.TaskId"));
		generateOnceTaskResponse.setFinishCount(_ctx.integerValue("GenerateOnceTaskResponse.FinishCount"));
	 
	 	return generateOnceTaskResponse;
	}
}