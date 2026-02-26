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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoResponse.BizEntityInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoResponse.BizEntityInfo.BizObject;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoResponse.BizEntityInfo.BizProcess;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizEntityInfoResponseUnmarshaller {

	public static GetBizEntityInfoResponse unmarshall(GetBizEntityInfoResponse getBizEntityInfoResponse, UnmarshallerContext _ctx) {
		
		getBizEntityInfoResponse.setRequestId(_ctx.stringValue("GetBizEntityInfoResponse.RequestId"));
		getBizEntityInfoResponse.setSuccess(_ctx.booleanValue("GetBizEntityInfoResponse.Success"));
		getBizEntityInfoResponse.setHttpStatusCode(_ctx.integerValue("GetBizEntityInfoResponse.HttpStatusCode"));
		getBizEntityInfoResponse.setCode(_ctx.stringValue("GetBizEntityInfoResponse.Code"));
		getBizEntityInfoResponse.setMessage(_ctx.stringValue("GetBizEntityInfoResponse.Message"));

		BizEntityInfo bizEntityInfo = new BizEntityInfo();
		bizEntityInfo.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.Type"));
		bizEntityInfo.setDataDomainId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.DataDomainId"));
		bizEntityInfo.setBizUnitId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizUnitId"));

		BizObject bizObject = new BizObject();
		bizObject.setId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Id"));
		bizObject.setName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Name"));
		bizObject.setDisplayName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.DisplayName"));
		bizObject.setDescription(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Description"));
		bizObject.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OwnerUserId"));
		bizObject.setOwnerName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OwnerName"));
		bizObject.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Type"));
		bizObject.setParentId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ParentId"));
		bizObject.setGmtCreate(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.GmtCreate"));
		bizObject.setGmtModified(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.GmtModified"));
		bizObject.setLastModifier(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.LastModifier"));
		bizObject.setLastModifierName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.LastModifierName"));
		bizObject.setRefDimTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefDimTableCount"));
		bizObject.setRefSummaryTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefSummaryTableCount"));
		bizObject.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OnlineStatus"));
		bizObject.setStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Status"));
		bizObject.setApprovalId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ApprovalId"));
		bizObject.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ApprovalStatus"));

		List<Long> refBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefBizEntityIdList["+ i +"]"));
		}
		bizObject.setRefBizEntityIdList(refBizEntityIdList);

		List<Long> childBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ChildBizEntityIdList.Length"); i++) {
			childBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ChildBizEntityIdList["+ i +"]"));
		}
		bizObject.setChildBizEntityIdList(childBizEntityIdList);
		bizEntityInfo.setBizObject(bizObject);

		BizProcess bizProcess = new BizProcess();
		bizProcess.setId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Id"));
		bizProcess.setName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Name"));
		bizProcess.setDisplayName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.DisplayName"));
		bizProcess.setDescription(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Description"));
		bizProcess.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OwnerUserId"));
		bizProcess.setOwnerName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OwnerName"));
		bizProcess.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Type"));
		bizProcess.setGmtCreate(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.GmtCreate"));
		bizProcess.setGmtModified(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.GmtModified"));
		bizProcess.setLastModifier(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.LastModifier"));
		bizProcess.setLastModifierName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.LastModifierName"));
		bizProcess.setHasDependent(_ctx.booleanValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.HasDependent"));
		bizProcess.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OnlineStatus"));
		bizProcess.setStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Status"));
		bizProcess.setApprovalId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.ApprovalId"));
		bizProcess.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.ApprovalStatus"));
		bizProcess.setRefFactTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefFactTableCount"));

		List<Long> refBizEntityIdList1 = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList1.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefBizEntityIdList["+ i +"]"));
		}
		bizProcess.setRefBizEntityIdList1(refBizEntityIdList1);

		List<Long> bizEventEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.BizEventEntityIdList.Length"); i++) {
			bizEventEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.BizEventEntityIdList["+ i +"]"));
		}
		bizProcess.setBizEventEntityIdList(bizEventEntityIdList);

		List<Long> preBizProcessIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.PreBizProcessIdList.Length"); i++) {
			preBizProcessIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.PreBizProcessIdList["+ i +"]"));
		}
		bizProcess.setPreBizProcessIdList(preBizProcessIdList);
		bizEntityInfo.setBizProcess(bizProcess);
		getBizEntityInfoResponse.setBizEntityInfo(bizEntityInfo);
	 
	 	return getBizEntityInfoResponse;
	}
}