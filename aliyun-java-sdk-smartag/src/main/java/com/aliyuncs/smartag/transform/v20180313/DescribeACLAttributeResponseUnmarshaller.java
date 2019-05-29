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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeACLAttributeResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeACLAttributeResponse.Acr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeACLAttributeResponseUnmarshaller {

	public static DescribeACLAttributeResponse unmarshall(DescribeACLAttributeResponse describeACLAttributeResponse, UnmarshallerContext context) {
		
		describeACLAttributeResponse.setRequestId(context.stringValue("DescribeACLAttributeResponse.RequestId"));
		describeACLAttributeResponse.setTotalCount(context.integerValue("DescribeACLAttributeResponse.TotalCount"));
		describeACLAttributeResponse.setPageNumber(context.integerValue("DescribeACLAttributeResponse.PageNumber"));
		describeACLAttributeResponse.setPageSize(context.integerValue("DescribeACLAttributeResponse.PageSize"));

		List<Acr> acrs = new ArrayList<Acr>();
		for (int i = 0; i < context.lengthValue("DescribeACLAttributeResponse.Acrs.Length"); i++) {
			Acr acr = new Acr();
			acr.setAcrId(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AcrId"));
			acr.setDescription(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Description"));
			acr.setDirection(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Direction"));
			acr.setSourceCidr(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourceCidr"));
			acr.setDestCidr(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestCidr"));
			acr.setIpProtocol(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].IpProtocol"));
			acr.setSourcePortRange(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourcePortRange"));
			acr.setDestPortRange(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestPortRange"));
			acr.setPolicy(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Policy"));
			acr.setPriority(context.integerValue("DescribeACLAttributeResponse.Acrs["+ i +"].Priority"));
			acr.setGmtCreate(context.longValue("DescribeACLAttributeResponse.Acrs["+ i +"].GmtCreate"));
			acr.setAclId(context.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AclId"));

			acrs.add(acr);
		}
		describeACLAttributeResponse.setAcrs(acrs);
	 
	 	return describeACLAttributeResponse;
	}
}