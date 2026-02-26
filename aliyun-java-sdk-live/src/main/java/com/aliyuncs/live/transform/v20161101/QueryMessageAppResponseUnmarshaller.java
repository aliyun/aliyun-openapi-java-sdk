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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.QueryMessageAppResponse;
import com.aliyuncs.live.model.v20161101.QueryMessageAppResponse.ResultItem;
import com.aliyuncs.live.model.v20161101.QueryMessageAppResponse.ResultItem.AppListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMessageAppResponseUnmarshaller {

	public static QueryMessageAppResponse unmarshall(QueryMessageAppResponse queryMessageAppResponse, UnmarshallerContext _ctx) {
		
		queryMessageAppResponse.setRequestId(_ctx.stringValue("QueryMessageAppResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMessageAppResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setHasMore(_ctx.booleanValue("QueryMessageAppResponse.Result["+ i +"].HasMore"));
			resultItem.setTotalCount(_ctx.integerValue("QueryMessageAppResponse.Result["+ i +"].TotalCount"));

			List<AppListItem> appList = new ArrayList<AppListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMessageAppResponse.Result["+ i +"].AppList.Length"); j++) {
				AppListItem appListItem = new AppListItem();
				appListItem.setAppConfig(_ctx.mapValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].AppConfig"));
				appListItem.setAppId(_ctx.stringValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].AppId"));
				appListItem.setAppName(_ctx.stringValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].AppName"));
				appListItem.setCreateTime(_ctx.longValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].CreateTime"));
				appListItem.setExtension(_ctx.mapValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].Extension"));
				appListItem.setStatus(_ctx.integerValue("QueryMessageAppResponse.Result["+ i +"].AppList["+ j +"].Status"));

				appList.add(appListItem);
			}
			resultItem.setAppList(appList);

			result.add(resultItem);
		}
		queryMessageAppResponse.setResult(result);
	 
	 	return queryMessageAppResponse;
	}
}