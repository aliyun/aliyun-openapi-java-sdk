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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneRunningStatusResponseUnmarshaller {

	public static DescribeSceneRunningStatusResponse unmarshall(DescribeSceneRunningStatusResponse describeSceneRunningStatusResponse, UnmarshallerContext _ctx) {
		
		describeSceneRunningStatusResponse.setTips(_ctx.stringValue("DescribeSceneRunningStatusResponse.Tips"));
		describeSceneRunningStatusResponse.setTotalRequestCount(_ctx.integerValue("DescribeSceneRunningStatusResponse.TotalRequestCount"));
		describeSceneRunningStatusResponse.setVum(_ctx.integerValue("DescribeSceneRunningStatusResponse.Vum"));
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
		describeSceneRunningStatusResponse.setSeg90Rt(_ctx.integerValue("DescribeSceneRunningStatusResponse.Seg90Rt"));
		describeSceneRunningStatusResponse.setAverageRt(_ctx.integerValue("DescribeSceneRunningStatusResponse.AverageRt"));
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
	 
	 	return describeSceneRunningStatusResponse;
	}
}