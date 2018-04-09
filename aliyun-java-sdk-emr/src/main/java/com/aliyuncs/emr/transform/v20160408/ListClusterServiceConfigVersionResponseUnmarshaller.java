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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigVersionResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigVersionResponse.ConfigVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigVersionResponseUnmarshaller {

	public static ListClusterServiceConfigVersionResponse unmarshall(ListClusterServiceConfigVersionResponse listClusterServiceConfigVersionResponse, UnmarshallerContext context) {
		
		listClusterServiceConfigVersionResponse.setRequestId(context.stringValue("ListClusterServiceConfigVersionResponse.RequestId"));
		listClusterServiceConfigVersionResponse.setPageNumber(context.integerValue("ListClusterServiceConfigVersionResponse.PageNumber"));
		listClusterServiceConfigVersionResponse.setPageSize(context.integerValue("ListClusterServiceConfigVersionResponse.PageSize"));
		listClusterServiceConfigVersionResponse.setTotalCount(context.integerValue("ListClusterServiceConfigVersionResponse.TotalCount"));

		List<ConfigVersion> configVersionList = new ArrayList<ConfigVersion>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceConfigVersionResponse.ConfigVersionList.Length"); i++) {
			ConfigVersion configVersion = new ConfigVersion();
			configVersion.setConfigVersion(context.stringValue("ListClusterServiceConfigVersionResponse.ConfigVersionList["+ i +"].ConfigVersion"));
			configVersion.setApplied(context.booleanValue("ListClusterServiceConfigVersionResponse.ConfigVersionList["+ i +"].Applied"));
			configVersion.setCreateTime(context.longValue("ListClusterServiceConfigVersionResponse.ConfigVersionList["+ i +"].CreateTime"));
			configVersion.setAuthor(context.stringValue("ListClusterServiceConfigVersionResponse.ConfigVersionList["+ i +"].Author"));
			configVersion.setComment(context.stringValue("ListClusterServiceConfigVersionResponse.ConfigVersionList["+ i +"].Comment"));

			configVersionList.add(configVersion);
		}
		listClusterServiceConfigVersionResponse.setConfigVersionList(configVersionList);
	 
	 	return listClusterServiceConfigVersionResponse;
	}
}