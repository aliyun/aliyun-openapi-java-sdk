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

import com.aliyuncs.sas.model.v20181203.GetCheckConfigResponse;
import com.aliyuncs.sas.model.v20181203.GetCheckConfigResponse.SelectedCheck;
import com.aliyuncs.sas.model.v20181203.GetCheckConfigResponse.Standard;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckConfigResponseUnmarshaller {

	public static GetCheckConfigResponse unmarshall(GetCheckConfigResponse getCheckConfigResponse, UnmarshallerContext _ctx) {
		
		getCheckConfigResponse.setRequestId(_ctx.stringValue("GetCheckConfigResponse.RequestId"));
		getCheckConfigResponse.setStartTime(_ctx.integerValue("GetCheckConfigResponse.StartTime"));
		getCheckConfigResponse.setEndTime(_ctx.integerValue("GetCheckConfigResponse.EndTime"));
		getCheckConfigResponse.setData(_ctx.mapValue("GetCheckConfigResponse.Data"));
		getCheckConfigResponse.setEnableAutoCheck(_ctx.booleanValue("GetCheckConfigResponse.EnableAutoCheck"));
		getCheckConfigResponse.setEnableAddCheck(_ctx.booleanValue("GetCheckConfigResponse.EnableAddCheck"));

		List<Integer> cycleDays = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConfigResponse.CycleDays.Length"); i++) {
			cycleDays.add(_ctx.integerValue("GetCheckConfigResponse.CycleDays["+ i +"]"));
		}
		getCheckConfigResponse.setCycleDays(cycleDays);

		List<Standard> standards = new ArrayList<Standard>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConfigResponse.Standards.Length"); i++) {
			Standard standard = new Standard();
			standard.setId(_ctx.longValue("GetCheckConfigResponse.Standards["+ i +"].Id"));
			standard.setShowName(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].ShowName"));
			standard.setType(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].Type"));
			standard.setStatus(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].Status"));

			standards.add(standard);
		}
		getCheckConfigResponse.setStandards(standards);

		List<SelectedCheck> selectedChecks = new ArrayList<SelectedCheck>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConfigResponse.SelectedChecks.Length"); i++) {
			SelectedCheck selectedCheck = new SelectedCheck();
			selectedCheck.setCheckId(_ctx.longValue("GetCheckConfigResponse.SelectedChecks["+ i +"].CheckId"));
			selectedCheck.setSectionId(_ctx.longValue("GetCheckConfigResponse.SelectedChecks["+ i +"].SectionId"));

			selectedChecks.add(selectedCheck);
		}
		getCheckConfigResponse.setSelectedChecks(selectedChecks);
	 
	 	return getCheckConfigResponse;
	}
}