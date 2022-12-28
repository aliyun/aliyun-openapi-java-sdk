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

package com.aliyuncs.es_serverless.transform.v20220822;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.es_serverless.model.v20220822.ListAppsResponse;
import com.aliyuncs.es_serverless.model.v20220822.ListAppsResponse.App;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setTotalCount(_ctx.integerValue("ListAppsResponse.totalCount"));
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.requestId"));

		List<App> result = new ArrayList<App>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.result.Length"); i++) {
			App app = new App();
			app.setAppName(_ctx.stringValue("ListAppsResponse.result["+ i +"].appName"));
			app.setOwnerId(_ctx.stringValue("ListAppsResponse.result["+ i +"].ownerId"));
			app.setStorageQuota(_ctx.stringValue("ListAppsResponse.result["+ i +"].storageQuota"));
			app.setRegionId(_ctx.stringValue("ListAppsResponse.result["+ i +"].regionId"));
			app.setStatus(_ctx.stringValue("ListAppsResponse.result["+ i +"].status"));
			app.setCreateTime(_ctx.stringValue("ListAppsResponse.result["+ i +"].createTime"));
			app.setFlowQuota(_ctx.stringValue("ListAppsResponse.result["+ i +"].flowQuota"));
			app.setDescription(_ctx.stringValue("ListAppsResponse.result["+ i +"].description"));

			result.add(app);
		}
		listAppsResponse.setResult(result);
	 
	 	return listAppsResponse;
	}
}