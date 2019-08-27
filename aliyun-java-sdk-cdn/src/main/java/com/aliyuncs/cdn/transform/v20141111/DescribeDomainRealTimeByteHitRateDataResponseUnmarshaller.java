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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeByteHitRateDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeByteHitRateDataResponse.ByteHitRateDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeByteHitRateDataResponseUnmarshaller {

	public static DescribeDomainRealTimeByteHitRateDataResponse unmarshall(DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRealTimeByteHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRealTimeByteHitRateDataResponse.RequestId"));

		List<ByteHitRateDataModel> data = new ArrayList<ByteHitRateDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRealTimeByteHitRateDataResponse.Data.Length"); i++) {
			ByteHitRateDataModel byteHitRateDataModel = new ByteHitRateDataModel();
			byteHitRateDataModel.setByteHitRate(_ctx.floatValue("DescribeDomainRealTimeByteHitRateDataResponse.Data["+ i +"].ByteHitRate"));
			byteHitRateDataModel.setTimeStamp(_ctx.stringValue("DescribeDomainRealTimeByteHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(byteHitRateDataModel);
		}
		describeDomainRealTimeByteHitRateDataResponse.setData(data);
	 
	 	return describeDomainRealTimeByteHitRateDataResponse;
	}
}