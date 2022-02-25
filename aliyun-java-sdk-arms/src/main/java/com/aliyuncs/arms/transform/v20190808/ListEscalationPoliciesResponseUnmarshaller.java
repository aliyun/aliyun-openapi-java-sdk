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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListEscalationPoliciesResponse;
import com.aliyuncs.arms.model.v20190808.ListEscalationPoliciesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListEscalationPoliciesResponse.PageBean.EscalationPoliciesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEscalationPoliciesResponseUnmarshaller {

	public static ListEscalationPoliciesResponse unmarshall(ListEscalationPoliciesResponse listEscalationPoliciesResponse, UnmarshallerContext _ctx) {
		
		listEscalationPoliciesResponse.setRequestId(_ctx.stringValue("ListEscalationPoliciesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListEscalationPoliciesResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListEscalationPoliciesResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListEscalationPoliciesResponse.PageBean.Size"));

		List<EscalationPoliciesItem> escalationPolicies = new ArrayList<EscalationPoliciesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEscalationPoliciesResponse.PageBean.EscalationPolicies.Length"); i++) {
			EscalationPoliciesItem escalationPoliciesItem = new EscalationPoliciesItem();
			escalationPoliciesItem.setId(_ctx.longValue("ListEscalationPoliciesResponse.PageBean.EscalationPolicies["+ i +"].Id"));
			escalationPoliciesItem.setName(_ctx.stringValue("ListEscalationPoliciesResponse.PageBean.EscalationPolicies["+ i +"].Name"));

			escalationPolicies.add(escalationPoliciesItem);
		}
		pageBean.setEscalationPolicies(escalationPolicies);
		listEscalationPoliciesResponse.setPageBean(pageBean);
	 
	 	return listEscalationPoliciesResponse;
	}
}