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

import com.aliyuncs.advisor_share.model.v20180608.ListAllAppInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListAllAppInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListAllAppInfoResponse.Data.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllAppInfoResponseUnmarshaller {

	public static ListAllAppInfoResponse unmarshall(ListAllAppInfoResponse listAllAppInfoResponse, UnmarshallerContext _ctx) {
		
		listAllAppInfoResponse.setSuccess(_ctx.booleanValue("ListAllAppInfoResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListAllAppInfoResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListAllAppInfoResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListAllAppInfoResponse.Data.Total"));

		List<Result> dataList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListAllAppInfoResponse.Data.DataList.Length"); i++) {
			Result result = new Result();
			result.setAppId(_ctx.stringValue("ListAllAppInfoResponse.Data.DataList["+ i +"].AppId"));
			result.setAppName(_ctx.stringValue("ListAllAppInfoResponse.Data.DataList["+ i +"].AppName"));

			dataList.add(result);
		}
		data.setDataList(dataList);
		listAllAppInfoResponse.setData(data);
	 
	 	return listAllAppInfoResponse;
	}
}