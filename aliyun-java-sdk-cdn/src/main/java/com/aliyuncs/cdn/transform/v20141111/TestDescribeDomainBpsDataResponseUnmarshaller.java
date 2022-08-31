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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.TestDescribeDomainBpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.TestDescribeDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestDescribeDomainBpsDataResponseUnmarshaller {

	public static TestDescribeDomainBpsDataResponse unmarshall(TestDescribeDomainBpsDataResponse testDescribeDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		testDescribeDomainBpsDataResponse.setRequestId(_ctx.stringValue("TestDescribeDomainBpsDataResponse.RequestId"));
		testDescribeDomainBpsDataResponse.setEndTime(_ctx.stringValue("TestDescribeDomainBpsDataResponse.EndTime"));
		testDescribeDomainBpsDataResponse.setStartTime(_ctx.stringValue("TestDescribeDomainBpsDataResponse.StartTime"));
		testDescribeDomainBpsDataResponse.setIspNameEn(_ctx.stringValue("TestDescribeDomainBpsDataResponse.IspNameEn"));
		testDescribeDomainBpsDataResponse.setLocationNameEn(_ctx.stringValue("TestDescribeDomainBpsDataResponse.LocationNameEn"));
		testDescribeDomainBpsDataResponse.setLocationName(_ctx.stringValue("TestDescribeDomainBpsDataResponse.LocationName"));
		testDescribeDomainBpsDataResponse.setIspName(_ctx.stringValue("TestDescribeDomainBpsDataResponse.IspName"));
		testDescribeDomainBpsDataResponse.setDomainName(_ctx.stringValue("TestDescribeDomainBpsDataResponse.DomainName"));
		testDescribeDomainBpsDataResponse.setDataInterval(_ctx.stringValue("TestDescribeDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setL2Value(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].L2Value"));
			dataModule.setDynamicValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicValue"));
			dataModule.setDynamicDomesticValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicDomesticValue"));
			dataModule.setDomesticValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Value"));
			dataModule.setOverseasL2Value(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasL2Value"));
			dataModule.setStaticDomesticValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticDomesticValue"));
			dataModule.setDomesticL2Value(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticL2Value"));
			dataModule.setOverseasValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setStaticValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticValue"));
			dataModule.setTimeStamp(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setStaticOverseasValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticOverseasValue"));
			dataModule.setDynamicOverseasValue(_ctx.stringValue("TestDescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicOverseasValue"));

			bpsDataPerInterval.add(dataModule);
		}
		testDescribeDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return testDescribeDomainBpsDataResponse;
	}
}