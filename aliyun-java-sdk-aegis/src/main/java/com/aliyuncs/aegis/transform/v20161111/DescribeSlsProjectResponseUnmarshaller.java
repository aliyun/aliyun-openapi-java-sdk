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

import com.aliyuncs.aegis.model.v20161111.DescribeSlsProjectResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSlsProjectResponse.SlsProjectDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlsProjectResponseUnmarshaller {

	public static DescribeSlsProjectResponse unmarshall(DescribeSlsProjectResponse describeSlsProjectResponse, UnmarshallerContext context) {
		
		describeSlsProjectResponse.setRequestId(context.stringValue("DescribeSlsProjectResponse.RequestId"));

		List<SlsProjectDataItem> slsProjectData = new ArrayList<SlsProjectDataItem>();
		for (int i = 0; i < context.lengthValue("DescribeSlsProjectResponse.SlsProjectData.Length"); i++) {
			SlsProjectDataItem slsProjectDataItem = new SlsProjectDataItem();
			slsProjectDataItem.setProject(context.stringValue("DescribeSlsProjectResponse.SlsProjectData["+ i +"].Project"));

			List<String> logStore = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeSlsProjectResponse.SlsProjectData["+ i +"].LogStore.Length"); j++) {
				logStore.add(context.stringValue("DescribeSlsProjectResponse.SlsProjectData["+ i +"].LogStore["+ j +"]"));
			}
			slsProjectDataItem.setLogStore(logStore);

			slsProjectData.add(slsProjectDataItem);
		}
		describeSlsProjectResponse.setSlsProjectData(slsProjectData);
	 
	 	return describeSlsProjectResponse;
	}
}