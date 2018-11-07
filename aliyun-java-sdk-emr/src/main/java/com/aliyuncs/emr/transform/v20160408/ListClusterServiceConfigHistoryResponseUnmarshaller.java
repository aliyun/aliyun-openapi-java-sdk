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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigHistoryResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigHistoryResponse.ConfigHistory;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigHistoryResponseUnmarshaller {

	public static ListClusterServiceConfigHistoryResponse unmarshall(ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistoryResponse, UnmarshallerContext context) {
		
		listClusterServiceConfigHistoryResponse.setRequestId(context.stringValue("ListClusterServiceConfigHistoryResponse.RequestId"));
		listClusterServiceConfigHistoryResponse.setTotalCount(context.integerValue("ListClusterServiceConfigHistoryResponse.TotalCount"));
		listClusterServiceConfigHistoryResponse.setPageNumber(context.integerValue("ListClusterServiceConfigHistoryResponse.PageNumber"));
		listClusterServiceConfigHistoryResponse.setPageSize(context.integerValue("ListClusterServiceConfigHistoryResponse.PageSize"));

		List<ConfigHistory> configHistoryList = new ArrayList<ConfigHistory>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList.Length"); i++) {
			ConfigHistory configHistory = new ConfigHistory();
			configHistory.setServiceName(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ServiceName"));
			configHistory.setConfigVersion(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigVersion"));
			configHistory.setConfigFileName(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigFileName"));
			configHistory.setConfigItemName(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigItemName"));
			configHistory.setNewValue(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].NewValue"));
			configHistory.setOldValue(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].OldValue"));
			configHistory.setApplied(context.booleanValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Applied"));
			configHistory.setCreateTime(context.longValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].CreateTime"));
			configHistory.setAuthor(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Author"));
			configHistory.setComment(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Comment"));

			configHistoryList.add(configHistory);
		}
		listClusterServiceConfigHistoryResponse.setConfigHistoryList(configHistoryList);
	 
	 	return listClusterServiceConfigHistoryResponse;
	}
}