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

import com.aliyuncs.pts.model.v20190810.DescribeUserVum2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVum2ResponseUnmarshaller {

	public static DescribeUserVum2Response unmarshall(DescribeUserVum2Response describeUserVum2Response, UnmarshallerContext _ctx) {
		
		describeUserVum2Response.setRequestId(_ctx.stringValue("DescribeUserVum2Response.RequestId"));
		describeUserVum2Response.setDyingVums(_ctx.integerValue("DescribeUserVum2Response.DyingVums"));
		describeUserVum2Response.setFrozenVum(_ctx.integerValue("DescribeUserVum2Response.FrozenVum"));
		describeUserVum2Response.setDyingCount(_ctx.integerValue("DescribeUserVum2Response.DyingCount"));
		describeUserVum2Response.setPackagesCount(_ctx.integerValue("DescribeUserVum2Response.PackagesCount"));
		describeUserVum2Response.setAvailableVums(_ctx.integerValue("DescribeUserVum2Response.AvailableVums"));
		describeUserVum2Response.setMessage(_ctx.stringValue("DescribeUserVum2Response.Message"));
		describeUserVum2Response.setHttpStatusCode(_ctx.integerValue("DescribeUserVum2Response.HttpStatusCode"));
		describeUserVum2Response.setCode(_ctx.stringValue("DescribeUserVum2Response.Code"));
		describeUserVum2Response.setSuccess(_ctx.booleanValue("DescribeUserVum2Response.Success"));
	 
	 	return describeUserVum2Response;
	}
}