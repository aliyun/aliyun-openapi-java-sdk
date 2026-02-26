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

import com.aliyuncs.lto.model.v20210707.ListMemberAuthorizedBizChainResponse;
import com.aliyuncs.lto.model.v20210707.ListMemberAuthorizedBizChainResponse.MemberAuthorizedBizChainInfo;
import com.aliyuncs.lto.model.v20210707.ListMemberAuthorizedBizChainResponse.MemberAuthorizedBizChainInfo.PeerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMemberAuthorizedBizChainResponseUnmarshaller {

	public static ListMemberAuthorizedBizChainResponse unmarshall(ListMemberAuthorizedBizChainResponse listMemberAuthorizedBizChainResponse, UnmarshallerContext _ctx) {
		
		listMemberAuthorizedBizChainResponse.setRequestId(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.RequestId"));
		listMemberAuthorizedBizChainResponse.setCode(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Code"));
		listMemberAuthorizedBizChainResponse.setHttpStatusCode(_ctx.integerValue("ListMemberAuthorizedBizChainResponse.HttpStatusCode"));
		listMemberAuthorizedBizChainResponse.setMessage(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Message"));
		listMemberAuthorizedBizChainResponse.setSuccess(_ctx.booleanValue("ListMemberAuthorizedBizChainResponse.Success"));

		List<MemberAuthorizedBizChainInfo> data = new ArrayList<MemberAuthorizedBizChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMemberAuthorizedBizChainResponse.Data.Length"); i++) {
			MemberAuthorizedBizChainInfo memberAuthorizedBizChainInfo = new MemberAuthorizedBizChainInfo();
			memberAuthorizedBizChainInfo.setBizChainType(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].BizChainType"));
			memberAuthorizedBizChainInfo.setBizChainName(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].BizChainName"));
			memberAuthorizedBizChainInfo.setBizChainId(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].BizChainId"));
			memberAuthorizedBizChainInfo.setAuthorized(_ctx.booleanValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].Authorized"));

			List<PeerInfo> peerList = new ArrayList<PeerInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].PeerList.Length"); j++) {
				PeerInfo peerInfo = new PeerInfo();
				peerInfo.setPeerName(_ctx.stringValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].PeerList["+ j +"].PeerName"));
				peerInfo.setAuthorized(_ctx.booleanValue("ListMemberAuthorizedBizChainResponse.Data["+ i +"].PeerList["+ j +"].Authorized"));

				peerList.add(peerInfo);
			}
			memberAuthorizedBizChainInfo.setPeerList(peerList);

			data.add(memberAuthorizedBizChainInfo);
		}
		listMemberAuthorizedBizChainResponse.setData(data);
	 
	 	return listMemberAuthorizedBizChainResponse;
	}
}