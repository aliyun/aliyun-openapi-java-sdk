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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeBackupDBsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeBackupDBsResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupDBsResponseUnmarshaller {

	public static DescribeBackupDBsResponse unmarshall(DescribeBackupDBsResponse describeBackupDBsResponse, UnmarshallerContext _ctx) {
		
		describeBackupDBsResponse.setRequestId(_ctx.stringValue("DescribeBackupDBsResponse.RequestId"));
		describeBackupDBsResponse.setPageNumber(_ctx.integerValue("DescribeBackupDBsResponse.PageNumber"));
		describeBackupDBsResponse.setPageSize(_ctx.integerValue("DescribeBackupDBsResponse.PageSize"));
		describeBackupDBsResponse.setTotalCount(_ctx.integerValue("DescribeBackupDBsResponse.TotalCount"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupDBsResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBName(_ctx.stringValue("DescribeBackupDBsResponse.Databases["+ i +"].DBName"));

			databases.add(database);
		}
		describeBackupDBsResponse.setDatabases(databases);
	 
	 	return describeBackupDBsResponse;
	}
}