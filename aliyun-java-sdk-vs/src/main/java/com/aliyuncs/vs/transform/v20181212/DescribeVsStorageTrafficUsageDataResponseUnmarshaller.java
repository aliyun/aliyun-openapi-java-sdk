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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsStorageTrafficUsageDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsStorageTrafficUsageDataResponse.TrafficUsageDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsStorageTrafficUsageDataResponseUnmarshaller {

	public static DescribeVsStorageTrafficUsageDataResponse unmarshall(DescribeVsStorageTrafficUsageDataResponse describeVsStorageTrafficUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeVsStorageTrafficUsageDataResponse.setRequestId(_ctx.stringValue("DescribeVsStorageTrafficUsageDataResponse.RequestId"));

		List<TrafficUsageDataModule> trafficUsage = new ArrayList<TrafficUsageDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage.Length"); i++) {
			TrafficUsageDataModule trafficUsageDataModule = new TrafficUsageDataModule();
			trafficUsageDataModule.setLanBandwidthOutDataValue(_ctx.floatValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].LanBandwidthOutDataValue"));
			trafficUsageDataModule.setWanBandwidthOutDataValue(_ctx.floatValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].WanBandwidthOutDataValue"));
			trafficUsageDataModule.setLanBandwidthInDataValue(_ctx.floatValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].LanBandwidthInDataValue"));
			trafficUsageDataModule.setLanTrafficInDataValue(_ctx.longValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].LanTrafficInDataValue"));
			trafficUsageDataModule.setWanTrafficOutDataValue(_ctx.longValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].WanTrafficOutDataValue"));
			trafficUsageDataModule.setTimeStamp(_ctx.stringValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].TimeStamp"));
			trafficUsageDataModule.setWanTrafficInDataValue(_ctx.longValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].WanTrafficInDataValue"));
			trafficUsageDataModule.setLanTrafficOutDataValue(_ctx.longValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].LanTrafficOutDataValue"));
			trafficUsageDataModule.setWanBandwidthInDataValue(_ctx.floatValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].WanBandwidthInDataValue"));
			trafficUsageDataModule.setBucket(_ctx.stringValue("DescribeVsStorageTrafficUsageDataResponse.TrafficUsage["+ i +"].Bucket"));

			trafficUsage.add(trafficUsageDataModule);
		}
		describeVsStorageTrafficUsageDataResponse.setTrafficUsage(trafficUsage);
	 
	 	return describeVsStorageTrafficUsageDataResponse;
	}
}