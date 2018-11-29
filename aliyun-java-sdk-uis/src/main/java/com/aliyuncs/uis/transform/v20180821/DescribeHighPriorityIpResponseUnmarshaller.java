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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeHighPriorityIpResponse;
import com.aliyuncs.uis.model.v20180821.DescribeHighPriorityIpResponse.HighPriorityIp;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHighPriorityIpResponseUnmarshaller {

	public static DescribeHighPriorityIpResponse unmarshall(DescribeHighPriorityIpResponse describeHighPriorityIpResponse, UnmarshallerContext context) {
		
		describeHighPriorityIpResponse.setRequestId(context.stringValue("DescribeHighPriorityIpResponse.RequestId"));
		describeHighPriorityIpResponse.setTotalCount(context.integerValue("DescribeHighPriorityIpResponse.TotalCount"));
		describeHighPriorityIpResponse.setPageNumber(context.integerValue("DescribeHighPriorityIpResponse.PageNumber"));
		describeHighPriorityIpResponse.setPageSize(context.integerValue("DescribeHighPriorityIpResponse.PageSize"));

		List<HighPriorityIp> highPriorityIps = new ArrayList<HighPriorityIp>();
		for (int i = 0; i < context.lengthValue("DescribeHighPriorityIpResponse.HighPriorityIps.Length"); i++) {
			HighPriorityIp highPriorityIp = new HighPriorityIp();
			highPriorityIp.setDomain(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].Domain"));
			highPriorityIp.setIp(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].Ip"));
			highPriorityIp.setState(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].State"));
			highPriorityIp.setStaticOffAreaId(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].StaticOffAreaId"));
			highPriorityIp.setDynamicOffAreaId(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].DynamicOffAreaId"));
			highPriorityIp.setBoardAreaId(context.stringValue("DescribeHighPriorityIpResponse.HighPriorityIps["+ i +"].BoardAreaId"));

			highPriorityIps.add(highPriorityIp);
		}
		describeHighPriorityIpResponse.setHighPriorityIps(highPriorityIps);
	 
	 	return describeHighPriorityIpResponse;
	}
}