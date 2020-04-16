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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeDingTalkResponse;
import com.aliyuncs.sas.model.v20181203.DescribeDingTalkResponse.ActionListArr;
import com.aliyuncs.sas.model.v20181203.DescribeDingTalkResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDingTalkResponseUnmarshaller {

	public static DescribeDingTalkResponse unmarshall(DescribeDingTalkResponse describeDingTalkResponse, UnmarshallerContext _ctx) {
		
		describeDingTalkResponse.setRequestId(_ctx.stringValue("DescribeDingTalkResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("DescribeDingTalkResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeDingTalkResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeDingTalkResponse.PageInfo.CurrentPage"));
		describeDingTalkResponse.setPageInfo(pageInfo);

		List<ActionListArr> actionList = new ArrayList<ActionListArr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDingTalkResponse.ActionList.Length"); i++) {
			ActionListArr actionListArr = new ActionListArr();
			actionListArr.setGmtModified(_ctx.longValue("DescribeDingTalkResponse.ActionList["+ i +"].GmtModified"));
			actionListArr.setId(_ctx.integerValue("DescribeDingTalkResponse.ActionList["+ i +"].Id"));
			actionListArr.setAliUid(_ctx.longValue("DescribeDingTalkResponse.ActionList["+ i +"].AliUid"));
			actionListArr.setGmtCreate(_ctx.longValue("DescribeDingTalkResponse.ActionList["+ i +"].GmtCreate"));
			actionListArr.setUrl(_ctx.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].Url"));
			actionListArr.setIntervalTime(_ctx.integerValue("DescribeDingTalkResponse.ActionList["+ i +"].IntervalTime"));
			actionListArr.setActionName(_ctx.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].ActionName"));
			actionListArr.setStatus(_ctx.integerValue("DescribeDingTalkResponse.ActionList["+ i +"].Status"));
			actionListArr.setConfigList(_ctx.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].ConfigList"));
			actionListArr.setGroupIdList(_ctx.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].GroupIdList"));
			actionListArr.setDingTalkLang(_ctx.stringValue("DescribeDingTalkResponse.ActionList["+ i +"].DingTalkLang"));

			actionList.add(actionListArr);
		}
		describeDingTalkResponse.setActionList(actionList);
	 
	 	return describeDingTalkResponse;
	}
}