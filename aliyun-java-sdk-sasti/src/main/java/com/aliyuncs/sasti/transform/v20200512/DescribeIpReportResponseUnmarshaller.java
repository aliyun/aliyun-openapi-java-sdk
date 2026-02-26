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

package com.aliyuncs.sasti.transform.v20200512;

import com.aliyuncs.sasti.model.v20200512.DescribeIpReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpReportResponseUnmarshaller {

	public static DescribeIpReportResponse unmarshall(DescribeIpReportResponse describeIpReportResponse, UnmarshallerContext _ctx) {
		
		describeIpReportResponse.setRequestId(_ctx.stringValue("DescribeIpReportResponse.RequestId"));
		describeIpReportResponse.setContext(_ctx.stringValue("DescribeIpReportResponse.Context"));
		describeIpReportResponse.setIntelligences(_ctx.stringValue("DescribeIpReportResponse.Intelligences"));
		describeIpReportResponse.setWhois(_ctx.stringValue("DescribeIpReportResponse.Whois"));
		describeIpReportResponse.setAttackPreferenceTop5(_ctx.stringValue("DescribeIpReportResponse.AttackPreferenceTop5"));
		describeIpReportResponse.setConfidence(_ctx.stringValue("DescribeIpReportResponse.Confidence"));
		describeIpReportResponse.setThreatTypes(_ctx.stringValue("DescribeIpReportResponse.ThreatTypes"));
		describeIpReportResponse.setScenario(_ctx.stringValue("DescribeIpReportResponse.Scenario"));
		describeIpReportResponse.setIp(_ctx.stringValue("DescribeIpReportResponse.Ip"));
		describeIpReportResponse.setThreatLevel(_ctx.stringValue("DescribeIpReportResponse.ThreatLevel"));
		describeIpReportResponse.setAttackCntByThreatType(_ctx.stringValue("DescribeIpReportResponse.AttackCntByThreatType"));
		describeIpReportResponse.setGroup(_ctx.stringValue("DescribeIpReportResponse.Group"));
	 
	 	return describeIpReportResponse;
	}
}