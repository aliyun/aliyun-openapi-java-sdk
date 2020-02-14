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

import com.aliyuncs.pts.model.v20190810.DescribeReportResponse;
import com.aliyuncs.pts.model.v20190810.DescribeReportResponse.AgentLocation;
import com.aliyuncs.pts.model.v20190810.DescribeReportResponse.Relation;
import com.aliyuncs.pts.model.v20190810.DescribeReportResponse.Relation.Node;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReportResponseUnmarshaller {

	public static DescribeReportResponse unmarshall(DescribeReportResponse describeReportResponse, UnmarshallerContext _ctx) {
		
		describeReportResponse.setRequestId(_ctx.stringValue("DescribeReportResponse.RequestId"));
		describeReportResponse.setAverageConcurrency(_ctx.integerValue("DescribeReportResponse.AverageConcurrency"));
		describeReportResponse.setAverageBandWidth(_ctx.longValue("DescribeReportResponse.AverageBandWidth"));
		describeReportResponse.setSucceedRequestRatio(_ctx.floatValue("DescribeReportResponse.SucceedRequestRatio"));
		describeReportResponse.setEndTime(_ctx.longValue("DescribeReportResponse.EndTime"));
		describeReportResponse.setBeginTime(_ctx.longValue("DescribeReportResponse.BeginTime"));
		describeReportResponse.setTotalAgents(_ctx.integerValue("DescribeReportResponse.TotalAgents"));
		describeReportResponse.setRequestCount(_ctx.longValue("DescribeReportResponse.RequestCount"));
		describeReportResponse.setRpsLimit(_ctx.integerValue("DescribeReportResponse.RpsLimit"));
		describeReportResponse.setAliveAgents(_ctx.integerValue("DescribeReportResponse.AliveAgents"));
		describeReportResponse.setMaxTps(_ctx.integerValue("DescribeReportResponse.MaxTps"));
		describeReportResponse.setConcurrencyLimit(_ctx.integerValue("DescribeReportResponse.ConcurrencyLimit"));
		describeReportResponse.setMaxConcurrency(_ctx.integerValue("DescribeReportResponse.MaxConcurrency"));
		describeReportResponse.setSceneDeleted(_ctx.booleanValue("DescribeReportResponse.SceneDeleted"));
		describeReportResponse.setDuration(_ctx.stringValue("DescribeReportResponse.Duration"));
		describeReportResponse.setMaxBandWidth(_ctx.longValue("DescribeReportResponse.MaxBandWidth"));
		describeReportResponse.setVum(_ctx.longValue("DescribeReportResponse.Vum"));
		describeReportResponse.setFailedBusinessCount(_ctx.longValue("DescribeReportResponse.FailedBusinessCount"));
		describeReportResponse.setFailedRequestCount(_ctx.longValue("DescribeReportResponse.FailedRequestCount"));
		describeReportResponse.setBusinessRequestRatio(_ctx.floatValue("DescribeReportResponse.BusinessRequestRatio"));
		describeReportResponse.setCode(_ctx.stringValue("DescribeReportResponse.Code"));
		describeReportResponse.setMessage(_ctx.stringValue("DescribeReportResponse.Message"));
		describeReportResponse.setHttpStatusCode(_ctx.integerValue("DescribeReportResponse.HttpStatusCode"));
		describeReportResponse.setSuccess(_ctx.booleanValue("DescribeReportResponse.Success"));

		List<AgentLocation> agentsLocation = new ArrayList<AgentLocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportResponse.AgentsLocation.Length"); i++) {
			AgentLocation agentLocation = new AgentLocation();
			agentLocation.setRegion(_ctx.stringValue("DescribeReportResponse.AgentsLocation["+ i +"].Region"));
			agentLocation.setProvince(_ctx.stringValue("DescribeReportResponse.AgentsLocation["+ i +"].Province"));
			agentLocation.setIsp(_ctx.stringValue("DescribeReportResponse.AgentsLocation["+ i +"].Isp"));
			agentLocation.setCount(_ctx.integerValue("DescribeReportResponse.AgentsLocation["+ i +"].Count"));

			agentsLocation.add(agentLocation);
		}
		describeReportResponse.setAgentsLocation(agentsLocation);

		List<Relation> relations = new ArrayList<Relation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportResponse.Relations.Length"); i++) {
			Relation relation = new Relation();
			relation.setName(_ctx.stringValue("DescribeReportResponse.Relations["+ i +"].Name"));
			relation.setId(_ctx.longValue("DescribeReportResponse.Relations["+ i +"].Id"));
			relation.setDisabled(_ctx.booleanValue("DescribeReportResponse.Relations["+ i +"].Disabled"));
			relation.setHeaders(_ctx.mapValue("DescribeReportResponse.Relations["+ i +"].Headers"));
			relation.setRelationTestConfig(_ctx.mapValue("DescribeReportResponse.Relations["+ i +"].RelationTestConfig"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReportResponse.Relations["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setType(_ctx.stringValue("DescribeReportResponse.Relations["+ i +"].Nodes["+ j +"].Type"));
				node.setId(_ctx.longValue("DescribeReportResponse.Relations["+ i +"].Nodes["+ j +"].Id"));
				node.setName(_ctx.stringValue("DescribeReportResponse.Relations["+ i +"].Nodes["+ j +"].Name"));
				node.setConfig(_ctx.mapValue("DescribeReportResponse.Relations["+ i +"].Nodes["+ j +"].Config"));

				nodes.add(node);
			}
			relation.setNodes(nodes);

			relations.add(relation);
		}
		describeReportResponse.setRelations(relations);
	 
	 	return describeReportResponse;
	}
}