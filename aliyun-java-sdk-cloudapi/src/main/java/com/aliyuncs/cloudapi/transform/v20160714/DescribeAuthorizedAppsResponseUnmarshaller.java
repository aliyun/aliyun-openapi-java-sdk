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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedAppsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedAppsResponse.AuthorizedApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuthorizedAppsResponseUnmarshaller {

	public static DescribeAuthorizedAppsResponse unmarshall(DescribeAuthorizedAppsResponse describeAuthorizedAppsResponse, UnmarshallerContext _ctx) {
		
		describeAuthorizedAppsResponse.setRequestId(_ctx.stringValue("DescribeAuthorizedAppsResponse.RequestId"));
		describeAuthorizedAppsResponse.setTotalCount(_ctx.integerValue("DescribeAuthorizedAppsResponse.TotalCount"));
		describeAuthorizedAppsResponse.setPageSize(_ctx.integerValue("DescribeAuthorizedAppsResponse.PageSize"));
		describeAuthorizedAppsResponse.setPageNumber(_ctx.integerValue("DescribeAuthorizedAppsResponse.PageNumber"));

		List<AuthorizedApp> authorizedApps = new ArrayList<AuthorizedApp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuthorizedAppsResponse.AuthorizedApps.Length"); i++) {
			AuthorizedApp authorizedApp = new AuthorizedApp();
			authorizedApp.setStageName(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].StageName"));
			authorizedApp.setAppId(_ctx.longValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AppId"));
			authorizedApp.setAppName(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AppName"));
			authorizedApp.setOperator(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].Operator"));
			authorizedApp.setAuthorizationSource(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AuthorizationSource"));
			authorizedApp.setDescription(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].Description"));
			authorizedApp.setAuthorizedTime(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AuthorizedTime"));
			authorizedApp.setAuthVaildTime(_ctx.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AuthVaildTime"));

			authorizedApps.add(authorizedApp);
		}
		describeAuthorizedAppsResponse.setAuthorizedApps(authorizedApps);
	 
	 	return describeAuthorizedAppsResponse;
	}
}