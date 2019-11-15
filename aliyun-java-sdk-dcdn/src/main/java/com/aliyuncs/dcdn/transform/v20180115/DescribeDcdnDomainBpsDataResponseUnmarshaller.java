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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainBpsDataResponse unmarshall(DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainBpsDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.RequestId"));
		describeDcdnDomainBpsDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.DomainName"));
		describeDcdnDomainBpsDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.StartTime"));
		describeDcdnDomainBpsDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.EndTime"));
		describeDcdnDomainBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBps(_ctx.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Bps"));
			dataModule.setDynamicHttpBps(_ctx.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicHttpBps"));
			dataModule.setDynamicHttpsBps(_ctx.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicHttpsBps"));
			dataModule.setStaticHttpBps(_ctx.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticHttpBps"));
			dataModule.setStaticHttpsBps(_ctx.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticHttpsBps"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDcdnDomainBpsDataResponse;
	}
}