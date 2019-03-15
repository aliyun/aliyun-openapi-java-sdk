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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentHealthInfoResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentHealthInfoResponse.HealthInfo;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentHealthInfoResponse.HealthInfo.HealthDetail;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentHealthInfoResponse.HealthInfo.HealthDetail.HealthRuleParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceComponentHealthInfoResponseUnmarshaller {

	public static ListClusterServiceComponentHealthInfoResponse unmarshall(ListClusterServiceComponentHealthInfoResponse listClusterServiceComponentHealthInfoResponse, UnmarshallerContext context) {
		
		listClusterServiceComponentHealthInfoResponse.setRequestId(context.stringValue("ListClusterServiceComponentHealthInfoResponse.RequestId"));
		listClusterServiceComponentHealthInfoResponse.setClusterId(context.stringValue("ListClusterServiceComponentHealthInfoResponse.ClusterId"));

		List<HealthInfo> healthInfoList = new ArrayList<HealthInfo>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList.Length"); i++) {
			HealthInfo healthInfo = new HealthInfo();
			healthInfo.setServiceName(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ServiceName"));
			healthInfo.setComponentName(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ComponentName"));
			healthInfo.setHealthLevel(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthLevel"));
			healthInfo.setStoppedNum(context.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].StoppedNum"));
			healthInfo.setManualStoppedNum(context.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ManualStoppedNum"));
			healthInfo.setNormalNum(context.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].NormalNum"));
			healthInfo.setTotalNum(context.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].TotalNum"));
			healthInfo.setAgentHeartBeatLostNum(context.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].AgentHeartBeatLostNum"));

			List<HealthDetail> healthDetailList = new ArrayList<HealthDetail>();
			for (int j = 0; j < context.lengthValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList.Length"); j++) {
				HealthDetail healthDetail = new HealthDetail();
				healthDetail.setCode(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].code"));

				HealthRuleParam healthRuleParam = new HealthRuleParam();
				healthRuleParam.setService(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Service"));
				healthRuleParam.setComponent(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Component"));
				healthRuleParam.setRuleTitle(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleTitle"));
				healthRuleParam.setPass(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Pass"));
				healthRuleParam.setRuleId(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleId"));
				healthRuleParam.setRuleDescription(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleDescription"));
				healthRuleParam.setHostNames(context.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.HostNames"));
				healthDetail.setHealthRuleParam(healthRuleParam);

				healthDetailList.add(healthDetail);
			}
			healthInfo.setHealthDetailList(healthDetailList);

			healthInfoList.add(healthInfo);
		}
		listClusterServiceComponentHealthInfoResponse.setHealthInfoList(healthInfoList);
	 
	 	return listClusterServiceComponentHealthInfoResponse;
	}
}