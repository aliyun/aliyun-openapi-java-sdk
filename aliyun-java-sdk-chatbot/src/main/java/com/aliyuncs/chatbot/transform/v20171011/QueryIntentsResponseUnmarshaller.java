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

import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent.RuleCheckItem;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent.SlotItem;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent.SlotItem.TagsItem;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent.UserSayItem;
import com.aliyuncs.chatbot.model.v20171011.QueryIntentsResponse.Intent.UserSayItem.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIntentsResponseUnmarshaller {

	public static QueryIntentsResponse unmarshall(QueryIntentsResponse queryIntentsResponse, UnmarshallerContext context) {
		
		queryIntentsResponse.setRequestId(context.stringValue("QueryIntentsResponse.RequestId"));
		queryIntentsResponse.setPageNumber(context.integerValue("QueryIntentsResponse.PageNumber"));
		queryIntentsResponse.setPageSize(context.integerValue("QueryIntentsResponse.PageSize"));
		queryIntentsResponse.setTotalCount(context.integerValue("QueryIntentsResponse.TotalCount"));

		List<Intent> intents = new ArrayList<Intent>();
		for (int i = 0; i < context.lengthValue("QueryIntentsResponse.Intents.Length"); i++) {
			Intent intent = new Intent();
			intent.setIntentId(context.longValue("QueryIntentsResponse.Intents["+ i +"].IntentId"));
			intent.setName(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Name"));
			intent.setCreateTime(context.stringValue("QueryIntentsResponse.Intents["+ i +"].CreateTime"));
			intent.setModifyTime(context.stringValue("QueryIntentsResponse.Intents["+ i +"].ModifyTime"));
			intent.setCreateUserId(context.stringValue("QueryIntentsResponse.Intents["+ i +"].CreateUserId"));
			intent.setCreateUserName(context.stringValue("QueryIntentsResponse.Intents["+ i +"].CreateUserName"));
			intent.setModifyUserId(context.stringValue("QueryIntentsResponse.Intents["+ i +"].ModifyUserId"));
			intent.setModifyUserName(context.stringValue("QueryIntentsResponse.Intents["+ i +"].ModifyUserName"));

			List<UserSayItem> userSay = new ArrayList<UserSayItem>();
			for (int j = 0; j < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].UserSay.Length"); j++) {
				UserSayItem userSayItem = new UserSayItem();
				userSayItem.setStrict(context.booleanValue("QueryIntentsResponse.Intents["+ i +"].UserSay["+ j +"].Strict"));

				List<DataItem> data = new ArrayList<DataItem>();
				for (int k = 0; k < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].UserSay["+ j +"].Data.Length"); k++) {
					DataItem dataItem = new DataItem();
					dataItem.setText(context.stringValue("QueryIntentsResponse.Intents["+ i +"].UserSay["+ j +"].Data["+ k +"].Text"));
					dataItem.setSlotId(context.stringValue("QueryIntentsResponse.Intents["+ i +"].UserSay["+ j +"].Data["+ k +"].SlotId"));

					data.add(dataItem);
				}
				userSayItem.setData(data);

				userSay.add(userSayItem);
			}
			intent.setUserSay(userSay);

			List<RuleCheckItem> ruleCheck = new ArrayList<RuleCheckItem>();
			for (int j = 0; j < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck.Length"); j++) {
				RuleCheckItem ruleCheckItem = new RuleCheckItem();
				ruleCheckItem.setText(context.stringValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Text"));
				ruleCheckItem.setStrict(context.booleanValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Strict"));

				List<String> warning = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Warning.Length"); k++) {
					warning.add(context.stringValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Warning["+ k +"]"));
				}
				ruleCheckItem.setWarning(warning);

				List<String> error = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Error.Length"); k++) {
					error.add(context.stringValue("QueryIntentsResponse.Intents["+ i +"].RuleCheck["+ j +"].Error["+ k +"]"));
				}
				ruleCheckItem.setError(error);

				ruleCheck.add(ruleCheckItem);
			}
			intent.setRuleCheck(ruleCheck);

			List<SlotItem> slot = new ArrayList<SlotItem>();
			for (int j = 0; j < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].Slot.Length"); j++) {
				SlotItem slotItem = new SlotItem();
				slotItem.setName(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Name"));
				slotItem.setValue(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Value"));
				slotItem.setIsNecessary(context.booleanValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].IsNecessary"));
				slotItem.setIsArray(context.booleanValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].IsArray"));
				slotItem.setLifeSpan(context.integerValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].LifeSpan"));

				List<String> question = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Question.Length"); k++) {
					question.add(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Question["+ k +"]"));
				}
				slotItem.setQuestion(question);

				List<TagsItem> tags = new ArrayList<TagsItem>();
				for (int k = 0; k < context.lengthValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Tags.Length"); k++) {
					TagsItem tagsItem = new TagsItem();
					tagsItem.setValue(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Tags["+ k +"].Value"));
					tagsItem.setUserSayId(context.stringValue("QueryIntentsResponse.Intents["+ i +"].Slot["+ j +"].Tags["+ k +"].UserSayId"));

					tags.add(tagsItem);
				}
				slotItem.setTags(tags);

				slot.add(slotItem);
			}
			intent.setSlot(slot);

			intents.add(intent);
		}
		queryIntentsResponse.setIntents(intents);
	 
	 	return queryIntentsResponse;
	}
}