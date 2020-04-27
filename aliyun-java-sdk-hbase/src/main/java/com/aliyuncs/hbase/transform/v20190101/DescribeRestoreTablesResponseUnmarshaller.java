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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreTablesResponseUnmarshaller {

	public static DescribeRestoreTablesResponse unmarshall(DescribeRestoreTablesResponse describeRestoreTablesResponse, UnmarshallerContext _ctx) {
		
		describeRestoreTablesResponse.setRequestId(_ctx.stringValue("DescribeRestoreTablesResponse.RequestId"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeRestoreTablesResponse.Tables["+ i +"]"));
		}
		describeRestoreTablesResponse.setTables(tables);
	 
	 	return describeRestoreTablesResponse;
	}
}