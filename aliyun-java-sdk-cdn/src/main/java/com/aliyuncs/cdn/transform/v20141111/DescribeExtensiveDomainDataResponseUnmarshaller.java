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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeExtensiveDomainDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeExtensiveDomainDataResponse.UsageData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExtensiveDomainDataResponseUnmarshaller {

	public static DescribeExtensiveDomainDataResponse unmarshall(DescribeExtensiveDomainDataResponse describeExtensiveDomainDataResponse, UnmarshallerContext context) {
		
		describeExtensiveDomainDataResponse.setRequestId(context.stringValue("DescribeExtensiveDomainDataResponse.RequestId"));
		describeExtensiveDomainDataResponse.setExtensiveDomain(context.stringValue("DescribeExtensiveDomainDataResponse.ExtensiveDomain"));
		describeExtensiveDomainDataResponse.setDataInterval(context.stringValue("DescribeExtensiveDomainDataResponse.DataInterval"));
		describeExtensiveDomainDataResponse.setStartTime(context.stringValue("DescribeExtensiveDomainDataResponse.StartTime"));
		describeExtensiveDomainDataResponse.setEndTime(context.stringValue("DescribeExtensiveDomainDataResponse.EndTime"));
		describeExtensiveDomainDataResponse.setPageNumber(context.stringValue("DescribeExtensiveDomainDataResponse.PageNumber"));
		describeExtensiveDomainDataResponse.setTotalCount(context.stringValue("DescribeExtensiveDomainDataResponse.TotalCount"));
		describeExtensiveDomainDataResponse.setPageSize(context.stringValue("DescribeExtensiveDomainDataResponse.PageSize"));

		List<UsageData> dataPerInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeExtensiveDomainDataResponse.DataPerInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setExactDomain(context.stringValue("DescribeExtensiveDomainDataResponse.DataPerInterval["+ i +"].ExactDomain"));
			usageData.setTimeStamp(context.stringValue("DescribeExtensiveDomainDataResponse.DataPerInterval["+ i +"].TimeStamp"));
			usageData.setAcc(context.stringValue("DescribeExtensiveDomainDataResponse.DataPerInterval["+ i +"].Acc"));
			usageData.setFlow(context.stringValue("DescribeExtensiveDomainDataResponse.DataPerInterval["+ i +"].Flow"));

			dataPerInterval.add(usageData);
		}
		describeExtensiveDomainDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeExtensiveDomainDataResponse;
	}
}