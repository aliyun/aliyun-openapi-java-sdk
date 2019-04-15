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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeDingTalkResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeDingTalkResponse.ActionListItem;
import com.aliyuncs.aegis.model.v20161111.DescribeDingTalkResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDingTalkResponseUnmarshaller {

	public static DescribeDingTalkResponse unmarshall(DescribeDingTalkResponse describeDingTalkResponse, UnmarshallerContext context) {
		
		describeDingTalkResponse.setRequestId(context.stringValue("DescribeDingTalkResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(context.integerValue("DescribeDingTalkResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("DescribeDingTalkResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(context.integerValue("DescribeDingTalkResponse.PageInfo.CurrentPage"));
		describeDingTalkResponse.setPageInfo(pageInfo);

		List<ActionListItem> actionList = new ArrayList<ActionListItem>();
		for (int i = 0; i < context.lengthValue("DescribeDingTalkResponse.ActionList.Length"); i++) {
			ActionListItem actionListItem = new ActionListItem();
			actionListItem.setGmtModified(context.longValue("DescribeDingTalkResponse.ActionList["+ i +"].GmtModified"));
			actionListItem.setId(context.integerValue("DescribeDingTalkResponse.ActionList["+ i +"].Id"));
			actionListItem.setAliUid(context.longValue("DescribeDingTalkResponse.ActionList["+ i +"].AliUid"));
			actionListItem.setGmtCreate(context.longValue("DescribeDingTalkResponse.ActionList["+ i +"].GmtCreate"));
			actionListItem.setUrl(context.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].Url"));
			actionListItem.setIntervalTime(context.integerValue("DescribeDingTalkResponse.ActionList["+ i +"].IntervalTime"));
			actionListItem.setActionName(context.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].ActionName"));

			actionList.add(actionListItem);
		}
		describeDingTalkResponse.setActionList(actionList);
	 
	 	return describeDingTalkResponse;
	}
}