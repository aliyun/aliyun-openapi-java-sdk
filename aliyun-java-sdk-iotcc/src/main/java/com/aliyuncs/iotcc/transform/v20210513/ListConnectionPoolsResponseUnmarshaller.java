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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolsResponse.ConnectionPoolModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionPoolsResponseUnmarshaller {

	public static ListConnectionPoolsResponse unmarshall(ListConnectionPoolsResponse listConnectionPoolsResponse, UnmarshallerContext _ctx) {
		
		listConnectionPoolsResponse.setRequestId(_ctx.stringValue("ListConnectionPoolsResponse.RequestId"));
		listConnectionPoolsResponse.setTotalCount(_ctx.integerValue("ListConnectionPoolsResponse.TotalCount"));
		listConnectionPoolsResponse.setNextToken(_ctx.stringValue("ListConnectionPoolsResponse.NextToken"));
		listConnectionPoolsResponse.setMaxResults(_ctx.integerValue("ListConnectionPoolsResponse.MaxResults"));

		List<ConnectionPoolModels> connectionPools = new ArrayList<ConnectionPoolModels>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionPoolsResponse.ConnectionPools.Length"); i++) {
			ConnectionPoolModels connectionPoolModels = new ConnectionPoolModels();
			connectionPoolModels.setConnectionPoolId(_ctx.stringValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].ConnectionPoolId"));
			connectionPoolModels.setConnectionPoolStatus(_ctx.stringValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].ConnectionPoolStatus"));
			connectionPoolModels.setConnectionPoolName(_ctx.stringValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].ConnectionPoolName"));
			connectionPoolModels.setConnectionPoolDescription(_ctx.stringValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].ConnectionPoolDescription"));

			List<String> cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].Cidrs.Length"); j++) {
				cidrs.add(_ctx.stringValue("ListConnectionPoolsResponse.ConnectionPools["+ i +"].Cidrs["+ j +"]"));
			}
			connectionPoolModels.setCidrs(cidrs);

			connectionPools.add(connectionPoolModels);
		}
		listConnectionPoolsResponse.setConnectionPools(connectionPools);
	 
	 	return listConnectionPoolsResponse;
	}
}