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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.AllDTXZoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllDTXZoneResponseUnmarshaller {

	public static AllDTXZoneResponse unmarshall(AllDTXZoneResponse allDTXZoneResponse, UnmarshallerContext _ctx) {
		
		allDTXZoneResponse.setRequestId(_ctx.stringValue("AllDTXZoneResponse.RequestId"));
		allDTXZoneResponse.setResultCode(_ctx.stringValue("AllDTXZoneResponse.ResultCode"));
		allDTXZoneResponse.setResultMessage(_ctx.stringValue("AllDTXZoneResponse.ResultMessage"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AllDTXZoneResponse.Zones.Length"); i++) {
			zones.add(_ctx.stringValue("AllDTXZoneResponse.Zones["+ i +"]"));
		}
		allDTXZoneResponse.setZones(zones);
	 
	 	return allDTXZoneResponse;
	}
}