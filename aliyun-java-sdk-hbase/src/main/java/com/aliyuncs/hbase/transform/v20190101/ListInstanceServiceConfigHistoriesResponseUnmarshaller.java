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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.ListInstanceServiceConfigHistoriesResponse;
import com.aliyuncs.hbase.model.v20190101.ListInstanceServiceConfigHistoriesResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceServiceConfigHistoriesResponseUnmarshaller {

	public static ListInstanceServiceConfigHistoriesResponse unmarshall(ListInstanceServiceConfigHistoriesResponse listInstanceServiceConfigHistoriesResponse, UnmarshallerContext _ctx) {
		
		listInstanceServiceConfigHistoriesResponse.setRequestId(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.RequestId"));
		listInstanceServiceConfigHistoriesResponse.setPageNumber(_ctx.integerValue("ListInstanceServiceConfigHistoriesResponse.PageNumber"));
		listInstanceServiceConfigHistoriesResponse.setPageRecordCount(_ctx.integerValue("ListInstanceServiceConfigHistoriesResponse.PageRecordCount"));
		listInstanceServiceConfigHistoriesResponse.setTotalRecordCount(_ctx.longValue("ListInstanceServiceConfigHistoriesResponse.TotalRecordCount"));

		List<Config> configureHistoryList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList.Length"); i++) {
			Config config = new Config();
			config.setConfigureName(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList["+ i +"].ConfigureName"));
			config.setOldValue(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList["+ i +"].OldValue"));
			config.setNewValue(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList["+ i +"].NewValue"));
			config.setEffective(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList["+ i +"].Effective"));
			config.setCreateTime(_ctx.stringValue("ListInstanceServiceConfigHistoriesResponse.ConfigureHistoryList["+ i +"].CreateTime"));

			configureHistoryList.add(config);
		}
		listInstanceServiceConfigHistoriesResponse.setConfigureHistoryList(configureHistoryList);
	 
	 	return listInstanceServiceConfigHistoriesResponse;
	}
}