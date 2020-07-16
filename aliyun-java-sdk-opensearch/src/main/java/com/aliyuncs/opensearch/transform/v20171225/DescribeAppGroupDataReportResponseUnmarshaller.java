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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupDataReportResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupDataReportResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupDataReportResponse.Result.ReceivedSampleItem;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupDataReportResponse.Result.ReceivedSampleItem.Message;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppGroupDataReportResponseUnmarshaller {

	public static DescribeAppGroupDataReportResponse unmarshall(DescribeAppGroupDataReportResponse describeAppGroupDataReportResponse, UnmarshallerContext _ctx) {
		
		describeAppGroupDataReportResponse.setRequestId(_ctx.stringValue("DescribeAppGroupDataReportResponse.requestId"));

		Result result = new Result();
		result.setReceivedCount(_ctx.integerValue("DescribeAppGroupDataReportResponse.result.receivedCount"));

		List<ReceivedSampleItem> receivedSample = new ArrayList<ReceivedSampleItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppGroupDataReportResponse.result.receivedSample.Length"); i++) {
			ReceivedSampleItem receivedSampleItem = new ReceivedSampleItem();
			receivedSampleItem.setReceivedTimeMs(_ctx.longValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].receivedTimeMs"));

			Message message = new Message();
			message.setClientIp(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.clientIp"));
			message.setArg3(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.arg3"));
			message.setUserId(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.userId"));
			message.setArgs(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.args"));
			message.setArg1(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.arg1"));
			message.setSdkType(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.sdkType"));
			message.setSessionId(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.sessionId"));
			message.setEventId(_ctx.integerValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.eventId"));
			message.setSdkVersion(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.sdkVersion"));
			message.setPage(_ctx.stringValue("DescribeAppGroupDataReportResponse.result.receivedSample["+ i +"].message.page"));
			receivedSampleItem.setMessage(message);

			receivedSample.add(receivedSampleItem);
		}
		result.setReceivedSample(receivedSample);
		describeAppGroupDataReportResponse.setResult(result);
	 
	 	return describeAppGroupDataReportResponse;
	}
}