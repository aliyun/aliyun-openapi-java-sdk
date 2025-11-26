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

import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentUserSayResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentUserSayResponse.UserSay;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBeebotIntentUserSayResponseUnmarshaller {

	public static ListBeebotIntentUserSayResponse unmarshall(ListBeebotIntentUserSayResponse listBeebotIntentUserSayResponse, UnmarshallerContext _ctx) {
		
		listBeebotIntentUserSayResponse.setRequestId(_ctx.stringValue("ListBeebotIntentUserSayResponse.RequestId"));
		listBeebotIntentUserSayResponse.setHttpStatusCode(_ctx.integerValue("ListBeebotIntentUserSayResponse.HttpStatusCode"));
		listBeebotIntentUserSayResponse.setSuccess(_ctx.booleanValue("ListBeebotIntentUserSayResponse.Success"));
		listBeebotIntentUserSayResponse.setBeebotRequestId(_ctx.stringValue("ListBeebotIntentUserSayResponse.BeebotRequestId"));
		listBeebotIntentUserSayResponse.setCode(_ctx.stringValue("ListBeebotIntentUserSayResponse.Code"));
		listBeebotIntentUserSayResponse.setMessage(_ctx.stringValue("ListBeebotIntentUserSayResponse.Message"));
		listBeebotIntentUserSayResponse.setPageSize(_ctx.integerValue("ListBeebotIntentUserSayResponse.PageSize"));
		listBeebotIntentUserSayResponse.setPageNumber(_ctx.integerValue("ListBeebotIntentUserSayResponse.PageNumber"));
		listBeebotIntentUserSayResponse.setTotalCount(_ctx.integerValue("ListBeebotIntentUserSayResponse.TotalCount"));

		List<UserSay> userSays = new ArrayList<UserSay>();
		for (int i = 0; i < _ctx.lengthValue("ListBeebotIntentUserSayResponse.UserSays.Length"); i++) {
			UserSay userSay = new UserSay();
			userSay.setUserSayId(_ctx.stringValue("ListBeebotIntentUserSayResponse.UserSays["+ i +"].UserSayId"));
			userSay.setContent(_ctx.stringValue("ListBeebotIntentUserSayResponse.UserSays["+ i +"].Content"));
			userSay.setCreateTime(_ctx.stringValue("ListBeebotIntentUserSayResponse.UserSays["+ i +"].CreateTime"));
			userSay.setModifyTime(_ctx.stringValue("ListBeebotIntentUserSayResponse.UserSays["+ i +"].ModifyTime"));
			userSay.setIntentId(_ctx.longValue("ListBeebotIntentUserSayResponse.UserSays["+ i +"].IntentId"));

			userSays.add(userSay);
		}
		listBeebotIntentUserSayResponse.setUserSays(userSays);
	 
	 	return listBeebotIntentUserSayResponse;
	}
}