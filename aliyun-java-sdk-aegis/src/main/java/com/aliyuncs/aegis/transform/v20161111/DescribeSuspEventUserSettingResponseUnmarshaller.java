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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventUserSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventUserSettingResponseUnmarshaller {

	public static DescribeSuspEventUserSettingResponse unmarshall(DescribeSuspEventUserSettingResponse describeSuspEventUserSettingResponse, UnmarshallerContext context) {
		
		describeSuspEventUserSettingResponse.setRequestId(context.stringValue("DescribeSuspEventUserSettingResponse.RequestId"));

		List<String> levelsOn = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSuspEventUserSettingResponse.LevelsOn.Length"); i++) {
			levelsOn.add(context.stringValue("DescribeSuspEventUserSettingResponse.LevelsOn["+ i +"]"));
		}
		describeSuspEventUserSettingResponse.setLevelsOn(levelsOn);
	 
	 	return describeSuspEventUserSettingResponse;
	}
}