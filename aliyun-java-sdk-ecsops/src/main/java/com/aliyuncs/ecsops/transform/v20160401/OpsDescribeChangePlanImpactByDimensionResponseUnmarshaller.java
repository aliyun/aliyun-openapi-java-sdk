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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanImpactByDimensionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanImpactByDimensionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanImpactByDimensionResponseUnmarshaller {

	public static OpsDescribeChangePlanImpactByDimensionResponse unmarshall(OpsDescribeChangePlanImpactByDimensionResponse opsDescribeChangePlanImpactByDimensionResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanImpactByDimensionResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanImpactByDimensionResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("OpsDescribeChangePlanImpactByDimensionResponse.Data.TotalCount"));

		List<String> groupWeightList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanImpactByDimensionResponse.Data.GroupWeightList.Length"); i++) {
			groupWeightList.add(_ctx.stringValue("OpsDescribeChangePlanImpactByDimensionResponse.Data.GroupWeightList["+ i +"]"));
		}
		data.setGroupWeightList(groupWeightList);
		opsDescribeChangePlanImpactByDimensionResponse.setData(data);
	 
	 	return opsDescribeChangePlanImpactByDimensionResponse;
	}
}