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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListExperimentGroupsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListExperimentGroupsResponse.ExperimentGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExperimentGroupsResponseUnmarshaller {

	public static ListExperimentGroupsResponse unmarshall(ListExperimentGroupsResponse listExperimentGroupsResponse, UnmarshallerContext _ctx) {
		
		listExperimentGroupsResponse.setRequestId(_ctx.stringValue("ListExperimentGroupsResponse.RequestId"));
		listExperimentGroupsResponse.setTotalCount(_ctx.longValue("ListExperimentGroupsResponse.TotalCount"));

		List<ExperimentGroupsItem> experimentGroups = new ArrayList<ExperimentGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExperimentGroupsResponse.ExperimentGroups.Length"); i++) {
			ExperimentGroupsItem experimentGroupsItem = new ExperimentGroupsItem();
			experimentGroupsItem.setExperimentGroupId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].ExperimentGroupId"));
			experimentGroupsItem.setLayerId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].LayerId"));
			experimentGroupsItem.setLaboratoryId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].LaboratoryId"));
			experimentGroupsItem.setSceneId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].SceneId"));
			experimentGroupsItem.setName(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Name"));
			experimentGroupsItem.setDescription(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Description"));
			experimentGroupsItem.setDebugUsers(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].DebugUsers"));
			experimentGroupsItem.setDebugCrowdId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].DebugCrowdId"));
			experimentGroupsItem.setOwner(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Owner"));
			experimentGroupsItem.setNeedAA(_ctx.booleanValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].NeedAA"));
			experimentGroupsItem.setFilter(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Filter"));
			experimentGroupsItem.setDistributionType(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].DistributionType"));
			experimentGroupsItem.setDistributionTimeDuration(_ctx.integerValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].DistributionTimeDuration"));
			experimentGroupsItem.setCrowdId(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].CrowdId"));
			experimentGroupsItem.setConfig(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Config"));
			experimentGroupsItem.setReservedBuckets(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].ReservedBuckets"));
			experimentGroupsItem.setStatus(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].Status"));
			experimentGroupsItem.setCrowdTargetType(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].CrowdTargetType"));
			experimentGroupsItem.setRandomFlow(_ctx.longValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].RandomFlow"));
			experimentGroupsItem.setHoldingBuckets(_ctx.stringValue("ListExperimentGroupsResponse.ExperimentGroups["+ i +"].HoldingBuckets"));

			experimentGroups.add(experimentGroupsItem);
		}
		listExperimentGroupsResponse.setExperimentGroups(experimentGroups);
	 
	 	return listExperimentGroupsResponse;
	}
}