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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiErrorImpactResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiErrorImpactResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiErrorImpactResponse.Data.ErrorApi;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiErrorImpactResponse.Data.ErrorApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiErrorImpactResponseUnmarshaller {

	public static GetDataServiceApiErrorImpactResponse unmarshall(GetDataServiceApiErrorImpactResponse getDataServiceApiErrorImpactResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiErrorImpactResponse.setRequestId(_ctx.stringValue("GetDataServiceApiErrorImpactResponse.RequestId"));
		getDataServiceApiErrorImpactResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiErrorImpactResponse.Success"));
		getDataServiceApiErrorImpactResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiErrorImpactResponse.HttpStatusCode"));
		getDataServiceApiErrorImpactResponse.setCode(_ctx.stringValue("GetDataServiceApiErrorImpactResponse.Code"));
		getDataServiceApiErrorImpactResponse.setMessage(_ctx.stringValue("GetDataServiceApiErrorImpactResponse.Message"));

		Data data = new Data();

		List<ErrorApp> errorAppList = new ArrayList<ErrorApp>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiErrorImpactResponse.Data.ErrorAppList.Length"); i++) {
			ErrorApp errorApp = new ErrorApp();
			errorApp.setAppId(_ctx.integerValue("GetDataServiceApiErrorImpactResponse.Data.ErrorAppList["+ i +"].AppId"));
			errorApp.setAppKey(_ctx.longValue("GetDataServiceApiErrorImpactResponse.Data.ErrorAppList["+ i +"].AppKey"));
			errorApp.setErrorCount(_ctx.longValue("GetDataServiceApiErrorImpactResponse.Data.ErrorAppList["+ i +"].ErrorCount"));
			errorApp.setAppName(_ctx.stringValue("GetDataServiceApiErrorImpactResponse.Data.ErrorAppList["+ i +"].AppName"));

			errorAppList.add(errorApp);
		}
		data.setErrorAppList(errorAppList);

		List<ErrorApi> errorApiList = new ArrayList<ErrorApi>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiErrorImpactResponse.Data.ErrorApiList.Length"); i++) {
			ErrorApi errorApi = new ErrorApi();
			errorApi.setAppId(_ctx.longValue("GetDataServiceApiErrorImpactResponse.Data.ErrorApiList["+ i +"].AppId"));
			errorApi.setApiName(_ctx.stringValue("GetDataServiceApiErrorImpactResponse.Data.ErrorApiList["+ i +"].ApiName"));
			errorApi.setErrorCount(_ctx.longValue("GetDataServiceApiErrorImpactResponse.Data.ErrorApiList["+ i +"].ErrorCount"));

			errorApiList.add(errorApi);
		}
		data.setErrorApiList(errorApiList);
		getDataServiceApiErrorImpactResponse.setData(data);
	 
	 	return getDataServiceApiErrorImpactResponse;
	}
}