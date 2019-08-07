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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeInfrastructuresResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeInfrastructuresResponse.Infrastructure;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInfrastructuresResponseUnmarshaller {

	public static DescribeInfrastructuresResponse unmarshall(DescribeInfrastructuresResponse describeInfrastructuresResponse, UnmarshallerContext _ctx) {
		
		describeInfrastructuresResponse.setRequestId(_ctx.stringValue("DescribeInfrastructuresResponse.RequestId"));
		describeInfrastructuresResponse.setSuccess(_ctx.booleanValue("DescribeInfrastructuresResponse.Success"));
		describeInfrastructuresResponse.setCode(_ctx.stringValue("DescribeInfrastructuresResponse.Code"));
		describeInfrastructuresResponse.setMessage(_ctx.stringValue("DescribeInfrastructuresResponse.Message"));
		describeInfrastructuresResponse.setTotalCount(_ctx.integerValue("DescribeInfrastructuresResponse.TotalCount"));
		describeInfrastructuresResponse.setPageNumber(_ctx.integerValue("DescribeInfrastructuresResponse.PageNumber"));
		describeInfrastructuresResponse.setPageSize(_ctx.integerValue("DescribeInfrastructuresResponse.PageSize"));

		List<Infrastructure> infrastructures = new ArrayList<Infrastructure>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInfrastructuresResponse.Infrastructures.Length"); i++) {
			Infrastructure infrastructure = new Infrastructure();
			infrastructure.setInfrastructureId(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].InfrastructureId"));
			infrastructure.setName(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].Name"));
			infrastructure.setType(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].Type"));
			infrastructure.setIpAddress(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].IpAddress"));
			infrastructure.setErrno(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].Errno"));
			infrastructure.setStatus(_ctx.stringValue("DescribeInfrastructuresResponse.Infrastructures["+ i +"].Status"));

			infrastructures.add(infrastructure);
		}
		describeInfrastructuresResponse.setInfrastructures(infrastructures);
	 
	 	return describeInfrastructuresResponse;
	}
}