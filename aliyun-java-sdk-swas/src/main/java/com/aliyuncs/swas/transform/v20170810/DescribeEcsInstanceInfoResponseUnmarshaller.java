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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DescribeEcsInstanceInfoResponse;
import com.aliyuncs.swas.model.v20170810.DescribeEcsInstanceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsInstanceInfoResponseUnmarshaller {

	public static DescribeEcsInstanceInfoResponse unmarshall(DescribeEcsInstanceInfoResponse describeEcsInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		describeEcsInstanceInfoResponse.setRequestId(_ctx.stringValue("DescribeEcsInstanceInfoResponse.RequestId"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.InstanceId"));
		data.setInstanceName(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.InstanceName"));
		data.setInnerIpAddress(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.InnerIpAddress"));
		data.setPublicIpAddress(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.PublicIpAddress"));
		data.setStatus(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.Status"));
		data.setInstanceOwnerId(_ctx.longValue("DescribeEcsInstanceInfoResponse.Data.InstanceOwnerId"));
		data.setOriginalInstanceId(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.OriginalInstanceId"));
		data.setOriginalVpcId(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.OriginalVpcId"));
		data.setOriginalRegionId(_ctx.stringValue("DescribeEcsInstanceInfoResponse.Data.OriginalRegionId"));
		data.setOriginalOwnerId(_ctx.longValue("DescribeEcsInstanceInfoResponse.Data.OriginalOwnerId"));
		describeEcsInstanceInfoResponse.setData(data);
	 
	 	return describeEcsInstanceInfoResponse;
	}
}