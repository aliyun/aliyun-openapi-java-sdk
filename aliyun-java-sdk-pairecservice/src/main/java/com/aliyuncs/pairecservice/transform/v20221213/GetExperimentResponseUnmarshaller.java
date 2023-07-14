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

import com.aliyuncs.pairecservice.model.v20221213.GetExperimentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentResponseUnmarshaller {

	public static GetExperimentResponse unmarshall(GetExperimentResponse getExperimentResponse, UnmarshallerContext _ctx) {
		
		getExperimentResponse.setRequestId(_ctx.stringValue("GetExperimentResponse.RequestId"));
		getExperimentResponse.setAliasExperimentId(_ctx.stringValue("GetExperimentResponse.AliasExperimentId"));
		getExperimentResponse.setExperimentGroupId(_ctx.stringValue("GetExperimentResponse.ExperimentGroupId"));
		getExperimentResponse.setLayerId(_ctx.stringValue("GetExperimentResponse.LayerId"));
		getExperimentResponse.setLaboratoryId(_ctx.stringValue("GetExperimentResponse.LaboratoryId"));
		getExperimentResponse.setSceneId(_ctx.stringValue("GetExperimentResponse.SceneId"));
		getExperimentResponse.setName(_ctx.stringValue("GetExperimentResponse.Name"));
		getExperimentResponse.setDescription(_ctx.stringValue("GetExperimentResponse.Description"));
		getExperimentResponse.setType(_ctx.stringValue("GetExperimentResponse.Type"));
		getExperimentResponse.setFlowPercent(_ctx.integerValue("GetExperimentResponse.FlowPercent"));
		getExperimentResponse.setBuckets(_ctx.stringValue("GetExperimentResponse.Buckets"));
		getExperimentResponse.setDebugUsers(_ctx.stringValue("GetExperimentResponse.DebugUsers"));
		getExperimentResponse.setDebugCrowdId(_ctx.stringValue("GetExperimentResponse.DebugCrowdId"));
		getExperimentResponse.setConfig(_ctx.stringValue("GetExperimentResponse.Config"));
		getExperimentResponse.setStatus(_ctx.stringValue("GetExperimentResponse.Status"));
		getExperimentResponse.setGmtCreateTime(_ctx.stringValue("GetExperimentResponse.GmtCreateTime"));
		getExperimentResponse.setGmtModifiedTime(_ctx.stringValue("GetExperimentResponse.GmtModifiedTime"));
	 
	 	return getExperimentResponse;
	}
}