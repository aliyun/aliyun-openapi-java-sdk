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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventDisposeResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventDisposeResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeEventDisposeResponse.Data.ReceiverInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventDisposeResponseUnmarshaller {

	public static DescribeEventDisposeResponse unmarshall(DescribeEventDisposeResponse describeEventDisposeResponse, UnmarshallerContext _ctx) {
		
		describeEventDisposeResponse.setRequestId(_ctx.stringValue("DescribeEventDisposeResponse.RequestId"));
		describeEventDisposeResponse.setSuccess(_ctx.booleanValue("DescribeEventDisposeResponse.Success"));
		describeEventDisposeResponse.setCode(_ctx.integerValue("DescribeEventDisposeResponse.Code"));
		describeEventDisposeResponse.setMessage(_ctx.stringValue("DescribeEventDisposeResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("DescribeEventDisposeResponse.Data.Status"));
		data.setRemark(_ctx.stringValue("DescribeEventDisposeResponse.Data.Remark"));

		List<String> eventDispose = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventDisposeResponse.Data.EventDispose.Length"); i++) {
			eventDispose.add(_ctx.stringValue("DescribeEventDisposeResponse.Data.EventDispose["+ i +"]"));
		}
		data.setEventDispose(eventDispose);

		ReceiverInfo receiverInfo = new ReceiverInfo();
		receiverInfo.setId(_ctx.longValue("DescribeEventDisposeResponse.Data.ReceiverInfo.Id"));
		receiverInfo.setGmtCreate(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.GmtCreate"));
		receiverInfo.setGmtModified(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.GmtModified"));
		receiverInfo.setIncidentUuid(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.IncidentUuid"));
		receiverInfo.setMessageTitle(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.MessageTitle"));
		receiverInfo.setReceiver(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.Receiver"));
		receiverInfo.setChannel(_ctx.stringValue("DescribeEventDisposeResponse.Data.ReceiverInfo.Channel"));
		receiverInfo.setStatus(_ctx.integerValue("DescribeEventDisposeResponse.Data.ReceiverInfo.Status"));
		data.setReceiverInfo(receiverInfo);
		describeEventDisposeResponse.setData(data);
	 
	 	return describeEventDisposeResponse;
	}
}