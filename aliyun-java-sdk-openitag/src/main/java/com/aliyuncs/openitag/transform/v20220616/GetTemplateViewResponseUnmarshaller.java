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

import com.aliyuncs.openitag.model.v20220616.GetTemplateViewResponse;
import com.aliyuncs.openitag.model.v20220616.GetTemplateViewResponse.ViewConfigs;
import com.aliyuncs.openitag.model.v20220616.GetTemplateViewResponse.ViewConfigs.ViewPluginsItem;
import com.aliyuncs.openitag.model.v20220616.GetTemplateViewResponse.ViewConfigs.ViewPluginsItem.VisitInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateViewResponseUnmarshaller {

	public static GetTemplateViewResponse unmarshall(GetTemplateViewResponse getTemplateViewResponse, UnmarshallerContext _ctx) {
		
		getTemplateViewResponse.setRequestId(_ctx.stringValue("GetTemplateViewResponse.RequestId"));
		getTemplateViewResponse.setCode(_ctx.integerValue("GetTemplateViewResponse.Code"));
		getTemplateViewResponse.setMessage(_ctx.stringValue("GetTemplateViewResponse.Message"));
		getTemplateViewResponse.setDetails(_ctx.stringValue("GetTemplateViewResponse.Details"));
		getTemplateViewResponse.setSuccess(_ctx.booleanValue("GetTemplateViewResponse.Success"));
		getTemplateViewResponse.setErrorCode(_ctx.stringValue("GetTemplateViewResponse.ErrorCode"));

		ViewConfigs viewConfigs = new ViewConfigs();

		List<ViewPluginsItem> viewPlugins = new ArrayList<ViewPluginsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins.Length"); i++) {
			ViewPluginsItem viewPluginsItem = new ViewPluginsItem();
			viewPluginsItem.setType(_ctx.stringValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].Type"));
			viewPluginsItem.setCorsProxy(_ctx.booleanValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].CorsProxy"));
			viewPluginsItem.setHide(_ctx.booleanValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].Hide"));
			viewPluginsItem.setConvertor(_ctx.stringValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].Convertor"));
			viewPluginsItem.setPlugins(_ctx.mapValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].Plugins"));
			viewPluginsItem.setExif(_ctx.mapValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].Exif"));
			viewPluginsItem.setBindField(_ctx.stringValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].BindField"));
			viewPluginsItem.setDisplayOriImg(_ctx.booleanValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].DisplayOriImg"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			viewPluginsItem.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();
			visitInfo.setOssConf(_ctx.mapValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.ossConf"));
			visitInfo.setAftsConf(_ctx.mapValue("GetTemplateViewResponse.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.aftsConf"));
			viewPluginsItem.setVisitInfo(visitInfo);

			viewPlugins.add(viewPluginsItem);
		}
		viewConfigs.setViewPlugins(viewPlugins);
		getTemplateViewResponse.setViewConfigs(viewConfigs);
	 
	 	return getTemplateViewResponse;
	}
}