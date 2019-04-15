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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeScreenSettingResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSettingResponse.SasScreenSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenSettingResponseUnmarshaller {

	public static DescribeScreenSettingResponse unmarshall(DescribeScreenSettingResponse describeScreenSettingResponse, UnmarshallerContext context) {
		
		describeScreenSettingResponse.setRequestId(context.stringValue("DescribeScreenSettingResponse.RequestId"));

		SasScreenSetting sasScreenSetting = new SasScreenSetting();
		sasScreenSetting.setScreenSettingTitle(context.stringValue("DescribeScreenSettingResponse.SasScreenSetting.ScreenSettingTitle"));
		sasScreenSetting.setScreenSettingIdMap(context.stringValue("DescribeScreenSettingResponse.SasScreenSetting.ScreenSettingIdMap"));
		describeScreenSettingResponse.setSasScreenSetting(sasScreenSetting);
	 
	 	return describeScreenSettingResponse;
	}
}