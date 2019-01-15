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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeHttpCodeDataResponse unmarshall(DescribeVodDomainRealTimeHttpCodeDataResponse describeVodDomainRealTimeHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeHttpCodeDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeVodDomainRealTimeHttpCodeDataResponse.setDomainName(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeVodDomainRealTimeHttpCodeDataResponse.setStartTime(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeVodDomainRealTimeHttpCodeDataResponse.setEndTime(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeVodDomainRealTimeHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < context.lengthValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(context.stringValue("DescribeVodDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeVodDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeVodDomainRealTimeHttpCodeDataResponse;
	}
}