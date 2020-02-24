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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.ListConversationDetailsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListConversationDetailsResponse.ConversationDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConversationDetailsResponseUnmarshaller {

	public static ListConversationDetailsResponse unmarshall(ListConversationDetailsResponse listConversationDetailsResponse, UnmarshallerContext _ctx) {
		
		listConversationDetailsResponse.setRequestId(_ctx.stringValue("ListConversationDetailsResponse.RequestId"));

		List<ConversationDetail> conversationDetails = new ArrayList<ConversationDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListConversationDetailsResponse.ConversationDetails.Length"); i++) {
			ConversationDetail conversationDetail = new ConversationDetail();
			conversationDetail.setConversationId(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].ConversationId"));
			conversationDetail.setSpeaker(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].Speaker"));
			conversationDetail.setUtterance(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].Utterance"));
			conversationDetail.setAction(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].Action"));
			conversationDetail.setActionParams(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].ActionParams"));
			conversationDetail.setCreateTime(_ctx.longValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].CreateTime"));
			conversationDetail.setSequenceId(_ctx.stringValue("ListConversationDetailsResponse.ConversationDetails["+ i +"].SequenceId"));

			conversationDetails.add(conversationDetail);
		}
		listConversationDetailsResponse.setConversationDetails(conversationDetails);
	 
	 	return listConversationDetailsResponse;
	}
}