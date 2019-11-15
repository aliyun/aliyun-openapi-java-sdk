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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeReqHitRateDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeReqHitRateDataResponse.ReqHitRateDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeReqHitRateDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeReqHitRateDataResponse unmarshall(DescribeScdnDomainRealTimeReqHitRateDataResponse describeScdnDomainRealTimeReqHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRealTimeReqHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.RequestId"));

		List<ReqHitRateDataModel> data = new ArrayList<ReqHitRateDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data.Length"); i++) {
			ReqHitRateDataModel reqHitRateDataModel = new ReqHitRateDataModel();
			reqHitRateDataModel.setReqHitRate(_ctx.floatValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].ReqHitRate"));
			reqHitRateDataModel.setTimeStamp(_ctx.stringValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(reqHitRateDataModel);
		}
		describeScdnDomainRealTimeReqHitRateDataResponse.setData(data);
	 
	 	return describeScdnDomainRealTimeReqHitRateDataResponse;
	}
}