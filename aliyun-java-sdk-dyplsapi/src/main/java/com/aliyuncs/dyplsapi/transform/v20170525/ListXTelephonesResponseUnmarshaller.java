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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.ListXTelephonesResponse;
import com.aliyuncs.dyplsapi.model.v20170525.ListXTelephonesResponse.Data;
import com.aliyuncs.dyplsapi.model.v20170525.ListXTelephonesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListXTelephonesResponseUnmarshaller {

	public static ListXTelephonesResponse unmarshall(ListXTelephonesResponse listXTelephonesResponse, UnmarshallerContext _ctx) {
		
		listXTelephonesResponse.setAccessDeniedDetail(_ctx.stringValue("ListXTelephonesResponse.AccessDeniedDetail"));
		listXTelephonesResponse.setMessage(_ctx.stringValue("ListXTelephonesResponse.Message"));
		listXTelephonesResponse.setCode(_ctx.stringValue("ListXTelephonesResponse.Code"));
		listXTelephonesResponse.setSuccess(_ctx.booleanValue("ListXTelephonesResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.longValue("ListXTelephonesResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListXTelephonesResponse.Data.Total"));
		data.setPageNo(_ctx.longValue("ListXTelephonesResponse.Data.PageNo"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListXTelephonesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBuyTime(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].BuyTime"));
			listItem.setTelephoneStatus(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].TelephoneStatus"));
			listItem.setCustomerPoolKey(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].CustomerPoolKey"));
			listItem.setBindTime(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].BindTime"));
			listItem.setCustomerPoolName(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].CustomerPoolName"));
			listItem.setTelephone(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].Telephone"));
			listItem.setSmsStatus(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].SmsStatus"));
			listItem.setReleaseTime(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].ReleaseTime"));
			listItem.setAuthMsg(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].AuthMsg"));
			listItem.setUnbindTime(_ctx.stringValue("ListXTelephonesResponse.Data.List["+ i +"].UnbindTime"));

			list.add(listItem);
		}
		data.setList(list);
		listXTelephonesResponse.setData(data);
	 
	 	return listXTelephonesResponse;
	}
}