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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListChangeOrdersResponse;
import com.aliyuncs.sae.model.v20190506.ListChangeOrdersResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListChangeOrdersResponse.Data.ChangeOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChangeOrdersResponseUnmarshaller {

	public static ListChangeOrdersResponse unmarshall(ListChangeOrdersResponse listChangeOrdersResponse, UnmarshallerContext _ctx) {
		
		listChangeOrdersResponse.setRequestId(_ctx.stringValue("ListChangeOrdersResponse.RequestId"));
		listChangeOrdersResponse.setCode(_ctx.stringValue("ListChangeOrdersResponse.Code"));
		listChangeOrdersResponse.setMessage(_ctx.stringValue("ListChangeOrdersResponse.Message"));
		listChangeOrdersResponse.setSuccess(_ctx.booleanValue("ListChangeOrdersResponse.Success"));
		listChangeOrdersResponse.setErrorCode(_ctx.stringValue("ListChangeOrdersResponse.ErrorCode"));
		listChangeOrdersResponse.setTraceId(_ctx.stringValue("ListChangeOrdersResponse.TraceId"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListChangeOrdersResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListChangeOrdersResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListChangeOrdersResponse.Data.TotalSize"));

		List<ChangeOrder> changeOrderList = new ArrayList<ChangeOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListChangeOrdersResponse.Data.ChangeOrderList.Length"); i++) {
			ChangeOrder changeOrder = new ChangeOrder();
			changeOrder.setAppId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].AppId"));
			changeOrder.setBatchCount(_ctx.integerValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchCount"));
			changeOrder.setBatchType(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchType"));
			changeOrder.setChangeOrderId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].ChangeOrderId"));
			changeOrder.setCoType(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoType"));
			changeOrder.setCoTypeCode(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoTypeCode"));
			changeOrder.setCreateTime(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateTime"));
			changeOrder.setDescription(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Description"));
			changeOrder.setFinishTime(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].FinishTime"));
			changeOrder.setGroupId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].GroupId"));
			changeOrder.setPipelines(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Pipelines"));
			changeOrder.setSource(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Source"));
			changeOrder.setStatus(_ctx.integerValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Status"));
			changeOrder.setUserId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].UserId"));
			changeOrder.setCreateUserId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateUserId"));

			changeOrderList.add(changeOrder);
		}
		data.setChangeOrderList(changeOrderList);
		listChangeOrdersResponse.setData(data);
	 
	 	return listChangeOrdersResponse;
	}
}