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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodEditingUsageDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodEditingUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodEditingUsageDataResponseUnmarshaller {

	public static DescribeVodEditingUsageDataResponse unmarshall(DescribeVodEditingUsageDataResponse describeVodEditingUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeVodEditingUsageDataResponse.setRequestId(_ctx.stringValue("DescribeVodEditingUsageDataResponse.RequestId"));
		describeVodEditingUsageDataResponse.setStartTime(_ctx.stringValue("DescribeVodEditingUsageDataResponse.StartTime"));
		describeVodEditingUsageDataResponse.setEndTime(_ctx.stringValue("DescribeVodEditingUsageDataResponse.EndTime"));

		List<DataModule> editingData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodEditingUsageDataResponse.EditingData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setSpecification(_ctx.stringValue("DescribeVodEditingUsageDataResponse.EditingData["+ i +"].Specification"));
			dataModule.setRegion(_ctx.stringValue("DescribeVodEditingUsageDataResponse.EditingData["+ i +"].Region"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodEditingUsageDataResponse.EditingData["+ i +"].TimeStamp"));
			dataModule.setDuration(_ctx.longValue("DescribeVodEditingUsageDataResponse.EditingData["+ i +"].Duration"));

			editingData.add(dataModule);
		}
		describeVodEditingUsageDataResponse.setEditingData(editingData);
	 
	 	return describeVodEditingUsageDataResponse;
	}
}