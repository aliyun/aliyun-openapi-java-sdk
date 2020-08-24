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

import com.aliyuncs.linkvisual.model.v20180120.QueryIotIdsByAIPlanResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryIotIdsByAIPlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIotIdsByAIPlanResponseUnmarshaller {

	public static QueryIotIdsByAIPlanResponse unmarshall(QueryIotIdsByAIPlanResponse queryIotIdsByAIPlanResponse, UnmarshallerContext _ctx) {
		
		queryIotIdsByAIPlanResponse.setRequestId(_ctx.stringValue("QueryIotIdsByAIPlanResponse.RequestId"));
		queryIotIdsByAIPlanResponse.setSuccess(_ctx.booleanValue("QueryIotIdsByAIPlanResponse.Success"));
		queryIotIdsByAIPlanResponse.setErrorMessage(_ctx.stringValue("QueryIotIdsByAIPlanResponse.ErrorMessage"));
		queryIotIdsByAIPlanResponse.setCode(_ctx.stringValue("QueryIotIdsByAIPlanResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QueryIotIdsByAIPlanResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryIotIdsByAIPlanResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryIotIdsByAIPlanResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryIotIdsByAIPlanResponse.Data.PageSize"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryIotIdsByAIPlanResponse.Data.List.Length"); i++) {
			list.add(_ctx.stringValue("QueryIotIdsByAIPlanResponse.Data.List["+ i +"]"));
		}
		data.setList(list);
		queryIotIdsByAIPlanResponse.setData(data);
	 
	 	return queryIotIdsByAIPlanResponse;
	}
}