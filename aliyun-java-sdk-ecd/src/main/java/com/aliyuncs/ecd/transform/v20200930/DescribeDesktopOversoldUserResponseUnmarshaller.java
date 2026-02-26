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

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldUserResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopOversoldUserResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopOversoldUserResponseUnmarshaller {

	public static DescribeDesktopOversoldUserResponse unmarshall(DescribeDesktopOversoldUserResponse describeDesktopOversoldUserResponse, UnmarshallerContext _ctx) {
		
		describeDesktopOversoldUserResponse.setRequestId(_ctx.stringValue("DescribeDesktopOversoldUserResponse.RequestId"));
		describeDesktopOversoldUserResponse.setCount(_ctx.integerValue("DescribeDesktopOversoldUserResponse.Count"));
		describeDesktopOversoldUserResponse.setNextToken(_ctx.stringValue("DescribeDesktopOversoldUserResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopOversoldUserResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOversoldGroupId(_ctx.stringValue("DescribeDesktopOversoldUserResponse.Data["+ i +"].OversoldGroupId"));
			dataItem.setUserGroupId(_ctx.stringValue("DescribeDesktopOversoldUserResponse.Data["+ i +"].UserGroupId"));
			dataItem.setEndUserId(_ctx.stringValue("DescribeDesktopOversoldUserResponse.Data["+ i +"].EndUserId"));
			dataItem.setUserDesktopId(_ctx.stringValue("DescribeDesktopOversoldUserResponse.Data["+ i +"].UserDesktopId"));

			data.add(dataItem);
		}
		describeDesktopOversoldUserResponse.setData(data);
	 
	 	return describeDesktopOversoldUserResponse;
	}
}