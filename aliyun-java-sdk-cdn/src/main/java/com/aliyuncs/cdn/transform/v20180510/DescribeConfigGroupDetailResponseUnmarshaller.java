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

import com.aliyuncs.cdn.model.v20180510.DescribeConfigGroupDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigGroupDetailResponseUnmarshaller {

	public static DescribeConfigGroupDetailResponse unmarshall(DescribeConfigGroupDetailResponse describeConfigGroupDetailResponse, UnmarshallerContext _ctx) {
		
		describeConfigGroupDetailResponse.setRequestId(_ctx.stringValue("DescribeConfigGroupDetailResponse.RequestId"));
		describeConfigGroupDetailResponse.setUpdateTime(_ctx.stringValue("DescribeConfigGroupDetailResponse.UpdateTime"));
		describeConfigGroupDetailResponse.setDescription(_ctx.stringValue("DescribeConfigGroupDetailResponse.Description"));
		describeConfigGroupDetailResponse.setConfigGroupName(_ctx.stringValue("DescribeConfigGroupDetailResponse.ConfigGroupName"));
		describeConfigGroupDetailResponse.setCreateTime(_ctx.stringValue("DescribeConfigGroupDetailResponse.CreateTime"));
		describeConfigGroupDetailResponse.setBizName(_ctx.stringValue("DescribeConfigGroupDetailResponse.BizName"));
		describeConfigGroupDetailResponse.setConfigGroupId(_ctx.stringValue("DescribeConfigGroupDetailResponse.ConfigGroupId"));
	 
	 	return describeConfigGroupDetailResponse;
	}
}