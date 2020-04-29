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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetConsistencySnapshotResponse;
import com.aliyuncs.arms.model.v20190808.GetConsistencySnapshotResponse.ConsistencyResult;
import com.aliyuncs.arms.model.v20190808.GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfo;
import com.aliyuncs.arms.model.v20190808.GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean;
import com.aliyuncs.arms.model.v20190808.GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsistencySnapshotResponseUnmarshaller {

	public static GetConsistencySnapshotResponse unmarshall(GetConsistencySnapshotResponse getConsistencySnapshotResponse, UnmarshallerContext _ctx) {
		
		getConsistencySnapshotResponse.setRequestId(_ctx.stringValue("GetConsistencySnapshotResponse.RequestId"));

		ConsistencyResult consistencyResult = new ConsistencyResult();
		consistencyResult.setJudgeTimestamp(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.JudgeTimestamp"));
		consistencyResult.setLastSlsShardWatermarkTimestamp(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.LastSlsShardWatermarkTimestamp"));
		consistencyResult.setLastAgentInfoTimestamp(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.LastAgentInfoTimestamp"));
		consistencyResult.setBarrierPointsLastTimestampMap(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.BarrierPointsLastTimestampMap"));
		consistencyResult.setLastBarrierTimestamp(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.LastBarrierTimestamp"));

		SlsShardWatermarkBean slsShardWatermarkBean = new SlsShardWatermarkBean();
		slsShardWatermarkBean.setPid(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.Pid"));
		slsShardWatermarkBean.setUserId(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.UserId"));
		slsShardWatermarkBean.setRegionId(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.RegionId"));
		slsShardWatermarkBean.setAppType(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.AppType"));

		List<Integer> cursorUpdateTimes = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CursorUpdateTimes.Length"); i++) {
			cursorUpdateTimes.add(_ctx.integerValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CursorUpdateTimes["+ i +"]"));
		}
		slsShardWatermarkBean.setCursorUpdateTimes(cursorUpdateTimes);

		List<CheckPointResponse> checkPointResponses = new ArrayList<CheckPointResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponses.Length"); i++) {
			CheckPointResponse checkPointResponse = new CheckPointResponse();
			checkPointResponse.setShard(_ctx.integerValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponses["+ i +"].Shard"));
			checkPointResponse.setCheckPoint(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponses["+ i +"].CheckPoint"));
			checkPointResponse.setUpdateTime(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponses["+ i +"].UpdateTime"));
			checkPointResponse.setConsumer(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.SlsShardWatermarkBean.CheckPointResponses["+ i +"].Consumer"));

			checkPointResponses.add(checkPointResponse);
		}
		slsShardWatermarkBean.setCheckPointResponses(checkPointResponses);
		consistencyResult.setSlsShardWatermarkBean(slsShardWatermarkBean);

		List<AgentHeartbeatInfo> agentHeartbeatInfos = new ArrayList<AgentHeartbeatInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos.Length"); i++) {
			AgentHeartbeatInfo agentHeartbeatInfo = new AgentHeartbeatInfo();
			agentHeartbeatInfo.setRegionId(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].RegionId"));
			agentHeartbeatInfo.setAppType(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].AppType"));
			agentHeartbeatInfo.setPid(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].Pid"));
			agentHeartbeatInfo.setIp(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].Ip"));
			agentHeartbeatInfo.setStartTimestamp(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].StartTimestamp"));
			agentHeartbeatInfo.setHostname(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].Hostname"));
			agentHeartbeatInfo.setProcId(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].ProcId"));
			agentHeartbeatInfo.setAgentVersion(_ctx.stringValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].AgentVersion"));
			agentHeartbeatInfo.setLastHeartbeatTime(_ctx.longValue("GetConsistencySnapshotResponse.ConsistencyResult.AgentHeartbeatInfos["+ i +"].LastHeartbeatTime"));

			agentHeartbeatInfos.add(agentHeartbeatInfo);
		}
		consistencyResult.setAgentHeartbeatInfos(agentHeartbeatInfos);
		getConsistencySnapshotResponse.setConsistencyResult(consistencyResult);
	 
	 	return getConsistencySnapshotResponse;
	}
}