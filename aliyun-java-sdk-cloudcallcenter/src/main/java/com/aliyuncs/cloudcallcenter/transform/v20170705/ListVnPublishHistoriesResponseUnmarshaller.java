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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnPublishHistoriesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnPublishHistoriesResponse.PublishHistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnPublishHistoriesResponseUnmarshaller {

	public static ListVnPublishHistoriesResponse unmarshall(ListVnPublishHistoriesResponse listVnPublishHistoriesResponse, UnmarshallerContext context) {
		
		listVnPublishHistoriesResponse.setRequestId(context.stringValue("ListVnPublishHistoriesResponse.RequestId"));
		listVnPublishHistoriesResponse.setTotalCount(context.integerValue("ListVnPublishHistoriesResponse.TotalCount"));
		listVnPublishHistoriesResponse.setPageNumber(context.integerValue("ListVnPublishHistoriesResponse.PageNumber"));
		listVnPublishHistoriesResponse.setPageSize(context.integerValue("ListVnPublishHistoriesResponse.PageSize"));

		List<PublishHistoriesItem> publishHistories = new ArrayList<PublishHistoriesItem>();
		for (int i = 0; i < context.lengthValue("ListVnPublishHistoriesResponse.PublishHistories.Length"); i++) {
			PublishHistoriesItem publishHistoriesItem = new PublishHistoriesItem();
			publishHistoriesItem.setInstanceId(context.stringValue("ListVnPublishHistoriesResponse.PublishHistories["+ i +"].InstanceId"));
			publishHistoriesItem.setVersion(context.stringValue("ListVnPublishHistoriesResponse.PublishHistories["+ i +"].Version"));
			publishHistoriesItem.setPublishUserName(context.stringValue("ListVnPublishHistoriesResponse.PublishHistories["+ i +"].PublishUserName"));
			publishHistoriesItem.setPublishTime(context.longValue("ListVnPublishHistoriesResponse.PublishHistories["+ i +"].PublishTime"));
			publishHistoriesItem.setIsRollbackApplicable(context.booleanValue("ListVnPublishHistoriesResponse.PublishHistories["+ i +"].IsRollbackApplicable"));

			publishHistories.add(publishHistoriesItem);
		}
		listVnPublishHistoriesResponse.setPublishHistories(publishHistories);
	 
	 	return listVnPublishHistoriesResponse;
	}
}