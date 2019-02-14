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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcBpsDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainRealTimeSrcBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeSrcBpsDataResponseUnmarshaller {

	public static DescribeDomainRealTimeSrcBpsDataResponse unmarshall(DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeSrcBpsDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.RequestId"));
		describeDomainRealTimeSrcBpsDataResponse.setDomainName(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.DomainName"));
		describeDomainRealTimeSrcBpsDataResponse.setStartTime(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.StartTime"));
		describeDomainRealTimeSrcBpsDataResponse.setEndTime(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.EndTime"));
		describeDomainRealTimeSrcBpsDataResponse.setDataInterval(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.DataInterval"));

		List<DataModule> realTimeSrcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].Value"));

			realTimeSrcBpsDataPerInterval.add(dataModule);
		}
		describeDomainRealTimeSrcBpsDataResponse.setRealTimeSrcBpsDataPerInterval(realTimeSrcBpsDataPerInterval);
	 
	 	return describeDomainRealTimeSrcBpsDataResponse;
	}
}