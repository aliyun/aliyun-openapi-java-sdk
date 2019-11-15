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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainIpaBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainIpaBpsDataResponse unmarshall(DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainIpaBpsDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.RequestId"));
		describeDcdnDomainIpaBpsDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.DomainName"));
		describeDcdnDomainIpaBpsDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.StartTime"));
		describeDcdnDomainIpaBpsDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.EndTime"));
		describeDcdnDomainIpaBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainIpaBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainIpaBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setIpaBps(_ctx.floatValue("DescribeDcdnDomainIpaBpsDataResponse.BpsDataPerInterval["+ i +"].IpaBps"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainIpaBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDcdnDomainIpaBpsDataResponse;
	}
}