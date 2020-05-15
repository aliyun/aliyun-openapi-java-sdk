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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response.Data.CpuItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowInItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowOutItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSysmetricsResponse.Response.Data.MemoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshSysmetricsResponseUnmarshaller {

	public static QueryRmsCloudmeshSysmetricsResponse unmarshall(QueryRmsCloudmeshSysmetricsResponse queryRmsCloudmeshSysmetricsResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshSysmetricsResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.RequestId"));
		queryRmsCloudmeshSysmetricsResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.ResultCode"));
		queryRmsCloudmeshSysmetricsResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshSysmetricsResponse.Response.Success"));

		Data data = new Data();

		List<CpuItem> cpu = new ArrayList<CpuItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Cpu.Length"); i++) {
			CpuItem cpuItem = new CpuItem();
			cpuItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Cpu["+ i +"].Timestamp"));
			cpuItem.setValue(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Cpu["+ i +"].Value"));

			cpu.add(cpuItem);
		}
		data.setCpu(cpu);

		List<FlowInItem> flowIn = new ArrayList<FlowInItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowIn.Length"); i++) {
			FlowInItem flowInItem = new FlowInItem();
			flowInItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowIn["+ i +"].Timestamp"));
			flowInItem.setValue(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowIn["+ i +"].Value"));

			flowIn.add(flowInItem);
		}
		data.setFlowIn(flowIn);

		List<FlowOutItem> flowOut = new ArrayList<FlowOutItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowOut.Length"); i++) {
			FlowOutItem flowOutItem = new FlowOutItem();
			flowOutItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowOut["+ i +"].Timestamp"));
			flowOutItem.setValue(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.FlowOut["+ i +"].Value"));

			flowOut.add(flowOutItem);
		}
		data.setFlowOut(flowOut);

		List<MemoryItem> memory = new ArrayList<MemoryItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Memory.Length"); i++) {
			MemoryItem memoryItem = new MemoryItem();
			memoryItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Memory["+ i +"].Timestamp"));
			memoryItem.setValue(_ctx.stringValue("QueryRmsCloudmeshSysmetricsResponse.Response.Data.Memory["+ i +"].Value"));

			memory.add(memoryItem);
		}
		data.setMemory(memory);
		response.setData(data);
		queryRmsCloudmeshSysmetricsResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshSysmetricsResponse;
	}
}