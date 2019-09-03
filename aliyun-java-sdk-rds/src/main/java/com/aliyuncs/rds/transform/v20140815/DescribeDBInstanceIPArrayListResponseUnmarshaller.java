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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceIPArrayListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceIPArrayListResponse.DBInstanceIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceIPArrayListResponseUnmarshaller {

	public static DescribeDBInstanceIPArrayListResponse unmarshall(DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceIPArrayListResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.RequestId"));

		List<DBInstanceIPArray> items = new ArrayList<DBInstanceIPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceIPArrayListResponse.Items.Length"); i++) {
			DBInstanceIPArray dBInstanceIPArray = new DBInstanceIPArray();
			dBInstanceIPArray.setDBInstanceIPArrayName(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].DBInstanceIPArrayName"));
			dBInstanceIPArray.setDBInstanceIPArrayAttribute(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].DBInstanceIPArrayAttribute"));
			dBInstanceIPArray.setSecurityIPType(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].SecurityIPType"));
			dBInstanceIPArray.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceIPArray.setWhitelistNetworkType(_ctx.stringValue("DescribeDBInstanceIPArrayListResponse.Items["+ i +"].WhitelistNetworkType"));

			items.add(dBInstanceIPArray);
		}
		describeDBInstanceIPArrayListResponse.setItems(items);
	 
	 	return describeDBInstanceIPArrayListResponse;
	}
}