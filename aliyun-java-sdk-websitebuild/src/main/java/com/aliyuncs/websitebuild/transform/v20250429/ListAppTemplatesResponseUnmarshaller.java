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

import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplatesResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplatesResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplatesResponse.Module.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplatesResponse.Module.Next;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppTemplatesResponseUnmarshaller {

	public static ListAppTemplatesResponse unmarshall(ListAppTemplatesResponse listAppTemplatesResponse, UnmarshallerContext _ctx) {
		
		listAppTemplatesResponse.setRequestId(_ctx.stringValue("ListAppTemplatesResponse.RequestId"));
		listAppTemplatesResponse.setDynamicCode(_ctx.stringValue("ListAppTemplatesResponse.DynamicCode"));
		listAppTemplatesResponse.setDynamicMessage(_ctx.stringValue("ListAppTemplatesResponse.DynamicMessage"));
		listAppTemplatesResponse.setSynchro(_ctx.booleanValue("ListAppTemplatesResponse.Synchro"));
		listAppTemplatesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppTemplatesResponse.AccessDeniedDetail"));
		listAppTemplatesResponse.setRootErrorMsg(_ctx.stringValue("ListAppTemplatesResponse.RootErrorMsg"));
		listAppTemplatesResponse.setRootErrorCode(_ctx.stringValue("ListAppTemplatesResponse.RootErrorCode"));
		listAppTemplatesResponse.setAllowRetry(_ctx.booleanValue("ListAppTemplatesResponse.AllowRetry"));
		listAppTemplatesResponse.setAppName(_ctx.stringValue("ListAppTemplatesResponse.AppName"));
		listAppTemplatesResponse.setMaxResults(_ctx.integerValue("ListAppTemplatesResponse.MaxResults"));
		listAppTemplatesResponse.setNextToken(_ctx.stringValue("ListAppTemplatesResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTemplatesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppTemplatesResponse.ErrorArgs["+ i +"]"));
		}
		listAppTemplatesResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("ListAppTemplatesResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("ListAppTemplatesResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("ListAppTemplatesResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("ListAppTemplatesResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("ListAppTemplatesResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("ListAppTemplatesResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("ListAppTemplatesResponse.Module.ResultLimit"));

		Next next = new Next();
		next.setId(_ctx.longValue("ListAppTemplatesResponse.Module.Next.Id"));
		next.setTemplateId(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.TemplateId"));
		next.setTemplateName(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.TemplateName"));
		next.setBizId(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.BizId"));
		next.setThumbnailUrl(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.ThumbnailUrl"));
		next.setPreviewUrl(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.PreviewUrl"));
		next.setProductVersion(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.ProductVersion"));
		next.setIndustry(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.Industry"));
		next.setColorScheme(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.ColorScheme"));
		next.setProductVersionName(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.ProductVersionName"));
		next.setIndustryName(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.IndustryName"));
		next.setColorSchemeName(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.ColorSchemeName"));
		next.setStatus(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.Status"));
		next.setViewCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Next.ViewCount"));
		next.setLikeCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Next.LikeCount"));
		next.setShareCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Next.ShareCount"));
		next.setCopyCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Next.CopyCount"));
		next.setMetadata(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.Metadata"));
		next.setCreator(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.Creator"));
		next.setLastModifier(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.LastModifier"));
		next.setAppType(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.AppType"));
		next.setWeight(_ctx.integerValue("ListAppTemplatesResponse.Module.Next.Weight"));
		next.setGmtCreate(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.GmtCreate"));
		next.setGmtModified(_ctx.stringValue("ListAppTemplatesResponse.Module.Next.GmtModified"));
		next.setLiked(_ctx.booleanValue("ListAppTemplatesResponse.Module.Next.Liked"));
		module.setNext(next);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTemplatesResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListAppTemplatesResponse.Module.Data["+ i +"].Id"));
			dataItem.setTemplateId(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].TemplateId"));
			dataItem.setTemplateName(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].TemplateName"));
			dataItem.setBizId(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].BizId"));
			dataItem.setThumbnailUrl(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].ThumbnailUrl"));
			dataItem.setPreviewUrl(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].PreviewUrl"));
			dataItem.setProductVersion(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].ProductVersion"));
			dataItem.setIndustry(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].Industry"));
			dataItem.setColorScheme(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].ColorScheme"));
			dataItem.setProductVersionName(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].ProductVersionName"));
			dataItem.setIndustryName(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].IndustryName"));
			dataItem.setColorSchemeName(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].ColorSchemeName"));
			dataItem.setStatus(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].Status"));
			dataItem.setViewCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Data["+ i +"].ViewCount"));
			dataItem.setLikeCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Data["+ i +"].LikeCount"));
			dataItem.setShareCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Data["+ i +"].ShareCount"));
			dataItem.setCopyCount(_ctx.integerValue("ListAppTemplatesResponse.Module.Data["+ i +"].CopyCount"));
			dataItem.setMetadata(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].Metadata"));
			dataItem.setCreator(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].Creator"));
			dataItem.setLastModifier(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].LastModifier"));
			dataItem.setAppType(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].AppType"));
			dataItem.setWeight(_ctx.integerValue("ListAppTemplatesResponse.Module.Data["+ i +"].Weight"));
			dataItem.setGmtCreateTime(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].GmtCreateTime"));
			dataItem.setGmtModifiedTime(_ctx.stringValue("ListAppTemplatesResponse.Module.Data["+ i +"].GmtModifiedTime"));
			dataItem.setLiked(_ctx.booleanValue("ListAppTemplatesResponse.Module.Data["+ i +"].Liked"));

			data.add(dataItem);
		}
		module.setData(data);
		listAppTemplatesResponse.setModule(module);
	 
	 	return listAppTemplatesResponse;
	}
}