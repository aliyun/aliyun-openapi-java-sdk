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

	public static DescribeVodDomainTrafficDataResponse unmarshall(DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.RequestId"));
		describeVodDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.DomainName"));
		describeVodDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.StartTime"));
		describeVodDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.EndTime"));
		describeVodDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(_ctx.stringValue("DescribeVodDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsOverseasValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeVodDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeVodDomainTrafficDataResponse;
	}
}