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

import com.aliyuncs.cloudesl.model.v20200201.DescribeEventsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeEventsResponse.EventInfoVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext _ctx) {
		
		describeEventsResponse.setRequestId(_ctx.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setErrorMessage(_ctx.stringValue("DescribeEventsResponse.ErrorMessage"));
		describeEventsResponse.setSuccess(_ctx.booleanValue("DescribeEventsResponse.Success"));
		describeEventsResponse.setErrorCode(_ctx.stringValue("DescribeEventsResponse.ErrorCode"));
		describeEventsResponse.setCode(_ctx.stringValue("DescribeEventsResponse.Code"));
		describeEventsResponse.setMessage(_ctx.stringValue("DescribeEventsResponse.Message"));
		describeEventsResponse.setDynamicMessage(_ctx.stringValue("DescribeEventsResponse.DynamicMessage"));
		describeEventsResponse.setDynamicCode(_ctx.stringValue("DescribeEventsResponse.DynamicCode"));
		describeEventsResponse.setTotalCount(_ctx.integerValue("DescribeEventsResponse.TotalCount"));
		describeEventsResponse.setPageSize(_ctx.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setPageNumber(_ctx.integerValue("DescribeEventsResponse.PageNumber"));

		List<EventInfoVO> items = new ArrayList<EventInfoVO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventsResponse.Items.Length"); i++) {
			EventInfoVO eventInfoVO = new EventInfoVO();
			eventInfoVO.setEventId(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].EventId"));
			eventInfoVO.setEventTime(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].EventTime"));
			eventInfoVO.setCategory(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].Category"));
			eventInfoVO.setEslBarCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].EslBarCode"));
			eventInfoVO.setApMac(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ApMac"));
			eventInfoVO.setStoreId(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].StoreId"));
			eventInfoVO.setItemBarCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ItemBarCode"));
			eventInfoVO.setItemId(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ItemId"));
			eventInfoVO.setItemTitle(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ItemTitle"));
			eventInfoVO.setContent(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].Content"));
			eventInfoVO.setStatus(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].Status"));
			eventInfoVO.setStaff(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].Staff"));
			eventInfoVO.setProcessTime(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ProcessTime"));
			eventInfoVO.setReason(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].Reason"));

			items.add(eventInfoVO);
		}
		describeEventsResponse.setItems(items);
	 
	 	return describeEventsResponse;
	}
}