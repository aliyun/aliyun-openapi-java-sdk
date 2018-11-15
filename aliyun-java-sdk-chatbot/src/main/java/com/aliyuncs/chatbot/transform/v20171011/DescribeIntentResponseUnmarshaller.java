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

import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse.RuleCheckItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse.SlotItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse.SlotItem.TagsItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse.UserSayItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeIntentResponse.UserSayItem.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIntentResponseUnmarshaller {

	public static DescribeIntentResponse unmarshall(DescribeIntentResponse describeIntentResponse, UnmarshallerContext context) {
		
		describeIntentResponse.setRequestId(context.stringValue("DescribeIntentResponse.RequestId"));
		describeIntentResponse.setIntentId(context.longValue("DescribeIntentResponse.IntentId"));
		describeIntentResponse.setName(context.stringValue("DescribeIntentResponse.Name"));
		describeIntentResponse.setType(context.stringValue("DescribeIntentResponse.Type"));
		describeIntentResponse.setDialogId(context.longValue("DescribeIntentResponse.DialogId"));
		describeIntentResponse.setCreateTime(context.stringValue("DescribeIntentResponse.CreateTime"));
		describeIntentResponse.setModifyTime(context.stringValue("DescribeIntentResponse.ModifyTime"));
		describeIntentResponse.setCreateUserId(context.stringValue("DescribeIntentResponse.CreateUserId"));
		describeIntentResponse.setCreateUserName(context.stringValue("DescribeIntentResponse.CreateUserName"));
		describeIntentResponse.setModifyUserId(context.stringValue("DescribeIntentResponse.ModifyUserId"));
		describeIntentResponse.setModifyUserName(context.stringValue("DescribeIntentResponse.ModifyUserName"));

		List<RuleCheckItem> ruleCheck = new ArrayList<RuleCheckItem>();
		for (int i = 0; i < context.lengthValue("DescribeIntentResponse.RuleCheck.Length"); i++) {
			RuleCheckItem ruleCheckItem = new RuleCheckItem();
			ruleCheckItem.setText(context.stringValue("DescribeIntentResponse.RuleCheck["+ i +"].Text"));
			ruleCheckItem.setStrict(context.booleanValue("DescribeIntentResponse.RuleCheck["+ i +"].Strict"));

			List<String> warning = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeIntentResponse.RuleCheck["+ i +"].Warning.Length"); j++) {
				warning.add(context.stringValue("DescribeIntentResponse.RuleCheck["+ i +"].Warning["+ j +"]"));
			}
			ruleCheckItem.setWarning(warning);

			List<String> error = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeIntentResponse.RuleCheck["+ i +"].Error.Length"); j++) {
				error.add(context.stringValue("DescribeIntentResponse.RuleCheck["+ i +"].Error["+ j +"]"));
			}
			ruleCheckItem.setError(error);

			ruleCheck.add(ruleCheckItem);
		}
		describeIntentResponse.setRuleCheck(ruleCheck);

		List<SlotItem> slot = new ArrayList<SlotItem>();
		for (int i = 0; i < context.lengthValue("DescribeIntentResponse.Slot.Length"); i++) {
			SlotItem slotItem = new SlotItem();
			slotItem.setName(context.stringValue("DescribeIntentResponse.Slot["+ i +"].Name"));
			slotItem.setValue(context.stringValue("DescribeIntentResponse.Slot["+ i +"].Value"));
			slotItem.setIsNecessary(context.booleanValue("DescribeIntentResponse.Slot["+ i +"].IsNecessary"));
			slotItem.setIsArray(context.booleanValue("DescribeIntentResponse.Slot["+ i +"].IsArray"));
			slotItem.setLifeSpan(context.integerValue("DescribeIntentResponse.Slot["+ i +"].LifeSpan"));

			List<String> question = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeIntentResponse.Slot["+ i +"].Question.Length"); j++) {
				question.add(context.stringValue("DescribeIntentResponse.Slot["+ i +"].Question["+ j +"]"));
			}
			slotItem.setQuestion(question);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("DescribeIntentResponse.Slot["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setValue(context.stringValue("DescribeIntentResponse.Slot["+ i +"].Tags["+ j +"].Value"));
				tagsItem.setUserSayId(context.stringValue("DescribeIntentResponse.Slot["+ i +"].Tags["+ j +"].UserSayId"));

				tags.add(tagsItem);
			}
			slotItem.setTags(tags);

			slot.add(slotItem);
		}
		describeIntentResponse.setSlot(slot);

		List<UserSayItem> userSay = new ArrayList<UserSayItem>();
		for (int i = 0; i < context.lengthValue("DescribeIntentResponse.UserSay.Length"); i++) {
			UserSayItem userSayItem = new UserSayItem();
			userSayItem.setStrict(context.booleanValue("DescribeIntentResponse.UserSay["+ i +"].Strict"));

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < context.lengthValue("DescribeIntentResponse.UserSay["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setText(context.stringValue("DescribeIntentResponse.UserSay["+ i +"].Data["+ j +"].Text"));
				dataItem.setSlotId(context.stringValue("DescribeIntentResponse.UserSay["+ i +"].Data["+ j +"].SlotId"));

				data.add(dataItem);
			}
			userSayItem.setData(data);

			userSay.add(userSayItem);
		}
		describeIntentResponse.setUserSay(userSay);
	 
	 	return describeIntentResponse;
	}
}