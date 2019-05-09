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

import com.aliyuncs.uis.model.v20180821.DescribeHighPriorityIpsResponse;
import com.aliyuncs.uis.model.v20180821.DescribeHighPriorityIpsResponse.HighPriorityIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHighPriorityIpsResponseUnmarshaller {

	public static DescribeHighPriorityIpsResponse unmarshall(DescribeHighPriorityIpsResponse describeHighPriorityIpsResponse, UnmarshallerContext context) {
		
		describeHighPriorityIpsResponse.setRequestId(context.stringValue("DescribeHighPriorityIpsResponse.RequestId"));
		describeHighPriorityIpsResponse.setTotalCount(context.integerValue("DescribeHighPriorityIpsResponse.TotalCount"));
		describeHighPriorityIpsResponse.setPageNumber(context.integerValue("DescribeHighPriorityIpsResponse.PageNumber"));
		describeHighPriorityIpsResponse.setPageSize(context.integerValue("DescribeHighPriorityIpsResponse.PageSize"));

		List<HighPriorityIp> highPriorityIps = new ArrayList<HighPriorityIp>();
		for (int i = 0; i < context.lengthValue("DescribeHighPriorityIpsResponse.HighPriorityIps.Length"); i++) {
			HighPriorityIp highPriorityIp = new HighPriorityIp();
			highPriorityIp.setDestination(context.stringValue("DescribeHighPriorityIpsResponse.HighPriorityIps["+ i +"].Destination"));
			highPriorityIp.setAreaId(context.stringValue("DescribeHighPriorityIpsResponse.HighPriorityIps["+ i +"].AreaId"));

			highPriorityIps.add(highPriorityIp);
		}
		describeHighPriorityIpsResponse.setHighPriorityIps(highPriorityIps);
	 
	 	return describeHighPriorityIpsResponse;
	}
}