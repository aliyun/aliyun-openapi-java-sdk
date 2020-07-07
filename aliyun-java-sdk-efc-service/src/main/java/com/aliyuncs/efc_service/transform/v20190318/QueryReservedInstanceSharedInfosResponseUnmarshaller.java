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

package com.aliyuncs.efc_service.transform.v20190318;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.efc_service.model.v20190318.QueryReservedInstanceSharedInfosResponse;
import com.aliyuncs.efc_service.model.v20190318.QueryReservedInstanceSharedInfosResponse.EcsRiShareInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryReservedInstanceSharedInfosResponseUnmarshaller {

	public static QueryReservedInstanceSharedInfosResponse unmarshall(QueryReservedInstanceSharedInfosResponse queryReservedInstanceSharedInfosResponse, UnmarshallerContext _ctx) {
		
		queryReservedInstanceSharedInfosResponse.setRequestId(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.RequestId"));
		queryReservedInstanceSharedInfosResponse.setCode(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Code"));
		queryReservedInstanceSharedInfosResponse.setSuccess(_ctx.booleanValue("QueryReservedInstanceSharedInfosResponse.Success"));
		queryReservedInstanceSharedInfosResponse.setCount(_ctx.integerValue("QueryReservedInstanceSharedInfosResponse.Count"));
		queryReservedInstanceSharedInfosResponse.setPageSize(_ctx.integerValue("QueryReservedInstanceSharedInfosResponse.PageSize"));
		queryReservedInstanceSharedInfosResponse.setCurrentPage(_ctx.integerValue("QueryReservedInstanceSharedInfosResponse.CurrentPage"));
		queryReservedInstanceSharedInfosResponse.setTotalCount(_ctx.integerValue("QueryReservedInstanceSharedInfosResponse.TotalCount"));
		queryReservedInstanceSharedInfosResponse.setMessage(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Message"));
		queryReservedInstanceSharedInfosResponse.setRegion(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Region"));

		List<EcsRiShareInfo> data = new ArrayList<EcsRiShareInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryReservedInstanceSharedInfosResponse.Data.Length"); i++) {
			EcsRiShareInfo ecsRiShareInfo = new EcsRiShareInfo();
			ecsRiShareInfo.setMainAccountPk(_ctx.longValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].MainAccountPk"));
			ecsRiShareInfo.setSubAccountPk(_ctx.longValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].SubAccountPk"));
			ecsRiShareInfo.setRelationType(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].RelationType"));
			ecsRiShareInfo.setRiInstanceId(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].RiInstanceId"));
			ecsRiShareInfo.setEffectTime(_ctx.longValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].EffectTime"));
			ecsRiShareInfo.setRegion(_ctx.stringValue("QueryReservedInstanceSharedInfosResponse.Data["+ i +"].Region"));

			data.add(ecsRiShareInfo);
		}
		queryReservedInstanceSharedInfosResponse.setData(data);
	 
	 	return queryReservedInstanceSharedInfosResponse;
	}
}