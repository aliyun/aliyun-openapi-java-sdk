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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeProtocolServiceResponse;
import com.aliyuncs.nas.model.v20170626.DescribeProtocolServiceResponse.ProtocolService;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtocolServiceResponseUnmarshaller {

	public static DescribeProtocolServiceResponse unmarshall(DescribeProtocolServiceResponse describeProtocolServiceResponse, UnmarshallerContext _ctx) {
		
		describeProtocolServiceResponse.setRequestId(_ctx.stringValue("DescribeProtocolServiceResponse.RequestId"));
		describeProtocolServiceResponse.setNextToken(_ctx.stringValue("DescribeProtocolServiceResponse.NextToken"));

		List<ProtocolService> protocolServices = new ArrayList<ProtocolService>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtocolServiceResponse.ProtocolServices.Length"); i++) {
			ProtocolService protocolService = new ProtocolService();
			protocolService.setFileSystemId(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].FileSystemId"));
			protocolService.setProtocolServiceId(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].ProtocolServiceId"));
			protocolService.setProtocolSpec(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].ProtocolSpec"));
			protocolService.setProtocolThroughput(_ctx.integerValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].ProtocolThroughput"));
			protocolService.setInstanceRAM(_ctx.integerValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].InstanceRAM"));
			protocolService.setInstanceBaseThroughput(_ctx.integerValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].InstanceBaseThroughput"));
			protocolService.setInstanceBurstThroughput(_ctx.integerValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].InstanceBurstThroughput"));
			protocolService.setMountTargetCount(_ctx.integerValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].MountTargetCount"));
			protocolService.setProtocolType(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].ProtocolType"));
			protocolService.setStatus(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].Status"));
			protocolService.setDescription(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].Description"));
			protocolService.setCreateTime(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].CreateTime"));
			protocolService.setModifyTime(_ctx.stringValue("DescribeProtocolServiceResponse.ProtocolServices["+ i +"].ModifyTime"));

			protocolServices.add(protocolService);
		}
		describeProtocolServiceResponse.setProtocolServices(protocolServices);
	 
	 	return describeProtocolServiceResponse;
	}
}