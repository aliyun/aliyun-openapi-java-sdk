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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppsByGroupIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppsByGroupIdResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAppsByGroupIdResponseUnmarshaller {

	public static GetDataServiceAppsByGroupIdResponse unmarshall(GetDataServiceAppsByGroupIdResponse getDataServiceAppsByGroupIdResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAppsByGroupIdResponse.setRequestId(_ctx.stringValue("GetDataServiceAppsByGroupIdResponse.RequestId"));
		getDataServiceAppsByGroupIdResponse.setSuccess(_ctx.booleanValue("GetDataServiceAppsByGroupIdResponse.Success"));
		getDataServiceAppsByGroupIdResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAppsByGroupIdResponse.HttpStatusCode"));
		getDataServiceAppsByGroupIdResponse.setCode(_ctx.stringValue("GetDataServiceAppsByGroupIdResponse.Code"));
		getDataServiceAppsByGroupIdResponse.setMessage(_ctx.stringValue("GetDataServiceAppsByGroupIdResponse.Message"));

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAppsByGroupIdResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setId(_ctx.integerValue("GetDataServiceAppsByGroupIdResponse.AppInfoList["+ i +"].Id"));
			appInfo.setName(_ctx.stringValue("GetDataServiceAppsByGroupIdResponse.AppInfoList["+ i +"].Name"));

			appInfoList.add(appInfo);
		}
		getDataServiceAppsByGroupIdResponse.setAppInfoList(appInfoList);
	 
	 	return getDataServiceAppsByGroupIdResponse;
	}
}