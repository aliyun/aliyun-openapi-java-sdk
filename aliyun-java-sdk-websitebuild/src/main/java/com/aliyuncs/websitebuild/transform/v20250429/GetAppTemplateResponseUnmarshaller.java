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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.GetAppTemplateResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppTemplateResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppTemplateResponseUnmarshaller {

	public static GetAppTemplateResponse unmarshall(GetAppTemplateResponse getAppTemplateResponse, UnmarshallerContext _ctx) {
		
		getAppTemplateResponse.setRequestId(_ctx.stringValue("GetAppTemplateResponse.RequestId"));
		getAppTemplateResponse.setDynamicCode(_ctx.stringValue("GetAppTemplateResponse.DynamicCode"));
		getAppTemplateResponse.setDynamicMessage(_ctx.stringValue("GetAppTemplateResponse.DynamicMessage"));
		getAppTemplateResponse.setSynchro(_ctx.booleanValue("GetAppTemplateResponse.Synchro"));
		getAppTemplateResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppTemplateResponse.AccessDeniedDetail"));
		getAppTemplateResponse.setRootErrorMsg(_ctx.stringValue("GetAppTemplateResponse.RootErrorMsg"));
		getAppTemplateResponse.setRootErrorCode(_ctx.stringValue("GetAppTemplateResponse.RootErrorCode"));
		getAppTemplateResponse.setAllowRetry(_ctx.booleanValue("GetAppTemplateResponse.AllowRetry"));
		getAppTemplateResponse.setAppName(_ctx.stringValue("GetAppTemplateResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppTemplateResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppTemplateResponse.ErrorArgs["+ i +"]"));
		}
		getAppTemplateResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setId(_ctx.longValue("GetAppTemplateResponse.Module.Id"));
		module.setTemplateId(_ctx.stringValue("GetAppTemplateResponse.Module.TemplateId"));
		module.setTemplateName(_ctx.stringValue("GetAppTemplateResponse.Module.TemplateName"));
		module.setBizId(_ctx.stringValue("GetAppTemplateResponse.Module.BizId"));
		module.setThumbnailUrl(_ctx.stringValue("GetAppTemplateResponse.Module.ThumbnailUrl"));
		module.setPreviewUrl(_ctx.stringValue("GetAppTemplateResponse.Module.PreviewUrl"));
		module.setProductVersion(_ctx.stringValue("GetAppTemplateResponse.Module.ProductVersion"));
		module.setIndustry(_ctx.stringValue("GetAppTemplateResponse.Module.Industry"));
		module.setColorScheme(_ctx.stringValue("GetAppTemplateResponse.Module.ColorScheme"));
		module.setProductVersionName(_ctx.stringValue("GetAppTemplateResponse.Module.ProductVersionName"));
		module.setIndustryName(_ctx.stringValue("GetAppTemplateResponse.Module.IndustryName"));
		module.setColorSchemeName(_ctx.stringValue("GetAppTemplateResponse.Module.ColorSchemeName"));
		module.setStatus(_ctx.stringValue("GetAppTemplateResponse.Module.Status"));
		module.setViewCount(_ctx.integerValue("GetAppTemplateResponse.Module.ViewCount"));
		module.setLikeCount(_ctx.integerValue("GetAppTemplateResponse.Module.LikeCount"));
		module.setShareCount(_ctx.integerValue("GetAppTemplateResponse.Module.ShareCount"));
		module.setCopyCount(_ctx.integerValue("GetAppTemplateResponse.Module.CopyCount"));
		module.setMetadata(_ctx.stringValue("GetAppTemplateResponse.Module.Metadata"));
		module.setCreator(_ctx.stringValue("GetAppTemplateResponse.Module.Creator"));
		module.setLastModifier(_ctx.stringValue("GetAppTemplateResponse.Module.LastModifier"));
		module.setAppType(_ctx.stringValue("GetAppTemplateResponse.Module.AppType"));
		module.setWeight(_ctx.integerValue("GetAppTemplateResponse.Module.Weight"));
		module.setGmtCreateTime(_ctx.stringValue("GetAppTemplateResponse.Module.GmtCreateTime"));
		module.setGmtModifiedTime(_ctx.stringValue("GetAppTemplateResponse.Module.GmtModifiedTime"));
		module.setLiked(_ctx.booleanValue("GetAppTemplateResponse.Module.Liked"));
		getAppTemplateResponse.setModule(module);
	 
	 	return getAppTemplateResponse;
	}
}