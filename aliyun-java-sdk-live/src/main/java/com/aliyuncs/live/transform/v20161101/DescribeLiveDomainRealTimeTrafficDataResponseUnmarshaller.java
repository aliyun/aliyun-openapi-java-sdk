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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeTrafficDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeLiveDomainRealTimeTrafficDataResponse unmarshall(DescribeLiveDomainRealTimeTrafficDataResponse describeLiveDomainRealTimeTrafficDataResponse, UnmarshallerContext context) {
		
		describeLiveDomainRealTimeTrafficDataResponse.setRequestId(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.RequestId"));
		describeLiveDomainRealTimeTrafficDataResponse.setDomainName(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.DomainName"));
		describeLiveDomainRealTimeTrafficDataResponse.setStartTime(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.StartTime"));
		describeLiveDomainRealTimeTrafficDataResponse.setEndTime(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.EndTime"));
		describeLiveDomainRealTimeTrafficDataResponse.setDataInterval(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeLiveDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeLiveDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeLiveDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeLiveDomainRealTimeTrafficDataResponse;
	}
}