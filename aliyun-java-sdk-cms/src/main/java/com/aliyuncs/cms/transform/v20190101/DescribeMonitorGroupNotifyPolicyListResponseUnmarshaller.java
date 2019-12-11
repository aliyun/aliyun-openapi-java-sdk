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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupNotifyPolicyListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupNotifyPolicyListResponseUnmarshaller {

	public static DescribeMonitorGroupNotifyPolicyListResponse unmarshall(DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyListResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupNotifyPolicyListResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.RequestId"));
		describeMonitorGroupNotifyPolicyListResponse.setCode(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.Code"));
		describeMonitorGroupNotifyPolicyListResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.Message"));
		describeMonitorGroupNotifyPolicyListResponse.setSuccess(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.Success"));
		describeMonitorGroupNotifyPolicyListResponse.setTotal(_ctx.integerValue("DescribeMonitorGroupNotifyPolicyListResponse.Total"));

		List<NotifyPolicy> notifyPolicyList = new ArrayList<NotifyPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList.Length"); i++) {
			NotifyPolicy notifyPolicy = new NotifyPolicy();
			notifyPolicy.setType(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList["+ i +"].Type"));
			notifyPolicy.setId(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList["+ i +"].Id"));
			notifyPolicy.setStartTime(_ctx.longValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList["+ i +"].StartTime"));
			notifyPolicy.setEndTime(_ctx.longValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList["+ i +"].EndTime"));
			notifyPolicy.setGroupId(_ctx.stringValue("DescribeMonitorGroupNotifyPolicyListResponse.NotifyPolicyList["+ i +"].GroupId"));

			notifyPolicyList.add(notifyPolicy);
		}
		describeMonitorGroupNotifyPolicyListResponse.setNotifyPolicyList(notifyPolicyList);
	 
	 	return describeMonitorGroupNotifyPolicyListResponse;
	}
}