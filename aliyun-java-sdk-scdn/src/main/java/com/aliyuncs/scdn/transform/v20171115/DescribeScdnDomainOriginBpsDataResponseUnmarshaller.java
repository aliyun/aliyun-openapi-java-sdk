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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainOriginBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainOriginBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainOriginBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainOriginBpsDataResponse unmarshall(DescribeScdnDomainOriginBpsDataResponse describeScdnDomainOriginBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainOriginBpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.RequestId"));
		describeScdnDomainOriginBpsDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.DomainName"));
		describeScdnDomainOriginBpsDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.StartTime"));
		describeScdnDomainOriginBpsDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.EndTime"));
		describeScdnDomainOriginBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.DataInterval"));

		List<DataModule> originBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setOriginBpsValue(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].OriginBpsValue"));
			dataModule.setHttpOriginBpsValue(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].HttpOriginBpsValue"));
			dataModule.setHttpsOriginBpsValue(_ctx.stringValue("DescribeScdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].HttpsOriginBpsValue"));

			originBpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainOriginBpsDataResponse.setOriginBpsDataPerInterval(originBpsDataPerInterval);
	 
	 	return describeScdnDomainOriginBpsDataResponse;
	}
}