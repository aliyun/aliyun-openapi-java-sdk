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
		getBizEntityInfoResponse.setMessage(_ctx.stringValue("GetBizEntityInfoResponse.Message"));
		getBizEntityInfoResponse.setHttpStatusCode(_ctx.integerValue("GetBizEntityInfoResponse.HttpStatusCode"));
		getBizEntityInfoResponse.setCode(_ctx.stringValue("GetBizEntityInfoResponse.Code"));
		getBizEntityInfoResponse.setSuccess(_ctx.booleanValue("GetBizEntityInfoResponse.Success"));

		BizEntityInfo bizEntityInfo = new BizEntityInfo();
		bizEntityInfo.setDataDomainId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.DataDomainId"));
		bizEntityInfo.setBizUnitId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizUnitId"));
		bizEntityInfo.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.Type"));

		BizProcess bizProcess = new BizProcess();
		bizProcess.setStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Status"));
		bizProcess.setOwnerName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OwnerName"));
		bizProcess.setLastModifier(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.LastModifier"));
		bizProcess.setDescription(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Description"));
		bizProcess.setGmtModified(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.GmtModified"));
		bizProcess.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OnlineStatus"));
		bizProcess.setApprovalId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.ApprovalId"));
		bizProcess.setLastModifierName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.LastModifierName"));
		bizProcess.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.ApprovalStatus"));
		bizProcess.setName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Name"));
		bizProcess.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.OwnerUserId"));
		bizProcess.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Type"));
		bizProcess.setGmtCreate(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.GmtCreate"));
		bizProcess.setHasDependent(_ctx.booleanValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.HasDependent"));
		bizProcess.setDisplayName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.DisplayName"));
		bizProcess.setRefFactTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefFactTableCount"));
		bizProcess.setId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.Id"));

		List<Long> bizEventEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.BizEventEntityIdList.Length"); i++) {
			bizEventEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.BizEventEntityIdList["+ i +"]"));
		}
		bizProcess.setBizEventEntityIdList(bizEventEntityIdList);

		List<Long> refBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.RefBizEntityIdList["+ i +"]"));
		}
		bizProcess.setRefBizEntityIdList(refBizEntityIdList);

		List<Long> preBizProcessIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.PreBizProcessIdList.Length"); i++) {
			preBizProcessIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizProcess.PreBizProcessIdList["+ i +"]"));
		}
		bizProcess.setPreBizProcessIdList(preBizProcessIdList);
		bizEntityInfo.setBizProcess(bizProcess);

		BizObject bizObject = new BizObject();
		bizObject.setParentId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ParentId"));
		bizObject.setStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Status"));
		bizObject.setOwnerName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OwnerName"));
		bizObject.setLastModifier(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.LastModifier"));
		bizObject.setDescription(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Description"));
		bizObject.setGmtModified(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.GmtModified"));
		bizObject.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OnlineStatus"));
		bizObject.setApprovalId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ApprovalId"));
		bizObject.setLastModifierName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.LastModifierName"));
		bizObject.setRefSummaryTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefSummaryTableCount"));
		bizObject.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ApprovalStatus"));
		bizObject.setName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Name"));
		bizObject.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.OwnerUserId"));
		bizObject.setType(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Type"));
		bizObject.setGmtCreate(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.GmtCreate"));
		bizObject.setDisplayName(_ctx.stringValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.DisplayName"));
		bizObject.setRefDimTableCount(_ctx.integerValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefDimTableCount"));
		bizObject.setId(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.Id"));

		List<Long> childBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ChildBizEntityIdList.Length"); i++) {
			childBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.ChildBizEntityIdList["+ i +"]"));
		}
		bizObject.setChildBizEntityIdList(childBizEntityIdList);

		List<Long> refBizEntityIdList1 = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList1.add(_ctx.longValue("GetBizEntityInfoResponse.BizEntityInfo.BizObject.RefBizEntityIdList["+ i +"]"));
		}
		bizObject.setRefBizEntityIdList1(refBizEntityIdList1);
		bizEntityInfo.setBizObject(bizObject);
		getBizEntityInfoResponse.setBizEntityInfo(bizEntityInfo);
	 
	 	return getBizEntityInfoResponse;
	}
}