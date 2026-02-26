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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem.AnnotationMissionChatListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem.AnnotationMissionChatListItem.AnnotationMissionChatCustomizationDataInfoListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem.AnnotationMissionChatListItem.AnnotationMissionChatIntentUserSayInfoListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem.AnnotationMissionChatListItem.AnnotationMissionChatTagInfoListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionListItem.AnnotationMissionChatListItem.AnnotationMissionChatVocabularyInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnnotationMissionSessionResponseUnmarshaller {

	public static ListAnnotationMissionSessionResponse unmarshall(ListAnnotationMissionSessionResponse listAnnotationMissionSessionResponse, UnmarshallerContext _ctx) {
		
		listAnnotationMissionSessionResponse.setRequestId(_ctx.stringValue("ListAnnotationMissionSessionResponse.RequestId"));
		listAnnotationMissionSessionResponse.setSuccess(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Success"));
		listAnnotationMissionSessionResponse.setCode(_ctx.stringValue("ListAnnotationMissionSessionResponse.Code"));
		listAnnotationMissionSessionResponse.setMessage(_ctx.stringValue("ListAnnotationMissionSessionResponse.Message"));
		listAnnotationMissionSessionResponse.setHttpStatusCode(_ctx.integerValue("ListAnnotationMissionSessionResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionId"));
		data.setSuccess(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.Message"));
		data.setTotalCount(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.TotalCount"));

		List<AnnotationMissionSessionListItem> annotationMissionSessionList = new ArrayList<AnnotationMissionSessionListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList.Length"); i++) {
			AnnotationMissionSessionListItem annotationMissionSessionListItem = new AnnotationMissionSessionListItem();
			annotationMissionSessionListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionSessionId"));
			annotationMissionSessionListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].CreateTime"));
			annotationMissionSessionListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].ModifiedTime"));
			annotationMissionSessionListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionId"));
			annotationMissionSessionListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].InstanceId"));
			annotationMissionSessionListItem.setScriptId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].ScriptId"));
			annotationMissionSessionListItem.setJobGroupId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].JobGroupId"));
			annotationMissionSessionListItem.setJobId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].JobId"));
			annotationMissionSessionListItem.setSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].SessionId"));
			annotationMissionSessionListItem.setAnnotationStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationStatus"));
			annotationMissionSessionListItem.setVersion(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].Version"));
			annotationMissionSessionListItem.setDebugConversation(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].DebugConversation"));

			List<AnnotationMissionChatListItem> annotationMissionChatList = new ArrayList<AnnotationMissionChatListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList.Length"); j++) {
				AnnotationMissionChatListItem annotationMissionChatListItem = new AnnotationMissionChatListItem();
				annotationMissionChatListItem.setAnnotationMissionChatId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatId"));
				annotationMissionChatListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].CreateTime"));
				annotationMissionChatListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].ModifiedTime"));
				annotationMissionChatListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionId"));
				annotationMissionChatListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionSessionId"));
				annotationMissionChatListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].InstanceId"));
				annotationMissionChatListItem.setSequenceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].SequenceId"));
				annotationMissionChatListItem.setOccurTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].OccurTime"));
				annotationMissionChatListItem.setAnswer(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].Answer"));
				annotationMissionChatListItem.setAnnotationStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationStatus"));
				annotationMissionChatListItem.setIntentAnnotationStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].IntentAnnotationStatus"));
				annotationMissionChatListItem.setAsrAnnotationStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AsrAnnotationStatus"));
				annotationMissionChatListItem.setTagAnnotationStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].TagAnnotationStatus"));
				annotationMissionChatListItem.setSubStatus(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].SubStatus"));
				annotationMissionChatListItem.setTranslationError(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].TranslationError"));
				annotationMissionChatListItem.setAnnotationAsrResult(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationAsrResult"));
				annotationMissionChatListItem.setOriginalAsrResult(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].OriginalAsrResult"));

				List<AnnotationMissionChatIntentUserSayInfoListItem> annotationMissionChatIntentUserSayInfoList = new ArrayList<AnnotationMissionChatIntentUserSayInfoListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList.Length"); k++) {
					AnnotationMissionChatIntentUserSayInfoListItem annotationMissionChatIntentUserSayInfoListItem = new AnnotationMissionChatIntentUserSayInfoListItem();
					annotationMissionChatIntentUserSayInfoListItem.setAnnotationMissionChatIntentUserSayInfoId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].AnnotationMissionChatIntentUserSayInfoId"));
					annotationMissionChatIntentUserSayInfoListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].CreateTime"));
					annotationMissionChatIntentUserSayInfoListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].ModifiedTime"));
					annotationMissionChatIntentUserSayInfoListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].InstanceId"));
					annotationMissionChatIntentUserSayInfoListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].AnnotationMissionId"));
					annotationMissionChatIntentUserSayInfoListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].AnnotationMissionSessionId"));
					annotationMissionChatIntentUserSayInfoListItem.setAnnotationMissionChatId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].AnnotationMissionChatId"));
					annotationMissionChatIntentUserSayInfoListItem.setContent(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].Content"));
					annotationMissionChatIntentUserSayInfoListItem.setIntentId(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].IntentId"));
					annotationMissionChatIntentUserSayInfoListItem.setDialogId(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].DialogId"));
					annotationMissionChatIntentUserSayInfoListItem.setBotId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].BotId"));
					annotationMissionChatIntentUserSayInfoListItem.setDelete(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].Delete"));
					annotationMissionChatIntentUserSayInfoListItem.setCreate(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatIntentUserSayInfoList["+ k +"].Create"));

					annotationMissionChatIntentUserSayInfoList.add(annotationMissionChatIntentUserSayInfoListItem);
				}
				annotationMissionChatListItem.setAnnotationMissionChatIntentUserSayInfoList(annotationMissionChatIntentUserSayInfoList);

				List<AnnotationMissionChatVocabularyInfoListItem> annotationMissionChatVocabularyInfoList = new ArrayList<AnnotationMissionChatVocabularyInfoListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList.Length"); k++) {
					AnnotationMissionChatVocabularyInfoListItem annotationMissionChatVocabularyInfoListItem = new AnnotationMissionChatVocabularyInfoListItem();
					annotationMissionChatVocabularyInfoListItem.setAnnotationMissionChatVocabularyInfoId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].AnnotationMissionChatVocabularyInfoId"));
					annotationMissionChatVocabularyInfoListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].CreateTime"));
					annotationMissionChatVocabularyInfoListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].ModifiedTime"));
					annotationMissionChatVocabularyInfoListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].InstanceId"));
					annotationMissionChatVocabularyInfoListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].AnnotationMissionId"));
					annotationMissionChatVocabularyInfoListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].AnnotationMissionSessionId"));
					annotationMissionChatVocabularyInfoListItem.setAnnotationMissionChatId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].AnnotationMissionChatId"));
					annotationMissionChatVocabularyInfoListItem.setVocabularyId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].VocabularyId"));
					annotationMissionChatVocabularyInfoListItem.setVocabulary(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].Vocabulary"));
					annotationMissionChatVocabularyInfoListItem.setVocabularyName(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].VocabularyName"));
					annotationMissionChatVocabularyInfoListItem.setVocabularyDescription(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].VocabularyDescription"));
					annotationMissionChatVocabularyInfoListItem.setVocabularyWeight(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].VocabularyWeight"));
					annotationMissionChatVocabularyInfoListItem.setDelete(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].Delete"));
					annotationMissionChatVocabularyInfoListItem.setCreate(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatVocabularyInfoList["+ k +"].Create"));

					annotationMissionChatVocabularyInfoList.add(annotationMissionChatVocabularyInfoListItem);
				}
				annotationMissionChatListItem.setAnnotationMissionChatVocabularyInfoList(annotationMissionChatVocabularyInfoList);

				List<AnnotationMissionChatCustomizationDataInfoListItem> annotationMissionChatCustomizationDataInfoList = new ArrayList<AnnotationMissionChatCustomizationDataInfoListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList.Length"); k++) {
					AnnotationMissionChatCustomizationDataInfoListItem annotationMissionChatCustomizationDataInfoListItem = new AnnotationMissionChatCustomizationDataInfoListItem();
					annotationMissionChatCustomizationDataInfoListItem.setAnnotationMissionChatCustomizationDataInfoId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].AnnotationMissionChatCustomizationDataInfoId"));
					annotationMissionChatCustomizationDataInfoListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].CreateTime"));
					annotationMissionChatCustomizationDataInfoListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].ModifiedTime"));
					annotationMissionChatCustomizationDataInfoListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].InstanceId"));
					annotationMissionChatCustomizationDataInfoListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].AnnotationMissionId"));
					annotationMissionChatCustomizationDataInfoListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].AnnotationMissionSessionId"));
					annotationMissionChatCustomizationDataInfoListItem.setAnnotationMissionChatId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].AnnotationMissionChatId"));
					annotationMissionChatCustomizationDataInfoListItem.setCustomizationDataId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].CustomizationDataId"));
					annotationMissionChatCustomizationDataInfoListItem.setContent(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].Content"));
					annotationMissionChatCustomizationDataInfoListItem.setCustomizationDataName(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].CustomizationDataName"));
					annotationMissionChatCustomizationDataInfoListItem.setCustomizationDataDescription(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].CustomizationDataDescription"));
					annotationMissionChatCustomizationDataInfoListItem.setCustomizationDataWeight(_ctx.integerValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].CustomizationDataWeight"));
					annotationMissionChatCustomizationDataInfoListItem.setDelete(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].Delete"));
					annotationMissionChatCustomizationDataInfoListItem.setCreate(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatCustomizationDataInfoList["+ k +"].Create"));

					annotationMissionChatCustomizationDataInfoList.add(annotationMissionChatCustomizationDataInfoListItem);
				}
				annotationMissionChatListItem.setAnnotationMissionChatCustomizationDataInfoList(annotationMissionChatCustomizationDataInfoList);

				List<AnnotationMissionChatTagInfoListItem> annotationMissionChatTagInfoList = new ArrayList<AnnotationMissionChatTagInfoListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList.Length"); k++) {
					AnnotationMissionChatTagInfoListItem annotationMissionChatTagInfoListItem = new AnnotationMissionChatTagInfoListItem();
					annotationMissionChatTagInfoListItem.setAnnotationMissionChatTagInfoId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionChatTagInfoId"));
					annotationMissionChatTagInfoListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].CreateTime"));
					annotationMissionChatTagInfoListItem.setModifiedTime(_ctx.longValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].ModifiedTime"));
					annotationMissionChatTagInfoListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].InstanceId"));
					annotationMissionChatTagInfoListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionId"));
					annotationMissionChatTagInfoListItem.setAnnotationMissionSessionId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionSessionId"));
					annotationMissionChatTagInfoListItem.setAnnotationMissionChatId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionChatId"));
					annotationMissionChatTagInfoListItem.setAnnotationMissionTagInfoId(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionTagInfoId"));
					annotationMissionChatTagInfoListItem.setAnnotationMissionTagInfoName(_ctx.stringValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].AnnotationMissionTagInfoName"));
					annotationMissionChatTagInfoListItem.setDelete(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].Delete"));
					annotationMissionChatTagInfoListItem.setCreate(_ctx.booleanValue("ListAnnotationMissionSessionResponse.Data.AnnotationMissionSessionList["+ i +"].AnnotationMissionChatList["+ j +"].AnnotationMissionChatTagInfoList["+ k +"].Create"));

					annotationMissionChatTagInfoList.add(annotationMissionChatTagInfoListItem);
				}
				annotationMissionChatListItem.setAnnotationMissionChatTagInfoList(annotationMissionChatTagInfoList);

				annotationMissionChatList.add(annotationMissionChatListItem);
			}
			annotationMissionSessionListItem.setAnnotationMissionChatList(annotationMissionChatList);

			annotationMissionSessionList.add(annotationMissionSessionListItem);
		}
		data.setAnnotationMissionSessionList(annotationMissionSessionList);
		listAnnotationMissionSessionResponse.setData(data);
	 
	 	return listAnnotationMissionSessionResponse;
	}
}