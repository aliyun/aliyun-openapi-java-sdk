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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListRuleTemplateResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListRuleTemplateResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListRuleTemplateResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleTemplateResponseUnmarshaller {

	public static ListRuleTemplateResponse unmarshall(ListRuleTemplateResponse listRuleTemplateResponse, UnmarshallerContext _ctx) {
		
		listRuleTemplateResponse.setSuccess(_ctx.booleanValue("ListRuleTemplateResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListRuleTemplateResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListRuleTemplateResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListRuleTemplateResponse.Data.Total"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleTemplateResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setGmtCreate(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].GmtCreate"));
			dataListItem.setGmtModified(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].GmtModified"));
			dataListItem.setId(_ctx.longValue("ListRuleTemplateResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setNamespace(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].Namespace"));
			dataListItem.setOwnerId(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].OwnerId"));
			dataListItem.setType(_ctx.stringValue("ListRuleTemplateResponse.Data.DataList["+ i +"].Type"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listRuleTemplateResponse.setData(data);
	 
	 	return listRuleTemplateResponse;
	}
}