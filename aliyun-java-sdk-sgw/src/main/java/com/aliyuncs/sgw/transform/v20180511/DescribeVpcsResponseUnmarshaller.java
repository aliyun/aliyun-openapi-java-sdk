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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeVpcsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeVpcsResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext _ctx) {
		
		describeVpcsResponse.setRequestId(_ctx.stringValue("DescribeVpcsResponse.RequestId"));
		describeVpcsResponse.setSuccess(_ctx.booleanValue("DescribeVpcsResponse.Success"));
		describeVpcsResponse.setCode(_ctx.stringValue("DescribeVpcsResponse.Code"));
		describeVpcsResponse.setMessage(_ctx.stringValue("DescribeVpcsResponse.Message"));
		describeVpcsResponse.setTotalCount(_ctx.integerValue("DescribeVpcsResponse.TotalCount"));
		describeVpcsResponse.setPageNumber(_ctx.integerValue("DescribeVpcsResponse.PageNumber"));
		describeVpcsResponse.setPageSize(_ctx.integerValue("DescribeVpcsResponse.PageSize"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setName(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Name"));
			vpc.setId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Id"));
			vpc.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].IsDefault"));
			vpc.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CidrBlock"));

			vpcs.add(vpc);
		}
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}