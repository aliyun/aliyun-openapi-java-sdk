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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAuthorizedAppsByGroupIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAuthorizedAppsByGroupIdResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAuthorizedAppsByGroupIdResponseUnmarshaller {

	public static GetDataServiceAuthorizedAppsByGroupIdResponse unmarshall(GetDataServiceAuthorizedAppsByGroupIdResponse getDataServiceAuthorizedAppsByGroupIdResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAuthorizedAppsByGroupIdResponse.setRequestId(_ctx.stringValue("GetDataServiceAuthorizedAppsByGroupIdResponse.RequestId"));
		getDataServiceAuthorizedAppsByGroupIdResponse.setSuccess(_ctx.booleanValue("GetDataServiceAuthorizedAppsByGroupIdResponse.Success"));
		getDataServiceAuthorizedAppsByGroupIdResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAuthorizedAppsByGroupIdResponse.HttpStatusCode"));
		getDataServiceAuthorizedAppsByGroupIdResponse.setCode(_ctx.stringValue("GetDataServiceAuthorizedAppsByGroupIdResponse.Code"));
		getDataServiceAuthorizedAppsByGroupIdResponse.setMessage(_ctx.stringValue("GetDataServiceAuthorizedAppsByGroupIdResponse.Message"));

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAuthorizedAppsByGroupIdResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppKey(_ctx.longValue("GetDataServiceAuthorizedAppsByGroupIdResponse.AppInfoList["+ i +"].AppKey"));
			appInfo.setId(_ctx.integerValue("GetDataServiceAuthorizedAppsByGroupIdResponse.AppInfoList["+ i +"].Id"));
			appInfo.setName(_ctx.stringValue("GetDataServiceAuthorizedAppsByGroupIdResponse.AppInfoList["+ i +"].Name"));

			appInfoList.add(appInfo);
		}
		getDataServiceAuthorizedAppsByGroupIdResponse.setAppInfoList(appInfoList);
	 
	 	return getDataServiceAuthorizedAppsByGroupIdResponse;
	}
}