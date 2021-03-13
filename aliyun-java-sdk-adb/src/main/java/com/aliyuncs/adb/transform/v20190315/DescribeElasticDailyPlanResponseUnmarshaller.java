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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeElasticDailyPlanResponse;
import com.aliyuncs.adb.model.v20190315.DescribeElasticDailyPlanResponse.ElasticDailyPlanInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticDailyPlanResponseUnmarshaller {

	public static DescribeElasticDailyPlanResponse unmarshall(DescribeElasticDailyPlanResponse describeElasticDailyPlanResponse, UnmarshallerContext _ctx) {
		
		describeElasticDailyPlanResponse.setRequestId(_ctx.stringValue("DescribeElasticDailyPlanResponse.RequestId"));

		List<ElasticDailyPlanInfo> elasticDailyPlanList = new ArrayList<ElasticDailyPlanInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList.Length"); i++) {
			ElasticDailyPlanInfo elasticDailyPlanInfo = new ElasticDailyPlanInfo();
			elasticDailyPlanInfo.setPlanName(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].PlanName"));
			elasticDailyPlanInfo.setResourcePoolName(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].ResourcePoolName"));
			elasticDailyPlanInfo.setElasticNodeNum(_ctx.integerValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].ElasticNodeNum"));
			elasticDailyPlanInfo.setPlanStartTs(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].PlanStartTs"));
			elasticDailyPlanInfo.setPlanEndTs(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].PlanEndTs"));
			elasticDailyPlanInfo.setStartTs(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].StartTs"));
			elasticDailyPlanInfo.setEndTs(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].EndTs"));
			elasticDailyPlanInfo.setDay(_ctx.stringValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].Day"));
			elasticDailyPlanInfo.setStatus(_ctx.integerValue("DescribeElasticDailyPlanResponse.ElasticDailyPlanList["+ i +"].Status"));

			elasticDailyPlanList.add(elasticDailyPlanInfo);
		}
		describeElasticDailyPlanResponse.setElasticDailyPlanList(elasticDailyPlanList);
	 
	 	return describeElasticDailyPlanResponse;
	}
}