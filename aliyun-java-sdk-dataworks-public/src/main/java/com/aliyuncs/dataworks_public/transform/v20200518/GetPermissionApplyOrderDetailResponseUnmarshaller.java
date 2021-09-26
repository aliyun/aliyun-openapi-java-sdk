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

import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveAccountListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaListItem.ColumnMetaListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPermissionApplyOrderDetailResponseUnmarshaller {

	public static GetPermissionApplyOrderDetailResponse unmarshall(GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getPermissionApplyOrderDetailResponse.setRequestId(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.RequestId"));

		ApplyOrderDetail applyOrderDetail = new ApplyOrderDetail();
		applyOrderDetail.setApplyBaseId(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApplyBaseId"));
		applyOrderDetail.setApplyTimestamp(_ctx.longValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApplyTimestamp"));
		applyOrderDetail.setFlowId(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.FlowId"));
		applyOrderDetail.setFlowStatus(_ctx.integerValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.FlowStatus"));

		ApproveContent approveContent = new ApproveContent();
		approveContent.setApplyReason(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ApplyReason"));
		approveContent.setDeadline(_ctx.longValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.Deadline"));
		approveContent.setOrderType(_ctx.integerValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.OrderType"));

		ProjectMeta projectMeta = new ProjectMeta();
		projectMeta.setMaxComputeProjectName(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.MaxComputeProjectName"));
		projectMeta.setWorkspaceId(_ctx.integerValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.WorkspaceId"));

		List<ObjectMetaListItem> objectMetaList = new ArrayList<ObjectMetaListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaList.Length"); i++) {
			ObjectMetaListItem objectMetaListItem = new ObjectMetaListItem();
			objectMetaListItem.setObjectName(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaList["+ i +"].ObjectName"));

			List<ColumnMetaListItem> columnMetaList = new ArrayList<ColumnMetaListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaList["+ i +"].ColumnMetaList.Length"); j++) {
				ColumnMetaListItem columnMetaListItem = new ColumnMetaListItem();
				columnMetaListItem.setColumnName(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaList["+ i +"].ColumnMetaList["+ j +"].ColumnName"));
				columnMetaListItem.setColumnComment(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveContent.ProjectMeta.ObjectMetaList["+ i +"].ColumnMetaList["+ j +"].ColumnComment"));

				columnMetaList.add(columnMetaListItem);
			}
			objectMetaListItem.setColumnMetaList(columnMetaList);

			objectMetaList.add(objectMetaListItem);
		}
		projectMeta.setObjectMetaList(objectMetaList);
		approveContent.setProjectMeta(projectMeta);
		applyOrderDetail.setApproveContent(approveContent);

		List<ApproveAccountListItem> approveAccountList = new ArrayList<ApproveAccountListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveAccountList.Length"); i++) {
			ApproveAccountListItem approveAccountListItem = new ApproveAccountListItem();
			approveAccountListItem.setBaseId(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.ApproveAccountList["+ i +"].BaseId"));

			approveAccountList.add(approveAccountListItem);
		}
		applyOrderDetail.setApproveAccountList(approveAccountList);

		List<GranteeObjectListItem> granteeObjectList = new ArrayList<GranteeObjectListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectList.Length"); i++) {
			GranteeObjectListItem granteeObjectListItem = new GranteeObjectListItem();
			granteeObjectListItem.setGranteeType(_ctx.integerValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectList["+ i +"].GranteeType"));
			granteeObjectListItem.setGranteeTypeSub(_ctx.integerValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectList["+ i +"].GranteeTypeSub"));
			granteeObjectListItem.setGranteeName(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectList["+ i +"].GranteeName"));
			granteeObjectListItem.setGranteeId(_ctx.stringValue("GetPermissionApplyOrderDetailResponse.ApplyOrderDetail.GranteeObjectList["+ i +"].GranteeId"));

			granteeObjectList.add(granteeObjectListItem);
		}
		applyOrderDetail.setGranteeObjectList(granteeObjectList);
		getPermissionApplyOrderDetailResponse.setApplyOrderDetail(applyOrderDetail);
	 
	 	return getPermissionApplyOrderDetailResponse;
	}
}