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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeLogicInstanceTopologyResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeLogicInstanceTopologyResponse.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogicInstanceTopologyResponseUnmarshaller {

	public static DescribeLogicInstanceTopologyResponse unmarshall(DescribeLogicInstanceTopologyResponse describeLogicInstanceTopologyResponse, UnmarshallerContext _ctx) {
		
		describeLogicInstanceTopologyResponse.setRequestId(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RequestId"));
		describeLogicInstanceTopologyResponse.setInstanceId(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.InstanceId"));

		List<NodeInfo> redisProxyList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogicInstanceTopologyResponse.RedisProxyList.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setNodeId(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisProxyList["+ i +"].NodeId"));
			nodeInfo.setConnection(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisProxyList["+ i +"].Connection"));
			nodeInfo.setBandwidth(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisProxyList["+ i +"].Bandwidth"));
			nodeInfo.setCapacity(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisProxyList["+ i +"].Capacity"));
			nodeInfo.setNodeType(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisProxyList["+ i +"].NodeType"));

			redisProxyList.add(nodeInfo);
		}
		describeLogicInstanceTopologyResponse.setRedisProxyList(redisProxyList);

		List<NodeInfo> redisShardList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogicInstanceTopologyResponse.RedisShardList.Length"); i++) {
			NodeInfo nodeInfo_ = new NodeInfo();
			nodeInfo_.setNodeId(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisShardList["+ i +"].NodeId"));
			nodeInfo_.setConnection(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisShardList["+ i +"].Connection"));
			nodeInfo_.setBandwidth(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisShardList["+ i +"].Bandwidth"));
			nodeInfo_.setCapacity(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisShardList["+ i +"].Capacity"));
			nodeInfo_.setNodeType(_ctx.stringValue("DescribeLogicInstanceTopologyResponse.RedisShardList["+ i +"].NodeType"));

			redisShardList.add(nodeInfo_);
		}
		describeLogicInstanceTopologyResponse.setRedisShardList(redisShardList);
	 
	 	return describeLogicInstanceTopologyResponse;
	}
}