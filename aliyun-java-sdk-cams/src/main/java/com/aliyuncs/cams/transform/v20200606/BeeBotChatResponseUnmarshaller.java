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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表.Knowledge;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表.Knowledge.RelatedKnowledgesItem;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表.Recommend;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表.Text;
import com.aliyuncs.cams.model.v20200606.BeeBotChatResponse.Data.消息的列表.Text.SlotsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeeBotChatResponseUnmarshaller {

	public static BeeBotChatResponse unmarshall(BeeBotChatResponse beeBotChatResponse, UnmarshallerContext _ctx) {
		
		beeBotChatResponse.setRequestId(_ctx.stringValue("BeeBotChatResponse.RequestId"));
		beeBotChatResponse.setCode(_ctx.stringValue("BeeBotChatResponse.Code"));
		beeBotChatResponse.setMessage(_ctx.stringValue("BeeBotChatResponse.Message"));
		beeBotChatResponse.setAccessDeniedDetail(_ctx.stringValue("BeeBotChatResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("BeeBotChatResponse.Data.MessageId"));
		data.setSessionId(_ctx.stringValue("BeeBotChatResponse.Data.SessionId"));

		List<消息的列表> messages = new ArrayList<消息的列表>();
		for (int i = 0; i < _ctx.lengthValue("BeeBotChatResponse.Data.Messages.Length"); i++) {
			消息的列表 消息的列表 = new 消息的列表();
			消息的列表.setAnswerType(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].AnswerType"));
			消息的列表.setAnswerSource(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].AnswerSource"));

			Knowledge knowledge = new Knowledge();
			knowledge.setHitStatement(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.HitStatement"));
			knowledge.setSummary(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.Summary"));
			knowledge.setCategory(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.Category"));
			knowledge.setTitle(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.Title"));
			knowledge.setContent(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.Content"));
			knowledge.setAnswerSource(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.AnswerSource"));
			knowledge.setId(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.Id"));
			knowledge.setContentType(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.ContentType"));

			List<RelatedKnowledgesItem> relatedKnowledges = new ArrayList<RelatedKnowledgesItem>();
			for (int j = 0; j < _ctx.lengthValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.RelatedKnowledges.Length"); j++) {
				RelatedKnowledgesItem relatedKnowledgesItem = new RelatedKnowledgesItem();
				relatedKnowledgesItem.setKnowledgeId(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.RelatedKnowledges["+ j +"].KnowledgeId"));
				relatedKnowledgesItem.setTitle(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Knowledge.RelatedKnowledges["+ j +"].Title"));

				relatedKnowledges.add(relatedKnowledgesItem);
			}
			knowledge.setRelatedKnowledges(relatedKnowledges);
			消息的列表.setKnowledge(knowledge);

			Text text = new Text();
			text.setHitStatement(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.HitStatement"));
			text.setDialogName(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.DialogName"));
			text.setAnswerSource(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.AnswerSource"));
			text.setNodeName(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.NodeName"));
			text.setIntentName(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.IntentName"));
			text.setMetaData(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.MetaData"));
			text.setExternalFlags(_ctx.mapValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.ExternalFlags"));
			text.setExt(_ctx.mapValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Ext"));
			text.setUserDefinedChatTitle(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.UserDefinedChatTitle"));
			text.setContent(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Content"));
			text.setNodeId(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.NodeId"));
			text.setContentType(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.ContentType"));

			List<SlotsItem> slots = new ArrayList<SlotsItem>();
			for (int j = 0; j < _ctx.lengthValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Slots.Length"); j++) {
				SlotsItem slotsItem = new SlotsItem();
				slotsItem.setValue(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Slots["+ j +"].Value"));
				slotsItem.setOrigin(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Slots["+ j +"].Origin"));
				slotsItem.setName(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Slots["+ j +"].Name"));
				slotsItem.setHit(_ctx.booleanValue("BeeBotChatResponse.Data.Messages["+ i +"].Text.Slots["+ j +"].Hit"));

				slots.add(slotsItem);
			}
			text.setSlots(slots);
			消息的列表.setText(text);

			List<Recommend> recommends = new ArrayList<Recommend>();
			for (int j = 0; j < _ctx.lengthValue("BeeBotChatResponse.Data.Messages["+ i +"].Recommends.Length"); j++) {
				Recommend recommend = new Recommend();
				recommend.setKnowledgeId(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Recommends["+ j +"].KnowledgeId"));
				recommend.setTitle(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Recommends["+ j +"].Title"));
				recommend.setAnswerSource(_ctx.stringValue("BeeBotChatResponse.Data.Messages["+ i +"].Recommends["+ j +"].AnswerSource"));

				recommends.add(recommend);
			}
			消息的列表.setRecommends(recommends);

			messages.add(消息的列表);
		}
		data.setMessages(messages);
		beeBotChatResponse.setData(data);
	 
	 	return beeBotChatResponse;
	}
}