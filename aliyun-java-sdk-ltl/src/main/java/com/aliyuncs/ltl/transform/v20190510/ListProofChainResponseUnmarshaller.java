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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListProofChainResponse;
import com.aliyuncs.ltl.model.v20190510.ListProofChainResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListProofChainResponse.Data.ProofChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProofChainResponseUnmarshaller {

	public static ListProofChainResponse unmarshall(ListProofChainResponse listProofChainResponse, UnmarshallerContext _ctx) {
		
		listProofChainResponse.setRequestId(_ctx.stringValue("ListProofChainResponse.RequestId"));
		listProofChainResponse.setCode(_ctx.integerValue("ListProofChainResponse.Code"));
		listProofChainResponse.setSuccess(_ctx.booleanValue("ListProofChainResponse.Success"));
		listProofChainResponse.setMessage(_ctx.stringValue("ListProofChainResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListProofChainResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListProofChainResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListProofChainResponse.Data.Size"));

		List<ProofChainInfo> pageData = new ArrayList<ProofChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListProofChainResponse.Data.PageData.Length"); i++) {
			ProofChainInfo proofChainInfo = new ProofChainInfo();
			proofChainInfo.setBizChainId(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].BizChainId"));
			proofChainInfo.setName(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].Name"));
			proofChainInfo.setRemark(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].Remark"));
			proofChainInfo.setRoleType(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].RoleType"));
			proofChainInfo.setBizChainCode(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].BizChainCode"));
			proofChainInfo.setDataTypeCode(_ctx.stringValue("ListProofChainResponse.Data.PageData["+ i +"].DataTypeCode"));

			pageData.add(proofChainInfo);
		}
		data.setPageData(pageData);
		listProofChainResponse.setData(data);
	 
	 	return listProofChainResponse;
	}
}