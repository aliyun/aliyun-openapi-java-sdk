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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListTableGranteesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableGranteesResponse.GranteeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableGranteesResponseUnmarshaller {

	public static ListTableGranteesResponse unmarshall(ListTableGranteesResponse listTableGranteesResponse, UnmarshallerContext _ctx) {
		
		listTableGranteesResponse.setRequestId(_ctx.stringValue("ListTableGranteesResponse.RequestId"));

		List<GranteeItem> grantee = new ArrayList<GranteeItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableGranteesResponse.Grantee.Length"); i++) {
			GranteeItem granteeItem = new GranteeItem();
			granteeItem.setGranteeTypeDescription(_ctx.stringValue("ListTableGranteesResponse.Grantee["+ i +"].GranteeTypeDescription"));
			granteeItem.setGranteeName(_ctx.stringValue("ListTableGranteesResponse.Grantee["+ i +"].GranteeName"));
			granteeItem.setGranteeId(_ctx.stringValue("ListTableGranteesResponse.Grantee["+ i +"].GranteeId"));

			List<String> actions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTableGranteesResponse.Grantee["+ i +"].Actions.Length"); j++) {
				actions.add(_ctx.stringValue("ListTableGranteesResponse.Grantee["+ i +"].Actions["+ j +"]"));
			}
			granteeItem.setActions(actions);

			grantee.add(granteeItem);
		}
		listTableGranteesResponse.setGrantee(grantee);
	 
	 	return listTableGranteesResponse;
	}
}