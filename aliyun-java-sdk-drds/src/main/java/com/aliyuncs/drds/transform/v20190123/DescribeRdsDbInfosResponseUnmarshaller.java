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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRdsDbInfosResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRdsDbInfosResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsDbInfosResponseUnmarshaller {

	public static DescribeRdsDbInfosResponse unmarshall(DescribeRdsDbInfosResponse describeRdsDbInfosResponse, UnmarshallerContext _ctx) {
		
		describeRdsDbInfosResponse.setRequestId(_ctx.stringValue("DescribeRdsDbInfosResponse.RequestId"));
		describeRdsDbInfosResponse.setSuccess(_ctx.booleanValue("DescribeRdsDbInfosResponse.Success"));
		describeRdsDbInfosResponse.setTotal(_ctx.stringValue("DescribeRdsDbInfosResponse.Total"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsDbInfosResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDbName(_ctx.stringValue("DescribeRdsDbInfosResponse.Databases["+ i +"].DbName"));
			database.setStatus(_ctx.integerValue("DescribeRdsDbInfosResponse.Databases["+ i +"].Status"));
			database.setDescription(_ctx.stringValue("DescribeRdsDbInfosResponse.Databases["+ i +"].Description"));

			databases.add(database);
		}
		describeRdsDbInfosResponse.setDatabases(databases);
	 
	 	return describeRdsDbInfosResponse;
	}
}