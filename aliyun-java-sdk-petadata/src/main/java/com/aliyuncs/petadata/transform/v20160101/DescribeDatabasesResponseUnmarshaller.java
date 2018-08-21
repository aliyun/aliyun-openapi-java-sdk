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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeDatabasesResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeDatabasesResponse.Database;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesResponseUnmarshaller {

	public static DescribeDatabasesResponse unmarshall(DescribeDatabasesResponse describeDatabasesResponse, UnmarshallerContext context) {
		
		describeDatabasesResponse.setRequestId(context.stringValue("DescribeDatabasesResponse.RequestId"));
		describeDatabasesResponse.setInstanceId(context.stringValue("DescribeDatabasesResponse.InstanceId"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < context.lengthValue("DescribeDatabasesResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setInstanceId(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].InstanceId"));
			database.setDBName(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBName"));
			database.setDBStatus(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBStatus"));
			database.setNodeSpec(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].NodeSpec"));
			database.setNodeNumber(context.integerValue("DescribeDatabasesResponse.Databases["+ i +"].NodeNumber"));
			database.setChargeType(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].ChargeType"));
			database.setCreateTime(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].CreateTime"));
			database.setEndTime(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].EndTime"));
			database.setDBType(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBType"));
			database.setSourceInstanceId(context.stringValue("DescribeDatabasesResponse.Databases["+ i +"].SourceInstanceId"));

			databases.add(database);
		}
		describeDatabasesResponse.setDatabases(databases);
	 
	 	return describeDatabasesResponse;
	}
}