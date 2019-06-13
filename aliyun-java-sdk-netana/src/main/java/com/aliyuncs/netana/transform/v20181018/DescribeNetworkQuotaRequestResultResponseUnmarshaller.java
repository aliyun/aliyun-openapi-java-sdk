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

package com.aliyuncs.netana.transform.v20181018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotaRequestResultResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotaRequestResultResponse.QuotaRequest;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkQuotaRequestResultResponseUnmarshaller {

	public static DescribeNetworkQuotaRequestResultResponse unmarshall(DescribeNetworkQuotaRequestResultResponse describeNetworkQuotaRequestResultResponse, UnmarshallerContext context) {
		
		describeNetworkQuotaRequestResultResponse.setRequestId(context.stringValue("DescribeNetworkQuotaRequestResultResponse.RequestId"));
		describeNetworkQuotaRequestResultResponse.setTotalCount(context.integerValue("DescribeNetworkQuotaRequestResultResponse.TotalCount"));
		describeNetworkQuotaRequestResultResponse.setPageNumber(context.integerValue("DescribeNetworkQuotaRequestResultResponse.PageNumber"));
		describeNetworkQuotaRequestResultResponse.setPageSize(context.integerValue("DescribeNetworkQuotaRequestResultResponse.PageSize"));

		List<QuotaRequest> quotaRequests = new ArrayList<QuotaRequest>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests.Length"); i++) {
			QuotaRequest quotaRequest = new QuotaRequest();
			quotaRequest.setRegionId(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RegionId"));
			quotaRequest.setProduct(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].Product"));
			quotaRequest.setResourceType(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResourceType"));
			quotaRequest.setQuotaPublicityName(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].QuotaPublicityName"));
			quotaRequest.setRequestReason(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestReason"));
			quotaRequest.setMobilePhone(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].MobilePhone"));
			quotaRequest.setEmail(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].Email"));
			quotaRequest.setRequestResult(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestResult"));
			quotaRequest.setResultQuantity(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResultQuantity"));
			quotaRequest.setResultReason(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResultReason"));
			quotaRequest.setRequestId(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestId"));
			quotaRequest.setCreateTime(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].CreateTime"));
			quotaRequest.setRequestQuantity(context.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestQuantity"));

			quotaRequests.add(quotaRequest);
		}
		describeNetworkQuotaRequestResultResponse.setQuotaRequests(quotaRequests);
	 
	 	return describeNetworkQuotaRequestResultResponse;
	}
}