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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.ListUserIntentionsResponse;
import com.aliyuncs.companyreg.model.v20200306.ListUserIntentionsResponse.Intention;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserIntentionsResponseUnmarshaller {

	public static ListUserIntentionsResponse unmarshall(ListUserIntentionsResponse listUserIntentionsResponse, UnmarshallerContext _ctx) {
		
		listUserIntentionsResponse.setRequestId(_ctx.stringValue("ListUserIntentionsResponse.RequestId"));
		listUserIntentionsResponse.setTotalItemNum(_ctx.integerValue("ListUserIntentionsResponse.TotalItemNum"));
		listUserIntentionsResponse.setCurrentPageNum(_ctx.integerValue("ListUserIntentionsResponse.CurrentPageNum"));
		listUserIntentionsResponse.setPageSize(_ctx.integerValue("ListUserIntentionsResponse.PageSize"));
		listUserIntentionsResponse.setTotalPageNum(_ctx.integerValue("ListUserIntentionsResponse.TotalPageNum"));

		List<Intention> data = new ArrayList<Intention>();
		for (int i = 0; i < _ctx.lengthValue("ListUserIntentionsResponse.Data.Length"); i++) {
			Intention intention = new Intention();
			intention.setUserId(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].UserId"));
			intention.setMobile(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].Mobile"));
			intention.setContactName(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].ContactName"));
			intention.setBizType(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].BizType"));
			intention.setBizId(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].BizId"));
			intention.setDescription(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].Description"));
			intention.setStatus(_ctx.integerValue("ListUserIntentionsResponse.Data["+ i +"].Status"));
			intention.setUpdateTime(_ctx.longValue("ListUserIntentionsResponse.Data["+ i +"].UpdateTime"));
			intention.setCreateTime(_ctx.longValue("ListUserIntentionsResponse.Data["+ i +"].CreateTime"));
			intention.setArea(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].Area"));
			intention.setReason(_ctx.stringValue("ListUserIntentionsResponse.Data["+ i +"].Reason"));

			data.add(intention);
		}
		listUserIntentionsResponse.setData(data);
	 
	 	return listUserIntentionsResponse;
	}
}