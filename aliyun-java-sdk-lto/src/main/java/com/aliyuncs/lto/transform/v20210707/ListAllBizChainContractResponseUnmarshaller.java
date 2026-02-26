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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllBizChainContractResponse;
import com.aliyuncs.lto.model.v20210707.ListAllBizChainContractResponse.ContractInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllBizChainContractResponseUnmarshaller {

	public static ListAllBizChainContractResponse unmarshall(ListAllBizChainContractResponse listAllBizChainContractResponse, UnmarshallerContext _ctx) {
		
		listAllBizChainContractResponse.setRequestId(_ctx.stringValue("ListAllBizChainContractResponse.RequestId"));
		listAllBizChainContractResponse.setCode(_ctx.stringValue("ListAllBizChainContractResponse.Code"));
		listAllBizChainContractResponse.setHttpStatusCode(_ctx.integerValue("ListAllBizChainContractResponse.HttpStatusCode"));
		listAllBizChainContractResponse.setMessage(_ctx.stringValue("ListAllBizChainContractResponse.Message"));
		listAllBizChainContractResponse.setSuccess(_ctx.booleanValue("ListAllBizChainContractResponse.Success"));

		List<ContractInfo> data = new ArrayList<ContractInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllBizChainContractResponse.Data.Length"); i++) {
			ContractInfo contractInfo = new ContractInfo();
			contractInfo.setContractName(_ctx.stringValue("ListAllBizChainContractResponse.Data["+ i +"].ContractName"));
			contractInfo.setInvokeType(_ctx.stringValue("ListAllBizChainContractResponse.Data["+ i +"].InvokeType"));
			contractInfo.setContractTemplateId(_ctx.stringValue("ListAllBizChainContractResponse.Data["+ i +"].ContractTemplateId"));

			data.add(contractInfo);
		}
		listAllBizChainContractResponse.setData(data);
	 
	 	return listAllBizChainContractResponse;
	}
}