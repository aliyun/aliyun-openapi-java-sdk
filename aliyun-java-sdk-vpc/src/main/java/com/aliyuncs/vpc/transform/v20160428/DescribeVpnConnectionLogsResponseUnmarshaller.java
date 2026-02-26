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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnConnectionLogsResponseUnmarshaller {

	public static DescribeVpnConnectionLogsResponse unmarshall(DescribeVpnConnectionLogsResponse describeVpnConnectionLogsResponse, UnmarshallerContext _ctx) {
		
		describeVpnConnectionLogsResponse.setRequestId(_ctx.stringValue("DescribeVpnConnectionLogsResponse.RequestId"));
		describeVpnConnectionLogsResponse.setPageSize(_ctx.integerValue("DescribeVpnConnectionLogsResponse.PageSize"));
		describeVpnConnectionLogsResponse.setPageNumber(_ctx.integerValue("DescribeVpnConnectionLogsResponse.PageNumber"));
		describeVpnConnectionLogsResponse.setCount(_ctx.integerValue("DescribeVpnConnectionLogsResponse.Count"));
		describeVpnConnectionLogsResponse.setIsCompleted(_ctx.booleanValue("DescribeVpnConnectionLogsResponse.IsCompleted"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnConnectionLogsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("DescribeVpnConnectionLogsResponse.Data["+ i +"]"));
		}
		describeVpnConnectionLogsResponse.setData(data);
	 
	 	return describeVpnConnectionLogsResponse;
	}
}