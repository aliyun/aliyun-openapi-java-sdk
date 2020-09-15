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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeUserGroupListResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeUserGroupListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserGroupListResponseUnmarshaller {

	public static DescribeUserGroupListResponse unmarshall(DescribeUserGroupListResponse describeUserGroupListResponse, UnmarshallerContext _ctx) {
		
		describeUserGroupListResponse.setRequestId(_ctx.stringValue("DescribeUserGroupListResponse.RequestId"));
		describeUserGroupListResponse.setSuccess(_ctx.booleanValue("DescribeUserGroupListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserGroupListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGroupUserCount(_ctx.integerValue("DescribeUserGroupListResponse.Data["+ i +"].GroupUserCount"));
			dataItem.setGroupName(_ctx.stringValue("DescribeUserGroupListResponse.Data["+ i +"].GroupName"));
			dataItem.setId(_ctx.longValue("DescribeUserGroupListResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		describeUserGroupListResponse.setData(data);
	 
	 	return describeUserGroupListResponse;
	}
}