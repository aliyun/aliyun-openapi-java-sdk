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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListChainResponse;
import com.aliyuncs.cr.model.v20181201.ListChainResponse.ChainsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChainResponseUnmarshaller {

	public static ListChainResponse unmarshall(ListChainResponse listChainResponse, UnmarshallerContext _ctx) {
		
		listChainResponse.setRequestId(_ctx.stringValue("ListChainResponse.RequestId"));
		listChainResponse.setCode(_ctx.stringValue("ListChainResponse.Code"));
		listChainResponse.setPageNo(_ctx.integerValue("ListChainResponse.PageNo"));
		listChainResponse.setIsSuccess(_ctx.booleanValue("ListChainResponse.IsSuccess"));
		listChainResponse.setPageSize(_ctx.integerValue("ListChainResponse.PageSize"));
		listChainResponse.setTotalCount(_ctx.integerValue("ListChainResponse.TotalCount"));

		List<ChainsItem> chains = new ArrayList<ChainsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChainResponse.Chains.Length"); i++) {
			ChainsItem chainsItem = new ChainsItem();
			chainsItem.setModifiedTime(_ctx.longValue("ListChainResponse.Chains["+ i +"].ModifiedTime"));
			chainsItem.setScopeId(_ctx.stringValue("ListChainResponse.Chains["+ i +"].ScopeId"));
			chainsItem.setDescription(_ctx.stringValue("ListChainResponse.Chains["+ i +"].Description"));
			chainsItem.setCreateTime(_ctx.longValue("ListChainResponse.Chains["+ i +"].CreateTime"));
			chainsItem.setScopeType(_ctx.stringValue("ListChainResponse.Chains["+ i +"].ScopeType"));
			chainsItem.setChainId(_ctx.stringValue("ListChainResponse.Chains["+ i +"].ChainId"));
			chainsItem.setInstanceId(_ctx.stringValue("ListChainResponse.Chains["+ i +"].InstanceId"));
			chainsItem.setName(_ctx.stringValue("ListChainResponse.Chains["+ i +"].Name"));

			chains.add(chainsItem);
		}
		listChainResponse.setChains(chains);
	 
	 	return listChainResponse;
	}
}