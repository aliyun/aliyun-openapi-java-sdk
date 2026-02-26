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

import com.aliyuncs.eas.model.v20210701.DescribeGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupResponseUnmarshaller {

	public static DescribeGroupResponse unmarshall(DescribeGroupResponse describeGroupResponse, UnmarshallerContext _ctx) {
		
		describeGroupResponse.setName(_ctx.stringValue("DescribeGroupResponse.Name"));
		describeGroupResponse.setClusterId(_ctx.stringValue("DescribeGroupResponse.ClusterId"));
		describeGroupResponse.setCreateTime(_ctx.stringValue("DescribeGroupResponse.CreateTime"));
		describeGroupResponse.setUpdateTime(_ctx.stringValue("DescribeGroupResponse.UpdateTime"));
		describeGroupResponse.setQueueService(_ctx.stringValue("DescribeGroupResponse.QueueService"));
		describeGroupResponse.setInternetEndpoint(_ctx.stringValue("DescribeGroupResponse.InternetEndpoint"));
		describeGroupResponse.setIntranetEndpoint(_ctx.stringValue("DescribeGroupResponse.IntranetEndpoint"));
		describeGroupResponse.setAccessToken(_ctx.stringValue("DescribeGroupResponse.AccessToken"));
	 
	 	return describeGroupResponse;
	}
}