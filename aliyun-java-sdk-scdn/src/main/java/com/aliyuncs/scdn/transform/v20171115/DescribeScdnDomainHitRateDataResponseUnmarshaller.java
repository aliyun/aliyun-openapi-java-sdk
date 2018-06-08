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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHitRateDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainHitRateDataResponseUnmarshaller {

	public static DescribeScdnDomainHitRateDataResponse unmarshall(DescribeScdnDomainHitRateDataResponse describeScdnDomainHitRateDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainHitRateDataResponse.setRequestId(context.stringValue("DescribeScdnDomainHitRateDataResponse.RequestId"));
		describeScdnDomainHitRateDataResponse.setDomainName(context.stringValue("DescribeScdnDomainHitRateDataResponse.DomainName"));
		describeScdnDomainHitRateDataResponse.setStartTime(context.stringValue("DescribeScdnDomainHitRateDataResponse.StartTime"));
		describeScdnDomainHitRateDataResponse.setEndTime(context.stringValue("DescribeScdnDomainHitRateDataResponse.EndTime"));
		describeScdnDomainHitRateDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRatePerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].TimeStamp"));
			dataModule.setReqHitRate(context.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ReqHitRate"));
			dataModule.setByteHitRate(context.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ByteHitRate"));

			hitRatePerInterval.add(dataModule);
		}
		describeScdnDomainHitRateDataResponse.setHitRatePerInterval(hitRatePerInterval);
	 
	 	return describeScdnDomainHitRateDataResponse;
	}
}