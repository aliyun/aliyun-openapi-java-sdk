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

import com.aliyuncs.uis.model.v20180821.DescribeUiseNodeStatusResponse;
import com.aliyuncs.uis.model.v20180821.DescribeUiseNodeStatusResponse.IpStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUiseNodeStatusResponseUnmarshaller {

	public static DescribeUiseNodeStatusResponse unmarshall(DescribeUiseNodeStatusResponse describeUiseNodeStatusResponse, UnmarshallerContext context) {
		
		describeUiseNodeStatusResponse.setRequestId(context.stringValue("DescribeUiseNodeStatusResponse.RequestId"));

		List<IpStatus> ipStatusList = new ArrayList<IpStatus>();
		for (int i = 0; i < context.lengthValue("DescribeUiseNodeStatusResponse.IpStatusList.Length"); i++) {
			IpStatus ipStatus = new IpStatus();
			ipStatus.setIp(context.stringValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].Ip"));
			ipStatus.setMaxConnections(context.integerValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].MaxConnections"));
			ipStatus.setCurrentConnections(context.integerValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].CurrentConnections"));
			ipStatus.setCpuStatus(context.stringValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].CpuStatus"));
			ipStatus.setMemStatus(context.stringValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].MemStatus"));
			ipStatus.setBandwidthStatus(context.stringValue("DescribeUiseNodeStatusResponse.IpStatusList["+ i +"].BandwidthStatus"));

			ipStatusList.add(ipStatus);
		}
		describeUiseNodeStatusResponse.setIpStatusList(ipStatusList);
	 
	 	return describeUiseNodeStatusResponse;
	}
}