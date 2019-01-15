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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainHitRateDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainHitRateDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainHitRateDataResponseUnmarshaller {

	public static DescribeVodDomainHitRateDataResponse unmarshall(DescribeVodDomainHitRateDataResponse describeVodDomainHitRateDataResponse, UnmarshallerContext context) {
		
		describeVodDomainHitRateDataResponse.setRequestId(context.stringValue("DescribeVodDomainHitRateDataResponse.RequestId"));
		describeVodDomainHitRateDataResponse.setDomainName(context.stringValue("DescribeVodDomainHitRateDataResponse.DomainName"));
		describeVodDomainHitRateDataResponse.setStartTime(context.stringValue("DescribeVodDomainHitRateDataResponse.StartTime"));
		describeVodDomainHitRateDataResponse.setEndTime(context.stringValue("DescribeVodDomainHitRateDataResponse.EndTime"));
		describeVodDomainHitRateDataResponse.setDataInterval(context.stringValue("DescribeVodDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRateInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainHitRateDataResponse.HitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].Value"));
			dataModule.setHttpsValue(context.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].HttpsValue"));

			hitRateInterval.add(dataModule);
		}
		describeVodDomainHitRateDataResponse.setHitRateInterval(hitRateInterval);
	 
	 	return describeVodDomainHitRateDataResponse;
	}
}