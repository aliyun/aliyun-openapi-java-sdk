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

import com.aliyuncs.pairecservice.model.v20221213.GetABMetricResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetABMetricResponseUnmarshaller {

	public static GetABMetricResponse unmarshall(GetABMetricResponse getABMetricResponse, UnmarshallerContext _ctx) {
		
		getABMetricResponse.setRequestId(_ctx.stringValue("GetABMetricResponse.RequestId"));
		getABMetricResponse.setName(_ctx.stringValue("GetABMetricResponse.Name"));
		getABMetricResponse.setDescription(_ctx.stringValue("GetABMetricResponse.Description"));
		getABMetricResponse.setSceneId(_ctx.stringValue("GetABMetricResponse.SceneId"));
		getABMetricResponse.setSceneName(_ctx.stringValue("GetABMetricResponse.SceneName"));
		getABMetricResponse.setType(_ctx.stringValue("GetABMetricResponse.Type"));
		getABMetricResponse.setRealtime(_ctx.stringValue("GetABMetricResponse.Realtime"));
		getABMetricResponse.setTableMetaId(_ctx.stringValue("GetABMetricResponse.TableMetaId"));
		getABMetricResponse.setResultTableMetaId(_ctx.stringValue("GetABMetricResponse.ResultTableMetaId"));
		getABMetricResponse.setResultResourceId(_ctx.stringValue("GetABMetricResponse.ResultResourceId"));
		getABMetricResponse.setDefinition(_ctx.stringValue("GetABMetricResponse.Definition"));
		getABMetricResponse.setStatisticsCycle(_ctx.integerValue("GetABMetricResponse.StatisticsCycle"));
		getABMetricResponse.setLeftMetricId(_ctx.stringValue("GetABMetricResponse.LeftMetricId"));
		getABMetricResponse.setRightMetricId(_ctx.stringValue("GetABMetricResponse.RightMetricId"));
		getABMetricResponse.setOperator(_ctx.stringValue("GetABMetricResponse.Operator"));
	 
	 	return getABMetricResponse;
	}
}