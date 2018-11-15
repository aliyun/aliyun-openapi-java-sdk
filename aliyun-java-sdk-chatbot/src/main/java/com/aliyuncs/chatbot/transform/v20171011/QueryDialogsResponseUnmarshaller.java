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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.chatbot.model.v20171011.QueryDialogsResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryDialogsResponse.Dialog;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDialogsResponseUnmarshaller {

	public static QueryDialogsResponse unmarshall(QueryDialogsResponse queryDialogsResponse, UnmarshallerContext context) {
		
		queryDialogsResponse.setRequestId(context.stringValue("QueryDialogsResponse.RequestId"));
		queryDialogsResponse.setPageSize(context.integerValue("QueryDialogsResponse.PageSize"));
		queryDialogsResponse.setPageNumber(context.integerValue("QueryDialogsResponse.PageNumber"));
		queryDialogsResponse.setTotalCount(context.integerValue("QueryDialogsResponse.TotalCount"));

		List<Dialog> dialogs = new ArrayList<Dialog>();
		for (int i = 0; i < context.lengthValue("QueryDialogsResponse.Dialogs.Length"); i++) {
			Dialog dialog = new Dialog();
			dialog.setDialogId(context.longValue("QueryDialogsResponse.Dialogs["+ i +"].DialogId"));
			dialog.setDialogName(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].DialogName"));
			dialog.setDescription(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].Description"));
			dialog.setCreateTime(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].CreateTime"));
			dialog.setModifyTime(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].ModifyTime"));
			dialog.setCreateUserId(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].CreateUserId"));
			dialog.setCreateUserName(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].CreateUserName"));
			dialog.setModifyUserId(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].ModifyUserId"));
			dialog.setModifyUserName(context.stringValue("QueryDialogsResponse.Dialogs["+ i +"].ModifyUserName"));
			dialog.setIsSampleDialog(context.booleanValue("QueryDialogsResponse.Dialogs["+ i +"].IsSampleDialog"));
			dialog.setStatus(context.integerValue("QueryDialogsResponse.Dialogs["+ i +"].Status"));
			dialog.setIsOnline(context.booleanValue("QueryDialogsResponse.Dialogs["+ i +"].IsOnline"));

			dialogs.add(dialog);
		}
		queryDialogsResponse.setDialogs(dialogs);
	 
	 	return queryDialogsResponse;
	}
}