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

import com.aliyuncs.adb.model.v20190315.DescribeElasticPlanResponse;
import com.aliyuncs.adb.model.v20190315.DescribeElasticPlanResponse.ElasticPlanInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticPlanResponseUnmarshaller {

	public static DescribeElasticPlanResponse unmarshall(DescribeElasticPlanResponse describeElasticPlanResponse, UnmarshallerContext _ctx) {
		
		describeElasticPlanResponse.setRequestId(_ctx.stringValue("DescribeElasticPlanResponse.RequestId"));

		List<ElasticPlanInfo> elasticPlanList = new ArrayList<ElasticPlanInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticPlanResponse.ElasticPlanList.Length"); i++) {
			ElasticPlanInfo elasticPlanInfo = new ElasticPlanInfo();
			elasticPlanInfo.setPlanName(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].PlanName"));
			elasticPlanInfo.setResourcePoolName(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].ResourcePoolName"));
			elasticPlanInfo.setElasticNodeNum(_ctx.integerValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].ElasticNodeNum"));
			elasticPlanInfo.setStartTime(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].StartTime"));
			elasticPlanInfo.setEndTime(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].EndTime"));
			elasticPlanInfo.setWeeklyRepeat(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].WeeklyRepeat"));
			elasticPlanInfo.setStartDay(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].StartDay"));
			elasticPlanInfo.setEndDay(_ctx.stringValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].EndDay"));
			elasticPlanInfo.setEnable(_ctx.booleanValue("DescribeElasticPlanResponse.ElasticPlanList["+ i +"].Enable"));

			elasticPlanList.add(elasticPlanInfo);
		}
		describeElasticPlanResponse.setElasticPlanList(elasticPlanList);
	 
	 	return describeElasticPlanResponse;
	}
}