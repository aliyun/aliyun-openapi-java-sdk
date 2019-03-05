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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.SearchProjectsByRegionResponse;
import com.aliyuncs.rdc.model.v20180821.SearchProjectsByRegionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchProjectsByRegionResponseUnmarshaller {

	public static SearchProjectsByRegionResponse unmarshall(SearchProjectsByRegionResponse searchProjectsByRegionResponse, UnmarshallerContext context) {
		
		searchProjectsByRegionResponse.setRequestId(context.stringValue("SearchProjectsByRegionResponse.RequestId"));
		searchProjectsByRegionResponse.setCode(context.integerValue("SearchProjectsByRegionResponse.Code"));
		searchProjectsByRegionResponse.setSuccess(context.booleanValue("SearchProjectsByRegionResponse.Success"));
		searchProjectsByRegionResponse.setMessage(context.stringValue("SearchProjectsByRegionResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("SearchProjectsByRegionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFullName(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].FullName"));
			dataItem.setName(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Name"));
			dataItem.setId(context.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].Id"));
			dataItem.setDescription(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Description"));
			dataItem.setMode(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Mode"));
			dataItem.setType(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Type"));
			dataItem.setStamp(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Stamp"));
			dataItem.setStatus(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Status"));
			dataItem.setParentId(context.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].ParentId"));
			dataItem.setIdPath(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].IdPath"));
			dataItem.setAoneType(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].AoneType"));
			dataItem.setAoneId(context.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].AoneId"));

			List<String> icons = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchProjectsByRegionResponse.Data["+ i +"].Icons.Length"); j++) {
				icons.add(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Icons["+ j +"]"));
			}
			dataItem.setIcons(icons);

			List<String> customFieldMap = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchProjectsByRegionResponse.Data["+ i +"].CustomFieldMap.Length"); j++) {
				customFieldMap.add(context.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].CustomFieldMap["+ j +"]"));
			}
			dataItem.setCustomFieldMap(customFieldMap);

			data.add(dataItem);
		}
		searchProjectsByRegionResponse.setData(data);
	 
	 	return searchProjectsByRegionResponse;
	}
}