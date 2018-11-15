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

package com.aliyuncs.chatbot.transform.v20171011;

import com.aliyuncs.chatbot.model.v20171011.DescribeDialogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDialogResponseUnmarshaller {

	public static DescribeDialogResponse unmarshall(DescribeDialogResponse describeDialogResponse, UnmarshallerContext context) {
		
		describeDialogResponse.setRequestId(context.stringValue("DescribeDialogResponse.RequestId"));
		describeDialogResponse.setDialogId(context.longValue("DescribeDialogResponse.DialogId"));
		describeDialogResponse.setDialogName(context.stringValue("DescribeDialogResponse.DialogName"));
		describeDialogResponse.setDescription(context.stringValue("DescribeDialogResponse.Description"));
		describeDialogResponse.setCreateTime(context.stringValue("DescribeDialogResponse.CreateTime"));
		describeDialogResponse.setModifyTime(context.stringValue("DescribeDialogResponse.ModifyTime"));
		describeDialogResponse.setCreateUserId(context.stringValue("DescribeDialogResponse.CreateUserId"));
		describeDialogResponse.setCreateUserName(context.stringValue("DescribeDialogResponse.CreateUserName"));
		describeDialogResponse.setModifyUserId(context.stringValue("DescribeDialogResponse.ModifyUserId"));
		describeDialogResponse.setModifyUserName(context.stringValue("DescribeDialogResponse.ModifyUserName"));
		describeDialogResponse.setIsSampleDialog(context.booleanValue("DescribeDialogResponse.IsSampleDialog"));
		describeDialogResponse.setStatus(context.integerValue("DescribeDialogResponse.Status"));
		describeDialogResponse.setIsOnline(context.booleanValue("DescribeDialogResponse.IsOnline"));
	 
	 	return describeDialogResponse;
	}
}