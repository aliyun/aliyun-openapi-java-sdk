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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeByteHitRateDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeByteHitRateDataResponse.ByteHitRateDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeByteHitRateDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeByteHitRateDataResponse unmarshall(DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainRealTimeByteHitRateDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainRealTimeByteHitRateDataResponse.RequestId"));

		List<ByteHitRateDataModel> data = new ArrayList<ByteHitRateDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainRealTimeByteHitRateDataResponse.Data.Length"); i++) {
			ByteHitRateDataModel byteHitRateDataModel = new ByteHitRateDataModel();
			byteHitRateDataModel.setByteHitRate(context.floatValue("DescribeDcdnDomainRealTimeByteHitRateDataResponse.Data["+ i +"].ByteHitRate"));
			byteHitRateDataModel.setTimeStamp(context.stringValue("DescribeDcdnDomainRealTimeByteHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(byteHitRateDataModel);
		}
		describeDcdnDomainRealTimeByteHitRateDataResponse.setData(data);
	 
	 	return describeDcdnDomainRealTimeByteHitRateDataResponse;
	}
}