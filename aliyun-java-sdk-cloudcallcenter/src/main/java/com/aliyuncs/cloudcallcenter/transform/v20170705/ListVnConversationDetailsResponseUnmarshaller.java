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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnConversationDetailsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnConversationDetailsResponse.ConversationDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnConversationDetailsResponseUnmarshaller {

	public static ListVnConversationDetailsResponse unmarshall(ListVnConversationDetailsResponse listVnConversationDetailsResponse, UnmarshallerContext context) {
		
		listVnConversationDetailsResponse.setRequestId(context.stringValue("ListVnConversationDetailsResponse.RequestId"));

		List<ConversationDetail> conversationDetails = new ArrayList<ConversationDetail>();
		for (int i = 0; i < context.lengthValue("ListVnConversationDetailsResponse.ConversationDetails.Length"); i++) {
			ConversationDetail conversationDetail = new ConversationDetail();
			conversationDetail.setConversationId(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].ConversationId"));
			conversationDetail.setSpeaker(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].Speaker"));
			conversationDetail.setUtterance(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].Utterance"));
			conversationDetail.setAction(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].Action"));
			conversationDetail.setActionParams(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].ActionParams"));
			conversationDetail.setCreateTime(context.longValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].CreateTime"));
			conversationDetail.setSequenceId(context.stringValue("ListVnConversationDetailsResponse.ConversationDetails["+ i +"].SequenceId"));

			conversationDetails.add(conversationDetail);
		}
		listVnConversationDetailsResponse.setConversationDetails(conversationDetails);
	 
	 	return listVnConversationDetailsResponse;
	}
}