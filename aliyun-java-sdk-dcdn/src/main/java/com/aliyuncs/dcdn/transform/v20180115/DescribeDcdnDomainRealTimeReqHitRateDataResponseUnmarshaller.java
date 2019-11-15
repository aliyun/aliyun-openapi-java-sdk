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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeReqHitRateDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeReqHitRateDataResponse.ReqHitRateDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeReqHitRateDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeReqHitRateDataResponse unmarshall(DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainRealTimeReqHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainRealTimeReqHitRateDataResponse.RequestId"));

		List<ReqHitRateDataModel> data = new ArrayList<ReqHitRateDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainRealTimeReqHitRateDataResponse.Data.Length"); i++) {
			ReqHitRateDataModel reqHitRateDataModel = new ReqHitRateDataModel();
			reqHitRateDataModel.setReqHitRate(_ctx.floatValue("DescribeDcdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].ReqHitRate"));
			reqHitRateDataModel.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(reqHitRateDataModel);
		}
		describeDcdnDomainRealTimeReqHitRateDataResponse.setData(data);
	 
	 	return describeDcdnDomainRealTimeReqHitRateDataResponse;
	}
}