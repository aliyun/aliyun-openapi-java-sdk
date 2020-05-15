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

import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerInstancesResponse.SqlServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlServerInstancesResponseUnmarshaller {

	public static DescribeSqlServerInstancesResponse unmarshall(DescribeSqlServerInstancesResponse describeSqlServerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeSqlServerInstancesResponse.setRequestId(_ctx.stringValue("DescribeSqlServerInstancesResponse.RequestId"));
		describeSqlServerInstancesResponse.setSuccess(_ctx.booleanValue("DescribeSqlServerInstancesResponse.Success"));
		describeSqlServerInstancesResponse.setCode(_ctx.stringValue("DescribeSqlServerInstancesResponse.Code"));
		describeSqlServerInstancesResponse.setMessage(_ctx.stringValue("DescribeSqlServerInstancesResponse.Message"));
		describeSqlServerInstancesResponse.setTotalCount(_ctx.integerValue("DescribeSqlServerInstancesResponse.TotalCount"));
		describeSqlServerInstancesResponse.setPageSize(_ctx.integerValue("DescribeSqlServerInstancesResponse.PageSize"));
		describeSqlServerInstancesResponse.setPageNumber(_ctx.integerValue("DescribeSqlServerInstancesResponse.PageNumber"));

		List<SqlServer> sqlServers = new ArrayList<SqlServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlServerInstancesResponse.SqlServers.Length"); i++) {
			SqlServer sqlServer = new SqlServer();
			sqlServer.setClusterId(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].ClusterId"));
			sqlServer.setServerName(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].ServerName"));
			sqlServer.setVaultId(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].VaultId"));
			sqlServer.setSqlLogin(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].SqlLogin"));
			sqlServer.setUseWindowsAuth(_ctx.booleanValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].UseWindowsAuth"));
			sqlServer.setStatus(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].Status"));
			sqlServer.setStatusMessage(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].StatusMessage"));
			sqlServer.setWindowsLogin(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].WindowsLogin"));
			sqlServer.setProductName(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].ProductName"));
			sqlServer.setVaultType(_ctx.stringValue("DescribeSqlServerInstancesResponse.SqlServers["+ i +"].VaultType"));

			sqlServers.add(sqlServer);
		}
		describeSqlServerInstancesResponse.setSqlServers(sqlServers);
	 
	 	return describeSqlServerInstancesResponse;
	}
}