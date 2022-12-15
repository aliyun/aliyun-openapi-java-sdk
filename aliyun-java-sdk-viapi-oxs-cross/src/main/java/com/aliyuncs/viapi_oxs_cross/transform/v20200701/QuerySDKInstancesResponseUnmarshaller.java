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

package com.aliyuncs.viapi_oxs_cross.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi_oxs_cross.model.v20200701.QuerySDKInstancesResponse;
import com.aliyuncs.viapi_oxs_cross.model.v20200701.QuerySDKInstancesResponse.Data;
import com.aliyuncs.viapi_oxs_cross.model.v20200701.QuerySDKInstancesResponse.Data.SDKInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySDKInstancesResponseUnmarshaller {

	public static QuerySDKInstancesResponse unmarshall(QuerySDKInstancesResponse querySDKInstancesResponse, UnmarshallerContext _ctx) {
		
		querySDKInstancesResponse.setRequestId(_ctx.stringValue("QuerySDKInstancesResponse.RequestId"));
		querySDKInstancesResponse.setOk(_ctx.booleanValue("QuerySDKInstancesResponse.Ok"));
		querySDKInstancesResponse.setCode(_ctx.stringValue("QuerySDKInstancesResponse.Code"));
		querySDKInstancesResponse.setHttpCode(_ctx.integerValue("QuerySDKInstancesResponse.HttpCode"));
		querySDKInstancesResponse.setErrorMessage(_ctx.stringValue("QuerySDKInstancesResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("QuerySDKInstancesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("QuerySDKInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QuerySDKInstancesResponse.Data.TotalCount"));

		List<SDKInstance> content = new ArrayList<SDKInstance>();
		for (int i = 0; i < _ctx.lengthValue("QuerySDKInstancesResponse.Data.Content.Length"); i++) {
			SDKInstance sDKInstance = new SDKInstance();
			sDKInstance.setStatus(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].Status"));
			sDKInstance.setLatestBuild(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].LatestBuild"));
			sDKInstance.setValidFromDate(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].ValidFromDate"));
			sDKInstance.setValidToDate(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].ValidToDate"));
			sDKInstance.setUserId(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].UserId"));
			sDKInstance.setPlatform(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].Platform"));
			sDKInstance.setCreatedAt(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].CreatedAt"));
			sDKInstance.setRecipe(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].Recipe"));
			sDKInstance.setUpdatedAt(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].UpdatedAt"));
			sDKInstance.setInstanceId(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].InstanceId"));
			sDKInstance.setBundleId(_ctx.stringValue("QuerySDKInstancesResponse.Data.Content["+ i +"].BundleId"));

			content.add(sDKInstance);
		}
		data.setContent(content);
		querySDKInstancesResponse.setData(data);
	 
	 	return querySDKInstancesResponse;
	}
}