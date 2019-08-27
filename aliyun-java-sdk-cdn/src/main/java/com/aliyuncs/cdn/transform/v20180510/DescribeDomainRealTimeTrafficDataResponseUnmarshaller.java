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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeTrafficDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeDomainRealTimeTrafficDataResponse unmarshall(DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRealTimeTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.RequestId"));
		describeDomainRealTimeTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.DomainName"));
		describeDomainRealTimeTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.StartTime"));
		describeDomainRealTimeTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.EndTime"));
		describeDomainRealTimeTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeDomainRealTimeTrafficDataResponse;
	}
}