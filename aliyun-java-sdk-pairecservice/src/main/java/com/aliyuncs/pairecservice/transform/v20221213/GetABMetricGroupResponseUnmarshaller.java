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

import com.aliyuncs.pairecservice.model.v20221213.GetABMetricGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetABMetricGroupResponseUnmarshaller {

	public static GetABMetricGroupResponse unmarshall(GetABMetricGroupResponse getABMetricGroupResponse, UnmarshallerContext _ctx) {
		
		getABMetricGroupResponse.setRequestId(_ctx.stringValue("GetABMetricGroupResponse.RequestId"));
		getABMetricGroupResponse.setName(_ctx.stringValue("GetABMetricGroupResponse.Name"));
		getABMetricGroupResponse.setSceneId(_ctx.stringValue("GetABMetricGroupResponse.SceneId"));
		getABMetricGroupResponse.setDescription(_ctx.stringValue("GetABMetricGroupResponse.Description"));
		getABMetricGroupResponse.setOwner(_ctx.stringValue("GetABMetricGroupResponse.Owner"));
		getABMetricGroupResponse.setABMetricIds(_ctx.stringValue("GetABMetricGroupResponse.ABMetricIds"));
		getABMetricGroupResponse.setABMetricNames(_ctx.stringValue("GetABMetricGroupResponse.ABMetricNames"));
		getABMetricGroupResponse.setRealtime(_ctx.booleanValue("GetABMetricGroupResponse.Realtime"));
	 
	 	return getABMetricGroupResponse;
	}
}