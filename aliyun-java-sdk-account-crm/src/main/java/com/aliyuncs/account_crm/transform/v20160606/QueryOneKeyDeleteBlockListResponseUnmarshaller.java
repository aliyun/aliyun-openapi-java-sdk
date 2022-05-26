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

import com.aliyuncs.account_crm.model.v20160606.QueryOneKeyDeleteBlockListResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryOneKeyDeleteBlockListResponse.OneKeyDeleteBlockDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOneKeyDeleteBlockListResponseUnmarshaller {

	public static QueryOneKeyDeleteBlockListResponse unmarshall(QueryOneKeyDeleteBlockListResponse queryOneKeyDeleteBlockListResponse, UnmarshallerContext _ctx) {
		
		queryOneKeyDeleteBlockListResponse.setRequestId(_ctx.stringValue("QueryOneKeyDeleteBlockListResponse.RequestId"));
		queryOneKeyDeleteBlockListResponse.setCode(_ctx.stringValue("QueryOneKeyDeleteBlockListResponse.Code"));
		queryOneKeyDeleteBlockListResponse.setMessage(_ctx.stringValue("QueryOneKeyDeleteBlockListResponse.Message"));
		queryOneKeyDeleteBlockListResponse.setSuccess(_ctx.booleanValue("QueryOneKeyDeleteBlockListResponse.Success"));

		List<OneKeyDeleteBlockDto> data = new ArrayList<OneKeyDeleteBlockDto>();
		for (int i = 0; i < _ctx.lengthValue("QueryOneKeyDeleteBlockListResponse.Data.Length"); i++) {
			OneKeyDeleteBlockDto oneKeyDeleteBlockDto = new OneKeyDeleteBlockDto();
			oneKeyDeleteBlockDto.setBlockMsg(_ctx.stringValue("QueryOneKeyDeleteBlockListResponse.Data["+ i +"].BlockMsg"));
			oneKeyDeleteBlockDto.setBlockCode(_ctx.stringValue("QueryOneKeyDeleteBlockListResponse.Data["+ i +"].BlockCode"));

			data.add(oneKeyDeleteBlockDto);
		}
		queryOneKeyDeleteBlockListResponse.setData(data);
	 
	 	return queryOneKeyDeleteBlockListResponse;
	}
}