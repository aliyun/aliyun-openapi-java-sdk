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

package com.aliyuncs.domain.transform.v20180208;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.QueryDomainTransferStatusResponse;
import com.aliyuncs.domain.model.v20180208.QueryDomainTransferStatusResponse.DomainTransferStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainTransferStatusResponseUnmarshaller {

	public static QueryDomainTransferStatusResponse unmarshall(QueryDomainTransferStatusResponse queryDomainTransferStatusResponse, UnmarshallerContext _ctx) {
		
		queryDomainTransferStatusResponse.setRequestId(_ctx.stringValue("QueryDomainTransferStatusResponse.RequestId"));

		List<DomainTransferStatusItem> domainTransferStatus = new ArrayList<DomainTransferStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainTransferStatusResponse.DomainTransferStatus.Length"); i++) {
			DomainTransferStatusItem domainTransferStatusItem = new DomainTransferStatusItem();
			domainTransferStatusItem.setDomainStatusDescription(_ctx.stringValue("QueryDomainTransferStatusResponse.DomainTransferStatus["+ i +"].DomainStatusDescription"));
			domainTransferStatusItem.setDomainName(_ctx.stringValue("QueryDomainTransferStatusResponse.DomainTransferStatus["+ i +"].DomainName"));

			domainTransferStatus.add(domainTransferStatusItem);
		}
		queryDomainTransferStatusResponse.setDomainTransferStatus(domainTransferStatus);
	 
	 	return queryDomainTransferStatusResponse;
	}
}