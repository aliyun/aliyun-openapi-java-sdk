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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeSrcBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeSrcBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeSrcBpsDataResponse unmarshall(DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainRealTimeSrcBpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.RequestId"));
		describeDcdnDomainRealTimeSrcBpsDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.DomainName"));
		describeDcdnDomainRealTimeSrcBpsDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.StartTime"));
		describeDcdnDomainRealTimeSrcBpsDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.EndTime"));
		describeDcdnDomainRealTimeSrcBpsDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.DataInterval"));

		List<DataModule> realTimeSrcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDcdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].Value"));

			realTimeSrcBpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainRealTimeSrcBpsDataResponse.setRealTimeSrcBpsDataPerInterval(realTimeSrcBpsDataPerInterval);
	 
	 	return describeDcdnDomainRealTimeSrcBpsDataResponse;
	}
}