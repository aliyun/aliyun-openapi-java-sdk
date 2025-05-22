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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceTDEResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceTDEResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceTDEResponseUnmarshaller {

	public static DescribeDBInstanceTDEResponse unmarshall(DescribeDBInstanceTDEResponse describeDBInstanceTDEResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceTDEResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceTDEResponse.RequestId"));
		describeDBInstanceTDEResponse.setTDEMode(_ctx.stringValue("DescribeDBInstanceTDEResponse.TDEMode"));
		describeDBInstanceTDEResponse.setTDEStatus(_ctx.stringValue("DescribeDBInstanceTDEResponse.TDEStatus"));
		describeDBInstanceTDEResponse.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceTDEResponse.EncryptionKey"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceTDEResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBName(_ctx.stringValue("DescribeDBInstanceTDEResponse.Databases["+ i +"].DBName"));
			database.setTDEStatus(_ctx.stringValue("DescribeDBInstanceTDEResponse.Databases["+ i +"].TDEStatus"));

			databases.add(database);
		}
		describeDBInstanceTDEResponse.setDatabases(databases);
	 
	 	return describeDBInstanceTDEResponse;
	}
}