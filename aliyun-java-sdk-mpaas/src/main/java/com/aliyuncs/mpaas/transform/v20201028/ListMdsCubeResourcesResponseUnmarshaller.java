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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeResourcesResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeResourcesResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeResourcesResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeResourcesResponse.ResultContent.Data.Content;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeResourcesResponse.ResultContent.Data.Content.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMdsCubeResourcesResponseUnmarshaller {

	public static ListMdsCubeResourcesResponse unmarshall(ListMdsCubeResourcesResponse listMdsCubeResourcesResponse, UnmarshallerContext _ctx) {
		
		listMdsCubeResourcesResponse.setRequestId(_ctx.stringValue("ListMdsCubeResourcesResponse.RequestId"));
		listMdsCubeResourcesResponse.setResultMessage(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultMessage"));
		listMdsCubeResourcesResponse.setResultCode(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.RequestId"));
		data.setErrorCode(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.ErrorCode"));
		data.setSuccess(_ctx.booleanValue("ListMdsCubeResourcesResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.ResultMsg"));

		Content content = new Content();
		content.setPageNo(_ctx.integerValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.PageNo"));
		content.setPageSize(_ctx.integerValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.PageSize"));
		content.setTotalCount(_ctx.integerValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.TotalCount"));
		content.setFirstPage(_ctx.booleanValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.FirstPage"));
		content.setLastPage(_ctx.booleanValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.LastPage"));
		content.setPrePage(_ctx.longValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.PrePage"));
		content.setNextPage(_ctx.longValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.NextPage"));
		content.setFirstResult(_ctx.longValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.FirstResult"));
		content.setCurrentMaxIosVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.CurrentMaxIosVersion"));
		content.setCurrentMaxAndroidVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.CurrentMaxAndroidVersion"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].Status"));
			listItem.setAppCode(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].AppCode"));
			listItem.setMinCubeSdkVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].MinCubeSdkVersion"));
			listItem.setBinPublicFileUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].BinPublicFileUrl"));
			listItem.setJsonPublicFileUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].JsonPublicFileUrl"));
			listItem.setGmtModified(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].GmtModified"));
			listItem.setExtendInfo(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].ExtendInfo"));
			listItem.setTemplateResourceVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].TemplateResourceVersion"));
			listItem.setAndroidMinVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].AndroidMinVersion"));
			listItem.setJsonPrivateFileUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].JsonPrivateFileUrl"));
			listItem.setBinPrivateFileUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].BinPrivateFileUrl"));
			listItem.setTemplateResourceDesc(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].TemplateResourceDesc"));
			listItem.setIosMaxVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].IosMaxVersion"));
			listItem.setIosMinVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].IosMinVersion"));
			listItem.setPlatform(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].Platform"));
			listItem.setGmtCreate(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].GmtCreate"));
			listItem.setOperator(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].Operator"));
			listItem.setAndroidMaxVersion(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].AndroidMaxVersion"));
			listItem.setBinFileMd5(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].BinFileMd5"));
			listItem.setTemplateId(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].TemplateId"));
			listItem.setId(_ctx.longValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].Id"));
			listItem.setResourceStatus(_ctx.longValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].ResourceStatus"));
			listItem.setMockDataDownloadUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].MockDataDownloadUrl"));
			listItem.setPreviewPictureUrl(_ctx.stringValue("ListMdsCubeResourcesResponse.ResultContent.Data.Content.List["+ i +"].PreviewPictureUrl"));

			list.add(listItem);
		}
		content.setList(list);
		data.setContent(content);
		resultContent.setData(data);
		listMdsCubeResourcesResponse.setResultContent(resultContent);
	 
	 	return listMdsCubeResourcesResponse;
	}
}