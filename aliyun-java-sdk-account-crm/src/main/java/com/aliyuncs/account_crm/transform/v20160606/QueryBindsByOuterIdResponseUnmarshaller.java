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

import com.aliyuncs.account_crm.model.v20160606.QueryBindsByOuterIdResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryBindsByOuterIdResponse.BindDto;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBindsByOuterIdResponseUnmarshaller {

	public static QueryBindsByOuterIdResponse unmarshall(QueryBindsByOuterIdResponse queryBindsByOuterIdResponse, UnmarshallerContext _ctx) {
		
		queryBindsByOuterIdResponse.setRequestId(_ctx.stringValue("QueryBindsByOuterIdResponse.RequestId"));
		queryBindsByOuterIdResponse.setCode(_ctx.stringValue("QueryBindsByOuterIdResponse.Code"));
		queryBindsByOuterIdResponse.setMessage(_ctx.stringValue("QueryBindsByOuterIdResponse.Message"));
		queryBindsByOuterIdResponse.setHttpCode(_ctx.stringValue("QueryBindsByOuterIdResponse.HttpCode"));
		queryBindsByOuterIdResponse.setSuccess(_ctx.booleanValue("QueryBindsByOuterIdResponse.Success"));

		List<BindDto> data = new ArrayList<BindDto>();
		for (int i = 0; i < _ctx.lengthValue("QueryBindsByOuterIdResponse.Data.Length"); i++) {
			BindDto bindDto = new BindDto();
			bindDto.setStatus(_ctx.stringValue("QueryBindsByOuterIdResponse.Data["+ i +"].Status"));
			bindDto.setMinorOuterId(_ctx.stringValue("QueryBindsByOuterIdResponse.Data["+ i +"].MinorOuterId"));
			bindDto.setOuterId(_ctx.stringValue("QueryBindsByOuterIdResponse.Data["+ i +"].OuterId"));
			bindDto.setPk(_ctx.stringValue("QueryBindsByOuterIdResponse.Data["+ i +"].Pk"));
			bindDto.setBindData(_ctx.mapValue("QueryBindsByOuterIdResponse.Data["+ i +"].BindData"));
			bindDto.setTenantId(_ctx.stringValue("QueryBindsByOuterIdResponse.Data["+ i +"].TenantId"));

			data.add(bindDto);
		}
		queryBindsByOuterIdResponse.setData(data);
	 
	 	return queryBindsByOuterIdResponse;
	}
}