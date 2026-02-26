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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsByApiProductResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsByApiProductResponse.AuthorizedApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppsByApiProductResponseUnmarshaller {

	public static DescribeAppsByApiProductResponse unmarshall(DescribeAppsByApiProductResponse describeAppsByApiProductResponse, UnmarshallerContext _ctx) {
		
		describeAppsByApiProductResponse.setRequestId(_ctx.stringValue("DescribeAppsByApiProductResponse.RequestId"));
		describeAppsByApiProductResponse.setPageSize(_ctx.integerValue("DescribeAppsByApiProductResponse.PageSize"));
		describeAppsByApiProductResponse.setPageNumber(_ctx.integerValue("DescribeAppsByApiProductResponse.PageNumber"));
		describeAppsByApiProductResponse.setTotalCount(_ctx.integerValue("DescribeAppsByApiProductResponse.TotalCount"));

		List<AuthorizedApp> authorizedApps = new ArrayList<AuthorizedApp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppsByApiProductResponse.AuthorizedApps.Length"); i++) {
			AuthorizedApp authorizedApp = new AuthorizedApp();
			authorizedApp.setAppName(_ctx.stringValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].AppName"));
			authorizedApp.setDescription(_ctx.stringValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].Description"));
			authorizedApp.setAuthValidTime(_ctx.stringValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].AuthValidTime"));
			authorizedApp.setAppId(_ctx.longValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].AppId"));
			authorizedApp.setExtend(_ctx.stringValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].Extend"));
			authorizedApp.setAuthorizedTime(_ctx.stringValue("DescribeAppsByApiProductResponse.AuthorizedApps["+ i +"].AuthorizedTime"));

			authorizedApps.add(authorizedApp);
		}
		describeAppsByApiProductResponse.setAuthorizedApps(authorizedApps);
	 
	 	return describeAppsByApiProductResponse;
	}
}