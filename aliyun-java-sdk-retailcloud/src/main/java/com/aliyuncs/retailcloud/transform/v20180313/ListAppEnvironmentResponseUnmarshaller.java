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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAppEnvironmentResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppEnvironmentResponse.AppEnvironmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppEnvironmentResponseUnmarshaller {

	public static ListAppEnvironmentResponse unmarshall(ListAppEnvironmentResponse listAppEnvironmentResponse, UnmarshallerContext _ctx) {
		
		listAppEnvironmentResponse.setRequestId(_ctx.stringValue("ListAppEnvironmentResponse.RequestId"));
		listAppEnvironmentResponse.setCode(_ctx.integerValue("ListAppEnvironmentResponse.Code"));
		listAppEnvironmentResponse.setPageNumber(_ctx.integerValue("ListAppEnvironmentResponse.PageNumber"));
		listAppEnvironmentResponse.setPageSize(_ctx.integerValue("ListAppEnvironmentResponse.PageSize"));
		listAppEnvironmentResponse.setTotalCount(_ctx.longValue("ListAppEnvironmentResponse.TotalCount"));
		listAppEnvironmentResponse.setErrorMsg(_ctx.stringValue("ListAppEnvironmentResponse.ErrorMsg"));

		List<AppEnvironmentResponse> data = new ArrayList<AppEnvironmentResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListAppEnvironmentResponse.Data.Length"); i++) {
			AppEnvironmentResponse appEnvironmentResponse = new AppEnvironmentResponse();
			appEnvironmentResponse.setAppId(_ctx.longValue("ListAppEnvironmentResponse.Data["+ i +"].AppId"));
			appEnvironmentResponse.setEnvId(_ctx.longValue("ListAppEnvironmentResponse.Data["+ i +"].EnvId"));
			appEnvironmentResponse.setEnvName(_ctx.stringValue("ListAppEnvironmentResponse.Data["+ i +"].EnvName"));
			appEnvironmentResponse.setEnvType(_ctx.integerValue("ListAppEnvironmentResponse.Data["+ i +"].EnvType"));
			appEnvironmentResponse.setEnvTypeName(_ctx.stringValue("ListAppEnvironmentResponse.Data["+ i +"].EnvTypeName"));
			appEnvironmentResponse.setAppSchemaId(_ctx.longValue("ListAppEnvironmentResponse.Data["+ i +"].AppSchemaId"));
			appEnvironmentResponse.setRegion(_ctx.stringValue("ListAppEnvironmentResponse.Data["+ i +"].Region"));

			data.add(appEnvironmentResponse);
		}
		listAppEnvironmentResponse.setData(data);
	 
	 	return listAppEnvironmentResponse;
	}
}