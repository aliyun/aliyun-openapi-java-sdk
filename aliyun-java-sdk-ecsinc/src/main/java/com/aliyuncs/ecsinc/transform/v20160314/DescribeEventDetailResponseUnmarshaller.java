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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.DescribeEventDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventDetailResponseUnmarshaller {

	public static DescribeEventDetailResponse unmarshall(DescribeEventDetailResponse describeEventDetailResponse, UnmarshallerContext context) {
		
		describeEventDetailResponse.setRequestId(context.stringValue("DescribeEventDetailResponse.RequestId"));
		describeEventDetailResponse.setResourceId(context.stringValue("DescribeEventDetailResponse.ResourceId"));
		describeEventDetailResponse.setEventType(context.stringValue("DescribeEventDetailResponse.EventType"));
		describeEventDetailResponse.setEventCategory(context.stringValue("DescribeEventDetailResponse.EventCategory"));
		describeEventDetailResponse.setStatus(context.stringValue("DescribeEventDetailResponse.Status"));
		describeEventDetailResponse.setSupportModify(context.stringValue("DescribeEventDetailResponse.SupportModify"));
		describeEventDetailResponse.setPlanTime(context.stringValue("DescribeEventDetailResponse.PlanTime"));
		describeEventDetailResponse.setExpireTime(context.stringValue("DescribeEventDetailResponse.ExpireTime"));
		describeEventDetailResponse.setEventId(context.stringValue("DescribeEventDetailResponse.EventId"));
		describeEventDetailResponse.setStartTime(context.stringValue("DescribeEventDetailResponse.StartTime"));
		describeEventDetailResponse.setEndTime(context.stringValue("DescribeEventDetailResponse.EndTime"));
		describeEventDetailResponse.setEffectTime(context.stringValue("DescribeEventDetailResponse.EffectTime"));
		describeEventDetailResponse.setLimitTime(context.stringValue("DescribeEventDetailResponse.LimitTime"));
		describeEventDetailResponse.setMark(context.stringValue("DescribeEventDetailResponse.Mark"));
	 
	 	return describeEventDetailResponse;
	}
}