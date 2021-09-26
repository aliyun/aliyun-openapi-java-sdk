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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceAuthorizedApisResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceAuthorizedApisResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceAuthorizedApisResponse.Data.ApiAuthorized;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceAuthorizedApisResponseUnmarshaller {

	public static ListDataServiceAuthorizedApisResponse unmarshall(ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApisResponse, UnmarshallerContext _ctx) {
		
		listDataServiceAuthorizedApisResponse.setRequestId(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.RequestId"));
		listDataServiceAuthorizedApisResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceAuthorizedApisResponse.HttpStatusCode"));
		listDataServiceAuthorizedApisResponse.setErrorMessage(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.ErrorMessage"));
		listDataServiceAuthorizedApisResponse.setSuccess(_ctx.booleanValue("ListDataServiceAuthorizedApisResponse.Success"));
		listDataServiceAuthorizedApisResponse.setErrorCode(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataServiceAuthorizedApisResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataServiceAuthorizedApisResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataServiceAuthorizedApisResponse.Data.TotalCount"));

		List<ApiAuthorized> apiAuthorizedList = new ArrayList<ApiAuthorized>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList.Length"); i++) {
			ApiAuthorized apiAuthorized = new ApiAuthorized();
			apiAuthorized.setApiId(_ctx.longValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ApiId"));
			apiAuthorized.setApiStatus(_ctx.integerValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ApiStatus"));
			apiAuthorized.setGrantOperatorId(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].GrantOperatorId"));
			apiAuthorized.setProjectId(_ctx.longValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ProjectId"));
			apiAuthorized.setCreatorId(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].CreatorId"));
			apiAuthorized.setGrantEndTime(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].GrantEndTime"));
			apiAuthorized.setModifiedTime(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ModifiedTime"));
			apiAuthorized.setGroupId(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].GroupId"));
			apiAuthorized.setGrantCreatedTime(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].GrantCreatedTime"));
			apiAuthorized.setCreatedTime(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].CreatedTime"));
			apiAuthorized.setApiName(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ApiName"));
			apiAuthorized.setTenantId(_ctx.longValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].TenantId"));
			apiAuthorized.setApiPath(_ctx.stringValue("ListDataServiceAuthorizedApisResponse.Data.ApiAuthorizedList["+ i +"].ApiPath"));

			apiAuthorizedList.add(apiAuthorized);
		}
		data.setApiAuthorizedList(apiAuthorizedList);
		listDataServiceAuthorizedApisResponse.setData(data);
	 
	 	return listDataServiceAuthorizedApisResponse;
	}
}