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

import com.aliyuncs.eventbridge.model.v20200401.ListApiDestinationsResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListApiDestinationsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListApiDestinationsResponse.Data.ApiDestinationsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListApiDestinationsResponse.Data.ApiDestinationsItem.HttpApiParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListApiDestinationsResponse.Data.ApiDestinationsItem.HttpApiParameters.ApiParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiDestinationsResponseUnmarshaller {

	public static ListApiDestinationsResponse unmarshall(ListApiDestinationsResponse listApiDestinationsResponse, UnmarshallerContext _ctx) {
		
		listApiDestinationsResponse.setRequestId(_ctx.stringValue("ListApiDestinationsResponse.RequestId"));
		listApiDestinationsResponse.setMessage(_ctx.stringValue("ListApiDestinationsResponse.Message"));
		listApiDestinationsResponse.setCode(_ctx.stringValue("ListApiDestinationsResponse.Code"));

		Data data = new Data();

		List<ApiDestinationsItem> apiDestinations = new ArrayList<ApiDestinationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApiDestinationsResponse.Data.ApiDestinations.Length"); i++) {
			ApiDestinationsItem apiDestinationsItem = new ApiDestinationsItem();
			apiDestinationsItem.setApiDestinationName(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].ApiDestinationName"));
			apiDestinationsItem.setConnectionName(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].ConnectionName"));
			apiDestinationsItem.setDescription(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].Description"));
			apiDestinationsItem.setGmtCreate(_ctx.longValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].GmtCreate"));
			apiDestinationsItem.setInvocationRateLimitPerSecond(_ctx.longValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].InvocationRateLimitPerSecond"));

			HttpApiParameters httpApiParameters = new HttpApiParameters();
			httpApiParameters.setEndpoint(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.Endpoint"));
			httpApiParameters.setBizMethod(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.Method"));

			List<ApiParametersItem> apiParameters = new ArrayList<ApiParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters.Length"); j++) {
				ApiParametersItem apiParametersItem = new ApiParametersItem();
				apiParametersItem.setName(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters["+ j +"].Name"));
				apiParametersItem.setDescription(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters["+ j +"].Description"));
				apiParametersItem.setType(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters["+ j +"].Type"));
				apiParametersItem.setDefaultValue(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters["+ j +"].DefaultValue"));
				apiParametersItem.setIn(_ctx.stringValue("ListApiDestinationsResponse.Data.ApiDestinations["+ i +"].HttpApiParameters.ApiParameters["+ j +"].In"));

				apiParameters.add(apiParametersItem);
			}
			httpApiParameters.setApiParameters(apiParameters);
			apiDestinationsItem.setHttpApiParameters(httpApiParameters);

			apiDestinations.add(apiDestinationsItem);
		}
		data.setApiDestinations(apiDestinations);
		listApiDestinationsResponse.setData(data);
	 
	 	return listApiDestinationsResponse;
	}
}