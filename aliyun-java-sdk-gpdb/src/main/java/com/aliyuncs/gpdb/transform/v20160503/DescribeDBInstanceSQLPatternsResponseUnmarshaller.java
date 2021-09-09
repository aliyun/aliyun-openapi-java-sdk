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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceSQLPatternsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceSQLPatternsResponse.Pattern;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSQLPatternsResponseUnmarshaller {

	public static DescribeDBInstanceSQLPatternsResponse unmarshall(DescribeDBInstanceSQLPatternsResponse describeDBInstanceSQLPatternsResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSQLPatternsResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSQLPatternsResponse.RequestId"));
		describeDBInstanceSQLPatternsResponse.setEndTime(_ctx.stringValue("DescribeDBInstanceSQLPatternsResponse.EndTime"));
		describeDBInstanceSQLPatternsResponse.setStartTime(_ctx.stringValue("DescribeDBInstanceSQLPatternsResponse.StartTime"));
		describeDBInstanceSQLPatternsResponse.setDBClusterId(_ctx.stringValue("DescribeDBInstanceSQLPatternsResponse.DBClusterId"));

		List<Pattern> patterns = new ArrayList<Pattern>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceSQLPatternsResponse.Patterns.Length"); i++) {
			Pattern pattern = new Pattern();
			pattern.setName(_ctx.stringValue("DescribeDBInstanceSQLPatternsResponse.Patterns["+ i +"].Name"));
			pattern.setValues(_ctx.mapValue("DescribeDBInstanceSQLPatternsResponse.Patterns["+ i +"].Values"));

			patterns.add(pattern);
		}
		describeDBInstanceSQLPatternsResponse.setPatterns(patterns);
	 
	 	return describeDBInstanceSQLPatternsResponse;
	}
}