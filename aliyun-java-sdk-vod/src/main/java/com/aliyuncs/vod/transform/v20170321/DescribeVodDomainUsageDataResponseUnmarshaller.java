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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainUsageDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainUsageDataResponseUnmarshaller {

	public static DescribeVodDomainUsageDataResponse unmarshall(DescribeVodDomainUsageDataResponse describeVodDomainUsageDataResponse, UnmarshallerContext context) {
		
		describeVodDomainUsageDataResponse.setRequestId(context.stringValue("DescribeVodDomainUsageDataResponse.RequestId"));
		describeVodDomainUsageDataResponse.setDomainName(context.stringValue("DescribeVodDomainUsageDataResponse.DomainName"));
		describeVodDomainUsageDataResponse.setStartTime(context.stringValue("DescribeVodDomainUsageDataResponse.StartTime"));
		describeVodDomainUsageDataResponse.setEndTime(context.stringValue("DescribeVodDomainUsageDataResponse.EndTime"));
		describeVodDomainUsageDataResponse.setType(context.stringValue("DescribeVodDomainUsageDataResponse.Type"));
		describeVodDomainUsageDataResponse.setArea(context.stringValue("DescribeVodDomainUsageDataResponse.Area"));
		describeVodDomainUsageDataResponse.setDataInterval(context.stringValue("DescribeVodDomainUsageDataResponse.DataInterval"));

		List<DataModule> usageDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainUsageDataResponse.UsageDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainUsageDataResponse.UsageDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainUsageDataResponse.UsageDataPerInterval["+ i +"].Value"));

			usageDataPerInterval.add(dataModule);
		}
		describeVodDomainUsageDataResponse.setUsageDataPerInterval(usageDataPerInterval);
	 
	 	return describeVodDomainUsageDataResponse;
	}
}