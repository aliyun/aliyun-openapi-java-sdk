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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigHistoryResponseUnmarshaller {

	public static ListClusterServiceConfigHistoryResponse unmarshall(ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistoryResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceConfigHistoryResponse.setRequestId(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.RequestId"));
		listClusterServiceConfigHistoryResponse.setTotalCount(_ctx.integerValue("ListClusterServiceConfigHistoryResponse.TotalCount"));
		listClusterServiceConfigHistoryResponse.setPageNumber(_ctx.integerValue("ListClusterServiceConfigHistoryResponse.PageNumber"));
		listClusterServiceConfigHistoryResponse.setPageSize(_ctx.integerValue("ListClusterServiceConfigHistoryResponse.PageSize"));

		List<ConfigHistory> configHistoryList = new ArrayList<ConfigHistory>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList.Length"); i++) {
			ConfigHistory configHistory = new ConfigHistory();
			configHistory.setServiceName(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ServiceName"));
			configHistory.setConfigVersion(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigVersion"));
			configHistory.setConfigFileName(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigFileName"));
			configHistory.setConfigItemName(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].ConfigItemName"));
			configHistory.setNewValue(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].NewValue"));
			configHistory.setOldValue(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].OldValue"));
			configHistory.setApplied(_ctx.booleanValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Applied"));
			configHistory.setCreateTime(_ctx.longValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].CreateTime"));
			configHistory.setAuthor(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Author"));
			configHistory.setComment(_ctx.stringValue("ListClusterServiceConfigHistoryResponse.ConfigHistoryList["+ i +"].Comment"));

			configHistoryList.add(configHistory);
		}
		listClusterServiceConfigHistoryResponse.setConfigHistoryList(configHistoryList);
	 
	 	return listClusterServiceConfigHistoryResponse;
	}
}