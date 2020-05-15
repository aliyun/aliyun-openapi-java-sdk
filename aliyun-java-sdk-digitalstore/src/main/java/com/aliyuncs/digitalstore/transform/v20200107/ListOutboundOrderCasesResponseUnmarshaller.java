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

import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderCasesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderCasesResponse.CaseBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundOrderCasesResponseUnmarshaller {

	public static ListOutboundOrderCasesResponse unmarshall(ListOutboundOrderCasesResponse listOutboundOrderCasesResponse, UnmarshallerContext _ctx) {
		
		listOutboundOrderCasesResponse.setRequestId(_ctx.stringValue("ListOutboundOrderCasesResponse.RequestId"));
		listOutboundOrderCasesResponse.setPageSize(_ctx.integerValue("ListOutboundOrderCasesResponse.PageSize"));
		listOutboundOrderCasesResponse.setTotalCount(_ctx.integerValue("ListOutboundOrderCasesResponse.TotalCount"));
		listOutboundOrderCasesResponse.setPageNumber(_ctx.integerValue("ListOutboundOrderCasesResponse.PageNumber"));
		listOutboundOrderCasesResponse.setSuccess(_ctx.booleanValue("ListOutboundOrderCasesResponse.Success"));

		List<CaseBiz> cases = new ArrayList<CaseBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundOrderCasesResponse.Cases.Length"); i++) {
			CaseBiz caseBiz = new CaseBiz();
			caseBiz.setId(_ctx.stringValue("ListOutboundOrderCasesResponse.Cases["+ i +"].Id"));
			caseBiz.setOperateQuantity(_ctx.stringValue("ListOutboundOrderCasesResponse.Cases["+ i +"].OperateQuantity"));
			caseBiz.setCaseCode(_ctx.stringValue("ListOutboundOrderCasesResponse.Cases["+ i +"].CaseCode"));
			caseBiz.setCaseStatus(_ctx.stringValue("ListOutboundOrderCasesResponse.Cases["+ i +"].CaseStatus"));
			caseBiz.setBeConfirmInboundCase(_ctx.booleanValue("ListOutboundOrderCasesResponse.Cases["+ i +"].BeConfirmInboundCase"));
			caseBiz.setBeConfirmOutboundCase(_ctx.booleanValue("ListOutboundOrderCasesResponse.Cases["+ i +"].BeConfirmOutboundCase"));
			caseBiz.setApplyStatus(_ctx.booleanValue("ListOutboundOrderCasesResponse.Cases["+ i +"].ApplyStatus"));

			cases.add(caseBiz);
		}
		listOutboundOrderCasesResponse.setCases(cases);
	 
	 	return listOutboundOrderCasesResponse;
	}
}