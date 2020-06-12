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

	public static SearchProjectsByRegionResponse unmarshall(SearchProjectsByRegionResponse searchProjectsByRegionResponse, UnmarshallerContext _ctx) {
		
		searchProjectsByRegionResponse.setRequestId(_ctx.stringValue("SearchProjectsByRegionResponse.RequestId"));
		searchProjectsByRegionResponse.setCode(_ctx.integerValue("SearchProjectsByRegionResponse.Code"));
		searchProjectsByRegionResponse.setSuccess(_ctx.booleanValue("SearchProjectsByRegionResponse.Success"));
		searchProjectsByRegionResponse.setMessage(_ctx.stringValue("SearchProjectsByRegionResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchProjectsByRegionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFullName(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].FullName"));
			dataItem.setName(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Name"));
			dataItem.setId(_ctx.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].Id"));
			dataItem.setDescription(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Description"));
			dataItem.setMode(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Mode"));
			dataItem.setType(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Type"));
			dataItem.setStamp(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Stamp"));
			dataItem.setStatus(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Status"));
			dataItem.setParentId(_ctx.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].ParentId"));
			dataItem.setIdPath(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].IdPath"));
			dataItem.setAoneType(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].AoneType"));
			dataItem.setAoneId(_ctx.integerValue("SearchProjectsByRegionResponse.Data["+ i +"].AoneId"));

			List<String> icons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchProjectsByRegionResponse.Data["+ i +"].Icons.Length"); j++) {
				icons.add(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].Icons["+ j +"]"));
			}
			dataItem.setIcons(icons);

			List<String> customFieldMap = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchProjectsByRegionResponse.Data["+ i +"].CustomFieldMap.Length"); j++) {
				customFieldMap.add(_ctx.stringValue("SearchProjectsByRegionResponse.Data["+ i +"].CustomFieldMap["+ j +"]"));
			}
			dataItem.setCustomFieldMap(customFieldMap);

			data.add(dataItem);
		}
		searchProjectsByRegionResponse.setData(data);
	 
	 	return searchProjectsByRegionResponse;
	}
}