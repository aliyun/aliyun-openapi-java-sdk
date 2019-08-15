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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetCrashSummaryResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.GetCrashSummaryResponse.CrashSummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCrashSummaryResponseUnmarshaller {

	public static GetCrashSummaryResponse unmarshall(GetCrashSummaryResponse getCrashSummaryResponse, UnmarshallerContext _ctx) {
		
		getCrashSummaryResponse.setRequestId(_ctx.stringValue("GetCrashSummaryResponse.RequestId"));

		List<CrashSummaryItem> crashSummaryList = new ArrayList<CrashSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCrashSummaryResponse.CrashSummaryList.Length"); i++) {
			CrashSummaryItem crashSummaryItem = new CrashSummaryItem();
			crashSummaryItem.setCrashId(_ctx.stringValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].CrashId"));
			crashSummaryItem.setCrashName(_ctx.stringValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].CrashName"));
			crashSummaryItem.setErrorType(_ctx.stringValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].ErrorType"));
			crashSummaryItem.setCrashRate(_ctx.floatValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].CrashRate"));
			crashSummaryItem.setDevicesAffected(_ctx.longValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].DevicesAffected"));
			crashSummaryItem.setCrashCount(_ctx.longValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].CrashCount"));
			crashSummaryItem.setDeviceAffectedRate(_ctx.floatValue("GetCrashSummaryResponse.CrashSummaryList["+ i +"].DeviceAffectedRate"));

			crashSummaryList.add(crashSummaryItem);
		}
		getCrashSummaryResponse.setCrashSummaryList(crashSummaryList);
	 
	 	return getCrashSummaryResponse;
	}
}