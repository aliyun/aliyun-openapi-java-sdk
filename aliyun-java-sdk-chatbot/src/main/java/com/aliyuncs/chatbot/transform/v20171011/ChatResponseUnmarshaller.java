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

import com.aliyuncs.chatbot.model.v20171011.ChatResponse;
import com.aliyuncs.chatbot.model.v20171011.ChatResponse.Message;
import com.aliyuncs.chatbot.model.v20171011.ChatResponse.Message.Knowledge;
import com.aliyuncs.chatbot.model.v20171011.ChatResponse.Message.Recommend;
import com.aliyuncs.chatbot.model.v20171011.ChatResponse.Message.Text;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatResponseUnmarshaller {

	public static ChatResponse unmarshall(ChatResponse chatResponse, UnmarshallerContext context) {
		
		chatResponse.setRequestId(context.stringValue("ChatResponse.RequestId"));
		chatResponse.setSessionId(context.stringValue("ChatResponse.SessionId"));
		chatResponse.setMessageId(context.stringValue("ChatResponse.MessageId"));
		chatResponse.setTag(context.stringValue("ChatResponse.Tag"));

		List<Message> messages = new ArrayList<Message>();
		for (int i = 0; i < context.lengthValue("ChatResponse.Messages.Length"); i++) {
			Message message = new Message();
			message.setType(context.stringValue("ChatResponse.Messages["+ i +"].Type"));

			Text text = new Text();
			text.setContent(context.stringValue("ChatResponse.Messages["+ i +"].Text.Content"));
			text.setAnswerSource(context.stringValue("ChatResponse.Messages["+ i +"].Text.AnswerSource"));
			message.setText(text);

			Knowledge knowledge = new Knowledge();
			knowledge.setId(context.stringValue("ChatResponse.Messages["+ i +"].Knowledge.Id"));
			knowledge.setTitle(context.stringValue("ChatResponse.Messages["+ i +"].Knowledge.Title"));
			knowledge.setSummary(context.stringValue("ChatResponse.Messages["+ i +"].Knowledge.Summary"));
			knowledge.setContent(context.stringValue("ChatResponse.Messages["+ i +"].Knowledge.Content"));
			knowledge.setAnswerSource(context.stringValue("ChatResponse.Messages["+ i +"].Knowledge.AnswerSource"));
			message.setKnowledge(knowledge);

			List<Recommend> recommends = new ArrayList<Recommend>();
			for (int j = 0; j < context.lengthValue("ChatResponse.Messages["+ i +"].Recommends.Length"); j++) {
				Recommend recommend = new Recommend();
				recommend.setKnowledgeId(context.stringValue("ChatResponse.Messages["+ i +"].Recommends["+ j +"].KnowledgeId"));
				recommend.setTitle(context.stringValue("ChatResponse.Messages["+ i +"].Recommends["+ j +"].Title"));
				recommend.setAnswerSource(context.stringValue("ChatResponse.Messages["+ i +"].Recommends["+ j +"].AnswerSource"));
				recommend.setSummary(context.stringValue("ChatResponse.Messages["+ i +"].Recommends["+ j +"].Summary"));
				recommend.setContent(context.stringValue("ChatResponse.Messages["+ i +"].Recommends["+ j +"].Content"));

				recommends.add(recommend);
			}
			message.setRecommends(recommends);

			messages.add(message);
		}
		chatResponse.setMessages(messages);
	 
	 	return chatResponse;
	}
}