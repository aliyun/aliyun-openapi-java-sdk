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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetApplicationListResponse;
import com.aliyuncs.mse.model.v20190531.GetApplicationListResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetApplicationListResponse.Data.ApplicationList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationListResponseUnmarshaller {

	public static GetApplicationListResponse unmarshall(GetApplicationListResponse getApplicationListResponse, UnmarshallerContext _ctx) {
		
		getApplicationListResponse.setRequestId(_ctx.stringValue("GetApplicationListResponse.RequestId"));
		getApplicationListResponse.setHttpStatusCode(_ctx.integerValue("GetApplicationListResponse.HttpStatusCode"));
		getApplicationListResponse.setMessage(_ctx.stringValue("GetApplicationListResponse.Message"));
		getApplicationListResponse.setCode(_ctx.integerValue("GetApplicationListResponse.Code"));
		getApplicationListResponse.setSuccess(_ctx.booleanValue("GetApplicationListResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("GetApplicationListResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("GetApplicationListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetApplicationListResponse.Data.PageSize"));

		List<ApplicationList> result = new ArrayList<ApplicationList>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationListResponse.Data.Result.Length"); i++) {
			ApplicationList applicationList = new ApplicationList();
			applicationList.setStatus(_ctx.longValue("GetApplicationListResponse.Data.Result["+ i +"].Status"));
			applicationList.setExtraInfo(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].ExtraInfo"));
			applicationList.setAppName(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].AppName"));
			applicationList.setLicenseKey(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].LicenseKey"));
			applicationList.setAppId(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].AppId"));
			applicationList.setUserId(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].UserId"));
			applicationList.setInstancesNumber(_ctx.integerValue("GetApplicationListResponse.Data.Result["+ i +"].InstancesNumber"));
			applicationList.setSource(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].Source"));
			applicationList.setLanguage(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].Language"));
			applicationList.setRegionId(_ctx.stringValue("GetApplicationListResponse.Data.Result["+ i +"].RegionId"));

			result.add(applicationList);
		}
		data.setResult(result);
		getApplicationListResponse.setData(data);
	 
	 	return getApplicationListResponse;
	}
}