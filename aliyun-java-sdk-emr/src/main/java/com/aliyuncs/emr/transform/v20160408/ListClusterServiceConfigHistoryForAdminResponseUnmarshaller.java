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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigHistoryForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigHistoryForAdminResponse.ConfigHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigHistoryForAdminResponseUnmarshaller {

	public static ListClusterServiceConfigHistoryForAdminResponse unmarshall(ListClusterServiceConfigHistoryForAdminResponse listClusterServiceConfigHistoryForAdminResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceConfigHistoryForAdminResponse.setRequestId(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.RequestId"));
		listClusterServiceConfigHistoryForAdminResponse.setTotalCount(_ctx.integerValue("ListClusterServiceConfigHistoryForAdminResponse.TotalCount"));
		listClusterServiceConfigHistoryForAdminResponse.setPageNumber(_ctx.integerValue("ListClusterServiceConfigHistoryForAdminResponse.PageNumber"));
		listClusterServiceConfigHistoryForAdminResponse.setPageSize(_ctx.integerValue("ListClusterServiceConfigHistoryForAdminResponse.PageSize"));

		List<ConfigHistory> configHistoryList = new ArrayList<ConfigHistory>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList.Length"); i++) {
			ConfigHistory configHistory = new ConfigHistory();
			configHistory.setServiceName(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].ServiceName"));
			configHistory.setConfigVersion(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].ConfigVersion"));
			configHistory.setConfigFileName(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].ConfigFileName"));
			configHistory.setConfigItemName(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].ConfigItemName"));
			configHistory.setNewValue(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].NewValue"));
			configHistory.setOldValue(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].OldValue"));
			configHistory.setApplied(_ctx.booleanValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].Applied"));
			configHistory.setCreateTime(_ctx.longValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].CreateTime"));
			configHistory.setAuthor(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].Author"));
			configHistory.setComment(_ctx.stringValue("ListClusterServiceConfigHistoryForAdminResponse.ConfigHistoryList["+ i +"].Comment"));

			configHistoryList.add(configHistory);
		}
		listClusterServiceConfigHistoryForAdminResponse.setConfigHistoryList(configHistoryList);
	 
	 	return listClusterServiceConfigHistoryForAdminResponse;
	}
}