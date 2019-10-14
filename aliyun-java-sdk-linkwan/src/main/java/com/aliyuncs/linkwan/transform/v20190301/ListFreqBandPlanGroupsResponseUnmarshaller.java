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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListFreqBandPlanGroupsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListFreqBandPlanGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFreqBandPlanGroupsResponseUnmarshaller {

	public static ListFreqBandPlanGroupsResponse unmarshall(ListFreqBandPlanGroupsResponse listFreqBandPlanGroupsResponse, UnmarshallerContext _ctx) {
		
		listFreqBandPlanGroupsResponse.setRequestId(_ctx.stringValue("ListFreqBandPlanGroupsResponse.RequestId"));
		listFreqBandPlanGroupsResponse.setSuccess(_ctx.booleanValue("ListFreqBandPlanGroupsResponse.Success"));

		List<Group> data = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListFreqBandPlanGroupsResponse.Data.Length"); i++) {
			Group group = new Group();
			group.setGroupId(_ctx.longValue("ListFreqBandPlanGroupsResponse.Data["+ i +"].GroupId"));
			group.setFrequencyRegionId(_ctx.stringValue("ListFreqBandPlanGroupsResponse.Data["+ i +"].FrequencyRegionId"));
			group.setFrequencyType(_ctx.stringValue("ListFreqBandPlanGroupsResponse.Data["+ i +"].FrequencyType"));
			group.setBeginFrequency(_ctx.longValue("ListFreqBandPlanGroupsResponse.Data["+ i +"].BeginFrequency"));
			group.setEndFrequency(_ctx.longValue("ListFreqBandPlanGroupsResponse.Data["+ i +"].EndFrequency"));

			data.add(group);
		}
		listFreqBandPlanGroupsResponse.setData(data);
	 
	 	return listFreqBandPlanGroupsResponse;
	}
}