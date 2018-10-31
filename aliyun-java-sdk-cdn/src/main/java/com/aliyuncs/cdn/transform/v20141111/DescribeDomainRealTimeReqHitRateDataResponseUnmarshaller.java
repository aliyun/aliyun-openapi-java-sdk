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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeReqHitRateDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeReqHitRateDataResponse.ReqHitRateDataModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeReqHitRateDataResponseUnmarshaller {

	public static DescribeDomainRealTimeReqHitRateDataResponse unmarshall(DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeReqHitRateDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeReqHitRateDataResponse.RequestId"));

		List<ReqHitRateDataModel> data = new ArrayList<ReqHitRateDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeReqHitRateDataResponse.Data.Length"); i++) {
			ReqHitRateDataModel reqHitRateDataModel = new ReqHitRateDataModel();
			reqHitRateDataModel.setReqHitRate(context.floatValue("DescribeDomainRealTimeReqHitRateDataResponse.Data["+ i +"].ReqHitRate"));
			reqHitRateDataModel.setTimeStamp(context.stringValue("DescribeDomainRealTimeReqHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(reqHitRateDataModel);
		}
		describeDomainRealTimeReqHitRateDataResponse.setData(data);
	 
	 	return describeDomainRealTimeReqHitRateDataResponse;
	}
}