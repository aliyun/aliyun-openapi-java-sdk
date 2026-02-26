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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeActiveSQLRecordsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeActiveSQLRecordsResponse.Query;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveSQLRecordsResponseUnmarshaller {

	public static DescribeActiveSQLRecordsResponse unmarshall(DescribeActiveSQLRecordsResponse describeActiveSQLRecordsResponse, UnmarshallerContext _ctx) {
		
		describeActiveSQLRecordsResponse.setRequestId(_ctx.stringValue("DescribeActiveSQLRecordsResponse.RequestId"));
		describeActiveSQLRecordsResponse.setDBInstanceId(_ctx.stringValue("DescribeActiveSQLRecordsResponse.DBInstanceId"));

		List<Query> queries = new ArrayList<Query>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveSQLRecordsResponse.Queries.Length"); i++) {
			Query query = new Query();
			query.setPID(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].PID"));
			query.setSessionID(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].SessionID"));
			query.setState(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].State"));
			query.setQueryStart(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].QueryStart"));
			query.setQueryDuration(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].QueryDuration"));
			query.setQuery(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].Query"));
			query.setUser(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].User"));
			query.setDatabase(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].Database"));
			query.setClientAddr(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].ClientAddr"));
			query.setSqlTruncated(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].SqlTruncated"));
			query.setSqlTruncatedThreshold(_ctx.stringValue("DescribeActiveSQLRecordsResponse.Queries["+ i +"].SqlTruncatedThreshold"));

			queries.add(query);
		}
		describeActiveSQLRecordsResponse.setQueries(queries);
	 
	 	return describeActiveSQLRecordsResponse;
	}
}