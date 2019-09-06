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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnSslServerLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnSslServerLogsResponseUnmarshaller {

	public static DescribeVpnSslServerLogsResponse unmarshall(DescribeVpnSslServerLogsResponse describeVpnSslServerLogsResponse, UnmarshallerContext _ctx) {
		
		describeVpnSslServerLogsResponse.setRequestId(_ctx.stringValue("DescribeVpnSslServerLogsResponse.RequestId"));
		describeVpnSslServerLogsResponse.setCount(_ctx.integerValue("DescribeVpnSslServerLogsResponse.Count"));
		describeVpnSslServerLogsResponse.setIsCompleted(_ctx.booleanValue("DescribeVpnSslServerLogsResponse.IsCompleted"));
		describeVpnSslServerLogsResponse.setPageNumber(_ctx.integerValue("DescribeVpnSslServerLogsResponse.PageNumber"));
		describeVpnSslServerLogsResponse.setPageSize(_ctx.integerValue("DescribeVpnSslServerLogsResponse.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnSslServerLogsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("DescribeVpnSslServerLogsResponse.Data["+ i +"]"));
		}
		describeVpnSslServerLogsResponse.setData(data);
	 
	 	return describeVpnSslServerLogsResponse;
	}
}