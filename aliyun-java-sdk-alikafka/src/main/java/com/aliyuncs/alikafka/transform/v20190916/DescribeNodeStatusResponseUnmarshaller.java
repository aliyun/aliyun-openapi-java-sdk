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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.DescribeNodeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeStatusResponseUnmarshaller {

	public static DescribeNodeStatusResponse unmarshall(DescribeNodeStatusResponse describeNodeStatusResponse, UnmarshallerContext _ctx) {
		
		describeNodeStatusResponse.setRequestId(_ctx.stringValue("DescribeNodeStatusResponse.RequestId"));
		describeNodeStatusResponse.setSuccess(_ctx.booleanValue("DescribeNodeStatusResponse.Success"));
		describeNodeStatusResponse.setCode(_ctx.integerValue("DescribeNodeStatusResponse.Code"));
		describeNodeStatusResponse.setMessage(_ctx.stringValue("DescribeNodeStatusResponse.Message"));

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeStatusResponse.StatusList.Length"); i++) {
			statusList.add(_ctx.stringValue("DescribeNodeStatusResponse.StatusList["+ i +"]"));
		}
		describeNodeStatusResponse.setStatusList(statusList);
	 
	 	return describeNodeStatusResponse;
	}
}