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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListCheckStandardResponse;
import com.aliyuncs.sas.model.v20181203.ListCheckStandardResponse.StandardsItem;
import com.aliyuncs.sas.model.v20181203.ListCheckStandardResponse.StandardsItem.RequirementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckStandardResponseUnmarshaller {

	public static ListCheckStandardResponse unmarshall(ListCheckStandardResponse listCheckStandardResponse, UnmarshallerContext _ctx) {
		
		listCheckStandardResponse.setRequestId(_ctx.stringValue("ListCheckStandardResponse.RequestId"));

		List<StandardsItem> standards = new ArrayList<StandardsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckStandardResponse.Standards.Length"); i++) {
			StandardsItem standardsItem = new StandardsItem();
			standardsItem.setId(_ctx.longValue("ListCheckStandardResponse.Standards["+ i +"].Id"));
			standardsItem.setShowName(_ctx.stringValue("ListCheckStandardResponse.Standards["+ i +"].ShowName"));
			standardsItem.setType(_ctx.stringValue("ListCheckStandardResponse.Standards["+ i +"].Type"));

			List<RequirementsItem> requirements = new ArrayList<RequirementsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckStandardResponse.Standards["+ i +"].Requirements.Length"); j++) {
				RequirementsItem requirementsItem = new RequirementsItem();
				requirementsItem.setId(_ctx.longValue("ListCheckStandardResponse.Standards["+ i +"].Requirements["+ j +"].Id"));
				requirementsItem.setShowName(_ctx.stringValue("ListCheckStandardResponse.Standards["+ i +"].Requirements["+ j +"].ShowName"));
				requirementsItem.setRiskCheckCount(_ctx.longValue("ListCheckStandardResponse.Standards["+ i +"].Requirements["+ j +"].RiskCheckCount"));

				requirements.add(requirementsItem);
			}
			standardsItem.setRequirements(requirements);

			standards.add(standardsItem);
		}
		listCheckStandardResponse.setStandards(standards);
	 
	 	return listCheckStandardResponse;
	}
}