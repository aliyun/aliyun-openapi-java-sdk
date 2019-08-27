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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.DescribeUserDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserDataResponseUnmarshaller {

	public static DescribeUserDataResponse unmarshall(DescribeUserDataResponse describeUserDataResponse, UnmarshallerContext _ctx) {
		
		describeUserDataResponse.setRequestId(_ctx.stringValue("DescribeUserDataResponse.RequestId"));
		describeUserDataResponse.setRegionId(_ctx.stringValue("DescribeUserDataResponse.RegionId"));
		describeUserDataResponse.setInstanceId(_ctx.stringValue("DescribeUserDataResponse.InstanceId"));
		describeUserDataResponse.setUserData(_ctx.stringValue("DescribeUserDataResponse.UserData"));
	 
	 	return describeUserDataResponse;
	}
}