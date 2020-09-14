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

package com.aliyuncs.xingzhen.transform.v20191121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xingzhen.model.v20191121.AlertGroupQueryListResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AlertGroupQueryListResponseUnmarshaller {

	public static AlertGroupQueryListResponse unmarshall(AlertGroupQueryListResponse alertGroupQueryListResponse, UnmarshallerContext _ctx) {
		
		alertGroupQueryListResponse.setRequestId(_ctx.stringValue("AlertGroupQueryListResponse.RequestId"));
		alertGroupQueryListResponse.setSuccess(_ctx.booleanValue("AlertGroupQueryListResponse.Success"));
		alertGroupQueryListResponse.setCode(_ctx.stringValue("AlertGroupQueryListResponse.Code"));
		alertGroupQueryListResponse.setMessage(_ctx.stringValue("AlertGroupQueryListResponse.Message"));
		alertGroupQueryListResponse.setTotalCount(_ctx.longValue("AlertGroupQueryListResponse.TotalCount"));
		alertGroupQueryListResponse.setCurrentPage(_ctx.integerValue("AlertGroupQueryListResponse.CurrentPage"));
		alertGroupQueryListResponse.setPageSize(_ctx.integerValue("AlertGroupQueryListResponse.PageSize"));

		List<Map<Object, Object>> data = _ctx.listMapValue("AlertGroupQueryListResponse.Data");
		alertGroupQueryListResponse.setData(data);
	 
	 	return alertGroupQueryListResponse;
	}
}