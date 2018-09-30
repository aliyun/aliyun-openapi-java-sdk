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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcTrafficDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeSrcTrafficDataResponseUnmarshaller {

	public static DescribeDomainRealTimeSrcTrafficDataResponse unmarshall(DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeSrcTrafficDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RequestId"));
		describeDomainRealTimeSrcTrafficDataResponse.setDomainName(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.DomainName"));
		describeDomainRealTimeSrcTrafficDataResponse.setStartTime(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.StartTime"));
		describeDomainRealTimeSrcTrafficDataResponse.setEndTime(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.EndTime"));
		describeDomainRealTimeSrcTrafficDataResponse.setDataInterval(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeSrcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].Value"));

			realTimeSrcTrafficDataPerInterval.add(dataModule);
		}
		describeDomainRealTimeSrcTrafficDataResponse.setRealTimeSrcTrafficDataPerInterval(realTimeSrcTrafficDataPerInterval);
	 
	 	return describeDomainRealTimeSrcTrafficDataResponse;
	}
}