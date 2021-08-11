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

import com.aliyuncs.ltl.model.v20190510.ListMultiPartyCollaborationChainResponse;
import com.aliyuncs.ltl.model.v20190510.ListMultiPartyCollaborationChainResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListMultiPartyCollaborationChainResponse.Data.MultiPartyCollaborationChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiPartyCollaborationChainResponseUnmarshaller {

	public static ListMultiPartyCollaborationChainResponse unmarshall(ListMultiPartyCollaborationChainResponse listMultiPartyCollaborationChainResponse, UnmarshallerContext _ctx) {
		
		listMultiPartyCollaborationChainResponse.setRequestId(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.RequestId"));
		listMultiPartyCollaborationChainResponse.setCode(_ctx.integerValue("ListMultiPartyCollaborationChainResponse.Code"));
		listMultiPartyCollaborationChainResponse.setSuccess(_ctx.booleanValue("ListMultiPartyCollaborationChainResponse.Success"));
		listMultiPartyCollaborationChainResponse.setMessage(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListMultiPartyCollaborationChainResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListMultiPartyCollaborationChainResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListMultiPartyCollaborationChainResponse.Data.Size"));

		List<MultiPartyCollaborationChainInfo> pageData = new ArrayList<MultiPartyCollaborationChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiPartyCollaborationChainResponse.Data.PageData.Length"); i++) {
			MultiPartyCollaborationChainInfo multiPartyCollaborationChainInfo = new MultiPartyCollaborationChainInfo();
			multiPartyCollaborationChainInfo.setBizChainId(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.Data.PageData["+ i +"].BizChainId"));
			multiPartyCollaborationChainInfo.setName(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.Data.PageData["+ i +"].Name"));
			multiPartyCollaborationChainInfo.setRemark(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.Data.PageData["+ i +"].Remark"));
			multiPartyCollaborationChainInfo.setRoleType(_ctx.stringValue("ListMultiPartyCollaborationChainResponse.Data.PageData["+ i +"].RoleType"));

			pageData.add(multiPartyCollaborationChainInfo);
		}
		data.setPageData(pageData);
		listMultiPartyCollaborationChainResponse.setData(data);
	 
	 	return listMultiPartyCollaborationChainResponse;
	}
}