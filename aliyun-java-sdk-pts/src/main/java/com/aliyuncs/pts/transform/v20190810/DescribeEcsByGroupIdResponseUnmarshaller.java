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

import com.aliyuncs.pts.model.v20190810.DescribeEcsByGroupIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsByGroupIdResponseUnmarshaller {

	public static DescribeEcsByGroupIdResponse unmarshall(DescribeEcsByGroupIdResponse describeEcsByGroupIdResponse, UnmarshallerContext _ctx) {
		
		describeEcsByGroupIdResponse.setRequestId(_ctx.stringValue("DescribeEcsByGroupIdResponse.RequestId"));
		describeEcsByGroupIdResponse.setCode(_ctx.stringValue("DescribeEcsByGroupIdResponse.Code"));
		describeEcsByGroupIdResponse.setMessage(_ctx.stringValue("DescribeEcsByGroupIdResponse.Message"));
		describeEcsByGroupIdResponse.setSuccess(_ctx.booleanValue("DescribeEcsByGroupIdResponse.Success"));
		describeEcsByGroupIdResponse.setPageNumber(_ctx.integerValue("DescribeEcsByGroupIdResponse.PageNumber"));
		describeEcsByGroupIdResponse.setPageSize(_ctx.integerValue("DescribeEcsByGroupIdResponse.PageSize"));
		describeEcsByGroupIdResponse.setEcsViews(_ctx.stringValue("DescribeEcsByGroupIdResponse.EcsViews"));
		describeEcsByGroupIdResponse.setTotalCount(_ctx.longValue("DescribeEcsByGroupIdResponse.TotalCount"));
	 
	 	return describeEcsByGroupIdResponse;
	}
}