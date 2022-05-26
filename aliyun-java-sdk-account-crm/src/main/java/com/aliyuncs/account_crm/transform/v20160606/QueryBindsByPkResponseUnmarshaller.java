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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.QueryBindsByPkResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryBindsByPkResponse.BindDto;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBindsByPkResponseUnmarshaller {

	public static QueryBindsByPkResponse unmarshall(QueryBindsByPkResponse queryBindsByPkResponse, UnmarshallerContext _ctx) {
		
		queryBindsByPkResponse.setRequestId(_ctx.stringValue("QueryBindsByPkResponse.RequestId"));
		queryBindsByPkResponse.setCode(_ctx.stringValue("QueryBindsByPkResponse.Code"));
		queryBindsByPkResponse.setMessage(_ctx.stringValue("QueryBindsByPkResponse.Message"));
		queryBindsByPkResponse.setHttpCode(_ctx.stringValue("QueryBindsByPkResponse.HttpCode"));
		queryBindsByPkResponse.setSuccess(_ctx.booleanValue("QueryBindsByPkResponse.Success"));

		List<BindDto> data = new ArrayList<BindDto>();
		for (int i = 0; i < _ctx.lengthValue("QueryBindsByPkResponse.Data.Length"); i++) {
			BindDto bindDto = new BindDto();
			bindDto.setStatus(_ctx.stringValue("QueryBindsByPkResponse.Data["+ i +"].Status"));
			bindDto.setMinorOuterId(_ctx.stringValue("QueryBindsByPkResponse.Data["+ i +"].MinorOuterId"));
			bindDto.setOuterId(_ctx.stringValue("QueryBindsByPkResponse.Data["+ i +"].OuterId"));
			bindDto.setPk(_ctx.stringValue("QueryBindsByPkResponse.Data["+ i +"].Pk"));
			bindDto.setBindData(_ctx.mapValue("QueryBindsByPkResponse.Data["+ i +"].BindData"));
			bindDto.setTenantId(_ctx.stringValue("QueryBindsByPkResponse.Data["+ i +"].TenantId"));

			data.add(bindDto);
		}
		queryBindsByPkResponse.setData(data);
	 
	 	return queryBindsByPkResponse;
	}
}