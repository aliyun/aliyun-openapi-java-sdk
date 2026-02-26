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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListSyntheticDetailResponse;
import com.aliyuncs.arms.model.v20190808.ListSyntheticDetailResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSyntheticDetailResponseUnmarshaller {

	public static ListSyntheticDetailResponse unmarshall(ListSyntheticDetailResponse listSyntheticDetailResponse, UnmarshallerContext _ctx) {
		
		listSyntheticDetailResponse.setRequestId(_ctx.stringValue("ListSyntheticDetailResponse.RequestId"));
		listSyntheticDetailResponse.setCode(_ctx.longValue("ListSyntheticDetailResponse.Code"));
		listSyntheticDetailResponse.setMessage(_ctx.stringValue("ListSyntheticDetailResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListSyntheticDetailResponse.Data.Total"));
		data.setPage(_ctx.integerValue("ListSyntheticDetailResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("ListSyntheticDetailResponse.Data.PageSize"));
		data.setTaskCreateTime(_ctx.longValue("ListSyntheticDetailResponse.Data.TaskCreateTime"));

		List<Map<Object, Object>> items = _ctx.listMapValue("ListSyntheticDetailResponse.Data.Items");
		data.setItems(items);
		listSyntheticDetailResponse.setData(data);
	 
	 	return listSyntheticDetailResponse;
	}
}