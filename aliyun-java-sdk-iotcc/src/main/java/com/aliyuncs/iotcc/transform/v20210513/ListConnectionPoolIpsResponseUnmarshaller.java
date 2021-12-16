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

import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolIpsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolIpsResponse.ConnectionPoolIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionPoolIpsResponseUnmarshaller {

	public static ListConnectionPoolIpsResponse unmarshall(ListConnectionPoolIpsResponse listConnectionPoolIpsResponse, UnmarshallerContext _ctx) {
		
		listConnectionPoolIpsResponse.setRequestId(_ctx.stringValue("ListConnectionPoolIpsResponse.RequestId"));
		listConnectionPoolIpsResponse.setTotalCount(_ctx.integerValue("ListConnectionPoolIpsResponse.TotalCount"));
		listConnectionPoolIpsResponse.setNextToken(_ctx.stringValue("ListConnectionPoolIpsResponse.NextToken"));
		listConnectionPoolIpsResponse.setMaxResults(_ctx.integerValue("ListConnectionPoolIpsResponse.MaxResults"));

		List<ConnectionPoolIp> connectionPoolIps = new ArrayList<ConnectionPoolIp>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionPoolIpsResponse.ConnectionPoolIps.Length"); i++) {
			ConnectionPoolIp connectionPoolIp = new ConnectionPoolIp();
			connectionPoolIp.setConnectionPoolId(_ctx.stringValue("ListConnectionPoolIpsResponse.ConnectionPoolIps["+ i +"].ConnectionPoolId"));
			connectionPoolIp.setIp(_ctx.stringValue("ListConnectionPoolIpsResponse.ConnectionPoolIps["+ i +"].Ip"));
			connectionPoolIp.setStatus(_ctx.stringValue("ListConnectionPoolIpsResponse.ConnectionPoolIps["+ i +"].Status"));

			connectionPoolIps.add(connectionPoolIp);
		}
		listConnectionPoolIpsResponse.setConnectionPoolIps(connectionPoolIps);
	 
	 	return listConnectionPoolIpsResponse;
	}
}