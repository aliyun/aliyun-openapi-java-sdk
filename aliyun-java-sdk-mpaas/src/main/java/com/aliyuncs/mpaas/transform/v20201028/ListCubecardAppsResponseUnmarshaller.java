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

import com.aliyuncs.mpaas.model.v20201028.ListCubecardAppsResponse;
import com.aliyuncs.mpaas.model.v20201028.ListCubecardAppsResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListCubecardAppsResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.ListCubecardAppsResponse.ResultContent.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCubecardAppsResponseUnmarshaller {

	public static ListCubecardAppsResponse unmarshall(ListCubecardAppsResponse listCubecardAppsResponse, UnmarshallerContext _ctx) {
		
		listCubecardAppsResponse.setRequestId(_ctx.stringValue("ListCubecardAppsResponse.RequestId"));
		listCubecardAppsResponse.setResultMessage(_ctx.stringValue("ListCubecardAppsResponse.ResultMessage"));
		listCubecardAppsResponse.setResultCode(_ctx.stringValue("ListCubecardAppsResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("ListCubecardAppsResponse.ResultContent.Data.Success"));
		data.setErrorCode(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.Data.ResultMsg"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCubecardAppsResponse.ResultContent.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setAppName(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.Data.Content["+ i +"].AppName"));
			contentItem.setAppId(_ctx.stringValue("ListCubecardAppsResponse.ResultContent.Data.Content["+ i +"].AppId"));

			content.add(contentItem);
		}
		data.setContent(content);
		resultContent.setData(data);
		listCubecardAppsResponse.setResultContent(resultContent);
	 
	 	return listCubecardAppsResponse;
	}
}