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

package com.aliyuncs.eas.transform.v20210701;

import com.aliyuncs.eas.model.v20210701.DescribeResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceResponseUnmarshaller {

	public static DescribeResourceResponse unmarshall(DescribeResourceResponse describeResourceResponse, UnmarshallerContext _ctx) {
		
		describeResourceResponse.setRequestId(_ctx.stringValue("DescribeResourceResponse.RequestId"));
		describeResourceResponse.setResourceId(_ctx.stringValue("DescribeResourceResponse.ResourceId"));
		describeResourceResponse.setResourceName(_ctx.stringValue("DescribeResourceResponse.ResourceName"));
		describeResourceResponse.setClusterId(_ctx.stringValue("DescribeResourceResponse.ClusterId"));
		describeResourceResponse.setCreateTime(_ctx.stringValue("DescribeResourceResponse.CreateTime"));
		describeResourceResponse.setUpdateTime(_ctx.stringValue("DescribeResourceResponse.UpdateTime"));
		describeResourceResponse.setOwnerUid(_ctx.stringValue("DescribeResourceResponse.OwnerUid"));
		describeResourceResponse.setInstanceCount(_ctx.integerValue("DescribeResourceResponse.InstanceCount"));
		describeResourceResponse.setPrePaidInstanceCount(_ctx.integerValue("DescribeResourceResponse.PrePaidInstanceCount"));
		describeResourceResponse.setPostPaidInstanceCount(_ctx.integerValue("DescribeResourceResponse.PostPaidInstanceCount"));
		describeResourceResponse.setCpuCount(_ctx.integerValue("DescribeResourceResponse.CpuCount"));
		describeResourceResponse.setGpuCount(_ctx.integerValue("DescribeResourceResponse.GpuCount"));
		describeResourceResponse.setStatus(_ctx.stringValue("DescribeResourceResponse.Status"));
		describeResourceResponse.setMessage(_ctx.stringValue("DescribeResourceResponse.Message"));
		describeResourceResponse.setExtraData(_ctx.stringValue("DescribeResourceResponse.ExtraData"));
	 
	 	return describeResourceResponse;
	}
}