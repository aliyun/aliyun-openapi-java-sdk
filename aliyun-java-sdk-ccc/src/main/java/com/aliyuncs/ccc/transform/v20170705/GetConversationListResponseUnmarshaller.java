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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetConversationListResponse;
import com.aliyuncs.ccc.model.v20170705.GetConversationListResponse.ConversationDetail;
import com.aliyuncs.ccc.model.v20170705.GetConversationListResponse.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConversationListResponseUnmarshaller {

	public static GetConversationListResponse unmarshall(GetConversationListResponse getConversationListResponse, UnmarshallerContext _ctx) {
		
		getConversationListResponse.setRequestId(_ctx.stringValue("GetConversationListResponse.RequestId"));
		getConversationListResponse.setSuccess(_ctx.booleanValue("GetConversationListResponse.Success"));
		getConversationListResponse.setCode(_ctx.stringValue("GetConversationListResponse.Code"));
		getConversationListResponse.setMessage(_ctx.stringValue("GetConversationListResponse.Message"));
		getConversationListResponse.setHttpStatusCode(_ctx.integerValue("GetConversationListResponse.HttpStatusCode"));

		List<ConversationDetail> conversations = new ArrayList<ConversationDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetConversationListResponse.Conversations.Length"); i++) {
			ConversationDetail conversationDetail = new ConversationDetail();
			conversationDetail.setTimestamp(_ctx.longValue("GetConversationListResponse.Conversations["+ i +"].Timestamp"));
			conversationDetail.setSpeaker(_ctx.stringValue("GetConversationListResponse.Conversations["+ i +"].Speaker"));
			conversationDetail.setScript(_ctx.stringValue("GetConversationListResponse.Conversations["+ i +"].Script"));

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("GetConversationListResponse.Conversations["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setCategory(_ctx.stringValue("GetConversationListResponse.Conversations["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(_ctx.stringValue("GetConversationListResponse.Conversations["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(_ctx.stringValue("GetConversationListResponse.Conversations["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem);
			}
			conversationDetail.setSummary(summary);

			conversations.add(conversationDetail);
		}
		getConversationListResponse.setConversations(conversations);
	 
	 	return getConversationListResponse;
	}
}