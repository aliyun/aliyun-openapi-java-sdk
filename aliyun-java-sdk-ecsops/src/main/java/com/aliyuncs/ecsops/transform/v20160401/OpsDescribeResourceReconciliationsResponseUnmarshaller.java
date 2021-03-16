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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceReconciliationsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceReconciliationsResponse.ResourceReconciliation;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceReconciliationsResponseUnmarshaller {

	public static OpsDescribeResourceReconciliationsResponse unmarshall(OpsDescribeResourceReconciliationsResponse opsDescribeResourceReconciliationsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceReconciliationsResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.RequestId"));
		opsDescribeResourceReconciliationsResponse.setTotalCount(_ctx.integerValue("OpsDescribeResourceReconciliationsResponse.TotalCount"));
		opsDescribeResourceReconciliationsResponse.setPageNumber(_ctx.integerValue("OpsDescribeResourceReconciliationsResponse.PageNumber"));
		opsDescribeResourceReconciliationsResponse.setPageSize(_ctx.integerValue("OpsDescribeResourceReconciliationsResponse.PageSize"));

		List<ResourceReconciliation> resourceReconciliations = new ArrayList<ResourceReconciliation>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations.Length"); i++) {
			ResourceReconciliation resourceReconciliation = new ResourceReconciliation();
			resourceReconciliation.setId(_ctx.longValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].Id"));
			resourceReconciliation.setGmtCreate(_ctx.longValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].GmtCreate"));
			resourceReconciliation.setGmtModified(_ctx.longValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].GmtModified"));
			resourceReconciliation.setResourceId(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].ResourceId"));
			resourceReconciliation.setResourceType(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].resourceType"));
			resourceReconciliation.setRegionId(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].RegionId"));
			resourceReconciliation.setHyInfo(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].HyInfo"));
			resourceReconciliation.setVpcInfo(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].VpcInfo"));
			resourceReconciliation.setDone(_ctx.booleanValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].Done"));
			resourceReconciliation.setErrorCode(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].ErrorCode"));
			resourceReconciliation.setErrorMessage(_ctx.stringValue("OpsDescribeResourceReconciliationsResponse.ResourceReconciliations["+ i +"].ErrorMessage"));

			resourceReconciliations.add(resourceReconciliation);
		}
		opsDescribeResourceReconciliationsResponse.setResourceReconciliations(resourceReconciliations);
	 
	 	return opsDescribeResourceReconciliationsResponse;
	}
}