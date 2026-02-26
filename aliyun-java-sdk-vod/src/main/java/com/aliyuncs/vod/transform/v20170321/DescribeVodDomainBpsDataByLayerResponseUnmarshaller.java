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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainBpsDataByLayerResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainBpsDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainBpsDataByLayerResponseUnmarshaller {

	public static DescribeVodDomainBpsDataByLayerResponse unmarshall(DescribeVodDomainBpsDataByLayerResponse describeVodDomainBpsDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainBpsDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeVodDomainBpsDataByLayerResponse.RequestId"));
		describeVodDomainBpsDataByLayerResponse.setDataInterval(_ctx.integerValue("DescribeVodDomainBpsDataByLayerResponse.DataInterval"));

		List<DataModule> bpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainBpsDataByLayerResponse.BpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.doubleValue("DescribeVodDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].Value"));
			dataModule.setTrafficValue(_ctx.longValue("DescribeVodDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].TrafficValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].TimeStamp"));

			bpsDataInterval.add(dataModule);
		}
		describeVodDomainBpsDataByLayerResponse.setBpsDataInterval(bpsDataInterval);
	 
	 	return describeVodDomainBpsDataByLayerResponse;
	}
}