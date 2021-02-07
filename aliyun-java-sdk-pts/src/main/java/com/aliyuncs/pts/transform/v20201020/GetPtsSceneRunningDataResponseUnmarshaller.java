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

import com.aliyuncs.pts.model.v20201020.GetPtsSceneRunningDataResponse;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneRunningDataResponse.ChainMonitorData;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneRunningDataResponse.ChainMonitorData.CheckPointResult;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneRunningDataResponse.Location;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsSceneRunningDataResponseUnmarshaller {

	public static GetPtsSceneRunningDataResponse unmarshall(GetPtsSceneRunningDataResponse getPtsSceneRunningDataResponse, UnmarshallerContext _ctx) {
		
		getPtsSceneRunningDataResponse.setRequestId(_ctx.stringValue("GetPtsSceneRunningDataResponse.RequestId"));
		getPtsSceneRunningDataResponse.setTotalRequestCount(_ctx.longValue("GetPtsSceneRunningDataResponse.TotalRequestCount"));
		getPtsSceneRunningDataResponse.setVum(_ctx.longValue("GetPtsSceneRunningDataResponse.Vum"));
		getPtsSceneRunningDataResponse.setRequestBps(_ctx.stringValue("GetPtsSceneRunningDataResponse.RequestBps"));
		getPtsSceneRunningDataResponse.setResponseBps(_ctx.stringValue("GetPtsSceneRunningDataResponse.ResponseBps"));
		getPtsSceneRunningDataResponse.setFailedRequestCount(_ctx.longValue("GetPtsSceneRunningDataResponse.FailedRequestCount"));
		getPtsSceneRunningDataResponse.setFailedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.FailedBusinessCount"));
		getPtsSceneRunningDataResponse.setConcurrency(_ctx.integerValue("GetPtsSceneRunningDataResponse.Concurrency"));
		getPtsSceneRunningDataResponse.setConcurrencyLimit(_ctx.integerValue("GetPtsSceneRunningDataResponse.ConcurrencyLimit"));
		getPtsSceneRunningDataResponse.setTpsLimit(_ctx.integerValue("GetPtsSceneRunningDataResponse.TpsLimit"));
		getPtsSceneRunningDataResponse.setAliveAgents(_ctx.integerValue("GetPtsSceneRunningDataResponse.AliveAgents"));
		getPtsSceneRunningDataResponse.setTotalAgents(_ctx.integerValue("GetPtsSceneRunningDataResponse.TotalAgents"));
		getPtsSceneRunningDataResponse.setSeg90Rt(_ctx.longValue("GetPtsSceneRunningDataResponse.Seg90Rt"));
		getPtsSceneRunningDataResponse.setAverageRt(_ctx.longValue("GetPtsSceneRunningDataResponse.AverageRt"));
		getPtsSceneRunningDataResponse.setBeginTime(_ctx.longValue("GetPtsSceneRunningDataResponse.BeginTime"));
		getPtsSceneRunningDataResponse.setCode(_ctx.stringValue("GetPtsSceneRunningDataResponse.Code"));
		getPtsSceneRunningDataResponse.setMessage(_ctx.stringValue("GetPtsSceneRunningDataResponse.Message"));
		getPtsSceneRunningDataResponse.setHttpStatusCode(_ctx.integerValue("GetPtsSceneRunningDataResponse.HttpStatusCode"));
		getPtsSceneRunningDataResponse.setSuccess(_ctx.booleanValue("GetPtsSceneRunningDataResponse.Success"));
		getPtsSceneRunningDataResponse.setStatus(_ctx.integerValue("GetPtsSceneRunningDataResponse.Status"));
		getPtsSceneRunningDataResponse.setHasReport(_ctx.booleanValue("GetPtsSceneRunningDataResponse.HasReport"));

		List<Location> agentLocation = new ArrayList<Location>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneRunningDataResponse.AgentLocation.Length"); i++) {
			Location location = new Location();
			location.setProvince(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Province"));
			location.setIsp(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Isp"));
			location.setRegion(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Region"));
			location.setCount(_ctx.integerValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Count"));

			agentLocation.add(location);
		}
		getPtsSceneRunningDataResponse.setAgentLocation(agentLocation);

		List<ChainMonitorData> chainMonitorDataList = new ArrayList<ChainMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList.Length"); i++) {
			ChainMonitorData chainMonitorData = new ChainMonitorData();
			chainMonitorData.setNodeId(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].NodeId"));
			chainMonitorData.setTimePoint(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].TimePoint"));
			chainMonitorData.setConfigQps(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].ConfigQps"));
			chainMonitorData.setRealQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].RealQps"));
			chainMonitorData.setConcurrency(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Concurrency"));
			chainMonitorData.setQps2XX(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Qps2XX"));
			chainMonitorData.setFailedQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].FailedQps"));
			chainMonitorData.setAverageRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].AverageRt"));
			chainMonitorData.setMaxRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].MaxRt"));
			chainMonitorData.setMinRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].MinRt"));
			chainMonitorData.setCount2XX(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Count2XX"));
			chainMonitorData.setFailedCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].FailedCount"));

			CheckPointResult checkPointResult = new CheckPointResult();
			checkPointResult.setSucceedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessCount"));
			checkPointResult.setFailedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessCount"));
			checkPointResult.setSucceedBusinessQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessQps"));
			checkPointResult.setFailedBusinessQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessQps"));
			chainMonitorData.setCheckPointResult(checkPointResult);

			chainMonitorDataList.add(chainMonitorData);
		}
		getPtsSceneRunningDataResponse.setChainMonitorDataList(chainMonitorDataList);
	 
	 	return getPtsSceneRunningDataResponse;
	}
}