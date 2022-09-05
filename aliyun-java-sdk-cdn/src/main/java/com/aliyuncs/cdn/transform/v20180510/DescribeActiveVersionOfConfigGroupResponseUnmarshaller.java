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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.DescribeActiveVersionOfConfigGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveVersionOfConfigGroupResponseUnmarshaller {

	public static DescribeActiveVersionOfConfigGroupResponse unmarshall(DescribeActiveVersionOfConfigGroupResponse describeActiveVersionOfConfigGroupResponse, UnmarshallerContext _ctx) {
		
		describeActiveVersionOfConfigGroupResponse.setRequestId(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.RequestId"));
		describeActiveVersionOfConfigGroupResponse.setStatus(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.Status"));
		describeActiveVersionOfConfigGroupResponse.setUpdateTime(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.UpdateTime"));
		describeActiveVersionOfConfigGroupResponse.setSeqId(_ctx.longValue("DescribeActiveVersionOfConfigGroupResponse.SeqId"));
		describeActiveVersionOfConfigGroupResponse.setDescription(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.Description"));
		describeActiveVersionOfConfigGroupResponse.setCreateTime(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.CreateTime"));
		describeActiveVersionOfConfigGroupResponse.setVersionId(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.VersionId"));
		describeActiveVersionOfConfigGroupResponse.setConfigGroupId(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.ConfigGroupId"));
		describeActiveVersionOfConfigGroupResponse.setOperator(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.Operator"));
		describeActiveVersionOfConfigGroupResponse.setBaseVersionId(_ctx.stringValue("DescribeActiveVersionOfConfigGroupResponse.BaseVersionId"));
	 
	 	return describeActiveVersionOfConfigGroupResponse;
	}
}