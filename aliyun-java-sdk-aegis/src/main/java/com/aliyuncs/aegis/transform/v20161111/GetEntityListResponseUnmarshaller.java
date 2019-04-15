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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.GetEntityListResponse;
import com.aliyuncs.aegis.model.v20161111.GetEntityListResponse.Data;
import com.aliyuncs.aegis.model.v20161111.GetEntityListResponse.Data.Entity;
import com.aliyuncs.aegis.model.v20161111.GetEntityListResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEntityListResponseUnmarshaller {

	public static GetEntityListResponse unmarshall(GetEntityListResponse getEntityListResponse, UnmarshallerContext context) {
		
		getEntityListResponse.setRequestId(context.stringValue("GetEntityListResponse.requestId"));
		getEntityListResponse.setCode(context.stringValue("GetEntityListResponse.Code"));
		getEntityListResponse.setSuccess(context.booleanValue("GetEntityListResponse.Success"));
		getEntityListResponse.setMessage(context.stringValue("GetEntityListResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(context.integerValue("GetEntityListResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(context.integerValue("GetEntityListResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("GetEntityListResponse.Data.PageInfo.TotalCount"));
		pageInfo.setCount(context.integerValue("GetEntityListResponse.Data.PageInfo.Count"));
		data.setPageInfo(pageInfo);

		List<Entity> list = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("GetEntityListResponse.Data.List.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(context.stringValue("GetEntityListResponse.Data.List["+ i +"].Uuid"));
			entity.setGroupId(context.longValue("GetEntityListResponse.Data.List["+ i +"].GroupId"));
			entity.setIp(context.stringValue("GetEntityListResponse.Data.List["+ i +"].Ip"));
			entity.setInstanceName(context.stringValue("GetEntityListResponse.Data.List["+ i +"].InstanceName"));
			entity.setInstanceId(context.stringValue("GetEntityListResponse.Data.List["+ i +"].InstanceId"));
			entity.setRegion(context.stringValue("GetEntityListResponse.Data.List["+ i +"].Region"));
			entity.setOs(context.stringValue("GetEntityListResponse.Data.List["+ i +"].Os"));
			entity.setFlag(context.stringValue("GetEntityListResponse.Data.List["+ i +"].Flag"));
			entity.setBuyVersion(context.stringValue("GetEntityListResponse.Data.List["+ i +"].BuyVersion"));
			entity.setAegisOnline(context.booleanValue("GetEntityListResponse.Data.List["+ i +"].AegisOnline"));
			entity.setAegisVersion(context.stringValue("GetEntityListResponse.Data.List["+ i +"].aegisVersion"));

			list.add(entity);
		}
		data.setList(list);
		getEntityListResponse.setData(data);
	 
	 	return getEntityListResponse;
	}
}