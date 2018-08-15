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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeHlsLiveStreamRealTimeBpsDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageDataPerDomain;
import com.aliyuncs.live.model.v20161101.DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageDataPerDomain.StreamInfo;
import com.aliyuncs.live.model.v20161101.DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageDataPerDomain.StreamInfo.Info;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHlsLiveStreamRealTimeBpsDataResponseUnmarshaller {

	public static DescribeHlsLiveStreamRealTimeBpsDataResponse unmarshall(DescribeHlsLiveStreamRealTimeBpsDataResponse describeHlsLiveStreamRealTimeBpsDataResponse, UnmarshallerContext context) {
		
		describeHlsLiveStreamRealTimeBpsDataResponse.setRequestId(context.stringValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.RequestId"));
		describeHlsLiveStreamRealTimeBpsDataResponse.setTime(context.stringValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.Time"));

		List<UsageDataPerDomain> usageData = new ArrayList<UsageDataPerDomain>();
		for (int i = 0; i < context.lengthValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData.Length"); i++) {
			UsageDataPerDomain usageDataPerDomain = new UsageDataPerDomain();
			usageDataPerDomain.setDomainName(context.stringValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].DomainName"));

			List<StreamInfo> streamInfos = new ArrayList<StreamInfo>();
			for (int j = 0; j < context.lengthValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos.Length"); j++) {
				StreamInfo streamInfo = new StreamInfo();
				streamInfo.setStreamName(context.stringValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos["+ j +"].StreamName"));

				List<Info> infos = new ArrayList<Info>();
				for (int k = 0; k < context.lengthValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos["+ j +"].Infos.Length"); k++) {
					Info info = new Info();
					info.setDownFlow(context.floatValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos["+ j +"].Infos["+ k +"].DownFlow"));
					info.setRate(context.stringValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos["+ j +"].Infos["+ k +"].Rate"));
					info.setOnline(context.floatValue("DescribeHlsLiveStreamRealTimeBpsDataResponse.UsageData["+ i +"].StreamInfos["+ j +"].Infos["+ k +"].Online"));

					infos.add(info);
				}
				streamInfo.setInfos(infos);

				streamInfos.add(streamInfo);
			}
			usageDataPerDomain.setStreamInfos(streamInfos);

			usageData.add(usageDataPerDomain);
		}
		describeHlsLiveStreamRealTimeBpsDataResponse.setUsageData(usageData);
	 
	 	return describeHlsLiveStreamRealTimeBpsDataResponse;
	}
}