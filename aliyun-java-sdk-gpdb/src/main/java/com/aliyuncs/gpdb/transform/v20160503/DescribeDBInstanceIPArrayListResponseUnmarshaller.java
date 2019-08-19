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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceIPArrayListResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceIPArrayListResponse.DBInstanceIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceIPArrayListResponseUnmarshaller {

	public static DescribeDBInstanceIPArrayListResponse unmarshall(DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceIPArrayListResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.RequestId"));

		List<DBInstanceIPArray> items = new ArrayList<DBInstanceIPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceIPArrayListResponse.Items.Length"); i++) {
			DBInstanceIPArray dBInstanceIPArray = new DBInstanceIPArray();
			dBInstanceIPArray.setDBInstanceIPArrayName(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].DBInstanceIPArrayName"));
			dBInstanceIPArray.setDBInstanceIPArrayAttribute(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].DBInstanceIPArrayAttribute"));
			dBInstanceIPArray.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].SecurityIPList"));

			items.add(dBInstanceIPArray);
		}
		describeDBInstanceIPArrayListResponse.setItems(items);
	 
	 	return describeDBInstanceIPArrayListResponse;
	}
}