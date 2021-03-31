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
		listChangeOrdersResponse.setMessage(_ctx.stringValue("ListChangeOrdersResponse.Message"));
		listChangeOrdersResponse.setTraceId(_ctx.stringValue("ListChangeOrdersResponse.TraceId"));
		listChangeOrdersResponse.setErrorCode(_ctx.stringValue("ListChangeOrdersResponse.ErrorCode"));
		listChangeOrdersResponse.setCode(_ctx.stringValue("ListChangeOrdersResponse.Code"));
		listChangeOrdersResponse.setSuccess(_ctx.booleanValue("ListChangeOrdersResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListChangeOrdersResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("ListChangeOrdersResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("ListChangeOrdersResponse.Data.TotalSize"));

		List<ChangeOrder> changeOrderList = new ArrayList<ChangeOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListChangeOrdersResponse.Data.ChangeOrderList.Length"); i++) {
			ChangeOrder changeOrder = new ChangeOrder();
			changeOrder.setStatus(_ctx.integerValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Status"));
			changeOrder.setDescription(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Description"));
			changeOrder.setCreateTime(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateTime"));
			changeOrder.setChangeOrderId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].ChangeOrderId"));
			changeOrder.setCreateUserId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateUserId"));
			changeOrder.setBatchType(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchType"));
			changeOrder.setSource(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Source"));
			changeOrder.setGroupId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].GroupId"));
			changeOrder.setAppId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].AppId"));
			changeOrder.setCoTypeCode(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoTypeCode"));
			changeOrder.setFinishTime(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].FinishTime"));
			changeOrder.setUserId(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].UserId"));
			changeOrder.setCoType(_ctx.stringValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoType"));
			changeOrder.setBatchCount(_ctx.integerValue("ListChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchCount"));

			changeOrderList.add(changeOrder);
		}
		data.setChangeOrderList(changeOrderList);
		listChangeOrdersResponse.setData(data);
	 
	 	return listChangeOrdersResponse;
	}
}