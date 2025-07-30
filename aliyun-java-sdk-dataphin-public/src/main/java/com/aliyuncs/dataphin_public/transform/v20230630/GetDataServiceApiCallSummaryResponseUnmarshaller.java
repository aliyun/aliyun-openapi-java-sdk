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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallSummaryResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiCallSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiCallSummaryResponseUnmarshaller {

	public static GetDataServiceApiCallSummaryResponse unmarshall(GetDataServiceApiCallSummaryResponse getDataServiceApiCallSummaryResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiCallSummaryResponse.setRequestId(_ctx.stringValue("GetDataServiceApiCallSummaryResponse.RequestId"));
		getDataServiceApiCallSummaryResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiCallSummaryResponse.Success"));
		getDataServiceApiCallSummaryResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiCallSummaryResponse.HttpStatusCode"));
		getDataServiceApiCallSummaryResponse.setCode(_ctx.stringValue("GetDataServiceApiCallSummaryResponse.Code"));
		getDataServiceApiCallSummaryResponse.setMessage(_ctx.stringValue("GetDataServiceApiCallSummaryResponse.Message"));

		Data data = new Data();
		data.setCallCount(_ctx.longValue("GetDataServiceApiCallSummaryResponse.Data.CallCount"));
		data.setErrorCount(_ctx.longValue("GetDataServiceApiCallSummaryResponse.Data.ErrorCount"));
		data.setErrorRate(_ctx.doubleValue("GetDataServiceApiCallSummaryResponse.Data.ErrorRate"));
		data.setOfflineRate(_ctx.doubleValue("GetDataServiceApiCallSummaryResponse.Data.OfflineRate"));
		data.setErrorApiCount(_ctx.longValue("GetDataServiceApiCallSummaryResponse.Data.ErrorApiCount"));
		data.setErrorAppCount(_ctx.longValue("GetDataServiceApiCallSummaryResponse.Data.ErrorAppCount"));
		getDataServiceApiCallSummaryResponse.setData(data);
	 
	 	return getDataServiceApiCallSummaryResponse;
	}
}