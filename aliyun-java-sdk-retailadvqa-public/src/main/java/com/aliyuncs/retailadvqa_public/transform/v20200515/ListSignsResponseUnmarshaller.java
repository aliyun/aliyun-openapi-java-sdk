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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListSignsResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListSignsResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListSignsResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSignsResponseUnmarshaller {

	public static ListSignsResponse unmarshall(ListSignsResponse listSignsResponse, UnmarshallerContext _ctx) {
		
		listSignsResponse.setRequestId(_ctx.stringValue("ListSignsResponse.RequestId"));
		listSignsResponse.setErrorCode(_ctx.stringValue("ListSignsResponse.ErrorCode"));
		listSignsResponse.setErrorDesc(_ctx.stringValue("ListSignsResponse.ErrorDesc"));
		listSignsResponse.setSuccess(_ctx.booleanValue("ListSignsResponse.Success"));
		listSignsResponse.setTraceId(_ctx.stringValue("ListSignsResponse.TraceId"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListSignsResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListSignsResponse.Data.PageSize"));
		data.setTotalNum(_ctx.longValue("ListSignsResponse.Data.TotalNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSignsResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setId(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].Id"));
			contentItem.setPlatformName(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].PlatformName"));
			contentItem.setGmtCreate(_ctx.longValue("ListSignsResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setSignStatus(_ctx.longValue("ListSignsResponse.Data.Content["+ i +"].SignStatus"));
			contentItem.setQaAccountId(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].QaAccountId"));
			contentItem.setCreateUserName(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].CreateUserName"));
			contentItem.setSignName(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].SignName"));
			contentItem.setErrDescription(_ctx.stringValue("ListSignsResponse.Data.Content["+ i +"].ErrDescription"));

			content.add(contentItem);
		}
		data.setContent(content);
		listSignsResponse.setData(data);
	 
	 	return listSignsResponse;
	}
}