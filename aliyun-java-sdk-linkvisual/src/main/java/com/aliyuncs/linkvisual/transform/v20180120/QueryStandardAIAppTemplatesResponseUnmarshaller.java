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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryStandardAIAppTemplatesResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryStandardAIAppTemplatesResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryStandardAIAppTemplatesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStandardAIAppTemplatesResponseUnmarshaller {

	public static QueryStandardAIAppTemplatesResponse unmarshall(QueryStandardAIAppTemplatesResponse queryStandardAIAppTemplatesResponse, UnmarshallerContext _ctx) {
		
		queryStandardAIAppTemplatesResponse.setRequestId(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.RequestId"));
		queryStandardAIAppTemplatesResponse.setSuccess(_ctx.booleanValue("QueryStandardAIAppTemplatesResponse.Success"));
		queryStandardAIAppTemplatesResponse.setErrorMessage(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.ErrorMessage"));
		queryStandardAIAppTemplatesResponse.setCode(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QueryStandardAIAppTemplatesResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryStandardAIAppTemplatesResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryStandardAIAppTemplatesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryStandardAIAppTemplatesResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryStandardAIAppTemplatesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAppTemplateId(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.Data.List["+ i +"].AppTemplateId"));
			listItem.setVersion(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.Data.List["+ i +"].Version"));
			listItem.setName(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.Data.List["+ i +"].Name"));
			listItem.setDescription(_ctx.stringValue("QueryStandardAIAppTemplatesResponse.Data.List["+ i +"].Description"));

			list.add(listItem);
		}
		data.setList(list);
		queryStandardAIAppTemplatesResponse.setData(data);
	 
	 	return queryStandardAIAppTemplatesResponse;
	}
}