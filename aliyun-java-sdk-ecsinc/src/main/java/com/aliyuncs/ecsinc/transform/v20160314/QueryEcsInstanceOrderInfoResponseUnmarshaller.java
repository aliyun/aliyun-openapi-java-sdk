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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.QueryEcsInstanceOrderInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEcsInstanceOrderInfoResponseUnmarshaller {

	public static QueryEcsInstanceOrderInfoResponse unmarshall(QueryEcsInstanceOrderInfoResponse queryEcsInstanceOrderInfoResponse, UnmarshallerContext context) {
		
		queryEcsInstanceOrderInfoResponse.setRequestId(context.stringValue("QueryEcsInstanceOrderInfoResponse.RequestId"));
		queryEcsInstanceOrderInfoResponse.setInstanceId(context.stringValue("QueryEcsInstanceOrderInfoResponse.InstanceId"));
		queryEcsInstanceOrderInfoResponse.setBandwidthByFlow(context.booleanValue("QueryEcsInstanceOrderInfoResponse.BandwidthByFlow"));
		queryEcsInstanceOrderInfoResponse.setBaseBandwidth(context.integerValue("QueryEcsInstanceOrderInfoResponse.BaseBandwidth"));
		queryEcsInstanceOrderInfoResponse.setRenewChangeBeginTime(context.stringValue("QueryEcsInstanceOrderInfoResponse.RenewChangeBeginTime"));
		queryEcsInstanceOrderInfoResponse.setRenewChangeEndTime(context.stringValue("QueryEcsInstanceOrderInfoResponse.RenewChangeEndTime"));
		queryEcsInstanceOrderInfoResponse.setRenewChanged(context.booleanValue("QueryEcsInstanceOrderInfoResponse.RenewChanged"));
		queryEcsInstanceOrderInfoResponse.setLocalOfSystemDisk(context.booleanValue("QueryEcsInstanceOrderInfoResponse.LocalOfSystemDisk"));
		queryEcsInstanceOrderInfoResponse.setElasticModificationUtcEndTime(context.stringValue("QueryEcsInstanceOrderInfoResponse.ElasticModificationUtcEndTime"));
		queryEcsInstanceOrderInfoResponse.setIncludeActiveElasticModification(context.booleanValue("QueryEcsInstanceOrderInfoResponse.IncludeActiveElasticModification"));
		queryEcsInstanceOrderInfoResponse.setBaseInstanceType(context.stringValue("QueryEcsInstanceOrderInfoResponse.BaseInstanceType"));
		queryEcsInstanceOrderInfoResponse.setDowngradeTimes(context.integerValue("QueryEcsInstanceOrderInfoResponse.DowngradeTimes"));
		queryEcsInstanceOrderInfoResponse.setDowngradeAvailableTimes(context.integerValue("QueryEcsInstanceOrderInfoResponse.DowngradeAvailableTimes"));
	 
	 	return queryEcsInstanceOrderInfoResponse;
	}
}