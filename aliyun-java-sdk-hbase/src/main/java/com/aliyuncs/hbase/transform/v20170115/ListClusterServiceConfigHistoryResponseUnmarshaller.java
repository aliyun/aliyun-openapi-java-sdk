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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.ListClusterServiceConfigHistoryResponse;
import com.aliyuncs.hbase.model.v20170115.ListClusterServiceConfigHistoryResponse.ConfigHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigHistoryResponseUnmarshaller {

	public static ListClusterServiceConfigHistoryResponse unmarshall(ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistoryResponse, UnmarshallerContext context) {
		
		listClusterServiceConfigHistoryResponse.setRequestId(context.stringValue("ListClusterServiceConfigHistoryResponse.RequestId"));
		listClusterServiceConfigHistoryResponse.setPageNumber(context.integerValue("ListClusterServiceConfigHistoryResponse.PageNumber"));
		listClusterServiceConfigHistoryResponse.setTotalRecordCount(context.integerValue("ListClusterServiceConfigHistoryResponse.TotalRecordCount"));
		listClusterServiceConfigHistoryResponse.setPageRecordCount(context.integerValue("ListClusterServiceConfigHistoryResponse.PageRecordCount"));

		List<ConfigHistory> configHistoryList = new ArrayList<ConfigHistory>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList.Length"); i++) {
			ConfigHistory configHistory = new ConfigHistory();
			configHistory.setName(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Name"));
			configHistory.setOldValue(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].OldValue"));
			configHistory.setNewValue(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].NewValue"));
			configHistory.setEffective(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Effective"));
			configHistory.setCreateTime(context.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].CreateTime"));

			configHistoryList.add(configHistory);
		}
		listClusterServiceConfigHistoryResponse.setConfigHistoryList(configHistoryList);
	 
	 	return listClusterServiceConfigHistoryResponse;
	}
}