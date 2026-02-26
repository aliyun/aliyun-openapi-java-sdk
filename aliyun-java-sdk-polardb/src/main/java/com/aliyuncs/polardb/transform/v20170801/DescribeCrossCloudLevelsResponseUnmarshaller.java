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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudLevelsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudLevelsResponse.CrossCloudLevelListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossCloudLevelsResponseUnmarshaller {

	public static DescribeCrossCloudLevelsResponse unmarshall(DescribeCrossCloudLevelsResponse describeCrossCloudLevelsResponse, UnmarshallerContext _ctx) {
		
		describeCrossCloudLevelsResponse.setRequestId(_ctx.stringValue("DescribeCrossCloudLevelsResponse.RequestId"));

		List<CrossCloudLevelListItem> crossCloudLevelList = new ArrayList<CrossCloudLevelListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossCloudLevelsResponse.CrossCloudLevelList.Length"); i++) {
			CrossCloudLevelListItem crossCloudLevelListItem = new CrossCloudLevelListItem();
			crossCloudLevelListItem.setDBType(_ctx.stringValue("DescribeCrossCloudLevelsResponse.CrossCloudLevelList["+ i +"].DBType"));
			crossCloudLevelListItem.setLevelName(_ctx.stringValue("DescribeCrossCloudLevelsResponse.CrossCloudLevelList["+ i +"].LevelName"));
			crossCloudLevelListItem.setLevelCode(_ctx.stringValue("DescribeCrossCloudLevelsResponse.CrossCloudLevelList["+ i +"].LevelCode"));

			crossCloudLevelList.add(crossCloudLevelListItem);
		}
		describeCrossCloudLevelsResponse.setCrossCloudLevelList(crossCloudLevelList);
	 
	 	return describeCrossCloudLevelsResponse;
	}
}