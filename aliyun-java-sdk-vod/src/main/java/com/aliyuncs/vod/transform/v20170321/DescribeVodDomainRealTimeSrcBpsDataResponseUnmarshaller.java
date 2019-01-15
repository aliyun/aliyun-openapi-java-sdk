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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeSrcBpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeSrcBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeSrcBpsDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeSrcBpsDataResponse unmarshall(DescribeVodDomainRealTimeSrcBpsDataResponse describeVodDomainRealTimeSrcBpsDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeSrcBpsDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.RequestId"));
		describeVodDomainRealTimeSrcBpsDataResponse.setDomainName(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.DomainName"));
		describeVodDomainRealTimeSrcBpsDataResponse.setStartTime(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.StartTime"));
		describeVodDomainRealTimeSrcBpsDataResponse.setEndTime(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.EndTime"));
		describeVodDomainRealTimeSrcBpsDataResponse.setDataInterval(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.DataInterval"));

		List<DataModule> realTimeSrcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].Value"));

			realTimeSrcBpsDataPerInterval.add(dataModule);
		}
		describeVodDomainRealTimeSrcBpsDataResponse.setRealTimeSrcBpsDataPerInterval(realTimeSrcBpsDataPerInterval);
	 
	 	return describeVodDomainRealTimeSrcBpsDataResponse;
	}
}