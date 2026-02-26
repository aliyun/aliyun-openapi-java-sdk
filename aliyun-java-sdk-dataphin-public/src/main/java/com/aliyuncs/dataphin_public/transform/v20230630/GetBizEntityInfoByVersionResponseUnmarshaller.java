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

import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoByVersionResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoByVersionResponse.BizEntityInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizEntityInfoByVersionResponseUnmarshaller {

	public static GetBizEntityInfoByVersionResponse unmarshall(GetBizEntityInfoByVersionResponse getBizEntityInfoByVersionResponse, UnmarshallerContext _ctx) {
		
		getBizEntityInfoByVersionResponse.setRequestId(_ctx.stringValue("GetBizEntityInfoByVersionResponse.RequestId"));
		getBizEntityInfoByVersionResponse.setSuccess(_ctx.booleanValue("GetBizEntityInfoByVersionResponse.Success"));
		getBizEntityInfoByVersionResponse.setHttpStatusCode(_ctx.integerValue("GetBizEntityInfoByVersionResponse.HttpStatusCode"));
		getBizEntityInfoByVersionResponse.setCode(_ctx.stringValue("GetBizEntityInfoByVersionResponse.Code"));
		getBizEntityInfoByVersionResponse.setMessage(_ctx.stringValue("GetBizEntityInfoByVersionResponse.Message"));

		BizEntityInfo bizEntityInfo = new BizEntityInfo();
		bizEntityInfo.setType(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.Type"));
		bizEntityInfo.setDataDomainId(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.DataDomainId"));
		bizEntityInfo.setBizUnitId(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizUnitId"));

		BizObject bizObject = new BizObject();
		bizObject.setId(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.Id"));
		bizObject.setName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.Name"));
		bizObject.setDisplayName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.DisplayName"));
		bizObject.setDescription(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.Description"));
		bizObject.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.OwnerUserId"));
		bizObject.setOwnerName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.OwnerName"));
		bizObject.setType(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.Type"));
		bizObject.setParentId(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.ParentId"));
		bizObject.setGmtCreate(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.GmtCreate"));
		bizObject.setGmtModified(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.GmtModified"));
		bizObject.setLastModifier(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.LastModifier"));
		bizObject.setLastModifierName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.LastModifierName"));
		bizObject.setRefDimTableCount(_ctx.integerValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.RefDimTableCount"));
		bizObject.setRefSummaryTableCount(_ctx.integerValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.RefSummaryTableCount"));
		bizObject.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.OnlineStatus"));
		bizObject.setStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.Status"));
		bizObject.setApprovalId(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.ApprovalId"));
		bizObject.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.ApprovalStatus"));

		List<Long> refBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.RefBizEntityIdList["+ i +"]"));
		}
		bizObject.setRefBizEntityIdList(refBizEntityIdList);

		List<Long> childBizEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.ChildBizEntityIdList.Length"); i++) {
			childBizEntityIdList.add(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizObject.ChildBizEntityIdList["+ i +"]"));
		}
		bizObject.setChildBizEntityIdList(childBizEntityIdList);
		bizEntityInfo.setBizObject(bizObject);

		BizProcess bizProcess = new BizProcess();
		bizProcess.setId(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.Id"));
		bizProcess.setName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.Name"));
		bizProcess.setDisplayName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.DisplayName"));
		bizProcess.setDescription(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.Description"));
		bizProcess.setOwnerUserId(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.OwnerUserId"));
		bizProcess.setOwnerName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.OwnerName"));
		bizProcess.setType(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.Type"));
		bizProcess.setGmtCreate(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.GmtCreate"));
		bizProcess.setGmtModified(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.GmtModified"));
		bizProcess.setLastModifier(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.LastModifier"));
		bizProcess.setLastModifierName(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.LastModifierName"));
		bizProcess.setHasDependent(_ctx.booleanValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.HasDependent"));
		bizProcess.setOnlineStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.OnlineStatus"));
		bizProcess.setStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.Status"));
		bizProcess.setApprovalId(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.ApprovalId"));
		bizProcess.setApprovalStatus(_ctx.stringValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.ApprovalStatus"));
		bizProcess.setRefFactTableCount(_ctx.integerValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.RefFactTableCount"));

		List<Long> refBizEntityIdList1 = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.RefBizEntityIdList.Length"); i++) {
			refBizEntityIdList1.add(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.RefBizEntityIdList["+ i +"]"));
		}
		bizProcess.setRefBizEntityIdList1(refBizEntityIdList1);

		List<Long> bizEventEntityIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.BizEventEntityIdList.Length"); i++) {
			bizEventEntityIdList.add(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.BizEventEntityIdList["+ i +"]"));
		}
		bizProcess.setBizEventEntityIdList(bizEventEntityIdList);

		List<Long> preBizProcessIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.PreBizProcessIdList.Length"); i++) {
			preBizProcessIdList.add(_ctx.longValue("GetBizEntityInfoByVersionResponse.BizEntityInfo.BizProcess.PreBizProcessIdList["+ i +"]"));
		}
		bizProcess.setPreBizProcessIdList(preBizProcessIdList);
		bizEntityInfo.setBizProcess(bizProcess);
		getBizEntityInfoByVersionResponse.setBizEntityInfo(bizEntityInfo);
	 
	 	return getBizEntityInfoByVersionResponse;
	}
}