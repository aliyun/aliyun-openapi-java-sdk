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
package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetPhotoProcessTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhotoProcessTaskResponseUnmarshaller {

	public static GetPhotoProcessTaskResponse unmarshall(GetPhotoProcessTaskResponse getPhotoProcessTaskResponse, UnmarshallerContext context) {
		
		getPhotoProcessTaskResponse.setRequestId(context.stringValue("GetPhotoProcessTaskResponse.RequestId"));
		getPhotoProcessTaskResponse.setTaskId(context.stringValue("GetPhotoProcessTaskResponse.TaskId"));
		getPhotoProcessTaskResponse.setStatus(context.stringValue("GetPhotoProcessTaskResponse.Status"));
		getPhotoProcessTaskResponse.setSrcUri(context.stringValue("GetPhotoProcessTaskResponse.SrcUri"));
		getPhotoProcessTaskResponse.setTgtUri(context.stringValue("GetPhotoProcessTaskResponse.TgtUri"));
		getPhotoProcessTaskResponse.setStyle(context.stringValue("GetPhotoProcessTaskResponse.Style"));
		getPhotoProcessTaskResponse.setNotifyTopicName(context.stringValue("GetPhotoProcessTaskResponse.NotifyTopicName"));
		getPhotoProcessTaskResponse.setNotifyEndpoint(context.stringValue("GetPhotoProcessTaskResponse.NotifyEndpoint"));
		getPhotoProcessTaskResponse.setExternalID(context.stringValue("GetPhotoProcessTaskResponse.ExternalID"));
		getPhotoProcessTaskResponse.setCreateTime(context.stringValue("GetPhotoProcessTaskResponse.CreateTime"));
		getPhotoProcessTaskResponse.setFinishTime(context.stringValue("GetPhotoProcessTaskResponse.FinishTime"));
		getPhotoProcessTaskResponse.setPercent(context.integerValue("GetPhotoProcessTaskResponse.Percent"));
	 
	 	return getPhotoProcessTaskResponse;
	}
}