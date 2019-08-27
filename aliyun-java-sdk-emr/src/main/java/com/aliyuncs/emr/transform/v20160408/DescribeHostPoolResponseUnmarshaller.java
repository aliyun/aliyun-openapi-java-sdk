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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeHostPoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHostPoolResponseUnmarshaller {

	public static DescribeHostPoolResponse unmarshall(DescribeHostPoolResponse describeHostPoolResponse, UnmarshallerContext _ctx) {
		
		describeHostPoolResponse.setRequestId(_ctx.stringValue("DescribeHostPoolResponse.RequestId"));
		describeHostPoolResponse.setName(_ctx.stringValue("DescribeHostPoolResponse.Name"));
		describeHostPoolResponse.setBizId(_ctx.stringValue("DescribeHostPoolResponse.BizId"));
		describeHostPoolResponse.setStatus(_ctx.stringValue("DescribeHostPoolResponse.Status"));
		describeHostPoolResponse.setType(_ctx.stringValue("DescribeHostPoolResponse.Type"));
		describeHostPoolResponse.setDescription(_ctx.stringValue("DescribeHostPoolResponse.Description"));
		describeHostPoolResponse.setHostCount(_ctx.integerValue("DescribeHostPoolResponse.HostCount"));
		describeHostPoolResponse.setGmtCreate(_ctx.longValue("DescribeHostPoolResponse.GmtCreate"));
	 
	 	return describeHostPoolResponse;
	}
}