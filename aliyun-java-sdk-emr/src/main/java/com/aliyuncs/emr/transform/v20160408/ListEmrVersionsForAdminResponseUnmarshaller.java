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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListEmrVersionsForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListEmrVersionsForAdminResponse.MainVersionKeyValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrVersionsForAdminResponseUnmarshaller {

	public static ListEmrVersionsForAdminResponse unmarshall(ListEmrVersionsForAdminResponse listEmrVersionsForAdminResponse, UnmarshallerContext context) {
		
		listEmrVersionsForAdminResponse.setRequestId(context.stringValue("ListEmrVersionsForAdminResponse.RequestId"));
		listEmrVersionsForAdminResponse.setPageNumber(context.integerValue("ListEmrVersionsForAdminResponse.PageNumber"));
		listEmrVersionsForAdminResponse.setPageSize(context.integerValue("ListEmrVersionsForAdminResponse.PageSize"));
		listEmrVersionsForAdminResponse.setTotalCount(context.integerValue("ListEmrVersionsForAdminResponse.TotalCount"));

		List<MainVersionKeyValue> mainVersionKeyValueList = new ArrayList<MainVersionKeyValue>();
		for (int i = 0; i < context.lengthValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList.Length"); i++) {
			MainVersionKeyValue mainVersionKeyValue = new MainVersionKeyValue();
			mainVersionKeyValue.setId(context.integerValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].Id"));
			mainVersionKeyValue.setKey(context.stringValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].Key"));
			mainVersionKeyValue.setValue(context.stringValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].Value"));
			mainVersionKeyValue.setStatus(context.integerValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].Status"));
			mainVersionKeyValue.setUtcCreateTimestamp(context.longValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].UtcCreateTimestamp"));
			mainVersionKeyValue.setUtcModifiedTimestamp(context.longValue("ListEmrVersionsForAdminResponse.MainVersionKeyValueList["+ i +"].UtcModifiedTimestamp"));

			mainVersionKeyValueList.add(mainVersionKeyValue);
		}
		listEmrVersionsForAdminResponse.setMainVersionKeyValueList(mainVersionKeyValueList);
	 
	 	return listEmrVersionsForAdminResponse;
	}
}