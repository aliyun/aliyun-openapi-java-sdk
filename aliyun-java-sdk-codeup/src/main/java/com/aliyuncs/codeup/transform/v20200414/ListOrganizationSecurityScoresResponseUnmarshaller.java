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

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.ListOrganizationSecurityScoresResponse;
import com.aliyuncs.codeup.model.v20200414.ListOrganizationSecurityScoresResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListOrganizationSecurityScoresResponse.ResultItem.OrganizationSecurityScore;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationSecurityScoresResponseUnmarshaller {

	public static ListOrganizationSecurityScoresResponse unmarshall(ListOrganizationSecurityScoresResponse listOrganizationSecurityScoresResponse, UnmarshallerContext _ctx) {
		
		listOrganizationSecurityScoresResponse.setRequestId(_ctx.stringValue("ListOrganizationSecurityScoresResponse.RequestId"));
		listOrganizationSecurityScoresResponse.setErrorCode(_ctx.stringValue("ListOrganizationSecurityScoresResponse.ErrorCode"));
		listOrganizationSecurityScoresResponse.setErrorMessage(_ctx.stringValue("ListOrganizationSecurityScoresResponse.ErrorMessage"));
		listOrganizationSecurityScoresResponse.setSuccess(_ctx.booleanValue("ListOrganizationSecurityScoresResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationSecurityScoresResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEnable(_ctx.booleanValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].Enable"));
			resultItem.setId(_ctx.longValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].Id"));
			resultItem.setOrganizationId(_ctx.stringValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].OrganizationId"));

			OrganizationSecurityScore organizationSecurityScore = new OrganizationSecurityScore();
			organizationSecurityScore.setAuthorityControlScore(_ctx.integerValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].OrganizationSecurityScore.AuthorityControlScore"));
			organizationSecurityScore.setCodeContentScore(_ctx.integerValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].OrganizationSecurityScore.CodeContentScore"));
			organizationSecurityScore.setMemberBehaviorScore(_ctx.integerValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].OrganizationSecurityScore.MemberBehaviorScore"));
			organizationSecurityScore.setLevel(_ctx.stringValue("ListOrganizationSecurityScoresResponse.Result["+ i +"].OrganizationSecurityScore.Level"));
			resultItem.setOrganizationSecurityScore(organizationSecurityScore);

			result.add(resultItem);
		}
		listOrganizationSecurityScoresResponse.setResult(result);
	 
	 	return listOrganizationSecurityScoresResponse;
	}
}