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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.QueryUserPoliciesResponse;
import com.aliyuncs.emr.model.v20160408.QueryUserPoliciesResponse.PolicyDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserPoliciesResponseUnmarshaller {

	public static QueryUserPoliciesResponse unmarshall(QueryUserPoliciesResponse queryUserPoliciesResponse, UnmarshallerContext _ctx) {
		
		queryUserPoliciesResponse.setRequestId(_ctx.stringValue("QueryUserPoliciesResponse.RequestId"));
		queryUserPoliciesResponse.setPaging(_ctx.booleanValue("QueryUserPoliciesResponse.Paging"));

		List<PolicyDTO> data = new ArrayList<PolicyDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserPoliciesResponse.Data.Length"); i++) {
			PolicyDTO policyDTO = new PolicyDTO();
			policyDTO.setName(_ctx.stringValue("QueryUserPoliciesResponse.Data["+ i +"].Name"));
			policyDTO.setGmtCreate(_ctx.stringValue("QueryUserPoliciesResponse.Data["+ i +"].GmtCreate"));
			policyDTO.setEffect(_ctx.stringValue("QueryUserPoliciesResponse.Data["+ i +"].Effect"));
			policyDTO.setAction(_ctx.stringValue("QueryUserPoliciesResponse.Data["+ i +"].Action"));
			policyDTO.setConditions(_ctx.stringValue("QueryUserPoliciesResponse.Data["+ i +"].Conditions"));

			data.add(policyDTO);
		}
		queryUserPoliciesResponse.setData(data);
	 
	 	return queryUserPoliciesResponse;
	}
}