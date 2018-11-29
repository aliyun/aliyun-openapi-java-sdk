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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeUisConnectionsResponse;
import com.aliyuncs.uis.model.v20180821.DescribeUisConnectionsResponse.UisConnection;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUisConnectionsResponseUnmarshaller {

	public static DescribeUisConnectionsResponse unmarshall(DescribeUisConnectionsResponse describeUisConnectionsResponse, UnmarshallerContext context) {
		
		describeUisConnectionsResponse.setRequestId(context.stringValue("DescribeUisConnectionsResponse.RequestId"));
		describeUisConnectionsResponse.setTotalCount(context.integerValue("DescribeUisConnectionsResponse.TotalCount"));
		describeUisConnectionsResponse.setPageNumber(context.integerValue("DescribeUisConnectionsResponse.PageNumber"));
		describeUisConnectionsResponse.setPageSize(context.integerValue("DescribeUisConnectionsResponse.PageSize"));

		List<UisConnection> uisConnections = new ArrayList<UisConnection>();
		for (int i = 0; i < context.lengthValue("DescribeUisConnectionsResponse.UisConnections.Length"); i++) {
			UisConnection uisConnection = new UisConnection();
			uisConnection.setUisId(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].UisId"));
			uisConnection.setUisNodeId(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].UisNodeId"));
			uisConnection.setUisConnectionId(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].UisConnectionId"));
			uisConnection.setDescription(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].Description"));
			uisConnection.setName(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].Name"));
			uisConnection.setState(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].State"));
			uisConnection.setUisProtocol(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].UisProtocol"));
			uisConnection.setGreConfig(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].GreConfig"));
			uisConnection.setSslConfig(context.stringValue("DescribeUisConnectionsResponse.UisConnections["+ i +"].SslConfig"));

			uisConnections.add(uisConnection);
		}
		describeUisConnectionsResponse.setUisConnections(uisConnections);
	 
	 	return describeUisConnectionsResponse;
	}
}