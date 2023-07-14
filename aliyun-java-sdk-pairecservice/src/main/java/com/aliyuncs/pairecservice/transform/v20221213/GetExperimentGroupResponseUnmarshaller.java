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

import com.aliyuncs.pairecservice.model.v20221213.GetExperimentGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentGroupResponseUnmarshaller {

	public static GetExperimentGroupResponse unmarshall(GetExperimentGroupResponse getExperimentGroupResponse, UnmarshallerContext _ctx) {
		
		getExperimentGroupResponse.setRequestId(_ctx.stringValue("GetExperimentGroupResponse.RequestId"));
		getExperimentGroupResponse.setLayerId(_ctx.stringValue("GetExperimentGroupResponse.LayerId"));
		getExperimentGroupResponse.setLaboratoryId(_ctx.stringValue("GetExperimentGroupResponse.LaboratoryId"));
		getExperimentGroupResponse.setSceneId(_ctx.stringValue("GetExperimentGroupResponse.SceneId"));
		getExperimentGroupResponse.setName(_ctx.stringValue("GetExperimentGroupResponse.Name"));
		getExperimentGroupResponse.setDescription(_ctx.stringValue("GetExperimentGroupResponse.Description"));
		getExperimentGroupResponse.setDebugUsers(_ctx.stringValue("GetExperimentGroupResponse.DebugUsers"));
		getExperimentGroupResponse.setDebugCrowdId(_ctx.stringValue("GetExperimentGroupResponse.DebugCrowdId"));
		getExperimentGroupResponse.setOwner(_ctx.stringValue("GetExperimentGroupResponse.Owner"));
		getExperimentGroupResponse.setNeedAA(_ctx.booleanValue("GetExperimentGroupResponse.NeedAA"));
		getExperimentGroupResponse.setFilter(_ctx.stringValue("GetExperimentGroupResponse.Filter"));
		getExperimentGroupResponse.setDistributionType(_ctx.stringValue("GetExperimentGroupResponse.DistributionType"));
		getExperimentGroupResponse.setDistributionTimeDuration(_ctx.integerValue("GetExperimentGroupResponse.DistributionTimeDuration"));
		getExperimentGroupResponse.setCrowdId(_ctx.stringValue("GetExperimentGroupResponse.CrowdId"));
		getExperimentGroupResponse.setConfig(_ctx.stringValue("GetExperimentGroupResponse.Config"));
		getExperimentGroupResponse.setReservedBuckets(_ctx.stringValue("GetExperimentGroupResponse.ReservedBuckets"));
		getExperimentGroupResponse.setStatus(_ctx.stringValue("GetExperimentGroupResponse.Status"));
	 
	 	return getExperimentGroupResponse;
	}
}