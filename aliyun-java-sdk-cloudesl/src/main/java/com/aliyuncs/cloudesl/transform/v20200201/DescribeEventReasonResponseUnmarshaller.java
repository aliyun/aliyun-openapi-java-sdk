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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeEventReasonResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeEventReasonResponse.EventReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventReasonResponseUnmarshaller {

	public static DescribeEventReasonResponse unmarshall(DescribeEventReasonResponse describeEventReasonResponse, UnmarshallerContext _ctx) {
		
		describeEventReasonResponse.setRequestId(_ctx.stringValue("DescribeEventReasonResponse.RequestId"));
		describeEventReasonResponse.setSuccess(_ctx.booleanValue("DescribeEventReasonResponse.Success"));
		describeEventReasonResponse.setMessage(_ctx.stringValue("DescribeEventReasonResponse.Message"));
		describeEventReasonResponse.setErrorCode(_ctx.stringValue("DescribeEventReasonResponse.ErrorCode"));
		describeEventReasonResponse.setErrorMessage(_ctx.stringValue("DescribeEventReasonResponse.ErrorMessage"));
		describeEventReasonResponse.setCode(_ctx.stringValue("DescribeEventReasonResponse.Code"));
		describeEventReasonResponse.setDynamicCode(_ctx.stringValue("DescribeEventReasonResponse.DynamicCode"));
		describeEventReasonResponse.setDynamicMessage(_ctx.stringValue("DescribeEventReasonResponse.DynamicMessage"));

		List<EventReason> eventReasons = new ArrayList<EventReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventReasonResponse.EventReasons.Length"); i++) {
			EventReason eventReason = new EventReason();
			eventReason.setCategory(_ctx.stringValue("DescribeEventReasonResponse.EventReasons["+ i +"].Category"));

			List<String> reasons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventReasonResponse.EventReasons["+ i +"].Reasons.Length"); j++) {
				reasons.add(_ctx.stringValue("DescribeEventReasonResponse.EventReasons["+ i +"].Reasons["+ j +"]"));
			}
			eventReason.setReasons(reasons);

			List<String> reasonI18ns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventReasonResponse.EventReasons["+ i +"].ReasonI18ns.Length"); j++) {
				reasonI18ns.add(_ctx.stringValue("DescribeEventReasonResponse.EventReasons["+ i +"].ReasonI18ns["+ j +"]"));
			}
			eventReason.setReasonI18ns(reasonI18ns);

			eventReasons.add(eventReason);
		}
		describeEventReasonResponse.setEventReasons(eventReasons);
	 
	 	return describeEventReasonResponse;
	}
}