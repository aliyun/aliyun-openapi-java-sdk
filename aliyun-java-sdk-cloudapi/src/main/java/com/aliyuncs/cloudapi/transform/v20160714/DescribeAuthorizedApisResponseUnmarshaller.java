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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedApisResponse.AuthorizedApi;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuthorizedApisResponseUnmarshaller {

	public static DescribeAuthorizedApisResponse unmarshall(DescribeAuthorizedApisResponse describeAuthorizedApisResponse, UnmarshallerContext _ctx) {
		
		describeAuthorizedApisResponse.setRequestId(_ctx.stringValue("DescribeAuthorizedApisResponse.RequestId"));
		describeAuthorizedApisResponse.setTotalCount(_ctx.integerValue("DescribeAuthorizedApisResponse.TotalCount"));
		describeAuthorizedApisResponse.setPageSize(_ctx.integerValue("DescribeAuthorizedApisResponse.PageSize"));
		describeAuthorizedApisResponse.setPageNumber(_ctx.integerValue("DescribeAuthorizedApisResponse.PageNumber"));

		List<AuthorizedApi> authorizedApis = new ArrayList<AuthorizedApi>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuthorizedApisResponse.AuthorizedApis.Length"); i++) {
			AuthorizedApi authorizedApi = new AuthorizedApi();
			authorizedApi.setRegionId(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].RegionId"));
			authorizedApi.setGroupId(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].GroupId"));
			authorizedApi.setGroupName(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].GroupName"));
			authorizedApi.setStageName(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].StageName"));
			authorizedApi.setOperator(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].Operator"));
			authorizedApi.setApiId(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].ApiId"));
			authorizedApi.setApiName(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].ApiName"));
			authorizedApi.setAuthorizationSource(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].AuthorizationSource"));
			authorizedApi.setDescription(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].Description"));
			authorizedApi.setAuthorizedTime(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].AuthorizedTime"));
			authorizedApi.setAuthVaildTime(_ctx.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].AuthVaildTime"));

			authorizedApis.add(authorizedApi);
		}
		describeAuthorizedApisResponse.setAuthorizedApis(authorizedApis);
	 
	 	return describeAuthorizedApisResponse;
	}
}