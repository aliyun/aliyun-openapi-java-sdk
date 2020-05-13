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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListAssistHistoryDetailsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListAssistHistoryDetailsResponse.ActionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssistHistoryDetailsResponseUnmarshaller {

	public static ListAssistHistoryDetailsResponse unmarshall(ListAssistHistoryDetailsResponse listAssistHistoryDetailsResponse, UnmarshallerContext _ctx) {
		
		listAssistHistoryDetailsResponse.setRequestId(_ctx.stringValue("ListAssistHistoryDetailsResponse.RequestId"));

		List<ActionsItem> actions = new ArrayList<ActionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssistHistoryDetailsResponse.Actions.Length"); i++) {
			ActionsItem actionsItem = new ActionsItem();
			actionsItem.setAssistId(_ctx.stringValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].AssistId"));
			actionsItem.setAction(_ctx.stringValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].Action"));
			actionsItem.setTimestamp(_ctx.stringValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].Timestamp"));
			actionsItem.setCreatedAt(_ctx.longValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].CreatedAt"));
			actionsItem.setUpdatedAt(_ctx.longValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].UpdatedAt"));
			actionsItem.setID(_ctx.stringValue("ListAssistHistoryDetailsResponse.Actions["+ i +"].ID"));

			actions.add(actionsItem);
		}
		listAssistHistoryDetailsResponse.setActions(actions);
	 
	 	return listAssistHistoryDetailsResponse;
	}
}