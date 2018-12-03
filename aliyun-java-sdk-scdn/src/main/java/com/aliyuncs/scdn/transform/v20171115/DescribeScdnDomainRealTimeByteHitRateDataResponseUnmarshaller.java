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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeByteHitRateDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeByteHitRateDataResponse.ByteHitRateDataModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeByteHitRateDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeByteHitRateDataResponse unmarshall(DescribeScdnDomainRealTimeByteHitRateDataResponse describeScdnDomainRealTimeByteHitRateDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRealTimeByteHitRateDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRealTimeByteHitRateDataResponse.RequestId"));

		List<ByteHitRateDataModel> data = new ArrayList<ByteHitRateDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRealTimeByteHitRateDataResponse.Data.Length"); i++) {
			ByteHitRateDataModel byteHitRateDataModel = new ByteHitRateDataModel();
			byteHitRateDataModel.setByteHitRate(context.floatValue("DescribeScdnDomainRealTimeByteHitRateDataResponse.Data["+ i +"].ByteHitRate"));
			byteHitRateDataModel.setTimeStamp(context.stringValue("DescribeScdnDomainRealTimeByteHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(byteHitRateDataModel);
		}
		describeScdnDomainRealTimeByteHitRateDataResponse.setData(data);
	 
	 	return describeScdnDomainRealTimeByteHitRateDataResponse;
	}
}