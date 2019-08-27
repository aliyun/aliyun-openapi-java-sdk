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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyResponse.Topology;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTopologyResponseUnmarshaller {

	public static DescribeInstanceTopologyResponse unmarshall(DescribeInstanceTopologyResponse describeInstanceTopologyResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTopologyResponse.setRequestId(_ctx.stringValue("DescribeInstanceTopologyResponse.RequestId"));

		List<Topology> topologys = new ArrayList<Topology>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTopologyResponse.Topologys.Length"); i++) {
			Topology topology = new Topology();
			topology.setInstanceId(_ctx.stringValue("DescribeInstanceTopologyResponse.Topologys["+ i +"].InstanceId"));
			topology.setHostId(_ctx.stringValue("DescribeInstanceTopologyResponse.Topologys["+ i +"].HostId"));

			topologys.add(topology);
		}
		describeInstanceTopologyResponse.setTopologys(topologys);
	 
	 	return describeInstanceTopologyResponse;
	}
}