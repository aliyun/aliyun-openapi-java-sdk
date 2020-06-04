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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderCasesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderCasesResponse.CaseBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrderCasesResponseUnmarshaller {

	public static ListInboundOrderCasesResponse unmarshall(ListInboundOrderCasesResponse listInboundOrderCasesResponse, UnmarshallerContext _ctx) {
		
		listInboundOrderCasesResponse.setRequestId(_ctx.stringValue("ListInboundOrderCasesResponse.RequestId"));
		listInboundOrderCasesResponse.setPageSize(_ctx.integerValue("ListInboundOrderCasesResponse.PageSize"));
		listInboundOrderCasesResponse.setTotalCount(_ctx.integerValue("ListInboundOrderCasesResponse.TotalCount"));
		listInboundOrderCasesResponse.setPageNumber(_ctx.integerValue("ListInboundOrderCasesResponse.PageNumber"));
		listInboundOrderCasesResponse.setSuccess(_ctx.booleanValue("ListInboundOrderCasesResponse.Success"));

		List<CaseBiz> cases = new ArrayList<CaseBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrderCasesResponse.Cases.Length"); i++) {
			CaseBiz caseBiz = new CaseBiz();
			caseBiz.setId(_ctx.stringValue("ListInboundOrderCasesResponse.Cases["+ i +"].Id"));
			caseBiz.setOperateQuantity(_ctx.integerValue("ListInboundOrderCasesResponse.Cases["+ i +"].OperateQuantity"));
			caseBiz.setCaseCode(_ctx.stringValue("ListInboundOrderCasesResponse.Cases["+ i +"].CaseCode"));
			caseBiz.setCaseStatus(_ctx.stringValue("ListInboundOrderCasesResponse.Cases["+ i +"].CaseStatus"));
			caseBiz.setBeConfirmInboundCase(_ctx.booleanValue("ListInboundOrderCasesResponse.Cases["+ i +"].BeConfirmInboundCase"));
			caseBiz.setBeConfirmOutboundCase(_ctx.booleanValue("ListInboundOrderCasesResponse.Cases["+ i +"].BeConfirmOutboundCase"));
			caseBiz.setApplyStatus(_ctx.stringValue("ListInboundOrderCasesResponse.Cases["+ i +"].ApplyStatus"));
			caseBiz.setPreboxingQuantity(_ctx.integerValue("ListInboundOrderCasesResponse.Cases["+ i +"].PreboxingQuantity"));

			cases.add(caseBiz);
		}
		listInboundOrderCasesResponse.setCases(cases);
	 
	 	return listInboundOrderCasesResponse;
	}
}