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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetAggregateResourceComplianceGroupByRegionResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultListItem;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultListItem.CompliancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateResourceComplianceGroupByRegionResponseUnmarshaller {

	public static GetAggregateResourceComplianceGroupByRegionResponse unmarshall(GetAggregateResourceComplianceGroupByRegionResponse getAggregateResourceComplianceGroupByRegionResponse, UnmarshallerContext _ctx) {
		
		getAggregateResourceComplianceGroupByRegionResponse.setRequestId(_ctx.stringValue("GetAggregateResourceComplianceGroupByRegionResponse.RequestId"));

		ComplianceResult complianceResult = new ComplianceResult();

		List<ComplianceResultListItem> complianceResultList = new ArrayList<ComplianceResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultList.Length"); i++) {
			ComplianceResultListItem complianceResultListItem = new ComplianceResultListItem();
			complianceResultListItem.setRegionId(_ctx.stringValue("GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultList["+ i +"].RegionId"));

			List<CompliancesItem> compliances = new ArrayList<CompliancesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultList["+ i +"].Compliances.Length"); j++) {
				CompliancesItem compliancesItem = new CompliancesItem();
				compliancesItem.setComplianceType(_ctx.stringValue("GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultList["+ i +"].Compliances["+ j +"].ComplianceType"));
				compliancesItem.setCount(_ctx.longValue("GetAggregateResourceComplianceGroupByRegionResponse.ComplianceResult.ComplianceResultList["+ i +"].Compliances["+ j +"].Count"));

				compliances.add(compliancesItem);
			}
			complianceResultListItem.setCompliances(compliances);

			complianceResultList.add(complianceResultListItem);
		}
		complianceResult.setComplianceResultList(complianceResultList);
		getAggregateResourceComplianceGroupByRegionResponse.setComplianceResult(complianceResult);
	 
	 	return getAggregateResourceComplianceGroupByRegionResponse;
	}
}