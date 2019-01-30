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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainTrafficDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainTrafficDataResponseUnmarshaller {

	public static DescribeVodDomainTrafficDataResponse unmarshall(DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataResponse, UnmarshallerContext context) {
		
		describeVodDomainTrafficDataResponse.setRequestId(context.stringValue("DescribeVodDomainTrafficDataResponse.RequestId"));
		describeVodDomainTrafficDataResponse.setDomainName(context.stringValue("DescribeVodDomainTrafficDataResponse.DomainName"));
		describeVodDomainTrafficDataResponse.setStartTime(context.stringValue("DescribeVodDomainTrafficDataResponse.StartTime"));
		describeVodDomainTrafficDataResponse.setEndTime(context.stringValue("DescribeVodDomainTrafficDataResponse.EndTime"));
		describeVodDomainTrafficDataResponse.setDataInterval(context.stringValue("DescribeVodDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(context.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsOverseasValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeVodDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeVodDomainTrafficDataResponse;
	}
}