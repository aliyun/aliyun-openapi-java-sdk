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

import com.aliyuncs.hbase.model.v20190101.ListInstanceServiceConfigurationsResponse;
import com.aliyuncs.hbase.model.v20190101.ListInstanceServiceConfigurationsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceServiceConfigurationsResponseUnmarshaller {

	public static ListInstanceServiceConfigurationsResponse unmarshall(ListInstanceServiceConfigurationsResponse listInstanceServiceConfigurationsResponse, UnmarshallerContext _ctx) {
		
		listInstanceServiceConfigurationsResponse.setRequestId(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.RequestId"));
		listInstanceServiceConfigurationsResponse.setPageNumber(_ctx.integerValue("ListInstanceServiceConfigurationsResponse.PageNumber"));
		listInstanceServiceConfigurationsResponse.setPageRecordCount(_ctx.integerValue("ListInstanceServiceConfigurationsResponse.PageRecordCount"));
		listInstanceServiceConfigurationsResponse.setTotalRecordCount(_ctx.longValue("ListInstanceServiceConfigurationsResponse.TotalRecordCount"));

		List<Config> configureList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceServiceConfigurationsResponse.ConfigureList.Length"); i++) {
			Config config = new Config();
			config.setConfigureName(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].ConfigureName"));
			config.setDefaultValue(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].DefaultValue"));
			config.setRunningValue(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].RunningValue"));
			config.setConfigureUnit(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].ConfigureUnit"));
			config.setValueRange(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].ValueRange"));
			config.setNeedRestart(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].NeedRestart"));
			config.setDescription(_ctx.stringValue("ListInstanceServiceConfigurationsResponse.ConfigureList["+ i +"].Description"));

			configureList.add(config);
		}
		listInstanceServiceConfigurationsResponse.setConfigureList(configureList);
	 
	 	return listInstanceServiceConfigurationsResponse;
	}
}