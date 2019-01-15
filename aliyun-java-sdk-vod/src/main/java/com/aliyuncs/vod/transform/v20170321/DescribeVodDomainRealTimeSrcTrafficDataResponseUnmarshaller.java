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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeSrcTrafficDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeSrcTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeSrcTrafficDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeSrcTrafficDataResponse unmarshall(DescribeVodDomainRealTimeSrcTrafficDataResponse describeVodDomainRealTimeSrcTrafficDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeSrcTrafficDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.RequestId"));
		describeVodDomainRealTimeSrcTrafficDataResponse.setDomainName(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.DomainName"));
		describeVodDomainRealTimeSrcTrafficDataResponse.setStartTime(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.StartTime"));
		describeVodDomainRealTimeSrcTrafficDataResponse.setEndTime(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.EndTime"));
		describeVodDomainRealTimeSrcTrafficDataResponse.setDataInterval(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeSrcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].Value"));

			realTimeSrcTrafficDataPerInterval.add(dataModule);
		}
		describeVodDomainRealTimeSrcTrafficDataResponse.setRealTimeSrcTrafficDataPerInterval(realTimeSrcTrafficDataPerInterval);
	 
	 	return describeVodDomainRealTimeSrcTrafficDataResponse;
	}
}