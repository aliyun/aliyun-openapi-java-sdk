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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterProxyResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterProxyResponse.ChildInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterProxyResponseUnmarshaller {

	public static DescribeDBClusterProxyResponse unmarshall(DescribeDBClusterProxyResponse describeDBClusterProxyResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterProxyResponse.setRequestId(_ctx.stringValue("DescribeDBClusterProxyResponse.RequestId"));
		describeDBClusterProxyResponse.setDBProxyClusterId(_ctx.stringValue("DescribeDBClusterProxyResponse.DBProxyClusterId"));
		describeDBClusterProxyResponse.setDBProxyClusterNum(_ctx.longValue("DescribeDBClusterProxyResponse.DBProxyClusterNum"));
		describeDBClusterProxyResponse.setDBProxyClusterStatus(_ctx.stringValue("DescribeDBClusterProxyResponse.DBProxyClusterStatus"));

		List<ChildInstance> childInstances = new ArrayList<ChildInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterProxyResponse.ChildInstances.Length"); i++) {
			ChildInstance childInstance = new ChildInstance();
			childInstance.setDBNodeClass(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].DBNodeClass"));
			childInstance.setDBNodeIP(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].DBNodeIP"));
			childInstance.setDBNodeId(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].DBNodeId"));
			childInstance.setDBNodePort(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].DBNodePort"));
			childInstance.setDBNodeStatus(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].DBNodeStatus"));
			childInstance.setHostName(_ctx.stringValue("DescribeDBClusterProxyResponse.ChildInstances["+ i +"].HostName"));

			childInstances.add(childInstance);
		}
		describeDBClusterProxyResponse.setChildInstances(childInstances);
	 
	 	return describeDBClusterProxyResponse;
	}
}