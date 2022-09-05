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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeIpStatusResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeIpStatusResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpStatusResponseUnmarshaller {

	public static DescribeIpStatusResponse unmarshall(DescribeIpStatusResponse describeIpStatusResponse, UnmarshallerContext _ctx) {
		
		describeIpStatusResponse.setRequestId(_ctx.stringValue("DescribeIpStatusResponse.RequestId"));

		List<UsageData> ipStatus = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpStatusResponse.IpStatus.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setIp(_ctx.stringValue("DescribeIpStatusResponse.IpStatus["+ i +"].ip"));
			usageData.setStatus(_ctx.stringValue("DescribeIpStatusResponse.IpStatus["+ i +"].status"));

			ipStatus.add(usageData);
		}
		describeIpStatusResponse.setIpStatus(ipStatus);
	 
	 	return describeIpStatusResponse;
	}
}