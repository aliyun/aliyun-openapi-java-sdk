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

import com.aliyuncs.sas.model.v20181203.CreateContainerScanTaskResponse;
import com.aliyuncs.sas.model.v20181203.CreateContainerScanTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateContainerScanTaskResponseUnmarshaller {

	public static CreateContainerScanTaskResponse unmarshall(CreateContainerScanTaskResponse createContainerScanTaskResponse, UnmarshallerContext _ctx) {
		
		createContainerScanTaskResponse.setRequestId(_ctx.stringValue("CreateContainerScanTaskResponse.RequestId"));
		createContainerScanTaskResponse.setSuccess(_ctx.booleanValue("CreateContainerScanTaskResponse.Success"));
		createContainerScanTaskResponse.setCode(_ctx.stringValue("CreateContainerScanTaskResponse.Code"));
		createContainerScanTaskResponse.setMessage(_ctx.stringValue("CreateContainerScanTaskResponse.Message"));
		createContainerScanTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateContainerScanTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("CreateContainerScanTaskResponse.Data.TaskId"));
		data.setTotalCount(_ctx.integerValue("CreateContainerScanTaskResponse.Data.TotalCount"));
		data.setFinishCount(_ctx.integerValue("CreateContainerScanTaskResponse.Data.FinishCount"));
		data.setCollectTime(_ctx.longValue("CreateContainerScanTaskResponse.Data.CollectTime"));
		data.setExecTime(_ctx.longValue("CreateContainerScanTaskResponse.Data.ExecTime"));
		data.setStatus(_ctx.stringValue("CreateContainerScanTaskResponse.Data.Status"));
		data.setProgress(_ctx.integerValue("CreateContainerScanTaskResponse.Data.Progress"));
		data.setResult(_ctx.stringValue("CreateContainerScanTaskResponse.Data.Result"));
		data.setCanCreate(_ctx.booleanValue("CreateContainerScanTaskResponse.Data.CanCreate"));
		createContainerScanTaskResponse.setData(data);
	 
	 	return createContainerScanTaskResponse;
	}
}