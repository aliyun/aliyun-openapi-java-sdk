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
package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterIPArrayListResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterIPArrayListResponse.DBClusterIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterIPArrayListResponseUnmarshaller {

	public static DescribeDBClusterIPArrayListResponse unmarshall(DescribeDBClusterIPArrayListResponse describeDBClusterIPArrayListResponse, UnmarshallerContext context) {
		
		describeDBClusterIPArrayListResponse.setRequestId(context.stringValue("DescribeDBClusterIPArrayListResponse.RequestId"));

		List<DBClusterIPArray> items = new ArrayList<DBClusterIPArray>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterIPArrayListResponse.Items.Length"); i++) {
			DBClusterIPArray dBClusterIPArray = new DBClusterIPArray();
			dBClusterIPArray.setDBClusterIPArrayName(context.stringValue("DescribeDBClusterIPArrayListResponse.Items["+ i +"].DBClusterIPArrayName"));
			dBClusterIPArray.setDBClusterIPArrayAttribute(context.stringValue("DescribeDBClusterIPArrayListResponse.Items["+ i +"].DBClusterIPArrayAttribute"));
			dBClusterIPArray.setSecurityIPList(context.stringValue("DescribeDBClusterIPArrayListResponse.Items["+ i +"].SecurityIPList"));

			items.add(dBClusterIPArray);
		}
		describeDBClusterIPArrayListResponse.setItems(items);
	 
	 	return describeDBClusterIPArrayListResponse;
	}
}