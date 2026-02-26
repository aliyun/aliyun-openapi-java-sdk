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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitsForApplicationResponse;
import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitsForApplicationResponse.OrganizationalUnit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationalUnitsForApplicationResponseUnmarshaller {

	public static ListOrganizationalUnitsForApplicationResponse unmarshall(ListOrganizationalUnitsForApplicationResponse listOrganizationalUnitsForApplicationResponse, UnmarshallerContext _ctx) {
		
		listOrganizationalUnitsForApplicationResponse.setRequestId(_ctx.stringValue("ListOrganizationalUnitsForApplicationResponse.RequestId"));
		listOrganizationalUnitsForApplicationResponse.setTotalCount(_ctx.longValue("ListOrganizationalUnitsForApplicationResponse.TotalCount"));

		List<OrganizationalUnit> organizationalUnits = new ArrayList<OrganizationalUnit>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationalUnitsForApplicationResponse.OrganizationalUnits.Length"); i++) {
			OrganizationalUnit organizationalUnit = new OrganizationalUnit();
			organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("ListOrganizationalUnitsForApplicationResponse.OrganizationalUnits["+ i +"].OrganizationalUnitId"));

			organizationalUnits.add(organizationalUnit);
		}
		listOrganizationalUnitsForApplicationResponse.setOrganizationalUnits(organizationalUnits);
	 
	 	return listOrganizationalUnitsForApplicationResponse;
	}
}