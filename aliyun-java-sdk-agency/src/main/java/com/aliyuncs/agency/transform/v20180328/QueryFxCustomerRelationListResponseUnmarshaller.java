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

package com.aliyuncs.agency.transform.v20180328;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180328.QueryFxCustomerRelationListResponse;
import com.aliyuncs.agency.model.v20180328.QueryFxCustomerRelationListResponse.FxCustomerRelationVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFxCustomerRelationListResponseUnmarshaller {

	public static QueryFxCustomerRelationListResponse unmarshall(QueryFxCustomerRelationListResponse queryFxCustomerRelationListResponse, UnmarshallerContext _ctx) {
		
		queryFxCustomerRelationListResponse.setRequestId(_ctx.stringValue("QueryFxCustomerRelationListResponse.RequestId"));
		queryFxCustomerRelationListResponse.setSuccess(_ctx.booleanValue("QueryFxCustomerRelationListResponse.Success"));
		queryFxCustomerRelationListResponse.setCode(_ctx.stringValue("QueryFxCustomerRelationListResponse.Code"));
		queryFxCustomerRelationListResponse.setMessage(_ctx.stringValue("QueryFxCustomerRelationListResponse.Message"));
		queryFxCustomerRelationListResponse.setTotalNum(_ctx.integerValue("QueryFxCustomerRelationListResponse.TotalNum"));
		queryFxCustomerRelationListResponse.setCount(_ctx.integerValue("QueryFxCustomerRelationListResponse.Count"));

		List<FxCustomerRelationVO> data = new ArrayList<FxCustomerRelationVO>();
		for (int i = 0; i < _ctx.lengthValue("QueryFxCustomerRelationListResponse.Data.Length"); i++) {
			FxCustomerRelationVO fxCustomerRelationVO = new FxCustomerRelationVO();
			fxCustomerRelationVO.setParentId(_ctx.longValue("QueryFxCustomerRelationListResponse.Data["+ i +"].ParentId"));
			fxCustomerRelationVO.setParentId1(_ctx.longValue("QueryFxCustomerRelationListResponse.Data["+ i +"].ParentId1"));
			fxCustomerRelationVO.setCustomerRebateType(_ctx.integerValue("QueryFxCustomerRelationListResponse.Data["+ i +"].CustomerRebateType"));
			fxCustomerRelationVO.setParentId3(_ctx.longValue("QueryFxCustomerRelationListResponse.Data["+ i +"].ParentId3"));
			fxCustomerRelationVO.setIsDistribution(_ctx.integerValue("QueryFxCustomerRelationListResponse.Data["+ i +"].IsDistribution"));
			fxCustomerRelationVO.setIsRebateAgent(_ctx.integerValue("QueryFxCustomerRelationListResponse.Data["+ i +"].IsRebateAgent"));
			fxCustomerRelationVO.setParentId2(_ctx.longValue("QueryFxCustomerRelationListResponse.Data["+ i +"].ParentId2"));
			fxCustomerRelationVO.setLevel(_ctx.integerValue("QueryFxCustomerRelationListResponse.Data["+ i +"].Level"));
			fxCustomerRelationVO.setUid(_ctx.longValue("QueryFxCustomerRelationListResponse.Data["+ i +"].Uid"));

			data.add(fxCustomerRelationVO);
		}
		queryFxCustomerRelationListResponse.setData(data);
	 
	 	return queryFxCustomerRelationListResponse;
	}
}