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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAccessWhitelistResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAccessWhitelistResponse.DBClusterIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAccessWhitelistResponseUnmarshaller {

	public static DescribeDBClusterAccessWhitelistResponse unmarshall(DescribeDBClusterAccessWhitelistResponse describeDBClusterAccessWhitelistResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAccessWhitelistResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAccessWhitelistResponse.RequestId"));

		List<DBClusterIPArray> items = new ArrayList<DBClusterIPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAccessWhitelistResponse.Items.Length"); i++) {
			DBClusterIPArray dBClusterIPArray = new DBClusterIPArray();
			dBClusterIPArray.setDBClusterIPArrayName(_ctx.stringValue("DescribeDBClusterAccessWhitelistResponse.Items["+ i +"].DBClusterIPArrayName"));
			dBClusterIPArray.setDBClusterIPArrayAttribute(_ctx.stringValue("DescribeDBClusterAccessWhitelistResponse.Items["+ i +"].DBClusterIPArrayAttribute"));
			dBClusterIPArray.setSecurityIps(_ctx.stringValue("DescribeDBClusterAccessWhitelistResponse.Items["+ i +"].SecurityIps"));

			items.add(dBClusterIPArray);
		}
		describeDBClusterAccessWhitelistResponse.setItems(items);
	 
	 	return describeDBClusterAccessWhitelistResponse;
	}
}