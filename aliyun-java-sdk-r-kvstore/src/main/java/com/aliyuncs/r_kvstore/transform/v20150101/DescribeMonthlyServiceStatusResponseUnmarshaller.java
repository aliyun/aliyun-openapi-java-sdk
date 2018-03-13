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
package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonthlyServiceStatusResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonthlyServiceStatusResponse.InstanceSLAInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonthlyServiceStatusResponseUnmarshaller {

	public static DescribeMonthlyServiceStatusResponse unmarshall(DescribeMonthlyServiceStatusResponse describeMonthlyServiceStatusResponse, UnmarshallerContext context) {
		
		describeMonthlyServiceStatusResponse.setRequestId(context.stringValue("DescribeMonthlyServiceStatusResponse.RequestId"));
		describeMonthlyServiceStatusResponse.setTotalCount(context.longValue("DescribeMonthlyServiceStatusResponse.TotalCount"));

		List<InstanceSLAInfo> instanceSLAInfos = new ArrayList<InstanceSLAInfo>();
		for (int i = 0; i < context.lengthValue("DescribeMonthlyServiceStatusResponse.InstanceSLAInfos.Length"); i++) {
			InstanceSLAInfo instanceSLAInfo = new InstanceSLAInfo();
			instanceSLAInfo.setInstanceId(context.stringValue("DescribeMonthlyServiceStatusResponse.InstanceSLAInfos["+ i +"].InstanceId"));
			instanceSLAInfo.setUptimePct(context.floatValue("DescribeMonthlyServiceStatusResponse.InstanceSLAInfos["+ i +"].UptimePct"));

			instanceSLAInfos.add(instanceSLAInfo);
		}
		describeMonthlyServiceStatusResponse.setInstanceSLAInfos(instanceSLAInfos);
	 
	 	return describeMonthlyServiceStatusResponse;
	}
}