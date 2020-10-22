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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeTrafficDataResponse unmarshall(DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainRealTimeTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.RequestId"));
		describeDcdnDomainRealTimeTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.DomainName"));
		describeDcdnDomainRealTimeTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.StartTime"));
		describeDcdnDomainRealTimeTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.EndTime"));
		describeDcdnDomainRealTimeTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDcdnDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeDcdnDomainRealTimeTrafficDataResponse;
	}
}