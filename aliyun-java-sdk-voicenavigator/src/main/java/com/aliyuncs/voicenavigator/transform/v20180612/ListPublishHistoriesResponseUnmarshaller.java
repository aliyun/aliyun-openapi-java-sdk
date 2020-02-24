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

import com.aliyuncs.voicenavigator.model.v20180612.ListPublishHistoriesResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListPublishHistoriesResponse.PublishHistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishHistoriesResponseUnmarshaller {

	public static ListPublishHistoriesResponse unmarshall(ListPublishHistoriesResponse listPublishHistoriesResponse, UnmarshallerContext _ctx) {
		
		listPublishHistoriesResponse.setRequestId(_ctx.stringValue("ListPublishHistoriesResponse.RequestId"));
		listPublishHistoriesResponse.setTotalCount(_ctx.integerValue("ListPublishHistoriesResponse.TotalCount"));
		listPublishHistoriesResponse.setPageNumber(_ctx.integerValue("ListPublishHistoriesResponse.PageNumber"));
		listPublishHistoriesResponse.setPageSize(_ctx.integerValue("ListPublishHistoriesResponse.PageSize"));

		List<PublishHistoriesItem> publishHistories = new ArrayList<PublishHistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPublishHistoriesResponse.PublishHistories.Length"); i++) {
			PublishHistoriesItem publishHistoriesItem = new PublishHistoriesItem();
			publishHistoriesItem.setInstanceId(_ctx.stringValue("ListPublishHistoriesResponse.PublishHistories["+ i +"].InstanceId"));
			publishHistoriesItem.setVersion(_ctx.stringValue("ListPublishHistoriesResponse.PublishHistories["+ i +"].Version"));
			publishHistoriesItem.setPublishUserName(_ctx.stringValue("ListPublishHistoriesResponse.PublishHistories["+ i +"].PublishUserName"));
			publishHistoriesItem.setPublishTime(_ctx.longValue("ListPublishHistoriesResponse.PublishHistories["+ i +"].PublishTime"));
			publishHistoriesItem.setIsRollbackApplicable(_ctx.booleanValue("ListPublishHistoriesResponse.PublishHistories["+ i +"].IsRollbackApplicable"));

			publishHistories.add(publishHistoriesItem);
		}
		listPublishHistoriesResponse.setPublishHistories(publishHistories);
	 
	 	return listPublishHistoriesResponse;
	}
}