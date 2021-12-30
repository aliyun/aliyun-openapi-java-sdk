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

import com.aliyuncs.cr.model.v20181201.ListChainInstanceResponse;
import com.aliyuncs.cr.model.v20181201.ListChainInstanceResponse.ChainInstancesItem;
import com.aliyuncs.cr.model.v20181201.ListChainInstanceResponse.ChainInstancesItem.Chain;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChainInstanceResponseUnmarshaller {

	public static ListChainInstanceResponse unmarshall(ListChainInstanceResponse listChainInstanceResponse, UnmarshallerContext _ctx) {
		
		listChainInstanceResponse.setRequestId(_ctx.stringValue("ListChainInstanceResponse.RequestId"));
		listChainInstanceResponse.setCode(_ctx.stringValue("ListChainInstanceResponse.Code"));
		listChainInstanceResponse.setPageNo(_ctx.integerValue("ListChainInstanceResponse.PageNo"));
		listChainInstanceResponse.setIsSuccess(_ctx.booleanValue("ListChainInstanceResponse.IsSuccess"));
		listChainInstanceResponse.setInstanceId(_ctx.stringValue("ListChainInstanceResponse.InstanceId"));
		listChainInstanceResponse.setPageSize(_ctx.integerValue("ListChainInstanceResponse.PageSize"));
		listChainInstanceResponse.setTotalCount(_ctx.integerValue("ListChainInstanceResponse.TotalCount"));

		List<ChainInstancesItem> chainInstances = new ArrayList<ChainInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChainInstanceResponse.ChainInstances.Length"); i++) {
			ChainInstancesItem chainInstancesItem = new ChainInstancesItem();
			chainInstancesItem.setEndTime(_ctx.longValue("ListChainInstanceResponse.ChainInstances["+ i +"].EndTime"));
			chainInstancesItem.setStatus(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].Status"));
			chainInstancesItem.setStartTime(_ctx.longValue("ListChainInstanceResponse.ChainInstances["+ i +"].StartTime"));
			chainInstancesItem.setResult(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].Result"));
			chainInstancesItem.setChainInstanceId(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].ChainInstanceId"));
			chainInstancesItem.setRepoNamespaceName(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].RepoNamespaceName"));
			chainInstancesItem.setRepoName(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].RepoName"));

			Chain chain = new Chain();
			chain.setChainId(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].Chain.ChainId"));
			chain.setChainName(_ctx.stringValue("ListChainInstanceResponse.ChainInstances["+ i +"].Chain.ChainName"));
			chain.setVersion(_ctx.longValue("ListChainInstanceResponse.ChainInstances["+ i +"].Chain.Version"));
			chainInstancesItem.setChain(chain);

			chainInstances.add(chainInstancesItem);
		}
		listChainInstanceResponse.setChainInstances(chainInstances);
	 
	 	return listChainInstanceResponse;
	}
}