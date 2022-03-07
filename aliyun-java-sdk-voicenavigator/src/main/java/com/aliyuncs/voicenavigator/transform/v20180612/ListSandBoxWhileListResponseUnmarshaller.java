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

import com.aliyuncs.voicenavigator.model.v20180612.ListSandBoxWhileListResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListSandBoxWhileListResponse.WhiteListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSandBoxWhileListResponseUnmarshaller {

	public static ListSandBoxWhileListResponse unmarshall(ListSandBoxWhileListResponse listSandBoxWhileListResponse, UnmarshallerContext _ctx) {
		
		listSandBoxWhileListResponse.setRequestId(_ctx.stringValue("ListSandBoxWhileListResponse.RequestId"));
		listSandBoxWhileListResponse.setPageSize(_ctx.integerValue("ListSandBoxWhileListResponse.PageSize"));
		listSandBoxWhileListResponse.setPageNumber(_ctx.integerValue("ListSandBoxWhileListResponse.PageNumber"));
		listSandBoxWhileListResponse.setTotalCount(_ctx.longValue("ListSandBoxWhileListResponse.TotalCount"));

		List<WhiteListItem> whiteList = new ArrayList<WhiteListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSandBoxWhileListResponse.WhiteList.Length"); i++) {
			WhiteListItem whiteListItem = new WhiteListItem();
			whiteListItem.setUuid(_ctx.stringValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].Uuid"));
			whiteListItem.setPhoneNumber(_ctx.stringValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].PhoneNumber"));
			whiteListItem.setDescription(_ctx.stringValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].Description"));
			whiteListItem.setIsEnable(_ctx.integerValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].IsEnable"));
			whiteListItem.setGmtCreate(_ctx.longValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].GmtCreate"));
			whiteListItem.setInstanceId(_ctx.stringValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].InstanceId"));
			whiteListItem.setGmtModified(_ctx.longValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].GmtModified"));
			whiteListItem.setName(_ctx.stringValue("ListSandBoxWhileListResponse.WhiteList["+ i +"].Name"));

			whiteList.add(whiteListItem);
		}
		listSandBoxWhileListResponse.setWhiteList(whiteList);
	 
	 	return listSandBoxWhileListResponse;
	}
}