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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListUserAdOrganizationUnitsResponse;
import com.aliyuncs.ecd.model.v20200930.ListUserAdOrganizationUnitsResponse.OuName;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserAdOrganizationUnitsResponseUnmarshaller {

	public static ListUserAdOrganizationUnitsResponse unmarshall(ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnitsResponse, UnmarshallerContext _ctx) {
		
		listUserAdOrganizationUnitsResponse.setRequestId(_ctx.stringValue("ListUserAdOrganizationUnitsResponse.RequestId"));

		List<OuName> oUNames = new ArrayList<OuName>();
		for (int i = 0; i < _ctx.lengthValue("ListUserAdOrganizationUnitsResponse.OUNames.Length"); i++) {
			OuName ouName = new OuName();
			ouName.setOfficeSiteId(_ctx.stringValue("ListUserAdOrganizationUnitsResponse.OUNames["+ i +"].OfficeSiteId"));
			ouName.setOUName(_ctx.stringValue("ListUserAdOrganizationUnitsResponse.OUNames["+ i +"].OUName"));

			oUNames.add(ouName);
		}
		listUserAdOrganizationUnitsResponse.setOUNames(oUNames);
	 
	 	return listUserAdOrganizationUnitsResponse;
	}
}