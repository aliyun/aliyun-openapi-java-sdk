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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.CpuItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ErrorRateItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowInItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowOutItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.MemoryItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ResTimeItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshMultibizqueryResponse.Response.Data.RpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshMultibizqueryResponseUnmarshaller {

	public static QueryRmsCloudmeshMultibizqueryResponse unmarshall(QueryRmsCloudmeshMultibizqueryResponse queryRmsCloudmeshMultibizqueryResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshMultibizqueryResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.RequestId"));
		queryRmsCloudmeshMultibizqueryResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.ResultCode"));
		queryRmsCloudmeshMultibizqueryResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Success"));

		Data data = new Data();
		data.setErrorRateDetail(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ErrorRateDetail"));
		data.setResTimeDetail(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ResTimeDetail"));
		data.setRpsDetail(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.RpsDetail"));

		List<CpuItem> cpu = new ArrayList<CpuItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Cpu.Length"); i++) {
			CpuItem cpuItem = new CpuItem();
			cpuItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Cpu["+ i +"].Timestamp"));
			cpuItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Cpu["+ i +"].Value"));

			cpu.add(cpuItem);
		}
		data.setCpu(cpu);

		List<ErrorRateItem> errorRate = new ArrayList<ErrorRateItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ErrorRate.Length"); i++) {
			ErrorRateItem errorRateItem = new ErrorRateItem();
			errorRateItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ErrorRate["+ i +"].Timestamp"));
			errorRateItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ErrorRate["+ i +"].Value"));

			errorRate.add(errorRateItem);
		}
		data.setErrorRate(errorRate);

		List<FlowInItem> flowIn = new ArrayList<FlowInItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowIn.Length"); i++) {
			FlowInItem flowInItem = new FlowInItem();
			flowInItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowIn["+ i +"].Timestamp"));
			flowInItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowIn["+ i +"].Value"));

			flowIn.add(flowInItem);
		}
		data.setFlowIn(flowIn);

		List<FlowOutItem> flowOut = new ArrayList<FlowOutItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowOut.Length"); i++) {
			FlowOutItem flowOutItem = new FlowOutItem();
			flowOutItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowOut["+ i +"].Timestamp"));
			flowOutItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.FlowOut["+ i +"].Value"));

			flowOut.add(flowOutItem);
		}
		data.setFlowOut(flowOut);

		List<MemoryItem> memory = new ArrayList<MemoryItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Memory.Length"); i++) {
			MemoryItem memoryItem = new MemoryItem();
			memoryItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Memory["+ i +"].Timestamp"));
			memoryItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Memory["+ i +"].Value"));

			memory.add(memoryItem);
		}
		data.setMemory(memory);

		List<ResTimeItem> resTime = new ArrayList<ResTimeItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ResTime.Length"); i++) {
			ResTimeItem resTimeItem = new ResTimeItem();
			resTimeItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ResTime["+ i +"].Timestamp"));
			resTimeItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.ResTime["+ i +"].Value"));

			resTime.add(resTimeItem);
		}
		data.setResTime(resTime);

		List<RpsItem> rps = new ArrayList<RpsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Rps.Length"); i++) {
			RpsItem rpsItem = new RpsItem();
			rpsItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Rps["+ i +"].Timestamp"));
			rpsItem.setValue(_ctx.stringValue("QueryRmsCloudmeshMultibizqueryResponse.Response.Data.Rps["+ i +"].Value"));

			rps.add(rpsItem);
		}
		data.setRps(rps);
		response.setData(data);
		queryRmsCloudmeshMultibizqueryResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshMultibizqueryResponse;
	}
}