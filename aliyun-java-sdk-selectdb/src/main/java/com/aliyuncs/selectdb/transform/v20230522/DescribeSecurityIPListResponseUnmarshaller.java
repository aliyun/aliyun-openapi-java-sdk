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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeSecurityIPListResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeSecurityIPListResponse.GroupItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityIPListResponseUnmarshaller {

	public static DescribeSecurityIPListResponse unmarshall(DescribeSecurityIPListResponse describeSecurityIPListResponse, UnmarshallerContext _ctx) {
		
		describeSecurityIPListResponse.setRequestId(_ctx.stringValue("DescribeSecurityIPListResponse.RequestId"));
		describeSecurityIPListResponse.setDBInstanceName(_ctx.stringValue("DescribeSecurityIPListResponse.DBInstanceName"));

		List<GroupItemsItem> groupItems = new ArrayList<GroupItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityIPListResponse.GroupItems.Length"); i++) {
			GroupItemsItem groupItemsItem = new GroupItemsItem();
			groupItemsItem.setGroupName(_ctx.stringValue("DescribeSecurityIPListResponse.GroupItems["+ i +"].GroupName"));
			groupItemsItem.setAecurityIPType(_ctx.stringValue("DescribeSecurityIPListResponse.GroupItems["+ i +"].AecurityIPType"));
			groupItemsItem.setGroupTag(_ctx.stringValue("DescribeSecurityIPListResponse.GroupItems["+ i +"].GroupTag"));
			groupItemsItem.setSecurityIPList(_ctx.stringValue("DescribeSecurityIPListResponse.GroupItems["+ i +"].SecurityIPList"));
			groupItemsItem.setWhitelistNetType(_ctx.stringValue("DescribeSecurityIPListResponse.GroupItems["+ i +"].WhitelistNetType"));

			groupItems.add(groupItemsItem);
		}
		describeSecurityIPListResponse.setGroupItems(groupItems);
	 
	 	return describeSecurityIPListResponse;
	}
}