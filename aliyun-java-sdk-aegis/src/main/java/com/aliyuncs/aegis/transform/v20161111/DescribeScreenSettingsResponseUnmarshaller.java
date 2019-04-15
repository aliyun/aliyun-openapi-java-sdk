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

import com.aliyuncs.aegis.model.v20161111.DescribeScreenSettingsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenSettingsResponse.SasScreenSettingListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenSettingsResponseUnmarshaller {

	public static DescribeScreenSettingsResponse unmarshall(DescribeScreenSettingsResponse describeScreenSettingsResponse, UnmarshallerContext context) {
		
		describeScreenSettingsResponse.setRequestId(context.stringValue("DescribeScreenSettingsResponse.RequestId"));
		describeScreenSettingsResponse.setRequestId1(context.stringValue("DescribeScreenSettingsResponse.RequestId"));

		List<SasScreenSettingListItem> sasScreenSettingList = new ArrayList<SasScreenSettingListItem>();
		for (int i = 0; i < context.lengthValue("DescribeScreenSettingsResponse.SasScreenSettingList.Length"); i++) {
			SasScreenSettingListItem sasScreenSettingListItem = new SasScreenSettingListItem();
			sasScreenSettingListItem.setScreenSettingTitle(context.stringValue("DescribeScreenSettingsResponse.SasScreenSettingList["+ i +"].ScreenSettingTitle"));
			sasScreenSettingListItem.setScreenSettingIdMap(context.stringValue("DescribeScreenSettingsResponse.SasScreenSettingList["+ i +"].ScreenSettingIdMap"));

			sasScreenSettingList.add(sasScreenSettingListItem);
		}
		describeScreenSettingsResponse.setSasScreenSettingList(sasScreenSettingList);
	 
	 	return describeScreenSettingsResponse;
	}
}