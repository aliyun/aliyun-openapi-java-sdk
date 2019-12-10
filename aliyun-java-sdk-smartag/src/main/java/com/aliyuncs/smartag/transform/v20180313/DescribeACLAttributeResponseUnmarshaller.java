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

	public static DescribeACLAttributeResponse unmarshall(DescribeACLAttributeResponse describeACLAttributeResponse, UnmarshallerContext _ctx) {
		
		describeACLAttributeResponse.setRequestId(_ctx.stringValue("DescribeACLAttributeResponse.RequestId"));
		describeACLAttributeResponse.setTotalCount(_ctx.integerValue("DescribeACLAttributeResponse.TotalCount"));
		describeACLAttributeResponse.setPageNumber(_ctx.integerValue("DescribeACLAttributeResponse.PageNumber"));
		describeACLAttributeResponse.setPageSize(_ctx.integerValue("DescribeACLAttributeResponse.PageSize"));

		List<Acr> acrs = new ArrayList<Acr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeACLAttributeResponse.Acrs.Length"); i++) {
			Acr acr = new Acr();
			acr.setAcrId(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AcrId"));
			acr.setDescription(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Description"));
			acr.setDirection(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Direction"));
			acr.setSourceCidr(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourceCidr"));
			acr.setDestCidr(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestCidr"));
			acr.setIpProtocol(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].IpProtocol"));
			acr.setSourcePortRange(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourcePortRange"));
			acr.setDestPortRange(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestPortRange"));
			acr.setPolicy(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Policy"));
			acr.setPriority(_ctx.integerValue("DescribeACLAttributeResponse.Acrs["+ i +"].Priority"));
			acr.setGmtCreate(_ctx.longValue("DescribeACLAttributeResponse.Acrs["+ i +"].GmtCreate"));
			acr.setAclId(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AclId"));
			acr.setType(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Type"));
			acr.setName(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Name"));

			acrs.add(acr);
		}
		describeACLAttributeResponse.setAcrs(acrs);
	 
	 	return describeACLAttributeResponse;
	}
}