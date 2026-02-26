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

	public static DescribeNetworkQuotaRequestResultResponse unmarshall(DescribeNetworkQuotaRequestResultResponse describeNetworkQuotaRequestResultResponse, UnmarshallerContext _ctx) {
		
		describeNetworkQuotaRequestResultResponse.setRequestId(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.RequestId"));
		describeNetworkQuotaRequestResultResponse.setTotalCount(_ctx.integerValue("DescribeNetworkQuotaRequestResultResponse.TotalCount"));
		describeNetworkQuotaRequestResultResponse.setPageSize(_ctx.integerValue("DescribeNetworkQuotaRequestResultResponse.PageSize"));
		describeNetworkQuotaRequestResultResponse.setPageNumber(_ctx.integerValue("DescribeNetworkQuotaRequestResultResponse.PageNumber"));

		List<QuotaRequest> quotaRequests = new ArrayList<QuotaRequest>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests.Length"); i++) {
			QuotaRequest quotaRequest = new QuotaRequest();
			quotaRequest.setQuotaPublicityName(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].QuotaPublicityName"));
			quotaRequest.setResourceType(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResourceType"));
			quotaRequest.setRequestId(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestId"));
			quotaRequest.setProduct(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].Product"));
			quotaRequest.setCreateTime(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].CreateTime"));
			quotaRequest.setRequestQuantity(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestQuantity"));
			quotaRequest.setRequestReason(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestReason"));
			quotaRequest.setResultReason(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResultReason"));
			quotaRequest.setRequestResult(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RequestResult"));
			quotaRequest.setResultQuantity(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].ResultQuantity"));
			quotaRequest.setRegionId(_ctx.stringValue("DescribeNetworkQuotaRequestResultResponse.QuotaRequests["+ i +"].RegionId"));

			quotaRequests.add(quotaRequest);
		}
		describeNetworkQuotaRequestResultResponse.setQuotaRequests(quotaRequests);
	 
	 	return describeNetworkQuotaRequestResultResponse;
	}
}