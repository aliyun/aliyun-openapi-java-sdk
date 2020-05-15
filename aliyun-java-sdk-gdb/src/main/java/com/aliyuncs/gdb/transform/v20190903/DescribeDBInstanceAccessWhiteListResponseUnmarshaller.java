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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.DescribeDBInstanceAccessWhiteListResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstanceAccessWhiteListResponse.DBInstanceIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAccessWhiteListResponseUnmarshaller {

	public static DescribeDBInstanceAccessWhiteListResponse unmarshall(DescribeDBInstanceAccessWhiteListResponse describeDBInstanceAccessWhiteListResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAccessWhiteListResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAccessWhiteListResponse.RequestId"));

		List<DBInstanceIPArray> items = new ArrayList<DBInstanceIPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAccessWhiteListResponse.Items.Length"); i++) {
			DBInstanceIPArray dBInstanceIPArray = new DBInstanceIPArray();
			dBInstanceIPArray.setDBInstanceIPArrayName(_ctx.stringValue("DescribeDBInstanceAccessWhiteListResponse.Items["+ i +"].DBInstanceIPArrayName"));
			dBInstanceIPArray.setDBInstanceIPArrayAttribute(_ctx.stringValue("DescribeDBInstanceAccessWhiteListResponse.Items["+ i +"].DBInstanceIPArrayAttribute"));
			dBInstanceIPArray.setSecurityIps(_ctx.stringValue("DescribeDBInstanceAccessWhiteListResponse.Items["+ i +"].SecurityIps"));

			items.add(dBInstanceIPArray);
		}
		describeDBInstanceAccessWhiteListResponse.setItems(items);
	 
	 	return describeDBInstanceAccessWhiteListResponse;
	}
}