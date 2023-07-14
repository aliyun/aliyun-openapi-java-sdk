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

import com.aliyuncs.pairecservice.model.v20221213.ListExperimentsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListExperimentsResponse.ExperimentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExperimentsResponseUnmarshaller {

	public static ListExperimentsResponse unmarshall(ListExperimentsResponse listExperimentsResponse, UnmarshallerContext _ctx) {
		
		listExperimentsResponse.setRequestId(_ctx.stringValue("ListExperimentsResponse.RequestId"));
		listExperimentsResponse.setTotalCount(_ctx.longValue("ListExperimentsResponse.TotalCount"));

		List<ExperimentsItem> experiments = new ArrayList<ExperimentsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExperimentsResponse.Experiments.Length"); i++) {
			ExperimentsItem experimentsItem = new ExperimentsItem();
			experimentsItem.setExperimentId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].ExperimentId"));
			experimentsItem.setAliasExperimentId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].AliasExperimentId"));
			experimentsItem.setExperimentGroupId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].ExperimentGroupId"));
			experimentsItem.setLayerId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].LayerId"));
			experimentsItem.setLaboratoryId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].LaboratoryId"));
			experimentsItem.setSceneId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].SceneId"));
			experimentsItem.setName(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Name"));
			experimentsItem.setDescription(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Description"));
			experimentsItem.setType(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Type"));
			experimentsItem.setFlowPercent(_ctx.integerValue("ListExperimentsResponse.Experiments["+ i +"].FlowPercent"));
			experimentsItem.setBuckets(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Buckets"));
			experimentsItem.setDebugUsers(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].DebugUsers"));
			experimentsItem.setDebugCrowdId(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].DebugCrowdId"));
			experimentsItem.setConfig(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Config"));
			experimentsItem.setStatus(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].Status"));
			experimentsItem.setGmtCreateTime(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].GmtCreateTime"));
			experimentsItem.setGmtModifiedTime(_ctx.stringValue("ListExperimentsResponse.Experiments["+ i +"].GmtModifiedTime"));

			experiments.add(experimentsItem);
		}
		listExperimentsResponse.setExperiments(experiments);
	 
	 	return listExperimentsResponse;
	}
}