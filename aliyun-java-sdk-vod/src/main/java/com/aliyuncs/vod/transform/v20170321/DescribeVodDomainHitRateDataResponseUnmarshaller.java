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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainHitRateDataResponseUnmarshaller {

	public static DescribeVodDomainHitRateDataResponse unmarshall(DescribeVodDomainHitRateDataResponse describeVodDomainHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.RequestId"));
		describeVodDomainHitRateDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.EndTime"));
		describeVodDomainHitRateDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.StartTime"));
		describeVodDomainHitRateDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.DomainName"));
		describeVodDomainHitRateDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRateInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainHitRateDataResponse.HitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeVodDomainHitRateDataResponse.HitRateInterval["+ i +"].HttpsValue"));

			hitRateInterval.add(dataModule);
		}
		describeVodDomainHitRateDataResponse.setHitRateInterval(hitRateInterval);
	 
	 	return describeVodDomainHitRateDataResponse;
	}
}