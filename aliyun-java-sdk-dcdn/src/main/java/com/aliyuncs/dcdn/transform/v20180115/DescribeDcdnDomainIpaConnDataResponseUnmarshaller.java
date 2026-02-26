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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaConnDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaConnDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainIpaConnDataResponseUnmarshaller {

	public static DescribeDcdnDomainIpaConnDataResponse unmarshall(DescribeDcdnDomainIpaConnDataResponse describeDcdnDomainIpaConnDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainIpaConnDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainIpaConnDataResponse.RequestId"));
		describeDcdnDomainIpaConnDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainIpaConnDataResponse.EndTime"));
		describeDcdnDomainIpaConnDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainIpaConnDataResponse.StartTime"));

		List<DataModule> connectionDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainIpaConnDataResponse.ConnectionDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainIpaConnDataResponse.ConnectionDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setDomain(_ctx.stringValue("DescribeDcdnDomainIpaConnDataResponse.ConnectionDataPerInterval["+ i +"].Domain"));
			dataModule.setConnections(_ctx.longValue("DescribeDcdnDomainIpaConnDataResponse.ConnectionDataPerInterval["+ i +"].Connections"));

			connectionDataPerInterval.add(dataModule);
		}
		describeDcdnDomainIpaConnDataResponse.setConnectionDataPerInterval(connectionDataPerInterval);
	 
	 	return describeDcdnDomainIpaConnDataResponse;
	}
}