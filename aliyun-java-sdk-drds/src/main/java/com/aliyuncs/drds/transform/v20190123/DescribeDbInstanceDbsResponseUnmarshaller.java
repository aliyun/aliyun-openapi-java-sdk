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

import com.aliyuncs.drds.model.v20190123.DescribeDbInstanceDbsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDbInstanceDbsResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDbInstanceDbsResponseUnmarshaller {

	public static DescribeDbInstanceDbsResponse unmarshall(DescribeDbInstanceDbsResponse describeDbInstanceDbsResponse, UnmarshallerContext _ctx) {
		
		describeDbInstanceDbsResponse.setRequestId(_ctx.stringValue("DescribeDbInstanceDbsResponse.RequestId"));
		describeDbInstanceDbsResponse.setSuccess(_ctx.booleanValue("DescribeDbInstanceDbsResponse.Success"));
		describeDbInstanceDbsResponse.setTotal(_ctx.stringValue("DescribeDbInstanceDbsResponse.Total"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDbInstanceDbsResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDbName(_ctx.stringValue("DescribeDbInstanceDbsResponse.Databases["+ i +"].DbName"));
			database.setStatus(_ctx.integerValue("DescribeDbInstanceDbsResponse.Databases["+ i +"].Status"));
			database.setDescription(_ctx.stringValue("DescribeDbInstanceDbsResponse.Databases["+ i +"].Description"));

			databases.add(database);
		}
		describeDbInstanceDbsResponse.setDatabases(databases);
	 
	 	return describeDbInstanceDbsResponse;
	}
}