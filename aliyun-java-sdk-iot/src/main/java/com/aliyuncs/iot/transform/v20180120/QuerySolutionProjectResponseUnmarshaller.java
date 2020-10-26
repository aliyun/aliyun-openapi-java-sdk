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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySolutionProjectResponse;
import com.aliyuncs.iot.model.v20180120.QuerySolutionProjectResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySolutionProjectResponse.Data.Items;
import com.aliyuncs.iot.model.v20180120.QuerySolutionProjectResponse.Data.Items.ExtMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySolutionProjectResponseUnmarshaller {

	public static QuerySolutionProjectResponse unmarshall(QuerySolutionProjectResponse querySolutionProjectResponse, UnmarshallerContext _ctx) {
		
		querySolutionProjectResponse.setRequestId(_ctx.stringValue("QuerySolutionProjectResponse.RequestId"));
		querySolutionProjectResponse.setSuccess(_ctx.booleanValue("QuerySolutionProjectResponse.Success"));
		querySolutionProjectResponse.setCode(_ctx.stringValue("QuerySolutionProjectResponse.Code"));
		querySolutionProjectResponse.setErrorMessage(_ctx.stringValue("QuerySolutionProjectResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySolutionProjectResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySolutionProjectResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySolutionProjectResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySolutionProjectResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setGmtCreate(_ctx.longValue("QuerySolutionProjectResponse.Data.List["+ i +"].GmtCreate"));
			items.setName(_ctx.stringValue("QuerySolutionProjectResponse.Data.List["+ i +"].Name"));
			items.setCode(_ctx.stringValue("QuerySolutionProjectResponse.Data.List["+ i +"].Code"));
			items.setStatus(_ctx.stringValue("QuerySolutionProjectResponse.Data.List["+ i +"].Status"));
			items.setDescription(_ctx.stringValue("QuerySolutionProjectResponse.Data.List["+ i +"].Description"));

			ExtMap extMap = new ExtMap();
			extMap.setProductKey(_ctx.stringValue("QuerySolutionProjectResponse.Data.List["+ i +"].ExtMap.ProductKey"));
			items.setExtMap(extMap);

			list.add(items);
		}
		data.setList(list);
		querySolutionProjectResponse.setData(data);
	 
	 	return querySolutionProjectResponse;
	}
}