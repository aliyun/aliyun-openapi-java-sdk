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

import com.aliyuncs.retailadvqa_public.model.v20200515.ListAudienceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListAudienceResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListAudienceResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAudienceResponseUnmarshaller {

	public static ListAudienceResponse unmarshall(ListAudienceResponse listAudienceResponse, UnmarshallerContext _ctx) {
		
		listAudienceResponse.setRequestId(_ctx.stringValue("ListAudienceResponse.RequestId"));
		listAudienceResponse.setErrorDesc(_ctx.stringValue("ListAudienceResponse.ErrorDesc"));
		listAudienceResponse.setTraceId(_ctx.stringValue("ListAudienceResponse.TraceId"));
		listAudienceResponse.setErrorCode(_ctx.stringValue("ListAudienceResponse.ErrorCode"));
		listAudienceResponse.setSuccess(_ctx.booleanValue("ListAudienceResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.stringValue("ListAudienceResponse.Data.PageNum"));
		data.setPageSize(_ctx.stringValue("ListAudienceResponse.Data.PageSize"));
		data.setTotalNum(_ctx.stringValue("ListAudienceResponse.Data.TotalNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAudienceResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setLatestDataModifyStatus(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].LatestDataModifyStatus"));
			contentItem.setErrorMessage(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].ErrorMessage"));
			contentItem.setNumberOfAudiences(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].NumberOfAudiences"));
			contentItem.setLatestDataModifyTime(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].LatestDataModifyTime"));
			contentItem.setGmtCreate(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setName(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].Name"));
			contentItem.setIsDynamic(_ctx.booleanValue("ListAudienceResponse.Data.Content["+ i +"].IsDynamic"));
			contentItem.setId(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].Id"));

			List<String> mappingTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAudienceResponse.Data.Content["+ i +"].MappingTypes.Length"); j++) {
				mappingTypes.add(_ctx.stringValue("ListAudienceResponse.Data.Content["+ i +"].MappingTypes["+ j +"]"));
			}
			contentItem.setMappingTypes(mappingTypes);

			content.add(contentItem);
		}
		data.setContent(content);
		listAudienceResponse.setData(data);
	 
	 	return listAudienceResponse;
	}
}