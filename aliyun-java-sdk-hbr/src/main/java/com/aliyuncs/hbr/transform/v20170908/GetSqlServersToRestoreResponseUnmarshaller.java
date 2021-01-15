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

import com.aliyuncs.hbr.model.v20170908.GetSqlServersToRestoreResponse;
import com.aliyuncs.hbr.model.v20170908.GetSqlServersToRestoreResponse.SqlServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSqlServersToRestoreResponseUnmarshaller {

	public static GetSqlServersToRestoreResponse unmarshall(GetSqlServersToRestoreResponse getSqlServersToRestoreResponse, UnmarshallerContext _ctx) {
		
		getSqlServersToRestoreResponse.setRequestId(_ctx.stringValue("GetSqlServersToRestoreResponse.RequestId"));
		getSqlServersToRestoreResponse.setSuccess(_ctx.booleanValue("GetSqlServersToRestoreResponse.Success"));
		getSqlServersToRestoreResponse.setCode(_ctx.stringValue("GetSqlServersToRestoreResponse.Code"));
		getSqlServersToRestoreResponse.setMessage(_ctx.stringValue("GetSqlServersToRestoreResponse.Message"));
		getSqlServersToRestoreResponse.setTotalCount(_ctx.integerValue("GetSqlServersToRestoreResponse.TotalCount"));
		getSqlServersToRestoreResponse.setPageSize(_ctx.integerValue("GetSqlServersToRestoreResponse.PageSize"));
		getSqlServersToRestoreResponse.setPageNumber(_ctx.integerValue("GetSqlServersToRestoreResponse.PageNumber"));

		List<SqlServer> sqlServers = new ArrayList<SqlServer>();
		for (int i = 0; i < _ctx.lengthValue("GetSqlServersToRestoreResponse.SqlServers.Length"); i++) {
			SqlServer sqlServer = new SqlServer();
			sqlServer.setClusterId(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].ClusterId"));
			sqlServer.setServerName(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].ServerName"));
			sqlServer.setVaultId(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].VaultId"));
			sqlServer.setWindowsLogin(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].WindowsLogin"));
			sqlServer.setSqlLogin(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].SqlLogin"));
			sqlServer.setUseWindowsAuth(_ctx.booleanValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].UseWindowsAuth"));
			sqlServer.setRegionId(_ctx.stringValue("GetSqlServersToRestoreResponse.SqlServers["+ i +"].RegionId"));

			sqlServers.add(sqlServer);
		}
		getSqlServersToRestoreResponse.setSqlServers(sqlServers);
	 
	 	return getSqlServersToRestoreResponse;
	}
}