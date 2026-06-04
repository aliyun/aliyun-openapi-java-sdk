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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.ListAppConversationsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppConversationsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAppConversationsResponse.Module.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppConversationsResponseUnmarshaller {

	public static ListAppConversationsResponse unmarshall(ListAppConversationsResponse listAppConversationsResponse, UnmarshallerContext _ctx) {
		
		listAppConversationsResponse.setRequestId(_ctx.stringValue("ListAppConversationsResponse.RequestId"));
		listAppConversationsResponse.setDynamicCode(_ctx.stringValue("ListAppConversationsResponse.DynamicCode"));
		listAppConversationsResponse.setDynamicMessage(_ctx.stringValue("ListAppConversationsResponse.DynamicMessage"));
		listAppConversationsResponse.setSynchro(_ctx.booleanValue("ListAppConversationsResponse.Synchro"));
		listAppConversationsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppConversationsResponse.AccessDeniedDetail"));
		listAppConversationsResponse.setRootErrorMsg(_ctx.stringValue("ListAppConversationsResponse.RootErrorMsg"));
		listAppConversationsResponse.setRootErrorCode(_ctx.stringValue("ListAppConversationsResponse.RootErrorCode"));
		listAppConversationsResponse.setAllowRetry(_ctx.booleanValue("ListAppConversationsResponse.AllowRetry"));
		listAppConversationsResponse.setAppName(_ctx.stringValue("ListAppConversationsResponse.AppName"));
		listAppConversationsResponse.setNextToken(_ctx.stringValue("ListAppConversationsResponse.NextToken"));
		listAppConversationsResponse.setMaxResults(_ctx.integerValue("ListAppConversationsResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppConversationsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppConversationsResponse.ErrorArgs["+ i +"]"));
		}
		listAppConversationsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalCount(_ctx.integerValue("ListAppConversationsResponse.Module.TotalCount"));
		module.setPageNum(_ctx.integerValue("ListAppConversationsResponse.Module.PageNum"));
		module.setPageSize(_ctx.integerValue("ListAppConversationsResponse.Module.PageSize"));

		List<Conversation> data = new ArrayList<Conversation>();
		for (int i = 0; i < _ctx.lengthValue("ListAppConversationsResponse.Module.Data.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setConversationId(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].ConversationId"));
			conversation.setUserId(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].UserId"));
			conversation.setAliyunPk(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].AliyunPk"));
			conversation.setSectionId(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].SectionId"));
			conversation.setSiteId(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].SiteId"));
			conversation.setBotId(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].BotId"));
			conversation.setTitle(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].Title"));
			conversation.setMetaData(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].MetaData"));
			conversation.setGmtCreateTime(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].GmtCreateTime"));
			conversation.setGmtModifiedTime(_ctx.stringValue("ListAppConversationsResponse.Module.Data["+ i +"].GmtModifiedTime"));
			conversation.setChatNum(_ctx.integerValue("ListAppConversationsResponse.Module.Data["+ i +"].ChatNum"));

			data.add(conversation);
		}
		module.setData(data);
		listAppConversationsResponse.setModule(module);
	 
	 	return listAppConversationsResponse;
	}
}