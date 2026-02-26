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

import com.aliyuncs.hbr.model.v20170908.DescribeHanaDatabasesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaDatabasesResponse.HanaDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaDatabasesResponseUnmarshaller {

	public static DescribeHanaDatabasesResponse unmarshall(DescribeHanaDatabasesResponse describeHanaDatabasesResponse, UnmarshallerContext _ctx) {
		
		describeHanaDatabasesResponse.setRequestId(_ctx.stringValue("DescribeHanaDatabasesResponse.RequestId"));
		describeHanaDatabasesResponse.setSuccess(_ctx.booleanValue("DescribeHanaDatabasesResponse.Success"));
		describeHanaDatabasesResponse.setCode(_ctx.stringValue("DescribeHanaDatabasesResponse.Code"));
		describeHanaDatabasesResponse.setMessage(_ctx.stringValue("DescribeHanaDatabasesResponse.Message"));
		describeHanaDatabasesResponse.setPageNumber(_ctx.integerValue("DescribeHanaDatabasesResponse.PageNumber"));
		describeHanaDatabasesResponse.setPageSize(_ctx.integerValue("DescribeHanaDatabasesResponse.PageSize"));
		describeHanaDatabasesResponse.setTotalCount(_ctx.longValue("DescribeHanaDatabasesResponse.TotalCount"));

		List<HanaDatabase> hanaDatabases = new ArrayList<HanaDatabase>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaDatabasesResponse.HanaDatabases.Length"); i++) {
			HanaDatabase hanaDatabase = new HanaDatabase();
			hanaDatabase.setHost(_ctx.stringValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].Host"));
			hanaDatabase.setSqlPort(_ctx.integerValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].SqlPort"));
			hanaDatabase.setDatabaseName(_ctx.stringValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].DatabaseName"));
			hanaDatabase.setServiceName(_ctx.stringValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].ServiceName"));
			hanaDatabase.setActiveStatus(_ctx.stringValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].ActiveStatus"));
			hanaDatabase.setDetail(_ctx.stringValue("DescribeHanaDatabasesResponse.HanaDatabases["+ i +"].Detail"));

			hanaDatabases.add(hanaDatabase);
		}
		describeHanaDatabasesResponse.setHanaDatabases(hanaDatabases);
	 
	 	return describeHanaDatabasesResponse;
	}
}