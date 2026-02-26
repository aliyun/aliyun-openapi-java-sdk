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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateViewsResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateViewsResponse.Views;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateViewsResponse.Views.ViewPluginsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateViewsResponse.Views.ViewPluginsItem.VisitInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskTemplateViewsResponseUnmarshaller {

	public static GetTaskTemplateViewsResponse unmarshall(GetTaskTemplateViewsResponse getTaskTemplateViewsResponse, UnmarshallerContext _ctx) {
		
		getTaskTemplateViewsResponse.setRequestId(_ctx.stringValue("GetTaskTemplateViewsResponse.RequestId"));
		getTaskTemplateViewsResponse.setCode(_ctx.integerValue("GetTaskTemplateViewsResponse.Code"));
		getTaskTemplateViewsResponse.setMessage(_ctx.stringValue("GetTaskTemplateViewsResponse.Message"));
		getTaskTemplateViewsResponse.setSuccess(_ctx.booleanValue("GetTaskTemplateViewsResponse.Success"));
		getTaskTemplateViewsResponse.setDetails(_ctx.stringValue("GetTaskTemplateViewsResponse.Details"));
		getTaskTemplateViewsResponse.setErrorCode(_ctx.stringValue("GetTaskTemplateViewsResponse.ErrorCode"));

		Views views = new Views();

		List<ViewPluginsItem> viewPlugins = new ArrayList<ViewPluginsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateViewsResponse.Views.ViewPlugins.Length"); i++) {
			ViewPluginsItem viewPluginsItem = new ViewPluginsItem();
			viewPluginsItem.setType(_ctx.stringValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].Type"));
			viewPluginsItem.setCorsProxy(_ctx.booleanValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].CorsProxy"));
			viewPluginsItem.setHide(_ctx.booleanValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].Hide"));
			viewPluginsItem.setConvertor(_ctx.stringValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].Convertor"));
			viewPluginsItem.setPlugins(_ctx.mapValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].Plugins"));
			viewPluginsItem.setExif(_ctx.mapValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].Exif"));
			viewPluginsItem.setBindField(_ctx.stringValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].BindField"));
			viewPluginsItem.setDisplayOriImg(_ctx.booleanValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].DisplayOriImg"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			viewPluginsItem.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();
			visitInfo.setOssConf(_ctx.mapValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].VisitInfo.ossConf"));
			visitInfo.setAftsConf(_ctx.mapValue("GetTaskTemplateViewsResponse.Views.ViewPlugins["+ i +"].VisitInfo.aftsConf"));
			viewPluginsItem.setVisitInfo(visitInfo);

			viewPlugins.add(viewPluginsItem);
		}
		views.setViewPlugins(viewPlugins);
		getTaskTemplateViewsResponse.setViews(views);
	 
	 	return getTaskTemplateViewsResponse;
	}
}