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

package com.aliyuncs.dypnsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dypnsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dypnsapi.model.v20170525.QuerySendDetailsResponse.ModelItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySendDetailsResponseUnmarshaller {

	public static QuerySendDetailsResponse unmarshall(QuerySendDetailsResponse querySendDetailsResponse, UnmarshallerContext _ctx) {
		
		querySendDetailsResponse.setAccessDeniedDetail(_ctx.stringValue("QuerySendDetailsResponse.AccessDeniedDetail"));
		querySendDetailsResponse.setTotalCount(_ctx.longValue("QuerySendDetailsResponse.TotalCount"));
		querySendDetailsResponse.setMessage(_ctx.stringValue("QuerySendDetailsResponse.Message"));
		querySendDetailsResponse.setCode(_ctx.stringValue("QuerySendDetailsResponse.Code"));
		querySendDetailsResponse.setSuccess(_ctx.booleanValue("QuerySendDetailsResponse.Success"));

		List<ModelItem> model = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySendDetailsResponse.Model.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setTemplateCode(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].TemplateCode"));
			modelItem.setReceiveDate(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].ReceiveDate"));
			modelItem.setPhoneNum(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].PhoneNum"));
			modelItem.setContent(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].Content"));
			modelItem.setSendStatus(_ctx.longValue("QuerySendDetailsResponse.Model["+ i +"].SendStatus"));
			modelItem.setOutId(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].OutId"));
			modelItem.setSendDate(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].SendDate"));
			modelItem.setErrCode(_ctx.stringValue("QuerySendDetailsResponse.Model["+ i +"].ErrCode"));

			model.add(modelItem);
		}
		querySendDetailsResponse.setModel(model);
	 
	 	return querySendDetailsResponse;
	}
}