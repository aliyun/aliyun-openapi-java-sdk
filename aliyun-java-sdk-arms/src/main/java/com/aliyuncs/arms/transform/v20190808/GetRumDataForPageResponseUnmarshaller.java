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

import com.aliyuncs.arms.model.v20190808.GetRumDataForPageResponse;
import com.aliyuncs.arms.model.v20190808.GetRumDataForPageResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRumDataForPageResponseUnmarshaller {

	public static GetRumDataForPageResponse unmarshall(GetRumDataForPageResponse getRumDataForPageResponse, UnmarshallerContext _ctx) {
		
		getRumDataForPageResponse.setRequestId(_ctx.stringValue("GetRumDataForPageResponse.RequestId"));
		getRumDataForPageResponse.setCode(_ctx.stringValue("GetRumDataForPageResponse.Code"));
		getRumDataForPageResponse.setSuccess(_ctx.stringValue("GetRumDataForPageResponse.Success"));
		getRumDataForPageResponse.setMessage(_ctx.stringValue("GetRumDataForPageResponse.Message"));
		getRumDataForPageResponse.setHttpStatusCode(_ctx.stringValue("GetRumDataForPageResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotal(_ctx.stringValue("GetRumDataForPageResponse.Data.Total"));
		data.setPage(_ctx.stringValue("GetRumDataForPageResponse.Data.Page"));
		data.setPageSize(_ctx.stringValue("GetRumDataForPageResponse.Data.PageSize"));
		data.setAuthentication(_ctx.stringValue("GetRumDataForPageResponse.Data.Authentication"));
		data.setCompletion(_ctx.stringValue("GetRumDataForPageResponse.Data.Completion"));
		data.setPreference(_ctx.stringValue("GetRumDataForPageResponse.Data.Preference"));

		List<Map<Object, Object>> items = _ctx.listMapValue("GetRumDataForPageResponse.Data.Items");
		data.setItems(items);
		getRumDataForPageResponse.setData(data);
	 
	 	return getRumDataForPageResponse;
	}
}