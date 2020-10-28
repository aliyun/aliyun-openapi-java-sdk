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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeSecurityIpsResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeSecurityIpsResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeSecurityIpsResponse.Data.GroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityIpsResponseUnmarshaller {

	public static DescribeSecurityIpsResponse unmarshall(DescribeSecurityIpsResponse describeSecurityIpsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityIpsResponse.setRequestId(_ctx.stringValue("DescribeSecurityIpsResponse.RequestId"));
		describeSecurityIpsResponse.setSuccess(_ctx.booleanValue("DescribeSecurityIpsResponse.Success"));
		describeSecurityIpsResponse.setMessage(_ctx.stringValue("DescribeSecurityIpsResponse.Message"));

		Data data = new Data();
		data.setDBInstanceName(_ctx.stringValue("DescribeSecurityIpsResponse.Data.DBInstanceName"));

		List<GroupItem> groupItems = new ArrayList<GroupItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityIpsResponse.Data.GroupItems.Length"); i++) {
			GroupItem groupItem = new GroupItem();
			groupItem.setGroupName(_ctx.stringValue("DescribeSecurityIpsResponse.Data.GroupItems["+ i +"].GroupName"));
			groupItem.setSecurityIPList(_ctx.stringValue("DescribeSecurityIpsResponse.Data.GroupItems["+ i +"].SecurityIPList"));

			groupItems.add(groupItem);
		}
		data.setGroupItems(groupItems);
		describeSecurityIpsResponse.setData(data);
	 
	 	return describeSecurityIpsResponse;
	}
}