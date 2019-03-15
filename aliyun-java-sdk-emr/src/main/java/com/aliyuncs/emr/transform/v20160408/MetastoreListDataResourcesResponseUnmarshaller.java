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

import com.aliyuncs.emr.model.v20160408.MetastoreListDataResourcesResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListDataResourcesResponse.DataResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListDataResourcesResponseUnmarshaller {

	public static MetastoreListDataResourcesResponse unmarshall(MetastoreListDataResourcesResponse metastoreListDataResourcesResponse, UnmarshallerContext context) {
		
		metastoreListDataResourcesResponse.setRequestId(context.stringValue("MetastoreListDataResourcesResponse.RequestId"));

		List<DataResourceInfo> dataResources = new ArrayList<DataResourceInfo>();
		for (int i = 0; i < context.lengthValue("MetastoreListDataResourcesResponse.DataResources.Length"); i++) {
			DataResourceInfo dataResourceInfo = new DataResourceInfo();
			dataResourceInfo.setId(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].Id"));
			dataResourceInfo.setRegionId(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].RegionId"));
			dataResourceInfo.setName(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].Name"));
			dataResourceInfo.setMetaType(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].MetaType"));
			dataResourceInfo.setClusterId(context.longValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].ClusterId"));
			dataResourceInfo.setAccessType(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].AccessType"));
			dataResourceInfo.set_Default(context.booleanValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].Default"));
			dataResourceInfo.setDescription(context.stringValue("MetastoreListDataResourcesResponse.DataResources["+ i +"].Description"));

			dataResources.add(dataResourceInfo);
		}
		metastoreListDataResourcesResponse.setDataResources(dataResources);
	 
	 	return metastoreListDataResourcesResponse;
	}
}