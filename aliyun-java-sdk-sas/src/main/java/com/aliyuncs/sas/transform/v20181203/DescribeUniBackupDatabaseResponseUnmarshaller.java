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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeUniBackupDatabaseResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupDatabaseResponse.Database;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupDatabaseResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUniBackupDatabaseResponseUnmarshaller {

	public static DescribeUniBackupDatabaseResponse unmarshall(DescribeUniBackupDatabaseResponse describeUniBackupDatabaseResponse, UnmarshallerContext _ctx) {
		
		describeUniBackupDatabaseResponse.setRequestId(_ctx.stringValue("DescribeUniBackupDatabaseResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeUniBackupDatabaseResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeUniBackupDatabaseResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeUniBackupDatabaseResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeUniBackupDatabaseResponse.PageInfo.Count"));
		describeUniBackupDatabaseResponse.setPageInfo(pageInfo);

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUniBackupDatabaseResponse.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setStatus(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].Status"));
			database.setDatabaseType(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].DatabaseType"));
			database.setDatabaseVersion(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].DatabaseVersion"));
			database.setDatabaseName(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].DatabaseName"));
			database.setInstanceName(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].InstanceName"));
			database.setInstanceUuid(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].InstanceUuid"));
			database.setCreatedByProduct(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].CreatedByProduct"));
			database.setInstanceId(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].InstanceId"));
			database.setPolicyId(_ctx.longValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].PolicyId"));
			database.setAgentStatus(_ctx.stringValue("DescribeUniBackupDatabaseResponse.DatabaseList["+ i +"].AgentStatus"));

			databaseList.add(database);
		}
		describeUniBackupDatabaseResponse.setDatabaseList(databaseList);
	 
	 	return describeUniBackupDatabaseResponse;
	}
}