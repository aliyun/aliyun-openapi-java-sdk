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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListInnerNodesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListInnerNodesResponse.Paging;
import com.aliyuncs.dataworks_public.model.v20200518.ListInnerNodesResponse.Paging.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInnerNodesResponseUnmarshaller {

	public static ListInnerNodesResponse unmarshall(ListInnerNodesResponse listInnerNodesResponse, UnmarshallerContext _ctx) {
		
		listInnerNodesResponse.setRequestId(_ctx.stringValue("ListInnerNodesResponse.RequestId"));
		listInnerNodesResponse.setSuccess(_ctx.booleanValue("ListInnerNodesResponse.Success"));

		Paging paging = new Paging();
		paging.setPageNumber(_ctx.integerValue("ListInnerNodesResponse.Paging.PageNumber"));
		paging.setPageSize(_ctx.integerValue("ListInnerNodesResponse.Paging.PageSize"));
		paging.setTotalCount(_ctx.integerValue("ListInnerNodesResponse.Paging.TotalCount"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInnerNodesResponse.Paging.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setSchedulerType(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].SchedulerType"));
			nodesItem.setRepeatInterval(_ctx.longValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].RepeatInterval"));
			nodesItem.setRepeatability(_ctx.booleanValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].Repeatability"));
			nodesItem.setProjectId(_ctx.longValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].ProjectId"));
			nodesItem.setProgramType(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].ProgramType"));
			nodesItem.setPriority(_ctx.integerValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].Priority"));
			nodesItem.setOwnerId(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].OwnerId"));
			nodesItem.setConnection(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].Connection"));
			nodesItem.setParamValues(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].ParamValues"));
			nodesItem.setDqcType(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].DqcType"));
			nodesItem.setBaselineId(_ctx.longValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].BaselineId"));
			nodesItem.setDescription(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].Description"));
			nodesItem.setNodeName(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].NodeName"));
			nodesItem.setResGroupName(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].ResGroupName"));
			nodesItem.setBusinessId(_ctx.longValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].BusinessId"));
			nodesItem.setDqcDescription(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].DqcDescription"));
			nodesItem.setCronExpress(_ctx.stringValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].CronExpress"));
			nodesItem.setNodeId(_ctx.longValue("ListInnerNodesResponse.Paging.Nodes["+ i +"].NodeId"));

			nodes.add(nodesItem);
		}
		paging.setNodes(nodes);
		listInnerNodesResponse.setPaging(paging);
	 
	 	return listInnerNodesResponse;
	}
}