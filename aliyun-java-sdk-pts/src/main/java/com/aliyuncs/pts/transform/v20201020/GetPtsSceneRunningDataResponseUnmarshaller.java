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
		getPtsSceneRunningDataResponse.setStatus(_ctx.integerValue("GetPtsSceneRunningDataResponse.Status"));
		getPtsSceneRunningDataResponse.setTotalRequestCount(_ctx.longValue("GetPtsSceneRunningDataResponse.TotalRequestCount"));
		getPtsSceneRunningDataResponse.setHasReport(_ctx.booleanValue("GetPtsSceneRunningDataResponse.HasReport"));
		getPtsSceneRunningDataResponse.setConcurrencyLimit(_ctx.integerValue("GetPtsSceneRunningDataResponse.ConcurrencyLimit"));
		getPtsSceneRunningDataResponse.setMessage(_ctx.stringValue("GetPtsSceneRunningDataResponse.Message"));
		getPtsSceneRunningDataResponse.setBeginTime(_ctx.longValue("GetPtsSceneRunningDataResponse.BeginTime"));
		getPtsSceneRunningDataResponse.setSeg90Rt(_ctx.longValue("GetPtsSceneRunningDataResponse.Seg90Rt"));
		getPtsSceneRunningDataResponse.setResponseBps(_ctx.stringValue("GetPtsSceneRunningDataResponse.ResponseBps"));
		getPtsSceneRunningDataResponse.setTotalAgents(_ctx.integerValue("GetPtsSceneRunningDataResponse.TotalAgents"));
		getPtsSceneRunningDataResponse.setCode(_ctx.stringValue("GetPtsSceneRunningDataResponse.Code"));
		getPtsSceneRunningDataResponse.setSuccess(_ctx.booleanValue("GetPtsSceneRunningDataResponse.Success"));
		getPtsSceneRunningDataResponse.setVum(_ctx.longValue("GetPtsSceneRunningDataResponse.Vum"));
		getPtsSceneRunningDataResponse.setAverageRt(_ctx.longValue("GetPtsSceneRunningDataResponse.AverageRt"));
		getPtsSceneRunningDataResponse.setRequestBps(_ctx.stringValue("GetPtsSceneRunningDataResponse.RequestBps"));
		getPtsSceneRunningDataResponse.setFailedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.FailedBusinessCount"));
		getPtsSceneRunningDataResponse.setConcurrency(_ctx.integerValue("GetPtsSceneRunningDataResponse.Concurrency"));
		getPtsSceneRunningDataResponse.setHttpStatusCode(_ctx.integerValue("GetPtsSceneRunningDataResponse.HttpStatusCode"));
		getPtsSceneRunningDataResponse.setFailedRequestCount(_ctx.longValue("GetPtsSceneRunningDataResponse.FailedRequestCount"));
		getPtsSceneRunningDataResponse.setTpsLimit(_ctx.integerValue("GetPtsSceneRunningDataResponse.TpsLimit"));
		getPtsSceneRunningDataResponse.setAliveAgents(_ctx.integerValue("GetPtsSceneRunningDataResponse.AliveAgents"));
		getPtsSceneRunningDataResponse.setTotalRealQps(_ctx.integerValue("GetPtsSceneRunningDataResponse.TotalRealQps"));

		List<Location> agentLocation = new ArrayList<Location>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneRunningDataResponse.AgentLocation.Length"); i++) {
			Location location = new Location();
			location.setRegion(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Region"));
			location.setIsp(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Isp"));
			location.setCount(_ctx.integerValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Count"));
			location.setProvince(_ctx.stringValue("GetPtsSceneRunningDataResponse.AgentLocation["+ i +"].Province"));

			agentLocation.add(location);
		}
		getPtsSceneRunningDataResponse.setAgentLocation(agentLocation);

		List<ChainMonitorData> chainMonitorDataList = new ArrayList<ChainMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList.Length"); i++) {
			ChainMonitorData chainMonitorData = new ChainMonitorData();
			chainMonitorData.setTimePoint(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].TimePoint"));
			chainMonitorData.setApiId(_ctx.stringValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].ApiId"));
			chainMonitorData.setMinRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].MinRt"));
			chainMonitorData.setQps2XX(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Qps2XX"));
			chainMonitorData.setMaxRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].MaxRt"));
			chainMonitorData.setConfigQps(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].ConfigQps"));
			chainMonitorData.setFailedCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].FailedCount"));
			chainMonitorData.setFailedQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].FailedQps"));
			chainMonitorData.setAverageRt(_ctx.integerValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].AverageRt"));
			chainMonitorData.setCount2XX(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Count2XX"));
			chainMonitorData.setRealQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].RealQps"));
			chainMonitorData.setApiName(_ctx.stringValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].ApiName"));
			chainMonitorData.setNodeId(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].NodeId"));
			chainMonitorData.setConcurrency(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].Concurrency"));

			CheckPointResult checkPointResult = new CheckPointResult();
			checkPointResult.setSucceedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessCount"));
			checkPointResult.setSucceedBusinessQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessQps"));
			checkPointResult.setFailedBusinessCount(_ctx.longValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessCount"));
			checkPointResult.setFailedBusinessQps(_ctx.floatValue("GetPtsSceneRunningDataResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessQps"));
			chainMonitorData.setCheckPointResult(checkPointResult);

			chainMonitorDataList.add(chainMonitorData);
		}
		getPtsSceneRunningDataResponse.setChainMonitorDataList(chainMonitorDataList);
	 
	 	return getPtsSceneRunningDataResponse;
	}
}