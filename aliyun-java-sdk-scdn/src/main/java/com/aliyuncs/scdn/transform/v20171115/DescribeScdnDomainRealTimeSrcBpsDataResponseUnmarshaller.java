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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeSrcBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeSrcBpsDataResponse unmarshall(DescribeScdnDomainRealTimeSrcBpsDataResponse describeScdnDomainRealTimeSrcBpsDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRealTimeSrcBpsDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RequestId"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setDomainName(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.DomainName"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setStartTime(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.StartTime"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setEndTime(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.EndTime"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.DataInterval"));

		List<DataModule> realTimeSrcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].Value"));

			realTimeSrcBpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainRealTimeSrcBpsDataResponse.setRealTimeSrcBpsDataPerInterval(realTimeSrcBpsDataPerInterval);
	 
	 	return describeScdnDomainRealTimeSrcBpsDataResponse;
	}
}