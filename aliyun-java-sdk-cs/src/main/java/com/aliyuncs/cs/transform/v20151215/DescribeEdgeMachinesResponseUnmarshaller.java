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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachinesResponse;
import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachinesResponse.Edge_machinesItem;
import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachinesResponse.Page_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdgeMachinesResponseUnmarshaller {

	public static DescribeEdgeMachinesResponse unmarshall(DescribeEdgeMachinesResponse describeEdgeMachinesResponse, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_number(_ctx.integerValue("DescribeEdgeMachinesResponse.page_info.page_number"));
		page_info.setPage_size(_ctx.integerValue("DescribeEdgeMachinesResponse.page_info.page_size"));
		page_info.setTotal_count(_ctx.integerValue("DescribeEdgeMachinesResponse.page_info.total_count"));
		describeEdgeMachinesResponse.setPage_info(page_info);

		List<Edge_machinesItem> edge_machines = new ArrayList<Edge_machinesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEdgeMachinesResponse.edge_machines.Length"); i++) {
			Edge_machinesItem edge_machinesItem = new Edge_machinesItem();
			edge_machinesItem.setEdge_machine_id(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].edge_machine_id"));
			edge_machinesItem.setCreated(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].created"));
			edge_machinesItem.setUpdated(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].updated"));
			edge_machinesItem.setName(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].name"));
			edge_machinesItem.setHostname(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].hostname"));
			edge_machinesItem.setSn(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].sn"));
			edge_machinesItem.setModel(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].model"));
			edge_machinesItem.setLife_state(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].life_state"));
			edge_machinesItem.setOnline_state(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].online_state"));
			edge_machinesItem.setActive_time(_ctx.stringValue("DescribeEdgeMachinesResponse.edge_machines["+ i +"].active_time"));

			edge_machines.add(edge_machinesItem);
		}
		describeEdgeMachinesResponse.setEdge_machines(edge_machines);
	 
	 	return describeEdgeMachinesResponse;
	}
}