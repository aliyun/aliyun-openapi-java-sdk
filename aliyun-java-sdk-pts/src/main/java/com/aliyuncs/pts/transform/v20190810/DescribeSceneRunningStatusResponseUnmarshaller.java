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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeSceneRunningStatusResponse;
import com.aliyuncs.pts.model.v20190810.DescribeSceneRunningStatusResponse.ChainElement;
import com.aliyuncs.pts.model.v20190810.DescribeSceneRunningStatusResponse.ChainMonitorData;
import com.aliyuncs.pts.model.v20190810.DescribeSceneRunningStatusResponse.ChainMonitorData.CheckPointResult;
import com.aliyuncs.pts.model.v20190810.DescribeSceneRunningStatusResponse.ChainMonitorData.QpsSummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneRunningStatusResponseUnmarshaller {

	public static DescribeSceneRunningStatusResponse unmarshall(DescribeSceneRunningStatusResponse describeSceneRunningStatusResponse, UnmarshallerContext _ctx) {
		
		describeSceneRunningStatusResponse.setRequestId(_ctx.stringValue("DescribeSceneRunningStatusResponse.RequestId"));
		describeSceneRunningStatusResponse.setTips(_ctx.stringValue("DescribeSceneRunningStatusResponse.Tips"));
		describeSceneRunningStatusResponse.setTotalRequestCount(_ctx.longValue("DescribeSceneRunningStatusResponse.TotalRequestCount"));
		describeSceneRunningStatusResponse.setVum(_ctx.longValue("DescribeSceneRunningStatusResponse.Vum"));
		describeSceneRunningStatusResponse.setRequestBps(_ctx.stringValue("DescribeSceneRunningStatusResponse.RequestBps"));
		describeSceneRunningStatusResponse.setResponseBps(_ctx.stringValue("DescribeSceneRunningStatusResponse.ResponseBps"));
		describeSceneRunningStatusResponse.setFailedRequestCount(_ctx.longValue("DescribeSceneRunningStatusResponse.FailedRequestCount"));
		describeSceneRunningStatusResponse.setFailedBusinessCount(_ctx.longValue("DescribeSceneRunningStatusResponse.FailedBusinessCount"));
		describeSceneRunningStatusResponse.setConcurrency(_ctx.integerValue("DescribeSceneRunningStatusResponse.Concurrency"));
		describeSceneRunningStatusResponse.setConcurrencyLimit(_ctx.integerValue("DescribeSceneRunningStatusResponse.ConcurrencyLimit"));
		describeSceneRunningStatusResponse.setTps(_ctx.integerValue("DescribeSceneRunningStatusResponse.Tps"));
		describeSceneRunningStatusResponse.setTpsLimit(_ctx.integerValue("DescribeSceneRunningStatusResponse.TpsLimit"));
		describeSceneRunningStatusResponse.setAliveAgents(_ctx.integerValue("DescribeSceneRunningStatusResponse.AliveAgents"));
		describeSceneRunningStatusResponse.setTotalAgents(_ctx.integerValue("DescribeSceneRunningStatusResponse.TotalAgents"));
		describeSceneRunningStatusResponse.setSeg90Rt(_ctx.longValue("DescribeSceneRunningStatusResponse.Seg90Rt"));
		describeSceneRunningStatusResponse.setAverageRt(_ctx.longValue("DescribeSceneRunningStatusResponse.AverageRt"));
		describeSceneRunningStatusResponse.setReportId(_ctx.stringValue("DescribeSceneRunningStatusResponse.ReportId"));
		describeSceneRunningStatusResponse.setBeginTime(_ctx.longValue("DescribeSceneRunningStatusResponse.BeginTime"));
		describeSceneRunningStatusResponse.setCurrentTime(_ctx.longValue("DescribeSceneRunningStatusResponse.CurrentTime"));
		describeSceneRunningStatusResponse.setCode(_ctx.stringValue("DescribeSceneRunningStatusResponse.Code"));
		describeSceneRunningStatusResponse.setMessage(_ctx.stringValue("DescribeSceneRunningStatusResponse.Message"));
		describeSceneRunningStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribeSceneRunningStatusResponse.HttpStatusCode"));
		describeSceneRunningStatusResponse.setSuccess(_ctx.booleanValue("DescribeSceneRunningStatusResponse.Success"));
		describeSceneRunningStatusResponse.setUseCustomPool(_ctx.booleanValue("DescribeSceneRunningStatusResponse.UseCustomPool"));

		List<ChainElement> agentsLocation = new ArrayList<ChainElement>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneRunningStatusResponse.AgentsLocation.Length"); i++) {
			ChainElement chainElement = new ChainElement();
			chainElement.setRegion(_ctx.stringValue("DescribeSceneRunningStatusResponse.AgentsLocation["+ i +"].Region"));
			chainElement.setProvince(_ctx.stringValue("DescribeSceneRunningStatusResponse.AgentsLocation["+ i +"].Province"));
			chainElement.setIsp(_ctx.stringValue("DescribeSceneRunningStatusResponse.AgentsLocation["+ i +"].Isp"));
			chainElement.setCount(_ctx.integerValue("DescribeSceneRunningStatusResponse.AgentsLocation["+ i +"].Count"));

			agentsLocation.add(chainElement);
		}
		describeSceneRunningStatusResponse.setAgentsLocation(agentsLocation);

		List<ChainMonitorData> chainMonitorDataList = new ArrayList<ChainMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList.Length"); i++) {
			ChainMonitorData chainMonitorData = new ChainMonitorData();
			chainMonitorData.setChainId(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].ChainId"));
			chainMonitorData.setTimePoint(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].TimePoint"));
			chainMonitorData.setConfigQps(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].ConfigQps"));
			chainMonitorData.setRealQps(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].RealQps"));
			chainMonitorData.setConcurrency(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].Concurrency"));
			chainMonitorData.setQps2XX(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].Qps2XX"));
			chainMonitorData.setFailedQps(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].FailedQps"));
			chainMonitorData.setAverageRt(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].AverageRt"));
			chainMonitorData.setMaxRt(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].MaxRt"));
			chainMonitorData.setMinRt(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].MinRt"));
			chainMonitorData.setCount2XX(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].Count2XX"));
			chainMonitorData.setFailedCount(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].FailedCount"));
			chainMonitorData.setQueueSize(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QueueSize"));
			chainMonitorData.setQueueCapacity(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QueueCapacity"));

			CheckPointResult checkPointResult = new CheckPointResult();
			checkPointResult.setSucceedBusinessCount(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessCount"));
			checkPointResult.setFailedBusinessCount(_ctx.longValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessCount"));
			checkPointResult.setSucceedBusinessQps(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].CheckPointResult.SucceedBusinessQps"));
			checkPointResult.setFailedBusinessQps(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].CheckPointResult.FailedBusinessQps"));
			chainMonitorData.setCheckPointResult(checkPointResult);

			List<QpsSummaryItem> qpsSummary = new ArrayList<QpsSummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QpsSummary.Length"); j++) {
				QpsSummaryItem qpsSummaryItem = new QpsSummaryItem();
				qpsSummaryItem.setStatusCode(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QpsSummary["+ j +"].StatusCode"));
				qpsSummaryItem.setQps(_ctx.floatValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QpsSummary["+ j +"].Qps"));
				qpsSummaryItem.setTotalCount(_ctx.integerValue("DescribeSceneRunningStatusResponse.ChainMonitorDataList["+ i +"].QpsSummary["+ j +"].TotalCount"));

				qpsSummary.add(qpsSummaryItem);
			}
			chainMonitorData.setQpsSummary(qpsSummary);

			chainMonitorDataList.add(chainMonitorData);
		}
		describeSceneRunningStatusResponse.setChainMonitorDataList(chainMonitorDataList);
	 
	 	return describeSceneRunningStatusResponse;
	}
}