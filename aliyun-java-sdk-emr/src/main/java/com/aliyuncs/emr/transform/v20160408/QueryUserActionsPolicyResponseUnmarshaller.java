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

import com.aliyuncs.emr.model.v20160408.QueryUserActionsPolicyResponse;
import com.aliyuncs.emr.model.v20160408.QueryUserActionsPolicyResponse.PolicyDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserActionsPolicyResponseUnmarshaller {

	public static QueryUserActionsPolicyResponse unmarshall(QueryUserActionsPolicyResponse queryUserActionsPolicyResponse, UnmarshallerContext _ctx) {
		
		queryUserActionsPolicyResponse.setRequestId(_ctx.stringValue("QueryUserActionsPolicyResponse.RequestId"));
		queryUserActionsPolicyResponse.setPaging(_ctx.booleanValue("QueryUserActionsPolicyResponse.Paging"));

		List<PolicyDTO> data = new ArrayList<PolicyDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserActionsPolicyResponse.Data.Length"); i++) {
			PolicyDTO policyDTO = new PolicyDTO();
			policyDTO.setName(_ctx.stringValue("QueryUserActionsPolicyResponse.Data["+ i +"].Name"));
			policyDTO.setGmtCreate(_ctx.stringValue("QueryUserActionsPolicyResponse.Data["+ i +"].GmtCreate"));
			policyDTO.setEffect(_ctx.stringValue("QueryUserActionsPolicyResponse.Data["+ i +"].Effect"));
			policyDTO.setAction(_ctx.stringValue("QueryUserActionsPolicyResponse.Data["+ i +"].Action"));
			policyDTO.setConditions(_ctx.stringValue("QueryUserActionsPolicyResponse.Data["+ i +"].Conditions"));

			data.add(policyDTO);
		}
		queryUserActionsPolicyResponse.setData(data);
	 
	 	return queryUserActionsPolicyResponse;
	}
}