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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeReqHitRateDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeReqHitRateDataResponse unmarshall(DescribeScdnDomainRealTimeReqHitRateDataResponse describeScdnDomainRealTimeReqHitRateDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRealTimeReqHitRateDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.RequestId"));

		List<ReqHitRateDataModel> data = new ArrayList<ReqHitRateDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data.Length"); i++) {
			ReqHitRateDataModel reqHitRateDataModel = new ReqHitRateDataModel();
			reqHitRateDataModel.setReqHitRate(context.floatValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].ReqHitRate"));
			reqHitRateDataModel.setTimeStamp(context.stringValue("DescribeScdnDomainRealTimeReqHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(reqHitRateDataModel);
		}
		describeScdnDomainRealTimeReqHitRateDataResponse.setData(data);
	 
	 	return describeScdnDomainRealTimeReqHitRateDataResponse;
	}
}