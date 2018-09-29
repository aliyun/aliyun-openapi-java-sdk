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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHitRateDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHitRateDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainHitRateDataResponseUnmarshaller {

	public static DescribeDcdnDomainHitRateDataResponse unmarshall(DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainHitRateDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainHitRateDataResponse.RequestId"));
		describeDcdnDomainHitRateDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainHitRateDataResponse.DomainName"));
		describeDcdnDomainHitRateDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainHitRateDataResponse.StartTime"));
		describeDcdnDomainHitRateDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainHitRateDataResponse.EndTime"));
		describeDcdnDomainHitRateDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRatePerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainHitRateDataResponse.HitRatePerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].TimeStamp"));
			dataModule.setReqHitRate(context.floatValue("DescribeDcdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ReqHitRate"));
			dataModule.setByteHitRate(context.floatValue("DescribeDcdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ByteHitRate"));

			hitRatePerInterval.add(dataModule);
		}
		describeDcdnDomainHitRateDataResponse.setHitRatePerInterval(hitRatePerInterval);
	 
	 	return describeDcdnDomainHitRateDataResponse;
	}
}