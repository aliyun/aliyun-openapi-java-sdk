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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcTrafficDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeSrcTrafficDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeSrcTrafficDataResponse unmarshall(DescribeScdnDomainRealTimeSrcTrafficDataResponse describeScdnDomainRealTimeSrcTrafficDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRealTimeSrcTrafficDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.RequestId"));
		describeScdnDomainRealTimeSrcTrafficDataResponse.setDomainName(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.DomainName"));
		describeScdnDomainRealTimeSrcTrafficDataResponse.setStartTime(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.StartTime"));
		describeScdnDomainRealTimeSrcTrafficDataResponse.setEndTime(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.EndTime"));
		describeScdnDomainRealTimeSrcTrafficDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeSrcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeScdnDomainRealTimeSrcTrafficDataResponse.RealTimeSrcTrafficDataPerInterval["+ i +"].Value"));

			realTimeSrcTrafficDataPerInterval.add(dataModule);
		}
		describeScdnDomainRealTimeSrcTrafficDataResponse.setRealTimeSrcTrafficDataPerInterval(realTimeSrcTrafficDataPerInterval);
	 
	 	return describeScdnDomainRealTimeSrcTrafficDataResponse;
	}
}