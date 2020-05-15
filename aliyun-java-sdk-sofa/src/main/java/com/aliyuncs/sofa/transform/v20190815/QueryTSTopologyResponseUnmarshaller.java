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

import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse.Data.EdgesItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse.Data.NodesItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse.Data.NodesItem.ActivityEventsItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyResponse.Data.NodesItem.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTopologyResponseUnmarshaller {

	public static QueryTSTopologyResponse unmarshall(QueryTSTopologyResponse queryTSTopologyResponse, UnmarshallerContext _ctx) {
		
		queryTSTopologyResponse.setRequestId(_ctx.stringValue("QueryTSTopologyResponse.RequestId"));
		queryTSTopologyResponse.setResultCode(_ctx.stringValue("QueryTSTopologyResponse.ResultCode"));
		queryTSTopologyResponse.setResultMessage(_ctx.stringValue("QueryTSTopologyResponse.ResultMessage"));

		Data data = new Data();
		data.setBaseVersion(_ctx.longValue("QueryTSTopologyResponse.Data.BaseVersion"));
		data.setProcessId(_ctx.longValue("QueryTSTopologyResponse.Data.ProcessId"));

		List<EdgesItem> edges = new ArrayList<EdgesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologyResponse.Data.Edges.Length"); i++) {
			EdgesItem edgesItem = new EdgesItem();
			edgesItem.setConditionValue(_ctx.booleanValue("QueryTSTopologyResponse.Data.Edges["+ i +"].ConditionValue"));
			edgesItem.setSource(_ctx.stringValue("QueryTSTopologyResponse.Data.Edges["+ i +"].Source"));
			edgesItem.setStatus(_ctx.stringValue("QueryTSTopologyResponse.Data.Edges["+ i +"].Status"));
			edgesItem.setTarget(_ctx.stringValue("QueryTSTopologyResponse.Data.Edges["+ i +"].Target"));

			edges.add(edgesItem);
		}
		data.setEdges(edges);

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologyResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setActivityId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityId"));
			nodesItem.setActivityInstanceId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityInstanceId"));
			nodesItem.setApp(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].App"));
			nodesItem.setCanSuspend(_ctx.booleanValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].CanSuspend"));
			nodesItem.setComment(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Comment"));
			nodesItem.setCondition(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Condition"));
			nodesItem.setConsume(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Consume"));
			nodesItem.setCreateTimestamp(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].CreateTimestamp"));
			nodesItem.setCurSharding(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].CurSharding"));
			nodesItem.setGmtBegin(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].GmtBegin"));
			nodesItem.setGmtEnd(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].GmtEnd"));
			nodesItem.setId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Id"));
			nodesItem.setIsInShardingGateway(_ctx.booleanValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].IsInShardingGateway"));
			nodesItem.setJobDes(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].JobDes"));
			nodesItem.setJobId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].JobId"));
			nodesItem.setJobType(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].JobType"));
			nodesItem.setLock(_ctx.booleanValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Lock"));
			nodesItem.setName(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Name"));
			nodesItem.setNeedConfirm(_ctx.booleanValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].NeedConfirm"));
			nodesItem.setParallelCount(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ParallelCount"));
			nodesItem.setParentActivityInstanceId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ParentActivityInstanceId"));
			nodesItem.setStatus(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Status"));
			nodesItem.setSubProcessRequestId(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].SubProcessRequestId"));
			nodesItem.setSucceedShardingNum(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].SucceedShardingNum"));
			nodesItem.setTopologyStatus(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].TopologyStatus"));
			nodesItem.setTotalShardingNum(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].TotalShardingNum"));
			nodesItem.setType(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Type"));

			List<ActivityEventsItem> activityEvents = new ArrayList<ActivityEventsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents.Length"); j++) {
				ActivityEventsItem activityEventsItem = new ActivityEventsItem();
				activityEventsItem.setActivityId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents["+ j +"].ActivityId"));
				activityEventsItem.setExtra(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents["+ j +"].Extra"));
				activityEventsItem.setId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents["+ j +"].Id"));
				activityEventsItem.setProcessId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents["+ j +"].ProcessId"));
				activityEventsItem.setType(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].ActivityEvents["+ j +"].Type"));

				activityEvents.add(activityEventsItem);
			}
			nodesItem.setActivityEvents(activityEvents);

			List<EventsItem> events = new ArrayList<EventsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events.Length"); j++) {
				EventsItem eventsItem = new EventsItem();
				eventsItem.setActivityId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events["+ j +"].ActivityId"));
				eventsItem.setExtra(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events["+ j +"].Extra"));
				eventsItem.setId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events["+ j +"].Id"));
				eventsItem.setProcessId(_ctx.longValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events["+ j +"].ProcessId"));
				eventsItem.setType(_ctx.stringValue("QueryTSTopologyResponse.Data.Nodes["+ i +"].Events["+ j +"].Type"));

				events.add(eventsItem);
			}
			nodesItem.setEvents(events);

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		queryTSTopologyResponse.setData(data);
	 
	 	return queryTSTopologyResponse;
	}
}