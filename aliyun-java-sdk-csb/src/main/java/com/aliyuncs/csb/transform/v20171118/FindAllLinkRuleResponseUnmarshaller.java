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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindAllLinkRuleResponse;
import com.aliyuncs.csb.model.v20171118.FindAllLinkRuleResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindAllLinkRuleResponse.Data.LinkRuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAllLinkRuleResponseUnmarshaller {

	public static FindAllLinkRuleResponse unmarshall(FindAllLinkRuleResponse findAllLinkRuleResponse, UnmarshallerContext _ctx) {
		
		findAllLinkRuleResponse.setRequestId(_ctx.stringValue("FindAllLinkRuleResponse.RequestId"));
		findAllLinkRuleResponse.setCode(_ctx.integerValue("FindAllLinkRuleResponse.Code"));
		findAllLinkRuleResponse.setMessage(_ctx.stringValue("FindAllLinkRuleResponse.Message"));

		Data data = new Data();

		List<LinkRuleListItem> linkRuleList = new ArrayList<LinkRuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("FindAllLinkRuleResponse.Data.LinkRuleList.Length"); i++) {
			LinkRuleListItem linkRuleListItem = new LinkRuleListItem();
			linkRuleListItem.setCsbId(_ctx.longValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].CsbId"));
			linkRuleListItem.setOwnerId(_ctx.stringValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].OwnerId"));
			linkRuleListItem.setGmtCreate(_ctx.longValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].GmtCreate"));
			linkRuleListItem.setGmtModified(_ctx.longValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].GmtModified"));
			linkRuleListItem.setId(_ctx.longValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].Id"));
			linkRuleListItem.setDeleted(_ctx.integerValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].Deleted"));
			linkRuleListItem.setOriginName(_ctx.stringValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].OriginName"));
			linkRuleListItem.setTargetName(_ctx.stringValue("FindAllLinkRuleResponse.Data.LinkRuleList["+ i +"].TargetName"));

			linkRuleList.add(linkRuleListItem);
		}
		data.setLinkRuleList(linkRuleList);
		findAllLinkRuleResponse.setData(data);
	 
	 	return findAllLinkRuleResponse;
	}
}