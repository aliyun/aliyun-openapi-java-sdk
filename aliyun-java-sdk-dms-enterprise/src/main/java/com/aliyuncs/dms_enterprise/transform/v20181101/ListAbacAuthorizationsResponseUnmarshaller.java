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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListAbacAuthorizationsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAbacAuthorizationsResponse.AuthorizationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAbacAuthorizationsResponseUnmarshaller {

	public static ListAbacAuthorizationsResponse unmarshall(ListAbacAuthorizationsResponse listAbacAuthorizationsResponse, UnmarshallerContext _ctx) {
		
		listAbacAuthorizationsResponse.setRequestId(_ctx.stringValue("ListAbacAuthorizationsResponse.RequestId"));
		listAbacAuthorizationsResponse.setErrorCode(_ctx.stringValue("ListAbacAuthorizationsResponse.ErrorCode"));
		listAbacAuthorizationsResponse.setErrorMessage(_ctx.stringValue("ListAbacAuthorizationsResponse.ErrorMessage"));
		listAbacAuthorizationsResponse.setSuccess(_ctx.booleanValue("ListAbacAuthorizationsResponse.Success"));
		listAbacAuthorizationsResponse.setTotalCount(_ctx.longValue("ListAbacAuthorizationsResponse.TotalCount"));

		List<AuthorizationListItem> authorizationList = new ArrayList<AuthorizationListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAbacAuthorizationsResponse.AuthorizationList.Length"); i++) {
			AuthorizationListItem authorizationListItem = new AuthorizationListItem();
			authorizationListItem.setPolicyId(_ctx.longValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].PolicyId"));
			authorizationListItem.setPolicyName(_ctx.stringValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].PolicyName"));
			authorizationListItem.setPolicySource(_ctx.stringValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].PolicySource"));
			authorizationListItem.setAuthorizationId(_ctx.longValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].AuthorizationId"));
			authorizationListItem.setIdentityId(_ctx.longValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].IdentityId"));
			authorizationListItem.setIdentityName(_ctx.stringValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].IdentityName"));
			authorizationListItem.setIdentityType(_ctx.stringValue("ListAbacAuthorizationsResponse.AuthorizationList["+ i +"].IdentityType"));

			authorizationList.add(authorizationListItem);
		}
		listAbacAuthorizationsResponse.setAuthorizationList(authorizationList);
	 
	 	return listAbacAuthorizationsResponse;
	}
}