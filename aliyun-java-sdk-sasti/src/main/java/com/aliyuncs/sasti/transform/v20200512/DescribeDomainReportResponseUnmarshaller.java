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

import com.aliyuncs.sasti.model.v20200512.DescribeDomainReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainReportResponseUnmarshaller {

	public static DescribeDomainReportResponse unmarshall(DescribeDomainReportResponse describeDomainReportResponse, UnmarshallerContext _ctx) {
		
		describeDomainReportResponse.setRequestId(_ctx.stringValue("DescribeDomainReportResponse.RequestId"));
		describeDomainReportResponse.setIntelligences(_ctx.stringValue("DescribeDomainReportResponse.Intelligences"));
		describeDomainReportResponse.setDomain(_ctx.stringValue("DescribeDomainReportResponse.Domain"));
		describeDomainReportResponse.setSslCert(_ctx.stringValue("DescribeDomainReportResponse.SslCert"));
		describeDomainReportResponse.setAttackPreferenceTop5(_ctx.stringValue("DescribeDomainReportResponse.AttackPreferenceTop5"));
		describeDomainReportResponse.setThreatTypes(_ctx.stringValue("DescribeDomainReportResponse.ThreatTypes"));
		describeDomainReportResponse.setConfidence(_ctx.stringValue("DescribeDomainReportResponse.Confidence"));
		describeDomainReportResponse.setThreatLevel(_ctx.stringValue("DescribeDomainReportResponse.ThreatLevel"));
		describeDomainReportResponse.setAttackCntByThreatType(_ctx.stringValue("DescribeDomainReportResponse.AttackCntByThreatType"));
		describeDomainReportResponse.setContext(_ctx.stringValue("DescribeDomainReportResponse.Context"));
		describeDomainReportResponse.setWhois(_ctx.stringValue("DescribeDomainReportResponse.Whois"));
		describeDomainReportResponse.setScenario(_ctx.stringValue("DescribeDomainReportResponse.Scenario"));
		describeDomainReportResponse.setBasic(_ctx.stringValue("DescribeDomainReportResponse.Basic"));
		describeDomainReportResponse.setGroup(_ctx.stringValue("DescribeDomainReportResponse.Group"));
	 
	 	return describeDomainReportResponse;
	}
}