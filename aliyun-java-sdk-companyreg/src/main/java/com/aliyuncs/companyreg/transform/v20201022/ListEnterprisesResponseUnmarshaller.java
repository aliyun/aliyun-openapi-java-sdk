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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.ListEnterprisesResponse;
import com.aliyuncs.companyreg.model.v20201022.ListEnterprisesResponse.EnterprisesListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnterprisesResponseUnmarshaller {

	public static ListEnterprisesResponse unmarshall(ListEnterprisesResponse listEnterprisesResponse, UnmarshallerContext _ctx) {
		
		listEnterprisesResponse.setRequestId(_ctx.stringValue("ListEnterprisesResponse.RequestId"));

		List<EnterprisesListItem> enterprisesList = new ArrayList<EnterprisesListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnterprisesResponse.EnterprisesList.Length"); i++) {
			EnterprisesListItem enterprisesListItem = new EnterprisesListItem();
			enterprisesListItem.setTaxNo(_ctx.stringValue("ListEnterprisesResponse.EnterprisesList["+ i +"].TaxNo"));
			enterprisesListItem.setEnterpriseName(_ctx.stringValue("ListEnterprisesResponse.EnterprisesList["+ i +"].EnterpriseName"));

			enterprisesList.add(enterprisesListItem);
		}
		listEnterprisesResponse.setEnterprisesList(enterprisesList);
	 
	 	return listEnterprisesResponse;
	}
}