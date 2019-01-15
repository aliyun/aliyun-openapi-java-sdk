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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeTrafficDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeTrafficDataResponse unmarshall(DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeTrafficDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RequestId"));
		describeVodDomainRealTimeTrafficDataResponse.setDomainName(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.DomainName"));
		describeVodDomainRealTimeTrafficDataResponse.setStartTime(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.StartTime"));
		describeVodDomainRealTimeTrafficDataResponse.setEndTime(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.EndTime"));
		describeVodDomainRealTimeTrafficDataResponse.setDataInterval(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeVodDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeVodDomainRealTimeTrafficDataResponse;
	}
}