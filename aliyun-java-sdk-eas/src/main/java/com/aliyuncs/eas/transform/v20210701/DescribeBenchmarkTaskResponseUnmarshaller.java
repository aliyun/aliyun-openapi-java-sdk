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

import com.aliyuncs.eas.model.v20210701.DescribeBenchmarkTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBenchmarkTaskResponseUnmarshaller {

	public static DescribeBenchmarkTaskResponse unmarshall(DescribeBenchmarkTaskResponse describeBenchmarkTaskResponse, UnmarshallerContext _ctx) {
		
		describeBenchmarkTaskResponse.setRequestId(_ctx.stringValue("DescribeBenchmarkTaskResponse.RequestId"));
		describeBenchmarkTaskResponse.setTaskName(_ctx.stringValue("DescribeBenchmarkTaskResponse.TaskName"));
		describeBenchmarkTaskResponse.setTaskId(_ctx.stringValue("DescribeBenchmarkTaskResponse.TaskId"));
		describeBenchmarkTaskResponse.setServiceName(_ctx.stringValue("DescribeBenchmarkTaskResponse.ServiceName"));
		describeBenchmarkTaskResponse.setToken(_ctx.stringValue("DescribeBenchmarkTaskResponse.Token"));
		describeBenchmarkTaskResponse.setCallerUid(_ctx.stringValue("DescribeBenchmarkTaskResponse.CallerUid"));
		describeBenchmarkTaskResponse.setParentUid(_ctx.stringValue("DescribeBenchmarkTaskResponse.ParentUid"));
		describeBenchmarkTaskResponse.setDesiredAgent(_ctx.longValue("DescribeBenchmarkTaskResponse.DesiredAgent"));
		describeBenchmarkTaskResponse.setAvailableAgent(_ctx.longValue("DescribeBenchmarkTaskResponse.AvailableAgent"));
		describeBenchmarkTaskResponse.setStatus(_ctx.stringValue("DescribeBenchmarkTaskResponse.Status"));
		describeBenchmarkTaskResponse.setReason(_ctx.stringValue("DescribeBenchmarkTaskResponse.Reason"));
		describeBenchmarkTaskResponse.setMessage(_ctx.stringValue("DescribeBenchmarkTaskResponse.Message"));
		describeBenchmarkTaskResponse.setEndpoint(_ctx.stringValue("DescribeBenchmarkTaskResponse.Endpoint"));
	 
	 	return describeBenchmarkTaskResponse;
	}
}