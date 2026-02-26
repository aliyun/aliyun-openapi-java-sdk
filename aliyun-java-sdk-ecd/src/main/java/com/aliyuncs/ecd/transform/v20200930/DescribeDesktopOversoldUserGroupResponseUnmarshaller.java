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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldUserGroupResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldUserGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopOversoldUserGroupResponseUnmarshaller {

	public static DescribeDesktopOversoldUserGroupResponse unmarshall(DescribeDesktopOversoldUserGroupResponse describeDesktopOversoldUserGroupResponse, UnmarshallerContext _ctx) {
		
		describeDesktopOversoldUserGroupResponse.setRequestId(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.RequestId"));
		describeDesktopOversoldUserGroupResponse.setCount(_ctx.integerValue("DescribeDesktopOversoldUserGroupResponse.Count"));
		describeDesktopOversoldUserGroupResponse.setNextToken(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopOversoldUserGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOversoldGroupId(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.Data["+ i +"].OversoldGroupId"));
			dataItem.setUserGroupId(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.Data["+ i +"].UserGroupId"));
			dataItem.setName(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.Data["+ i +"].Name"));
			dataItem.setImageId(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.Data["+ i +"].ImageId"));
			dataItem.setPolicyGroupId(_ctx.stringValue("DescribeDesktopOversoldUserGroupResponse.Data["+ i +"].PolicyGroupId"));

			data.add(dataItem);
		}
		describeDesktopOversoldUserGroupResponse.setData(data);
	 
	 	return describeDesktopOversoldUserGroupResponse;
	}
}