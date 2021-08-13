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
		describeACLAttributeResponse.setPageSize(_ctx.integerValue("DescribeACLAttributeResponse.PageSize"));
		describeACLAttributeResponse.setPageNumber(_ctx.integerValue("DescribeACLAttributeResponse.PageNumber"));

		List<Acr> acrs = new ArrayList<Acr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeACLAttributeResponse.Acrs.Length"); i++) {
			Acr acr = new Acr();
			acr.setDirection(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Direction"));
			acr.setType(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Type"));
			acr.setIpProtocol(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].IpProtocol"));
			acr.setPriority(_ctx.integerValue("DescribeACLAttributeResponse.Acrs["+ i +"].Priority"));
			acr.setAclId(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AclId"));
			acr.setPolicy(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Policy"));
			acr.setDescription(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Description"));
			acr.setGmtCreate(_ctx.longValue("DescribeACLAttributeResponse.Acrs["+ i +"].GmtCreate"));
			acr.setDestCidr(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestCidr"));
			acr.setDestPortRange(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DestPortRange"));
			acr.setName(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].Name"));
			acr.setAcrId(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].AcrId"));
			acr.setSourceCidr(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourceCidr"));
			acr.setSourcePortRange(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].SourcePortRange"));

			List<String> dpiSignatureIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeACLAttributeResponse.Acrs["+ i +"].DpiSignatureIds.Length"); j++) {
				dpiSignatureIds.add(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DpiSignatureIds["+ j +"]"));
			}
			acr.setDpiSignatureIds(dpiSignatureIds);

			List<String> dpiGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeACLAttributeResponse.Acrs["+ i +"].DpiGroupIds.Length"); j++) {
				dpiGroupIds.add(_ctx.stringValue("DescribeACLAttributeResponse.Acrs["+ i +"].DpiGroupIds["+ j +"]"));
			}
			acr.setDpiGroupIds(dpiGroupIds);

			acrs.add(acr);
		}
		describeACLAttributeResponse.setAcrs(acrs);
	 
	 	return describeACLAttributeResponse;
	}
}