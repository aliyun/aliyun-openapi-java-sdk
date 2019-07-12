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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainBpsDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainBpsDataResponseUnmarshaller {

	public static DescribeLiveDomainBpsDataResponse unmarshall(DescribeLiveDomainBpsDataResponse describeLiveDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainBpsDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.RequestId"));
		describeLiveDomainBpsDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.DomainName"));
		describeLiveDomainBpsDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.StartTime"));
		describeLiveDomainBpsDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.EndTime"));
		describeLiveDomainBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBpsValue(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.BpsDataPerInterval["+ i +"].BpsValue"));
			dataModule.setHttpBpsValue(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpBpsValue"));
			dataModule.setHttpsBpsValue(_ctx.stringValue("DescribeLiveDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsBpsValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeLiveDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeLiveDomainBpsDataResponse;
	}
}