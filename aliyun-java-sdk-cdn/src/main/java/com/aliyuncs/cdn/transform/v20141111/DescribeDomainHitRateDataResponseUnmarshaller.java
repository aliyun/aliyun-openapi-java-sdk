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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainHitRateDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainHitRateDataResponseUnmarshaller {

	public static DescribeDomainHitRateDataResponse unmarshall(DescribeDomainHitRateDataResponse describeDomainHitRateDataResponse, UnmarshallerContext context) {
		
		describeDomainHitRateDataResponse.setRequestId(context.stringValue("DescribeDomainHitRateDataResponse.RequestId"));
		describeDomainHitRateDataResponse.setDomainName(context.stringValue("DescribeDomainHitRateDataResponse.DomainName"));
		describeDomainHitRateDataResponse.setDataInterval(context.stringValue("DescribeDomainHitRateDataResponse.DataInterval"));
		describeDomainHitRateDataResponse.setStartTime(context.stringValue("DescribeDomainHitRateDataResponse.StartTime"));
		describeDomainHitRateDataResponse.setEndTime(context.stringValue("DescribeDomainHitRateDataResponse.EndTime"));

		List<DataModule> hitRateInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainHitRateDataResponse.HitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainHitRateDataResponse.HitRateInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainHitRateDataResponse.HitRateInterval["+ i +"].Value"));

			hitRateInterval.add(dataModule);
		}
		describeDomainHitRateDataResponse.setHitRateInterval(hitRateInterval);
	 
	 	return describeDomainHitRateDataResponse;
	}
}