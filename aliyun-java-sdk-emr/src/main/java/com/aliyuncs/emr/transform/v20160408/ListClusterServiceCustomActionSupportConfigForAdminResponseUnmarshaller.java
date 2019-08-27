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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceCustomActionSupportConfigForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceCustomActionSupportConfigForAdminResponse.SupportedConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceCustomActionSupportConfigForAdminResponseUnmarshaller {

	public static ListClusterServiceCustomActionSupportConfigForAdminResponse unmarshall(ListClusterServiceCustomActionSupportConfigForAdminResponse listClusterServiceCustomActionSupportConfigForAdminResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceCustomActionSupportConfigForAdminResponse.setRequestId(_ctx.stringValue("ListClusterServiceCustomActionSupportConfigForAdminResponse.RequestId"));

		List<SupportedConfig> supportedConfigList = new ArrayList<SupportedConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceCustomActionSupportConfigForAdminResponse.SupportedConfigList.Length"); i++) {
			SupportedConfig supportedConfig = new SupportedConfig();
			supportedConfig.setConfigKey(_ctx.stringValue("ListClusterServiceCustomActionSupportConfigForAdminResponse.SupportedConfigList["+ i +"].ConfigKey"));

			supportedConfigList.add(supportedConfig);
		}
		listClusterServiceCustomActionSupportConfigForAdminResponse.setSupportedConfigList(supportedConfigList);
	 
	 	return listClusterServiceCustomActionSupportConfigForAdminResponse;
	}
}