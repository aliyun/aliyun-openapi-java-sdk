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

import com.aliyuncs.arms.model.v20190808.GetAppApiByPageResponse;
import com.aliyuncs.arms.model.v20190808.GetAppApiByPageResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppApiByPageResponseUnmarshaller {

	public static GetAppApiByPageResponse unmarshall(GetAppApiByPageResponse getAppApiByPageResponse, UnmarshallerContext _ctx) {
		
		getAppApiByPageResponse.setRequestId(_ctx.stringValue("GetAppApiByPageResponse.RequestId"));
		getAppApiByPageResponse.setCode(_ctx.integerValue("GetAppApiByPageResponse.Code"));
		getAppApiByPageResponse.setMessage(_ctx.stringValue("GetAppApiByPageResponse.Message"));
		getAppApiByPageResponse.setSuccess(_ctx.booleanValue("GetAppApiByPageResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.stringValue("GetAppApiByPageResponse.Data.Total"));
		data.setPage(_ctx.integerValue("GetAppApiByPageResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("GetAppApiByPageResponse.Data.PageSize"));

		List<Map<Object, Object>> items = _ctx.listMapValue("GetAppApiByPageResponse.Data.Items");
		data.setItems(items);
		getAppApiByPageResponse.setData(data);
	 
	 	return getAppApiByPageResponse;
	}
}