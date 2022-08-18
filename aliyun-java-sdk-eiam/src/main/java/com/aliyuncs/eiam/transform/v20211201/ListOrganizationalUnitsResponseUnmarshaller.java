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

import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitsResponse;
import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitsResponse.OrganizationalUnit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationalUnitsResponseUnmarshaller {

	public static ListOrganizationalUnitsResponse unmarshall(ListOrganizationalUnitsResponse listOrganizationalUnitsResponse, UnmarshallerContext _ctx) {
		
		listOrganizationalUnitsResponse.setRequestId(_ctx.stringValue("ListOrganizationalUnitsResponse.RequestId"));
		listOrganizationalUnitsResponse.setTotalCount(_ctx.longValue("ListOrganizationalUnitsResponse.TotalCount"));

		List<OrganizationalUnit> organizationalUnits = new ArrayList<OrganizationalUnit>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationalUnitsResponse.OrganizationalUnits.Length"); i++) {
			OrganizationalUnit organizationalUnit = new OrganizationalUnit();
			organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].OrganizationalUnitId"));
			organizationalUnit.setOrganizationalUnitName(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].OrganizationalUnitName"));
			organizationalUnit.setParentId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].ParentId"));
			organizationalUnit.setExternalId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].ExternalId"));
			organizationalUnit.setOrganizationalUnitExternalId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].OrganizationalUnitExternalId"));
			organizationalUnit.setSourceType(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].SourceType"));
			organizationalUnit.setOrganizationalUnitSourceType(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].OrganizationalUnitSourceType"));
			organizationalUnit.setSourceId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].SourceId"));
			organizationalUnit.setOrganizationalUnitSourceId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].OrganizationalUnitSourceId"));
			organizationalUnit.setCreateTime(_ctx.longValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].CreateTime"));
			organizationalUnit.setUpdateTime(_ctx.longValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].UpdateTime"));
			organizationalUnit.setDescription(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].Description"));
			organizationalUnit.setInstanceId(_ctx.stringValue("ListOrganizationalUnitsResponse.OrganizationalUnits["+ i +"].InstanceId"));

			organizationalUnits.add(organizationalUnit);
		}
		listOrganizationalUnitsResponse.setOrganizationalUnits(organizationalUnits);
	 
	 	return listOrganizationalUnitsResponse;
	}
}