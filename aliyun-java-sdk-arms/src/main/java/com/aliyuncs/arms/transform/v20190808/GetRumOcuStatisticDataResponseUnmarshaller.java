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

import com.aliyuncs.arms.model.v20190808.GetRumOcuStatisticDataResponse;
import com.aliyuncs.arms.model.v20190808.GetRumOcuStatisticDataResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRumOcuStatisticDataResponseUnmarshaller {

	public static GetRumOcuStatisticDataResponse unmarshall(GetRumOcuStatisticDataResponse getRumOcuStatisticDataResponse, UnmarshallerContext _ctx) {
		
		getRumOcuStatisticDataResponse.setRequestId(_ctx.stringValue("GetRumOcuStatisticDataResponse.RequestId"));
		getRumOcuStatisticDataResponse.setCode(_ctx.longValue("GetRumOcuStatisticDataResponse.Code"));
		getRumOcuStatisticDataResponse.setMessage(_ctx.stringValue("GetRumOcuStatisticDataResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("GetRumOcuStatisticDataResponse.Data.Total"));
		data.setPage(_ctx.integerValue("GetRumOcuStatisticDataResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("GetRumOcuStatisticDataResponse.Data.PageSize"));
		data.setComplete(_ctx.booleanValue("GetRumOcuStatisticDataResponse.Data.Complete"));

		List<Map<Object, Object>> items = _ctx.listMapValue("GetRumOcuStatisticDataResponse.Data.Items");
		data.setItems(items);
		getRumOcuStatisticDataResponse.setData(data);
	 
	 	return getRumOcuStatisticDataResponse;
	}
}