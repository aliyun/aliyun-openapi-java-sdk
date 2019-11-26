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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeTransferDomainsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeTransferDomainsResponse.DomainTransfer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransferDomainsResponseUnmarshaller {

	public static DescribeTransferDomainsResponse unmarshall(DescribeTransferDomainsResponse describeTransferDomainsResponse, UnmarshallerContext _ctx) {
		
		describeTransferDomainsResponse.setRequestId(_ctx.stringValue("DescribeTransferDomainsResponse.RequestId"));
		describeTransferDomainsResponse.setTotalCount(_ctx.longValue("DescribeTransferDomainsResponse.TotalCount"));
		describeTransferDomainsResponse.setPageNumber(_ctx.longValue("DescribeTransferDomainsResponse.PageNumber"));
		describeTransferDomainsResponse.setPageSize(_ctx.longValue("DescribeTransferDomainsResponse.PageSize"));

		List<DomainTransfer> domainTransfers = new ArrayList<DomainTransfer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransferDomainsResponse.DomainTransfers.Length"); i++) {
			DomainTransfer domainTransfer = new DomainTransfer();
			domainTransfer.setDomainName(_ctx.stringValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].DomainName"));
			domainTransfer.setCreateTime(_ctx.stringValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].CreateTime"));
			domainTransfer.setCreateTimestamp(_ctx.longValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].CreateTimestamp"));
			domainTransfer.setFromUserId(_ctx.longValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].FromUserId"));
			domainTransfer.setTargetUserId(_ctx.longValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].TargetUserId"));
			domainTransfer.setId(_ctx.longValue("DescribeTransferDomainsResponse.DomainTransfers["+ i +"].Id"));

			domainTransfers.add(domainTransfer);
		}
		describeTransferDomainsResponse.setDomainTransfers(domainTransfers);
	 
	 	return describeTransferDomainsResponse;
	}
}