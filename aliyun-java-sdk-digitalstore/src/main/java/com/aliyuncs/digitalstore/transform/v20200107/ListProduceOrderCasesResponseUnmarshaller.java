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

import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderCasesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderCasesResponse.ProduceOrderCaseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceOrderCasesResponseUnmarshaller {

	public static ListProduceOrderCasesResponse unmarshall(ListProduceOrderCasesResponse listProduceOrderCasesResponse, UnmarshallerContext _ctx) {
		
		listProduceOrderCasesResponse.setRequestId(_ctx.stringValue("ListProduceOrderCasesResponse.RequestId"));
		listProduceOrderCasesResponse.setPageSize(_ctx.integerValue("ListProduceOrderCasesResponse.PageSize"));
		listProduceOrderCasesResponse.setTotalCount(_ctx.integerValue("ListProduceOrderCasesResponse.TotalCount"));
		listProduceOrderCasesResponse.setPageNumber(_ctx.integerValue("ListProduceOrderCasesResponse.PageNumber"));
		listProduceOrderCasesResponse.setSuccess(_ctx.booleanValue("ListProduceOrderCasesResponse.Success"));

		List<ProduceOrderCaseModel> produceOrderCases = new ArrayList<ProduceOrderCaseModel>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceOrderCasesResponse.ProduceOrderCases.Length"); i++) {
			ProduceOrderCaseModel produceOrderCaseModel = new ProduceOrderCaseModel();
			produceOrderCaseModel.setBindingQuantity(_ctx.integerValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].BindingQuantity"));
			produceOrderCaseModel.setCaseCode(_ctx.stringValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].CaseCode"));
			produceOrderCaseModel.setOrderId(_ctx.stringValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].OrderId"));
			produceOrderCaseModel.setBoxQuantity(_ctx.integerValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].BoxQuantity"));
			produceOrderCaseModel.setCaseId(_ctx.stringValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].CaseId"));
			produceOrderCaseModel.setEncasementMode(_ctx.stringValue("ListProduceOrderCasesResponse.ProduceOrderCases["+ i +"].EncasementMode"));

			produceOrderCases.add(produceOrderCaseModel);
		}
		listProduceOrderCasesResponse.setProduceOrderCases(produceOrderCases);
	 
	 	return listProduceOrderCasesResponse;
	}
}