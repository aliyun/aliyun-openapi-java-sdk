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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeMessageResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeMessageResponse.Message;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMessageResponseUnmarshaller {

	public static DescribeMessageResponse unmarshall(DescribeMessageResponse describeMessageResponse, UnmarshallerContext _ctx) {
		
		describeMessageResponse.setRequestId(_ctx.stringValue("DescribeMessageResponse.RequestId"));

		Message message = new Message();
		message.setId(_ctx.longValue("DescribeMessageResponse.Message.Id"));
		message.setProjectId(_ctx.stringValue("DescribeMessageResponse.Message.ProjectId"));
		message.setAppName(_ctx.stringValue("DescribeMessageResponse.Message.AppName"));
		message.setAppKey(_ctx.stringValue("DescribeMessageResponse.Message.AppKey"));
		message.setType(_ctx.integerValue("DescribeMessageResponse.Message.Type"));
		message.setSendStatus(_ctx.integerValue("DescribeMessageResponse.Message.SendStatus"));
		message.setTitle(_ctx.stringValue("DescribeMessageResponse.Message.Title"));
		message.setDesc(_ctx.stringValue("DescribeMessageResponse.Message.Desc"));
		message.setAction(_ctx.stringValue("DescribeMessageResponse.Message.Action"));
		message.setUri(_ctx.stringValue("DescribeMessageResponse.Message.Uri"));
		message.setParameter(_ctx.stringValue("DescribeMessageResponse.Message.Parameter"));
		message.setPredictSendCnt(_ctx.integerValue("DescribeMessageResponse.Message.PredictSendCnt"));
		message.setAckCnt(_ctx.integerValue("DescribeMessageResponse.Message.AckCnt"));
		message.setGmtCreateTime(_ctx.longValue("DescribeMessageResponse.Message.GmtCreateTime"));
		message.setExipiredTime(_ctx.longValue("DescribeMessageResponse.Message.ExipiredTime"));
		message.setAudit(_ctx.integerValue("DescribeMessageResponse.Message.Audit"));
		message.setAuditMsg(_ctx.stringValue("DescribeMessageResponse.Message.AuditMsg"));
		describeMessageResponse.setMessage(message);
	 
	 	return describeMessageResponse;
	}
}