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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAccessWhiteListResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAccessWhiteListResponse.IPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAccessWhiteListResponseUnmarshaller {

	public static DescribeDBClusterAccessWhiteListResponse unmarshall(DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteListResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAccessWhiteListResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAccessWhiteListResponse.RequestId"));

		List<IPArray> items = new ArrayList<IPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAccessWhiteListResponse.Items.Length"); i++) {
			IPArray iPArray = new IPArray();
			iPArray.setDBClusterIPArrayName(_ctx.stringValue("DescribeDBClusterAccessWhiteListResponse.Items["+ i +"].DBClusterIPArrayName"));
			iPArray.setSecurityIPList(_ctx.stringValue("DescribeDBClusterAccessWhiteListResponse.Items["+ i +"].SecurityIPList"));
			iPArray.setDBClusterIPArrayAttribute(_ctx.stringValue("DescribeDBClusterAccessWhiteListResponse.Items["+ i +"].DBClusterIPArrayAttribute"));

			items.add(iPArray);
		}
		describeDBClusterAccessWhiteListResponse.setItems(items);
	 
	 	return describeDBClusterAccessWhiteListResponse;
	}
}