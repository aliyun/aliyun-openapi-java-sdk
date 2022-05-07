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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse.ApplyOrders;
import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse.ApplyOrders.Orders;
import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse.ApplyOrders.Orders.ApproveContent;
import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse.ApplyOrders.Orders.ApproveContent.ProjectMeta;
import com.aliyuncs.dataworks_public.model.v20200518.ListPermissionApplyOrdersResponse.ApplyOrders.Orders.ApproveContent.ProjectMeta.ObjectMetaListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPermissionApplyOrdersResponseUnmarshaller {

	public static ListPermissionApplyOrdersResponse unmarshall(ListPermissionApplyOrdersResponse listPermissionApplyOrdersResponse, UnmarshallerContext _ctx) {
		
		listPermissionApplyOrdersResponse.setRequestId(_ctx.stringValue("ListPermissionApplyOrdersResponse.RequestId"));

		ApplyOrders applyOrders = new ApplyOrders();
		applyOrders.setPageSize(_ctx.integerValue("ListPermissionApplyOrdersResponse.ApplyOrders.PageSize"));
		applyOrders.setPageNumber(_ctx.integerValue("ListPermissionApplyOrdersResponse.ApplyOrders.PageNumber"));
		applyOrders.setTotalCount(_ctx.integerValue("ListPermissionApplyOrdersResponse.ApplyOrders.TotalCount"));

		List<Orders> applyOrder = new ArrayList<Orders>();
		for (int i = 0; i < _ctx.lengthValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder.Length"); i++) {
			Orders orders = new Orders();
			orders.setApplyBaseId(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApplyBaseId"));
			orders.setApplyTimestamp(_ctx.longValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApplyTimestamp"));
			orders.setFlowId(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].FlowId"));
			orders.setFlowStatus(_ctx.integerValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].FlowStatus"));

			ApproveContent approveContent = new ApproveContent();
			approveContent.setApplyReason(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ApplyReason"));
			approveContent.setOrderType(_ctx.integerValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.OrderType"));

			ProjectMeta projectMeta = new ProjectMeta();
			projectMeta.setWorkspaceName(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ProjectMeta.WorkspaceName"));

			List<ObjectMetaListItem> objectMetaList = new ArrayList<ObjectMetaListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ProjectMeta.ObjectMetaList.Length"); j++) {
				ObjectMetaListItem objectMetaListItem = new ObjectMetaListItem();
				objectMetaListItem.setObjectName(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ProjectMeta.ObjectMetaList["+ j +"].ObjectName"));

				List<String> actions = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ProjectMeta.ObjectMetaList["+ j +"].Actions.Length"); k++) {
					actions.add(_ctx.stringValue("ListPermissionApplyOrdersResponse.ApplyOrders.ApplyOrder["+ i +"].ApproveContent.ProjectMeta.ObjectMetaList["+ j +"].Actions["+ k +"]"));
				}
				objectMetaListItem.setActions(actions);

				objectMetaList.add(objectMetaListItem);
			}
			projectMeta.setObjectMetaList(objectMetaList);
			approveContent.setProjectMeta(projectMeta);
			orders.setApproveContent(approveContent);

			applyOrder.add(orders);
		}
		applyOrders.setApplyOrder(applyOrder);
		listPermissionApplyOrdersResponse.setApplyOrders(applyOrders);
	 
	 	return listPermissionApplyOrdersResponse;
	}
}