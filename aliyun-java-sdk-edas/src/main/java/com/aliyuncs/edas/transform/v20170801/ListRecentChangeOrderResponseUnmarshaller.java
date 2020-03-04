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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListRecentChangeOrderResponse;
import com.aliyuncs.edas.model.v20170801.ListRecentChangeOrderResponse.ChangeOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentChangeOrderResponseUnmarshaller {

	public static ListRecentChangeOrderResponse unmarshall(ListRecentChangeOrderResponse listRecentChangeOrderResponse, UnmarshallerContext _ctx) {
		
		listRecentChangeOrderResponse.setRequestId(_ctx.stringValue("ListRecentChangeOrderResponse.RequestId"));
		listRecentChangeOrderResponse.setCode(_ctx.integerValue("ListRecentChangeOrderResponse.Code"));
		listRecentChangeOrderResponse.setMessage(_ctx.stringValue("ListRecentChangeOrderResponse.Message"));

		List<ChangeOrder> changeOrderList = new ArrayList<ChangeOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListRecentChangeOrderResponse.ChangeOrderList.Length"); i++) {
			ChangeOrder changeOrder = new ChangeOrder();
			changeOrder.setChangeOrderId(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].ChangeOrderId"));
			changeOrder.setUserId(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].UserId"));
			changeOrder.setBatchType(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].BatchType"));
			changeOrder.setBatchCount(_ctx.integerValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].BatchCount"));
			changeOrder.setAppId(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].AppId"));
			changeOrder.setGroupId(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].GroupId"));
			changeOrder.setStatus(_ctx.integerValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].Status"));
			changeOrder.setCreateTime(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CreateTime"));
			changeOrder.setFinishTime(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].FinishTime"));
			changeOrder.setCoType(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CoType"));
			changeOrder.setCreateUserId(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CreateUserId"));
			changeOrder.setCoTypeCode(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CoTypeCode"));
			changeOrder.setSource(_ctx.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].Source"));

			changeOrderList.add(changeOrder);
		}
		listRecentChangeOrderResponse.setChangeOrderList(changeOrderList);
	 
	 	return listRecentChangeOrderResponse;
	}
}