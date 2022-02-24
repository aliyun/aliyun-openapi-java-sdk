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

package com.aliyuncs.eas.transform.v20171023;

import com.aliyuncs.eas.model.v20171023.DescribeStressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStressResponseUnmarshaller {

	public static DescribeStressResponse unmarshall(DescribeStressResponse describeStressResponse, UnmarshallerContext _ctx) {
		
		describeStressResponse.setRequestId(_ctx.stringValue("DescribeStressResponse.RequestId"));
		describeStressResponse.setCode(_ctx.longValue("DescribeStressResponse.Code"));
		describeStressResponse.setServiceName(_ctx.stringValue("DescribeStressResponse.ServiceName"));
		describeStressResponse.setStressName(_ctx.stringValue("DescribeStressResponse.StressName"));
		describeStressResponse.setToken(_ctx.stringValue("DescribeStressResponse.Token"));
		describeStressResponse.setCallerUid(_ctx.stringValue("DescribeStressResponse.CallerUid"));
		describeStressResponse.setParentUid(_ctx.stringValue("DescribeStressResponse.ParentUid"));
		describeStressResponse.setDesiredAgent(_ctx.longValue("DescribeStressResponse.DesiredAgent"));
		describeStressResponse.setAvailableAgent(_ctx.longValue("DescribeStressResponse.AvailableAgent"));
		describeStressResponse.setStatus(_ctx.stringValue("DescribeStressResponse.Status"));
		describeStressResponse.setReason(_ctx.stringValue("DescribeStressResponse.Reason"));
		describeStressResponse.setMessage(_ctx.stringValue("DescribeStressResponse.Message"));
		describeStressResponse.setDuration(_ctx.longValue("DescribeStressResponse.Duration"));
		describeStressResponse.setConfig(_ctx.stringValue("DescribeStressResponse.Config"));
		describeStressResponse.setCreateTime(_ctx.stringValue("DescribeStressResponse.CreateTime"));
		describeStressResponse.setUpdateTime(_ctx.stringValue("DescribeStressResponse.UpdateTime"));
	 
	 	return describeStressResponse;
	}
}