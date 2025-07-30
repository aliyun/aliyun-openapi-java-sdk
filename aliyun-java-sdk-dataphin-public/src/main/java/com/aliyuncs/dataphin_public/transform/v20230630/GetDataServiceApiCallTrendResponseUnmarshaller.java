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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallTrendResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallTrendResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrend;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallTrendResponse.Data.CallErrorTrend;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiCallTrendResponseUnmarshaller {

	public static GetDataServiceApiCallTrendResponse unmarshall(GetDataServiceApiCallTrendResponse getDataServiceApiCallTrendResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiCallTrendResponse.setRequestId(_ctx.stringValue("GetDataServiceApiCallTrendResponse.RequestId"));
		getDataServiceApiCallTrendResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiCallTrendResponse.Success"));
		getDataServiceApiCallTrendResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiCallTrendResponse.HttpStatusCode"));
		getDataServiceApiCallTrendResponse.setCode(_ctx.stringValue("GetDataServiceApiCallTrendResponse.Code"));
		getDataServiceApiCallTrendResponse.setMessage(_ctx.stringValue("GetDataServiceApiCallTrendResponse.Message"));

		Data data = new Data();

		List<CallErrorTrend> callErrorTrendList = new ArrayList<CallErrorTrend>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiCallTrendResponse.Data.CallErrorTrendList.Length"); i++) {
			CallErrorTrend callErrorTrend = new CallErrorTrend();
			callErrorTrend.setMinute(_ctx.stringValue("GetDataServiceApiCallTrendResponse.Data.CallErrorTrendList["+ i +"].Minute"));
			callErrorTrend.setCallCount(_ctx.longValue("GetDataServiceApiCallTrendResponse.Data.CallErrorTrendList["+ i +"].CallCount"));
			callErrorTrend.setErrorCount(_ctx.longValue("GetDataServiceApiCallTrendResponse.Data.CallErrorTrendList["+ i +"].ErrorCount"));

			callErrorTrendList.add(callErrorTrend);
		}
		data.setCallErrorTrendList(callErrorTrendList);

		List<CallErrorImpactTrend> callErrorImpactTrendList = new ArrayList<CallErrorImpactTrend>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList.Length"); i++) {
			CallErrorImpactTrend callErrorImpactTrend = new CallErrorImpactTrend();
			callErrorImpactTrend.setErrorApiCount(_ctx.integerValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList["+ i +"].ErrorApiCount"));
			callErrorImpactTrend.setMinute(_ctx.stringValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList["+ i +"].Minute"));
			callErrorImpactTrend.setErrorAppCount(_ctx.integerValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList["+ i +"].ErrorAppCount"));

			List<Long> apiIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList["+ i +"].ApiIdList.Length"); j++) {
				apiIdList.add(_ctx.longValue("GetDataServiceApiCallTrendResponse.Data.CallErrorImpactTrendList["+ i +"].ApiIdList["+ j +"]"));
			}
			callErrorImpactTrend.setApiIdList(apiIdList);

			callErrorImpactTrendList.add(callErrorImpactTrend);
		}
		data.setCallErrorImpactTrendList(callErrorImpactTrendList);
		getDataServiceApiCallTrendResponse.setData(data);
	 
	 	return getDataServiceApiCallTrendResponse;
	}
}