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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainBpsDataByLayerResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainBpsDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBpsDataByLayerResponseUnmarshaller {

	public static DescribeDomainBpsDataByLayerResponse unmarshall(DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDomainBpsDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDomainBpsDataByLayerResponse.RequestId"));
		describeDomainBpsDataByLayerResponse.setDataInterval(_ctx.stringValue("DescribeDomainBpsDataByLayerResponse.DataInterval"));

		List<DataModule> bpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainBpsDataByLayerResponse.BpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].Value"));
			dataModule.setTrafficValue(_ctx.stringValue("DescribeDomainBpsDataByLayerResponse.BpsDataInterval["+ i +"].TrafficValue"));

			bpsDataInterval.add(dataModule);
		}
		describeDomainBpsDataByLayerResponse.setBpsDataInterval(bpsDataInterval);
	 
	 	return describeDomainBpsDataByLayerResponse;
	}
}