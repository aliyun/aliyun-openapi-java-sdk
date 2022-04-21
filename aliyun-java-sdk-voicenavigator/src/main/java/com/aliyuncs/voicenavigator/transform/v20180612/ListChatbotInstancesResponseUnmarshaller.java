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

import com.aliyuncs.voicenavigator.model.v20180612.ListChatbotInstancesResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListChatbotInstancesResponse.Bot;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChatbotInstancesResponseUnmarshaller {

	public static ListChatbotInstancesResponse unmarshall(ListChatbotInstancesResponse listChatbotInstancesResponse, UnmarshallerContext _ctx) {
		
		listChatbotInstancesResponse.setRequestId(_ctx.stringValue("ListChatbotInstancesResponse.RequestId"));
		listChatbotInstancesResponse.setTotalCount(_ctx.longValue("ListChatbotInstancesResponse.TotalCount"));
		listChatbotInstancesResponse.setPageSize(_ctx.longValue("ListChatbotInstancesResponse.PageSize"));
		listChatbotInstancesResponse.setPageNumber(_ctx.integerValue("ListChatbotInstancesResponse.PageNumber"));

		List<Bot> bots = new ArrayList<Bot>();
		for (int i = 0; i < _ctx.lengthValue("ListChatbotInstancesResponse.Bots.Length"); i++) {
			Bot bot = new Bot();
			bot.setIntroduction(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].Introduction"));
			bot.setAvatar(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].Avatar"));
			bot.setTimeZone(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].TimeZone"));
			bot.setCreateTime(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].CreateTime"));
			bot.setLanguageCode(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].LanguageCode"));
			bot.setInstanceId(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].InstanceId"));
			bot.setName(_ctx.stringValue("ListChatbotInstancesResponse.Bots["+ i +"].Name"));

			bots.add(bot);
		}
		listChatbotInstancesResponse.setBots(bots);
	 
	 	return listChatbotInstancesResponse;
	}
}