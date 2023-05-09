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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.ListAnalyticsDataResponse;
import com.aliyuncs.iot.model.v20180120.ListAnalyticsDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnalyticsDataResponseUnmarshaller {

	public static ListAnalyticsDataResponse unmarshall(ListAnalyticsDataResponse listAnalyticsDataResponse, UnmarshallerContext _ctx) {
		
		listAnalyticsDataResponse.setRequestId(_ctx.stringValue("ListAnalyticsDataResponse.RequestId"));
		listAnalyticsDataResponse.setCode(_ctx.stringValue("ListAnalyticsDataResponse.Code"));
		listAnalyticsDataResponse.setErrorMessage(_ctx.stringValue("ListAnalyticsDataResponse.ErrorMessage"));
		listAnalyticsDataResponse.setSuccess(_ctx.booleanValue("ListAnalyticsDataResponse.Success"));

		Data data = new Data();
		data.setResultJson(_ctx.stringValue("ListAnalyticsDataResponse.Data.ResultJson"));
		data.setPageNum(_ctx.integerValue("ListAnalyticsDataResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListAnalyticsDataResponse.Data.PageSize"));
		data.setCount(_ctx.longValue("ListAnalyticsDataResponse.Data.Count"));
		data.setHasNext(_ctx.booleanValue("ListAnalyticsDataResponse.Data.HasNext"));
		listAnalyticsDataResponse.setData(data);
	 
	 	return listAnalyticsDataResponse;
	}
}