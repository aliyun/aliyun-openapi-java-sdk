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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeTrafficDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeTrafficDataResponse unmarshall(DescribeScdnDomainRealTimeTrafficDataResponse describeScdnDomainRealTimeTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRealTimeTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.RequestId"));
		describeScdnDomainRealTimeTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.DomainName"));
		describeScdnDomainRealTimeTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.StartTime"));
		describeScdnDomainRealTimeTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.EndTime"));
		describeScdnDomainRealTimeTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeScdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeScdnDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeScdnDomainRealTimeTrafficDataResponse;
	}
}