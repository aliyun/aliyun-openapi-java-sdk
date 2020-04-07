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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeServersResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeServersResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServersResponseUnmarshaller {

	public static DescribeServersResponse unmarshall(DescribeServersResponse describeServersResponse, UnmarshallerContext _ctx) {
		
		describeServersResponse.setRequestId(_ctx.stringValue("DescribeServersResponse.RequestId"));
		describeServersResponse.setSuccess(_ctx.booleanValue("DescribeServersResponse.Success"));
		describeServersResponse.setCode(_ctx.stringValue("DescribeServersResponse.Code"));
		describeServersResponse.setMessage(_ctx.stringValue("DescribeServersResponse.Message"));
		describeServersResponse.setTotalCount(_ctx.integerValue("DescribeServersResponse.TotalCount"));
		describeServersResponse.setPageSize(_ctx.integerValue("DescribeServersResponse.PageSize"));
		describeServersResponse.setPageNumber(_ctx.integerValue("DescribeServersResponse.PageNumber"));

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServersResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setCreatedTime(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].CreatedTime"));
			server.setUpdatedTime(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].UpdatedTime"));
			server.setServerId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ServerId"));
			server.setClientId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ClientId"));
			server.setVaultId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].VaultId"));
			server.setServerType(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ServerType"));
			server.setHost(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Host"));
			server.setUsername(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Username"));
			server.setPassword(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Password"));
			server.setServerStatus(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ServerStatus"));
			server.setIsRemoved(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].IsRemoved"));
			server.setDescription(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Description"));
			server.setDetailInfo(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].DetailInfo"));

			servers.add(server);
		}
		describeServersResponse.setServers(servers);
	 
	 	return describeServersResponse;
	}
}