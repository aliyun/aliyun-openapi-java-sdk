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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse.Data.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse.Data.PipelineConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse.Data.PipelineConfig.Hop;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineByIdResponse.Data.PipelineConfig.Step;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineByIdResponseUnmarshaller {

	public static GetPipelineByIdResponse unmarshall(GetPipelineByIdResponse getPipelineByIdResponse, UnmarshallerContext _ctx) {
		
		getPipelineByIdResponse.setRequestId(_ctx.stringValue("GetPipelineByIdResponse.RequestId"));
		getPipelineByIdResponse.setMessage(_ctx.stringValue("GetPipelineByIdResponse.Message"));
		getPipelineByIdResponse.setHttpStatusCode(_ctx.integerValue("GetPipelineByIdResponse.HttpStatusCode"));
		getPipelineByIdResponse.setCode(_ctx.stringValue("GetPipelineByIdResponse.Code"));
		getPipelineByIdResponse.setSuccess(_ctx.booleanValue("GetPipelineByIdResponse.Success"));

		Data data = new Data();
		data.setScheduleConfig(_ctx.stringValue("GetPipelineByIdResponse.Data.ScheduleConfig"));
		data.setPipelineType(_ctx.integerValue("GetPipelineByIdResponse.Data.PipelineType"));
		data.setMode(_ctx.stringValue("GetPipelineByIdResponse.Data.Mode"));
		data.setPipelineJson(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineJson"));
		data.setSettings(_ctx.stringValue("GetPipelineByIdResponse.Data.Settings"));

		PipelineConfig pipelineConfig = new PipelineConfig();

		List<Step> steps = new ArrayList<Step>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps.Length"); i++) {
			Step step = new Step();
			step.setPluginConfig(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps["+ i +"].PluginConfig"));
			step.setStepType(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps["+ i +"].StepType"));
			step.setStepName(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps["+ i +"].StepName"));
			step.setIsDistribute(_ctx.booleanValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps["+ i +"].IsDistribute"));
			step.setKey(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Steps["+ i +"].Key"));

			steps.add(step);
		}
		pipelineConfig.setSteps(steps);

		List<Hop> hops = new ArrayList<Hop>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineByIdResponse.Data.PipelineConfig.Hops.Length"); i++) {
			Hop hop = new Hop();
			hop.setTarget(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Hops["+ i +"].Target"));
			hop.setSendTo(_ctx.booleanValue("GetPipelineByIdResponse.Data.PipelineConfig.Hops["+ i +"].SendTo"));
			hop.setSource(_ctx.stringValue("GetPipelineByIdResponse.Data.PipelineConfig.Hops["+ i +"].Source"));

			hops.add(hop);
		}
		pipelineConfig.setHops(hops);
		data.setPipelineConfig(pipelineConfig);

		NodeInfo nodeInfo = new NodeInfo();
		nodeInfo.setDesc(_ctx.stringValue("GetPipelineByIdResponse.Data.NodeInfo.Desc"));
		nodeInfo.setNodeName(_ctx.stringValue("GetPipelineByIdResponse.Data.NodeInfo.NodeName"));
		nodeInfo.setNodeId(_ctx.stringValue("GetPipelineByIdResponse.Data.NodeInfo.NodeId"));
		nodeInfo.setPipelineId(_ctx.longValue("GetPipelineByIdResponse.Data.NodeInfo.PipelineId"));
		nodeInfo.setFileId(_ctx.longValue("GetPipelineByIdResponse.Data.NodeInfo.FileId"));
		nodeInfo.setDirectory(_ctx.stringValue("GetPipelineByIdResponse.Data.NodeInfo.Directory"));
		data.setNodeInfo(nodeInfo);
		getPipelineByIdResponse.setData(data);
	 
	 	return getPipelineByIdResponse;
	}
}