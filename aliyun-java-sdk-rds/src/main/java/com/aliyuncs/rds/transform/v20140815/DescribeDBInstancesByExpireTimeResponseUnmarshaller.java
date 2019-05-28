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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesByExpireTimeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesByExpireTimeResponse.DBInstanceExpireTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesByExpireTimeResponseUnmarshaller {

	public static DescribeDBInstancesByExpireTimeResponse unmarshall(DescribeDBInstancesByExpireTimeResponse describeDBInstancesByExpireTimeResponse, UnmarshallerContext context) {
		
		describeDBInstancesByExpireTimeResponse.setRequestId(context.stringValue("DescribeDBInstancesByExpireTimeResponse.RequestId"));
		describeDBInstancesByExpireTimeResponse.setPageNumber(context.integerValue("DescribeDBInstancesByExpireTimeResponse.PageNumber"));
		describeDBInstancesByExpireTimeResponse.setTotalRecordCount(context.integerValue("DescribeDBInstancesByExpireTimeResponse.TotalRecordCount"));
		describeDBInstancesByExpireTimeResponse.setPageRecordCount(context.integerValue("DescribeDBInstancesByExpireTimeResponse.PageRecordCount"));

		List<DBInstanceExpireTime> items = new ArrayList<DBInstanceExpireTime>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesByExpireTimeResponse.Items.Length"); i++) {
			DBInstanceExpireTime dBInstanceExpireTime = new DBInstanceExpireTime();
			dBInstanceExpireTime.setDBInstanceId(context.stringValue("DescribeDBInstancesByExpireTimeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceExpireTime.setDBInstanceDescription(context.stringValue("DescribeDBInstancesByExpireTimeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceExpireTime.setExpireTime(context.stringValue("DescribeDBInstancesByExpireTimeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceExpireTime.setDBInstanceStatus(context.stringValue("DescribeDBInstancesByExpireTimeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceExpireTime.setLockMode(context.stringValue("DescribeDBInstancesByExpireTimeResponse.Items["+ i +"].LockMode"));

			items.add(dBInstanceExpireTime);
		}
		describeDBInstancesByExpireTimeResponse.setItems(items);
	 
	 	return describeDBInstancesByExpireTimeResponse;
	}
}