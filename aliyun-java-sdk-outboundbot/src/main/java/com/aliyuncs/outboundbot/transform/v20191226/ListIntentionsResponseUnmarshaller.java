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

import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.RuleCheckItem;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.SlotItem;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.SlotItem.FeedbackFunction;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.SlotItem.FeedbackFunction.SwitchItem;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.SlotItem.Tag;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.UserSayItem;
import com.aliyuncs.outboundbot.model.v20191226.ListIntentionsResponse.Data.IntentListItem.UserSayItem.Data1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntentionsResponseUnmarshaller {

	public static ListIntentionsResponse unmarshall(ListIntentionsResponse listIntentionsResponse, UnmarshallerContext _ctx) {
		
		listIntentionsResponse.setRequestId(_ctx.stringValue("ListIntentionsResponse.RequestId"));
		listIntentionsResponse.setSuccess(_ctx.booleanValue("ListIntentionsResponse.Success"));
		listIntentionsResponse.setCode(_ctx.stringValue("ListIntentionsResponse.Code"));
		listIntentionsResponse.setMessage(_ctx.stringValue("ListIntentionsResponse.Message"));
		listIntentionsResponse.setHttpStatusCode(_ctx.integerValue("ListIntentionsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("ListIntentionsResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("ListIntentionsResponse.Data.Message"));
		data.setBotId(_ctx.stringValue("ListIntentionsResponse.Data.BotId"));

		List<IntentListItem> intentList = new ArrayList<IntentListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList.Length"); i++) {
			IntentListItem intentListItem = new IntentListItem();
			intentListItem.setBotId(_ctx.longValue("ListIntentionsResponse.Data.IntentList["+ i +"].BotId"));
			intentListItem.setDialogId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].DialogId"));
			intentListItem.setName(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Name"));
			intentListItem.setId(_ctx.longValue("ListIntentionsResponse.Data.IntentList["+ i +"].Id"));
			intentListItem.setBotName(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].BotName"));
			intentListItem.setLanguage(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Language"));
			intentListItem.setType(_ctx.integerValue("ListIntentionsResponse.Data.IntentList["+ i +"].Type"));
			intentListItem.setTableId(_ctx.longValue("ListIntentionsResponse.Data.IntentList["+ i +"].TableId"));

			List<String> alias = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Alias.Length"); j++) {
				alias.add(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Alias["+ j +"]"));
			}
			intentListItem.setAlias(alias);

			List<UserSayItem> userSay = new ArrayList<UserSayItem>();
			for (int j = 0; j < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay.Length"); j++) {
				UserSayItem userSayItem = new UserSayItem();
				userSayItem.setId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].Id"));
				userSayItem.setFromId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].FromId"));
				userSayItem.setStrict(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].Strict"));

				List<Data1> userSayData = new ArrayList<Data1>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].UserSayData.Length"); k++) {
					Data1 data1 = new Data1();
					data1.setSlotId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].UserSayData["+ k +"].SlotId"));
					data1.setText(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].UserSay["+ j +"].UserSayData["+ k +"].Text"));

					userSayData.add(data1);
				}
				userSayItem.setUserSayData(userSayData);

				userSay.add(userSayItem);
			}
			intentListItem.setUserSay(userSay);

			List<RuleCheckItem> ruleCheck = new ArrayList<RuleCheckItem>();
			for (int j = 0; j < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck.Length"); j++) {
				RuleCheckItem ruleCheckItem = new RuleCheckItem();
				ruleCheckItem.setStrict(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Strict"));
				ruleCheckItem.setText(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Text"));

				List<String> warning = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Warning.Length"); k++) {
					warning.add(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Warning["+ k +"]"));
				}
				ruleCheckItem.setWarning(warning);

				List<String> error = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Error.Length"); k++) {
					error.add(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].RuleCheck["+ j +"].Error["+ k +"]"));
				}
				ruleCheckItem.setError(error);

				ruleCheck.add(ruleCheckItem);
			}
			intentListItem.setRuleCheck(ruleCheck);

			List<SlotItem> slot = new ArrayList<SlotItem>();
			for (int j = 0; j < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot.Length"); j++) {
				SlotItem slotItem = new SlotItem();
				slotItem.setId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Id"));
				slotItem.setName(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Name"));
				slotItem.setIsArray(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].IsArray"));
				slotItem.setIsEncrypt(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].IsEncrypt"));
				slotItem.setIsInteractive(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].IsInteractive"));
				slotItem.setValue(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Value"));
				slotItem.setIsNecessary(_ctx.booleanValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].IsNecessary"));
				slotItem.setLifeSpan(_ctx.integerValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].LifeSpan"));
				slotItem.setFeedbackType(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackType"));

				List<String> question = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Question.Length"); k++) {
					question.add(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Question["+ k +"]"));
				}
				slotItem.setQuestion(question);

				List<Tag> tags = new ArrayList<Tag>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Tags.Length"); k++) {
					Tag tag = new Tag();
					tag.setUserSayId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Tags["+ k +"].UserSayId"));
					tag.setValue(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].Tags["+ k +"].Value"));

					tags.add(tag);
				}
				slotItem.setTags(tags);

				List<FeedbackFunction> feedbackFunctions = new ArrayList<FeedbackFunction>();
				for (int k = 0; k < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions.Length"); k++) {
					FeedbackFunction feedbackFunction = new FeedbackFunction();
					feedbackFunction.setCode(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Code"));
					feedbackFunction.setDescription(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Description"));
					feedbackFunction.setFunction(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Function"));
					feedbackFunction.setName(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Name"));
					feedbackFunction.setAliyunService(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].AliyunService"));
					feedbackFunction.setAliyunFunction(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].AliyunFunction"));
					feedbackFunction.setEndPoint(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].EndPoint"));
					feedbackFunction.setType(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Type"));
					feedbackFunction.setParams(_ctx.mapValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Params"));

					List<SwitchItem> _switch = new ArrayList<SwitchItem>();
					for (int l = 0; l < _ctx.lengthValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch.Length"); l++) {
						SwitchItem switchItem = new SwitchItem();
						switchItem.setId(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch["+ l +"].Id"));
						switchItem.setLabel(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch["+ l +"].Label"));
						switchItem.setType(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch["+ l +"].Type"));
						switchItem.setValue(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch["+ l +"].Value"));
						switchItem.setName(_ctx.stringValue("ListIntentionsResponse.Data.IntentList["+ i +"].Slot["+ j +"].FeedbackFunctions["+ k +"].Switch["+ l +"].Name"));

						_switch.add(switchItem);
					}
					feedbackFunction.set_Switch(_switch);

					feedbackFunctions.add(feedbackFunction);
				}
				slotItem.setFeedbackFunctions(feedbackFunctions);

				slot.add(slotItem);
			}
			intentListItem.setSlot(slot);

			intentList.add(intentListItem);
		}
		data.setIntentList(intentList);
		listIntentionsResponse.setData(data);
	 
	 	return listIntentionsResponse;
	}
}