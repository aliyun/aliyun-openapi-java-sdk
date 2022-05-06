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

package com.aliyuncs.educloud.transform.v20220202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.educloud.model.v20220202.ListLabTokensResponse;
import com.aliyuncs.educloud.model.v20220202.ListLabTokensResponse.Data;
import com.aliyuncs.educloud.model.v20220202.ListLabTokensResponse.Data.LabOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabTokensResponseUnmarshaller {

	public static ListLabTokensResponse unmarshall(ListLabTokensResponse listLabTokensResponse, UnmarshallerContext _ctx) {
		
		listLabTokensResponse.setRequestId(_ctx.stringValue("ListLabTokensResponse.RequestId"));
		listLabTokensResponse.setSuccess(_ctx.booleanValue("ListLabTokensResponse.Success"));
		listLabTokensResponse.setCode(_ctx.longValue("ListLabTokensResponse.Code"));
		listLabTokensResponse.setMessage(_ctx.stringValue("ListLabTokensResponse.Message"));

		Data data = new Data();
		data.setPage(_ctx.longValue("ListLabTokensResponse.Data.Page"));
		data.setPageSize(_ctx.longValue("ListLabTokensResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListLabTokensResponse.Data.Total"));

		List<LabOrder> list = new ArrayList<LabOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListLabTokensResponse.Data.List.Length"); i++) {
			LabOrder labOrder = new LabOrder();
			labOrder.setLabId(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].LabId"));
			labOrder.setOrderId(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].OrderId"));
			labOrder.setUrl(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].Url"));
			labOrder.setCreateTime(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].CreateTime"));
			labOrder.setFinishStatus(_ctx.longValue("ListLabTokensResponse.Data.List["+ i +"].FinishStatus"));
			labOrder.setResourceStatus(_ctx.longValue("ListLabTokensResponse.Data.List["+ i +"].ResourceStatus"));
			labOrder.setResourceActualReleaseTime(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].ResourceActualReleaseTime"));
			labOrder.setResourcePlanedReleaseTime(_ctx.stringValue("ListLabTokensResponse.Data.List["+ i +"].ResourcePlanedReleaseTime"));

			list.add(labOrder);
		}
		data.setList(list);
		listLabTokensResponse.setData(data);
	 
	 	return listLabTokensResponse;
	}
}