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

import com.aliyuncs.pairecservice.model.v20221213.ReportABMetricGroupResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportABMetricGroupResponseUnmarshaller {

	public static ReportABMetricGroupResponse unmarshall(ReportABMetricGroupResponse reportABMetricGroupResponse, UnmarshallerContext _ctx) {
		
		reportABMetricGroupResponse.setRequestId(_ctx.stringValue("ReportABMetricGroupResponse.RequestId"));
		reportABMetricGroupResponse.setExperimentReport(_ctx.mapValue("ReportABMetricGroupResponse.ExperimentReport"));

		List<String> groupDimension = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReportABMetricGroupResponse.GroupDimension.Length"); i++) {
			groupDimension.add(_ctx.stringValue("ReportABMetricGroupResponse.GroupDimension["+ i +"]"));
		}
		reportABMetricGroupResponse.setGroupDimension(groupDimension);
	 
	 	return reportABMetricGroupResponse;
	}
}