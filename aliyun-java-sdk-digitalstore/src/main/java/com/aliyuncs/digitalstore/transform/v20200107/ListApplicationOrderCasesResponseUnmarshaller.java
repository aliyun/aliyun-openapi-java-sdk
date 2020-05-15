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

import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderCasesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderCasesResponse.ApplyOrderCaseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationOrderCasesResponseUnmarshaller {

	public static ListApplicationOrderCasesResponse unmarshall(ListApplicationOrderCasesResponse listApplicationOrderCasesResponse, UnmarshallerContext _ctx) {
		
		listApplicationOrderCasesResponse.setRequestId(_ctx.stringValue("ListApplicationOrderCasesResponse.RequestId"));
		listApplicationOrderCasesResponse.setPageSize(_ctx.integerValue("ListApplicationOrderCasesResponse.PageSize"));
		listApplicationOrderCasesResponse.setTotalCount(_ctx.integerValue("ListApplicationOrderCasesResponse.TotalCount"));
		listApplicationOrderCasesResponse.setPageNumber(_ctx.integerValue("ListApplicationOrderCasesResponse.PageNumber"));
		listApplicationOrderCasesResponse.setSuccess(_ctx.booleanValue("ListApplicationOrderCasesResponse.Success"));

		List<ApplyOrderCaseModel> applyOrderCases = new ArrayList<ApplyOrderCaseModel>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationOrderCasesResponse.ApplyOrderCases.Length"); i++) {
			ApplyOrderCaseModel applyOrderCaseModel = new ApplyOrderCaseModel();
			applyOrderCaseModel.setCreateDate(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].CreateDate"));
			applyOrderCaseModel.setStatus(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].Status"));
			applyOrderCaseModel.setOrderCaseId(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].OrderCaseId"));
			applyOrderCaseModel.setProductTotal(_ctx.integerValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].ProductTotal"));
			applyOrderCaseModel.setCaseCode(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].CaseCode"));
			applyOrderCaseModel.setReceivedQuantity(_ctx.integerValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].ReceivedQuantity"));
			applyOrderCaseModel.setUpdateDate(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].UpdateDate"));
			applyOrderCaseModel.setOrderId(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].OrderId"));
			applyOrderCaseModel.setCaseId(_ctx.stringValue("ListApplicationOrderCasesResponse.ApplyOrderCases["+ i +"].CaseId"));

			applyOrderCases.add(applyOrderCaseModel);
		}
		listApplicationOrderCasesResponse.setApplyOrderCases(applyOrderCases);
	 
	 	return listApplicationOrderCasesResponse;
	}
}