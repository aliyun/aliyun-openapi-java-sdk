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
import com.aliyuncs.sas.model.v20181203.GetCheckConfigResponse.StandardsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckConfigResponseUnmarshaller {

	public static GetCheckConfigResponse unmarshall(GetCheckConfigResponse getCheckConfigResponse, UnmarshallerContext _ctx) {
		
		getCheckConfigResponse.setRequestId(_ctx.stringValue("GetCheckConfigResponse.RequestId"));
		getCheckConfigResponse.setStartTime(_ctx.integerValue("GetCheckConfigResponse.StartTime"));
		getCheckConfigResponse.setEndTime(_ctx.integerValue("GetCheckConfigResponse.EndTime"));
		getCheckConfigResponse.setData(_ctx.mapValue("GetCheckConfigResponse.Data"));

		List<Integer> cycleDays = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConfigResponse.CycleDays.Length"); i++) {
			cycleDays.add(_ctx.integerValue("GetCheckConfigResponse.CycleDays["+ i +"]"));
		}
		getCheckConfigResponse.setCycleDays(cycleDays);

		List<StandardsItem> standards = new ArrayList<StandardsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConfigResponse.Standards.Length"); i++) {
			StandardsItem standardsItem = new StandardsItem();
			standardsItem.setId(_ctx.longValue("GetCheckConfigResponse.Standards["+ i +"].Id"));
			standardsItem.setShowName(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].ShowName"));
			standardsItem.setType(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].Type"));
			standardsItem.setStatus(_ctx.stringValue("GetCheckConfigResponse.Standards["+ i +"].Status"));

			standards.add(standardsItem);
		}
		getCheckConfigResponse.setStandards(standards);
	 
	 	return getCheckConfigResponse;
	}
}