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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetJMeterSceneRunningDataResponse;
import com.aliyuncs.pts.model.v20201020.GetJMeterSceneRunningDataResponse.RunningData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJMeterSceneRunningDataResponseUnmarshaller {

	public static GetJMeterSceneRunningDataResponse unmarshall(GetJMeterSceneRunningDataResponse getJMeterSceneRunningDataResponse, UnmarshallerContext _ctx) {
		
		getJMeterSceneRunningDataResponse.setRequestId(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RequestId"));
		getJMeterSceneRunningDataResponse.setMessage(_ctx.stringValue("GetJMeterSceneRunningDataResponse.Message"));
		getJMeterSceneRunningDataResponse.setCode(_ctx.stringValue("GetJMeterSceneRunningDataResponse.Code"));
		getJMeterSceneRunningDataResponse.setSuccess(_ctx.booleanValue("GetJMeterSceneRunningDataResponse.Success"));
		getJMeterSceneRunningDataResponse.setHttpStatusCode(_ctx.integerValue("GetJMeterSceneRunningDataResponse.HttpStatusCode"));
		getJMeterSceneRunningDataResponse.setDocumentUrl(_ctx.stringValue("GetJMeterSceneRunningDataResponse.DocumentUrl"));

		RunningData runningData = new RunningData();
		runningData.setSceneId(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RunningData.SceneId"));
		runningData.setSceneName(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RunningData.SceneName"));
		runningData.setHoldFor(_ctx.integerValue("GetJMeterSceneRunningDataResponse.RunningData.HoldFor"));
		runningData.setAgentCount(_ctx.integerValue("GetJMeterSceneRunningDataResponse.RunningData.AgentCount"));
		runningData.setConcurrency(_ctx.integerValue("GetJMeterSceneRunningDataResponse.RunningData.Concurrency"));
		runningData.setHasReport(_ctx.booleanValue("GetJMeterSceneRunningDataResponse.RunningData.HasReport"));
		runningData.setIsDebugging(_ctx.booleanValue("GetJMeterSceneRunningDataResponse.RunningData.IsDebugging"));
		runningData.setStatus(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RunningData.Status"));
		runningData.setVum(_ctx.longValue("GetJMeterSceneRunningDataResponse.RunningData.Vum"));
		runningData.setStartTimeTS(_ctx.longValue("GetJMeterSceneRunningDataResponse.RunningData.StartTimeTS"));
		runningData.setStageName(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RunningData.StageName"));
		runningData.setAllSampleStat(_ctx.mapValue("GetJMeterSceneRunningDataResponse.RunningData.AllSampleStat"));

		List<String> agentIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJMeterSceneRunningDataResponse.RunningData.AgentIdList.Length"); i++) {
			agentIdList.add(_ctx.stringValue("GetJMeterSceneRunningDataResponse.RunningData.AgentIdList["+ i +"]"));
		}
		runningData.setAgentIdList(agentIdList);

		List<Map<Object, Object>> sampleStatList = _ctx.listMapValue("GetJMeterSceneRunningDataResponse.RunningData.SampleStatList");
		runningData.setSampleStatList(sampleStatList);
		getJMeterSceneRunningDataResponse.setRunningData(runningData);
	 
	 	return getJMeterSceneRunningDataResponse;
	}
}