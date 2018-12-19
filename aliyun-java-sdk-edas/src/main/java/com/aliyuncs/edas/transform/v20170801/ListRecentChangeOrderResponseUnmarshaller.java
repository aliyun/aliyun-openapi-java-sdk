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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentChangeOrderResponseUnmarshaller {

	public static ListRecentChangeOrderResponse unmarshall(ListRecentChangeOrderResponse listRecentChangeOrderResponse, UnmarshallerContext context) {
		
		listRecentChangeOrderResponse.setRequestId(context.stringValue("ListRecentChangeOrderResponse.RequestId"));
		listRecentChangeOrderResponse.setCode(context.integerValue("ListRecentChangeOrderResponse.Code"));
		listRecentChangeOrderResponse.setMessage(context.stringValue("ListRecentChangeOrderResponse.Message"));

		List<ChangeOrder> changeOrderList = new ArrayList<ChangeOrder>();
		for (int i = 0; i < context.lengthValue("ListRecentChangeOrderResponse.ChangeOrderList.Length"); i++) {
			ChangeOrder changeOrder = new ChangeOrder();
			changeOrder.setChangeOrderId(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].ChangeOrderId"));
			changeOrder.setUserId(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].UserId"));
			changeOrder.setBatchType(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].BatchType"));
			changeOrder.setBatchCount(context.integerValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].BatchCount"));
			changeOrder.setAppId(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].AppId"));
			changeOrder.setGroupId(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].GroupId"));
			changeOrder.setStatus(context.integerValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].Status"));
			changeOrder.setCreateTime(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CreateTime"));
			changeOrder.setFinishTime(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].FinishTime"));
			changeOrder.setCoType(context.stringValue("ListRecentChangeOrderResponse.ChangeOrderList["+ i +"].CoType"));

			changeOrderList.add(changeOrder);
		}
		listRecentChangeOrderResponse.setChangeOrderList(changeOrderList);
	 
	 	return listRecentChangeOrderResponse;
	}
}