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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetOrderBaseInfoResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOrderBaseInfoResponse.OrderBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderBaseInfoResponseUnmarshaller {

	public static GetOrderBaseInfoResponse unmarshall(GetOrderBaseInfoResponse getOrderBaseInfoResponse, UnmarshallerContext _ctx) {
		
		getOrderBaseInfoResponse.setRequestId(_ctx.stringValue("GetOrderBaseInfoResponse.RequestId"));
		getOrderBaseInfoResponse.setErrorCode(_ctx.stringValue("GetOrderBaseInfoResponse.ErrorCode"));
		getOrderBaseInfoResponse.setErrorMessage(_ctx.stringValue("GetOrderBaseInfoResponse.ErrorMessage"));
		getOrderBaseInfoResponse.setSuccess(_ctx.booleanValue("GetOrderBaseInfoResponse.Success"));

		OrderBaseInfo orderBaseInfo = new OrderBaseInfo();
		orderBaseInfo.setComment(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.Comment"));
		orderBaseInfo.setCreateTime(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.CreateTime"));
		orderBaseInfo.setCommitter(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.Committer"));
		orderBaseInfo.setWorkflowInstanceId(_ctx.longValue("GetOrderBaseInfoResponse.OrderBaseInfo.WorkflowInstanceId"));
		orderBaseInfo.setCommitterId(_ctx.longValue("GetOrderBaseInfoResponse.OrderBaseInfo.CommitterId"));
		orderBaseInfo.setLastModifyTime(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.LastModifyTime"));
		orderBaseInfo.setStatusCode(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.StatusCode"));
		orderBaseInfo.setWorkflowStatusDesc(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.WorkflowStatusDesc"));
		orderBaseInfo.setStatusDesc(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.StatusDesc"));
		orderBaseInfo.setPluginType(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.PluginType"));
		orderBaseInfo.setOrderId(_ctx.longValue("GetOrderBaseInfoResponse.OrderBaseInfo.OrderId"));

		List<String> relatedUserNickList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderBaseInfoResponse.OrderBaseInfo.RelatedUserNickList.Length"); i++) {
			relatedUserNickList.add(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.RelatedUserNickList["+ i +"]"));
		}
		orderBaseInfo.setRelatedUserNickList(relatedUserNickList);

		List<String> relatedUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderBaseInfoResponse.OrderBaseInfo.RelatedUserList.Length"); i++) {
			relatedUserList.add(_ctx.stringValue("GetOrderBaseInfoResponse.OrderBaseInfo.RelatedUserList["+ i +"]"));
		}
		orderBaseInfo.setRelatedUserList(relatedUserList);
		getOrderBaseInfoResponse.setOrderBaseInfo(orderBaseInfo);
	 
	 	return getOrderBaseInfoResponse;
	}
}