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

import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolAllIpsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListConnectionPoolAllIpsResponse.ConnectionPoolIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionPoolAllIpsResponseUnmarshaller {

	public static ListConnectionPoolAllIpsResponse unmarshall(ListConnectionPoolAllIpsResponse listConnectionPoolAllIpsResponse, UnmarshallerContext _ctx) {
		
		listConnectionPoolAllIpsResponse.setRequestId(_ctx.stringValue("ListConnectionPoolAllIpsResponse.RequestId"));
		listConnectionPoolAllIpsResponse.setTotalIpsCount(_ctx.integerValue("ListConnectionPoolAllIpsResponse.TotalIpsCount"));
		listConnectionPoolAllIpsResponse.setNextToken(_ctx.stringValue("ListConnectionPoolAllIpsResponse.NextToken"));
		listConnectionPoolAllIpsResponse.setMaxResults(_ctx.integerValue("ListConnectionPoolAllIpsResponse.MaxResults"));

		List<ConnectionPoolIp> connectionPoolIps = new ArrayList<ConnectionPoolIp>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps.Length"); i++) {
			ConnectionPoolIp connectionPoolIp = new ConnectionPoolIp();
			connectionPoolIp.setConnectionPoolId(_ctx.stringValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps["+ i +"].ConnectionPoolId"));
			connectionPoolIp.setIp(_ctx.stringValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps["+ i +"].Ip"));
			connectionPoolIp.setStatus(_ctx.stringValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps["+ i +"].Status"));
			connectionPoolIp.setType(_ctx.stringValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps["+ i +"].Type"));
			connectionPoolIp.setIpNum(_ctx.longValue("ListConnectionPoolAllIpsResponse.ConnectionPoolIps["+ i +"].IpNum"));

			connectionPoolIps.add(connectionPoolIp);
		}
		listConnectionPoolAllIpsResponse.setConnectionPoolIps(connectionPoolIps);
	 
	 	return listConnectionPoolAllIpsResponse;
	}
}