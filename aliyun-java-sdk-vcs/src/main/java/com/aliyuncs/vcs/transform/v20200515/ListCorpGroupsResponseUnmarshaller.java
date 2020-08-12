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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListCorpGroupsResponse;
import com.aliyuncs.vcs.model.v20200515.ListCorpGroupsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpGroupsResponseUnmarshaller {

	public static ListCorpGroupsResponse unmarshall(ListCorpGroupsResponse listCorpGroupsResponse, UnmarshallerContext _ctx) {
		
		listCorpGroupsResponse.setRequestId(_ctx.stringValue("ListCorpGroupsResponse.RequestId"));
		listCorpGroupsResponse.setCode(_ctx.stringValue("ListCorpGroupsResponse.Code"));
		listCorpGroupsResponse.setMessage(_ctx.stringValue("ListCorpGroupsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListCorpGroupsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListCorpGroupsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListCorpGroupsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("ListCorpGroupsResponse.Data.TotalPage"));

		List<String> records = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpGroupsResponse.Data.Records.Length"); i++) {
			records.add(_ctx.stringValue("ListCorpGroupsResponse.Data.Records["+ i +"]"));
		}
		data.setRecords(records);
		listCorpGroupsResponse.setData(data);
	 
	 	return listCorpGroupsResponse;
	}
}