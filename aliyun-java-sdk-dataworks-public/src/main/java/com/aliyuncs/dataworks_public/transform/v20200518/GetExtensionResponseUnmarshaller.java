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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetExtensionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetExtensionResponse.Extension;
import com.aliyuncs.dataworks_public.model.v20200518.GetExtensionResponse.Extension.BindEventListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetExtensionResponse.Extension.EventCategoryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExtensionResponseUnmarshaller {

	public static GetExtensionResponse unmarshall(GetExtensionResponse getExtensionResponse, UnmarshallerContext _ctx) {
		
		getExtensionResponse.setRequestId(_ctx.stringValue("GetExtensionResponse.RequestId"));

		Extension extension = new Extension();
		extension.setExtensionCode(_ctx.stringValue("GetExtensionResponse.Extension.ExtensionCode"));
		extension.setExtensionName(_ctx.stringValue("GetExtensionResponse.Extension.ExtensionName"));
		extension.setExtensionDesc(_ctx.stringValue("GetExtensionResponse.Extension.ExtensionDesc"));
		extension.setHelpDocUrl(_ctx.stringValue("GetExtensionResponse.Extension.HelpDocUrl"));
		extension.setStatus(_ctx.integerValue("GetExtensionResponse.Extension.Status"));
		extension.setProjectTesting(_ctx.longValue("GetExtensionResponse.Extension.ProjectTesting"));
		extension.setDetailUrl(_ctx.stringValue("GetExtensionResponse.Extension.DetailUrl"));
		extension.setParameterSetting(_ctx.stringValue("GetExtensionResponse.Extension.ParameterSetting"));
		extension.setOptionSetting(_ctx.stringValue("GetExtensionResponse.Extension.OptionSetting"));

		List<BindEventListItem> bindEventList = new ArrayList<BindEventListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetExtensionResponse.Extension.BindEventList.Length"); i++) {
			BindEventListItem bindEventListItem = new BindEventListItem();
			bindEventListItem.setEventCode(_ctx.stringValue("GetExtensionResponse.Extension.BindEventList["+ i +"].EventCode"));
			bindEventListItem.setEventName(_ctx.stringValue("GetExtensionResponse.Extension.BindEventList["+ i +"].EventName"));

			bindEventList.add(bindEventListItem);
		}
		extension.setBindEventList(bindEventList);

		List<EventCategoryListItem> eventCategoryList = new ArrayList<EventCategoryListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetExtensionResponse.Extension.EventCategoryList.Length"); i++) {
			EventCategoryListItem eventCategoryListItem = new EventCategoryListItem();
			eventCategoryListItem.setCategoryCode(_ctx.stringValue("GetExtensionResponse.Extension.EventCategoryList["+ i +"].CategoryCode"));
			eventCategoryListItem.setCategoryName(_ctx.stringValue("GetExtensionResponse.Extension.EventCategoryList["+ i +"].CategoryName"));

			eventCategoryList.add(eventCategoryListItem);
		}
		extension.setEventCategoryList(eventCategoryList);
		getExtensionResponse.setExtension(extension);
	 
	 	return getExtensionResponse;
	}
}