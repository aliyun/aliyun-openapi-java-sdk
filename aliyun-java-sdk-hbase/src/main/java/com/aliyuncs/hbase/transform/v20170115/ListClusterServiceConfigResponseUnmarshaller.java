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

import com.aliyuncs.hbase.model.v20170115.ListClusterServiceConfigResponse;
import com.aliyuncs.hbase.model.v20170115.ListClusterServiceConfigResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigResponseUnmarshaller {

	public static ListClusterServiceConfigResponse unmarshall(ListClusterServiceConfigResponse listClusterServiceConfigResponse, UnmarshallerContext context) {
		
		listClusterServiceConfigResponse.setRequestId(context.stringValue("ListClusterServiceConfigResponse.RequestId"));
		listClusterServiceConfigResponse.setPageNumber(context.integerValue("ListClusterServiceConfigResponse.PageNumber"));
		listClusterServiceConfigResponse.setTotalRecordCount(context.integerValue("ListClusterServiceConfigResponse.TotalRecordCount"));
		listClusterServiceConfigResponse.setPageRecordCount(context.integerValue("ListClusterServiceConfigResponse.PageRecordCount"));
		listClusterServiceConfigResponse.setClusterId(context.stringValue("ListClusterServiceConfigResponse.ClusterId"));
		listClusterServiceConfigResponse.setClusterName(context.stringValue("ListClusterServiceConfigResponse.ClusterName"));

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceConfigResponse.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setName(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].Name"));
			config.setDefaultValue(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].DefaultValue"));
			config.setRunningValue(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].RunningValue"));
			config.setUnit(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].Unit"));
			config.setValueRange(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].ValueRange"));
			config.setNeedRestart(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].NeedRestart"));
			config.setDescription(context.stringValue("ListClusterServiceConfigResponse.ConfigList["+ i +"].Description"));

			configList.add(config);
		}
		listClusterServiceConfigResponse.setConfigList(configList);
	 
	 	return listClusterServiceConfigResponse;
	}
}