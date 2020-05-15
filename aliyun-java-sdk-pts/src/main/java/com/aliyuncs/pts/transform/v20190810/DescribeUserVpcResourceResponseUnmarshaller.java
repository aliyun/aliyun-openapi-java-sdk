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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeUserVpcResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVpcResourceResponseUnmarshaller {

	public static DescribeUserVpcResourceResponse unmarshall(DescribeUserVpcResourceResponse describeUserVpcResourceResponse, UnmarshallerContext _ctx) {
		
		describeUserVpcResourceResponse.setRequestId(_ctx.stringValue("DescribeUserVpcResourceResponse.RequestId"));
		describeUserVpcResourceResponse.setVpcResources(_ctx.stringValue("DescribeUserVpcResourceResponse.VpcResources"));
		describeUserVpcResourceResponse.setHttpStatusCode(_ctx.integerValue("DescribeUserVpcResourceResponse.HttpStatusCode"));
		describeUserVpcResourceResponse.setMessage(_ctx.stringValue("DescribeUserVpcResourceResponse.Message"));
		describeUserVpcResourceResponse.setSuccess(_ctx.booleanValue("DescribeUserVpcResourceResponse.Success"));
		describeUserVpcResourceResponse.setCode(_ctx.stringValue("DescribeUserVpcResourceResponse.Code"));
		describeUserVpcResourceResponse.setJobId(_ctx.stringValue("DescribeUserVpcResourceResponse.JobId"));
		describeUserVpcResourceResponse.setFinished(_ctx.booleanValue("DescribeUserVpcResourceResponse.Finished"));
		describeUserVpcResourceResponse.setTimeout(_ctx.integerValue("DescribeUserVpcResourceResponse.Timeout"));
	 
	 	return describeUserVpcResourceResponse;
	}
}