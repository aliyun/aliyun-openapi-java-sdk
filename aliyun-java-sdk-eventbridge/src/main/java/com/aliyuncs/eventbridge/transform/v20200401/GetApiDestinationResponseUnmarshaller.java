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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.GetApiDestinationResponse;
import com.aliyuncs.eventbridge.model.v20200401.GetApiDestinationResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.GetApiDestinationResponse.Data.HttpApiParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetApiDestinationResponse.Data.HttpApiParameters.ApiParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiDestinationResponseUnmarshaller {

	public static GetApiDestinationResponse unmarshall(GetApiDestinationResponse getApiDestinationResponse, UnmarshallerContext _ctx) {
		
		getApiDestinationResponse.setRequestId(_ctx.stringValue("GetApiDestinationResponse.RequestId"));
		getApiDestinationResponse.setMessage(_ctx.stringValue("GetApiDestinationResponse.Message"));
		getApiDestinationResponse.setCode(_ctx.stringValue("GetApiDestinationResponse.Code"));

		Data data = new Data();
		data.setApiDestinationName(_ctx.stringValue("GetApiDestinationResponse.Data.ApiDestinationName"));
		data.setConnectionName(_ctx.stringValue("GetApiDestinationResponse.Data.ConnectionName"));
		data.setDescription(_ctx.stringValue("GetApiDestinationResponse.Data.Description"));
		data.setInvocationRateLimitPerSecond(_ctx.longValue("GetApiDestinationResponse.Data.InvocationRateLimitPerSecond"));
		data.setGmtCreate(_ctx.longValue("GetApiDestinationResponse.Data.GmtCreate"));

		HttpApiParameters httpApiParameters = new HttpApiParameters();
		httpApiParameters.setEndpoint(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.Endpoint"));
		httpApiParameters.setBizMethod(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.Method"));

		List<ApiParametersItem> apiParameters = new ArrayList<ApiParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetApiDestinationResponse.Data.HttpApiParameters.ApiParameters.Length"); i++) {
			ApiParametersItem apiParametersItem = new ApiParametersItem();
			apiParametersItem.setName(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.ApiParameters["+ i +"].Name"));
			apiParametersItem.setDescription(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.ApiParameters["+ i +"].Description"));
			apiParametersItem.setType(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.ApiParameters["+ i +"].Type"));
			apiParametersItem.setIn(_ctx.stringValue("GetApiDestinationResponse.Data.HttpApiParameters.ApiParameters["+ i +"].In"));

			apiParameters.add(apiParametersItem);
		}
		httpApiParameters.setApiParameters(apiParameters);
		data.setHttpApiParameters(httpApiParameters);
		getApiDestinationResponse.setData(data);
	 
	 	return getApiDestinationResponse;
	}
}