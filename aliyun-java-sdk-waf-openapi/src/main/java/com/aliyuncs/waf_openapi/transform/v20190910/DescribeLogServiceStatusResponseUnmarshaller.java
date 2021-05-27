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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeLogServiceStatusResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeLogServiceStatusResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogServiceStatusResponseUnmarshaller {

	public static DescribeLogServiceStatusResponse unmarshall(DescribeLogServiceStatusResponse describeLogServiceStatusResponse, UnmarshallerContext _ctx) {
		
		describeLogServiceStatusResponse.setRequestId(_ctx.stringValue("DescribeLogServiceStatusResponse.RequestId"));
		describeLogServiceStatusResponse.setTotalCount(_ctx.integerValue("DescribeLogServiceStatusResponse.TotalCount"));

		List<Status> domainStatus = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogServiceStatusResponse.DomainStatus.Length"); i++) {
			Status status = new Status();
			status.setSlsLogActive(_ctx.integerValue("DescribeLogServiceStatusResponse.DomainStatus["+ i +"].SlsLogActive"));
			status.setDomain(_ctx.stringValue("DescribeLogServiceStatusResponse.DomainStatus["+ i +"].Domain"));

			domainStatus.add(status);
		}
		describeLogServiceStatusResponse.setDomainStatus(domainStatus);
	 
	 	return describeLogServiceStatusResponse;
	}
}