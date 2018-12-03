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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainWebsocketBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainWebsocketBpsDataResponse unmarshall(DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainWebsocketBpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.RequestId"));
		describeDcdnDomainWebsocketBpsDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.DomainName"));
		describeDcdnDomainWebsocketBpsDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.StartTime"));
		describeDcdnDomainWebsocketBpsDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.EndTime"));
		describeDcdnDomainWebsocketBpsDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainWebsocketBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainWebsocketBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setWebsocketBps(context.floatValue("DescribeDcdnDomainWebsocketBpsDataResponse.BpsDataPerInterval["+ i +"].WebsocketBps"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainWebsocketBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDcdnDomainWebsocketBpsDataResponse;
	}
}