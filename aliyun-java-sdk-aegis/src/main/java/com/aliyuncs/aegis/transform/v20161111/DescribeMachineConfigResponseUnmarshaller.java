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

import com.aliyuncs.aegis.model.v20161111.DescribeMachineConfigResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeMachineConfigResponse.ConfigTarget;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMachineConfigResponseUnmarshaller {

	public static DescribeMachineConfigResponse unmarshall(DescribeMachineConfigResponse describeMachineConfigResponse, UnmarshallerContext context) {
		
		describeMachineConfigResponse.setRequestId(context.stringValue("DescribeMachineConfigResponse.RequestId"));
		describeMachineConfigResponse.setCount(context.integerValue("DescribeMachineConfigResponse.Count"));

		List<ConfigTarget> configTargets = new ArrayList<ConfigTarget>();
		for (int i = 0; i < context.lengthValue("DescribeMachineConfigResponse.ConfigTargets.Length"); i++) {
			ConfigTarget configTarget = new ConfigTarget();
			configTarget.setTargetType(context.stringValue("DescribeMachineConfigResponse.ConfigTargets["+ i +"].TargetType"));
			configTarget.setTarget(context.stringValue("DescribeMachineConfigResponse.ConfigTargets["+ i +"].Target"));
			configTarget.setFlag(context.stringValue("DescribeMachineConfigResponse.ConfigTargets["+ i +"].Flag"));

			configTargets.add(configTarget);
		}
		describeMachineConfigResponse.setConfigTargets(configTargets);
	 
	 	return describeMachineConfigResponse;
	}
}