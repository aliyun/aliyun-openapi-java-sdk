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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryUserSummariesResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryUserSummariesResponse.UserSummary;
import com.aliyuncs.advisor_share.model.v20180608.QueryUserSummariesResponse.UserSummary.OwnedResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserSummariesResponseUnmarshaller {

	public static QueryUserSummariesResponse unmarshall(QueryUserSummariesResponse queryUserSummariesResponse, UnmarshallerContext _ctx) {
		
		queryUserSummariesResponse.setRequestId(_ctx.stringValue("QueryUserSummariesResponse.RequestId"));

		List<UserSummary> data = new ArrayList<UserSummary>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserSummariesResponse.Data.Length"); i++) {
			UserSummary userSummary = new UserSummary();
			userSummary.setGcLevel(_ctx.stringValue("QueryUserSummariesResponse.Data["+ i +"].GcLevel"));
			userSummary.setAdviceCount(_ctx.longValue("QueryUserSummariesResponse.Data["+ i +"].AdviceCount"));
			userSummary.setConversionRate(_ctx.floatValue("QueryUserSummariesResponse.Data["+ i +"].ConversionRate"));
			userSummary.setDetailViewCount(_ctx.longValue("QueryUserSummariesResponse.Data["+ i +"].DetailViewCount"));
			userSummary.setAliyunId(_ctx.longValue("QueryUserSummariesResponse.Data["+ i +"].AliyunId"));
			userSummary.setUserName(_ctx.stringValue("QueryUserSummariesResponse.Data["+ i +"].UserName"));
			userSummary.setAcceptedCount(_ctx.longValue("QueryUserSummariesResponse.Data["+ i +"].AcceptedCount"));

			List<OwnedResourcesItem> ownedResources = new ArrayList<OwnedResourcesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryUserSummariesResponse.Data["+ i +"].OwnedResources.Length"); j++) {
				OwnedResourcesItem ownedResourcesItem = new OwnedResourcesItem();
				ownedResourcesItem.setValue(_ctx.stringValue("QueryUserSummariesResponse.Data["+ i +"].OwnedResources["+ j +"].Value"));
				ownedResourcesItem.setPercent(_ctx.floatValue("QueryUserSummariesResponse.Data["+ i +"].OwnedResources["+ j +"].Percent"));
				ownedResourcesItem.setName(_ctx.stringValue("QueryUserSummariesResponse.Data["+ i +"].OwnedResources["+ j +"].Name"));

				ownedResources.add(ownedResourcesItem);
			}
			userSummary.setOwnedResources(ownedResources);

			data.add(userSummary);
		}
		queryUserSummariesResponse.setData(data);
	 
	 	return queryUserSummariesResponse;
	}
}