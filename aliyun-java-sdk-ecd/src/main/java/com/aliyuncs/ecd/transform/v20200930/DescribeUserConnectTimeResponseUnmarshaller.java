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

import com.aliyuncs.ecd.model.v20200930.DescribeUserConnectTimeResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeUserConnectTimeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserConnectTimeResponseUnmarshaller {

	public static DescribeUserConnectTimeResponse unmarshall(DescribeUserConnectTimeResponse describeUserConnectTimeResponse, UnmarshallerContext _ctx) {
		
		describeUserConnectTimeResponse.setRequestId(_ctx.stringValue("DescribeUserConnectTimeResponse.RequestId"));
		describeUserConnectTimeResponse.setCount(_ctx.integerValue("DescribeUserConnectTimeResponse.Count"));
		describeUserConnectTimeResponse.setNextToken(_ctx.stringValue("DescribeUserConnectTimeResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserConnectTimeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOversoldGroupId(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].OversoldGroupId"));
			dataItem.setUserGroupId(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].UserGroupId"));
			dataItem.setEndUserId(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].EndUserId"));
			dataItem.setUserDesktopId(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].UserDesktopId"));
			dataItem.setStartConnectTime(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].StartConnectTime"));
			dataItem.setEndConnectTime(_ctx.stringValue("DescribeUserConnectTimeResponse.Data["+ i +"].EndConnectTime"));

			data.add(dataItem);
		}
		describeUserConnectTimeResponse.setData(data);
	 
	 	return describeUserConnectTimeResponse;
	}
}