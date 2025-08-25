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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.ListTemplatePageResponse;
import com.aliyuncs.mpaas.model.v20200710.ListTemplatePageResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatePageResponseUnmarshaller {

	public static ListTemplatePageResponse unmarshall(ListTemplatePageResponse listTemplatePageResponse, UnmarshallerContext _ctx) {
		
		listTemplatePageResponse.setRequestId(_ctx.stringValue("ListTemplatePageResponse.RequestId"));
		listTemplatePageResponse.setSuccess(_ctx.booleanValue("ListTemplatePageResponse.Success"));
		listTemplatePageResponse.setCode(_ctx.stringValue("ListTemplatePageResponse.Code"));
		listTemplatePageResponse.setMsg(_ctx.stringValue("ListTemplatePageResponse.Msg"));
		listTemplatePageResponse.setCurrentPage(_ctx.integerValue("ListTemplatePageResponse.CurrentPage"));
		listTemplatePageResponse.setPageSize(_ctx.integerValue("ListTemplatePageResponse.PageSize"));
		listTemplatePageResponse.setTotalSize(_ctx.integerValue("ListTemplatePageResponse.TotalSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatePageResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Action"));
			dataItem.setPushStyle(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].PushStyle"));
			dataItem.setVariables(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Variables"));
			dataItem.setGmtModified(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].GmtModified"));
			dataItem.setUri(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Uri"));
			dataItem.setShowStyle(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].ShowStyle"));
			dataItem.setTitle(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Title"));
			dataItem.setGmtCreate(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].GmtCreate"));
			dataItem.setDescInfo(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].DescInfo"));
			dataItem.setName(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Name"));
			dataItem.setContent(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Content"));
			dataItem.setId(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].Id"));
			dataItem.setImageUrls(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].ImageUrls"));
			dataItem.setIconUrls(_ctx.stringValue("ListTemplatePageResponse.Data["+ i +"].IconUrls"));

			data.add(dataItem);
		}
		listTemplatePageResponse.setData(data);
	 
	 	return listTemplatePageResponse;
	}
}