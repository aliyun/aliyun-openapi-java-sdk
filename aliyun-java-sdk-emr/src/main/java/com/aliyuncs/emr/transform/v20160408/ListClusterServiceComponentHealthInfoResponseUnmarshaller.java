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

	public static ListClusterServiceComponentHealthInfoResponse unmarshall(ListClusterServiceComponentHealthInfoResponse listClusterServiceComponentHealthInfoResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceComponentHealthInfoResponse.setRequestId(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.RequestId"));
		listClusterServiceComponentHealthInfoResponse.setClusterId(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.ClusterId"));

		List<HealthInfo> healthInfoList = new ArrayList<HealthInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList.Length"); i++) {
			HealthInfo healthInfo = new HealthInfo();
			healthInfo.setServiceName(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ServiceName"));
			healthInfo.setComponentName(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ComponentName"));
			healthInfo.setHealthLevel(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthLevel"));
			healthInfo.setStoppedNum(_ctx.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].StoppedNum"));
			healthInfo.setManualStoppedNum(_ctx.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].ManualStoppedNum"));
			healthInfo.setNormalNum(_ctx.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].NormalNum"));
			healthInfo.setTotalNum(_ctx.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].TotalNum"));
			healthInfo.setAgentHeartBeatLostNum(_ctx.integerValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].AgentHeartBeatLostNum"));
			healthInfo.setCreatedTime(_ctx.longValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].CreatedTime"));

			List<HealthDetail> healthDetailList = new ArrayList<HealthDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList.Length"); j++) {
				HealthDetail healthDetail = new HealthDetail();
				healthDetail.setCode(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].code"));

				HealthRuleParam healthRuleParam = new HealthRuleParam();
				healthRuleParam.setService(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Service"));
				healthRuleParam.setComponent(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Component"));
				healthRuleParam.setRuleTitle(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleTitle"));
				healthRuleParam.setPass(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.Pass"));
				healthRuleParam.setRuleId(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleId"));
				healthRuleParam.setRuleDescription(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.RuleDescription"));
				healthRuleParam.setHostNames(_ctx.stringValue("ListClusterServiceComponentHealthInfoResponse.HealthInfoList["+ i +"].HealthDetailList["+ j +"].HealthRuleParam.HostNames"));
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