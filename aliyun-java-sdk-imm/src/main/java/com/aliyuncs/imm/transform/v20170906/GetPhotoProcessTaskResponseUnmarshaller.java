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

	public static GetPhotoProcessTaskResponse unmarshall(GetPhotoProcessTaskResponse getPhotoProcessTaskResponse, UnmarshallerContext _ctx) {
		
		getPhotoProcessTaskResponse.setRequestId(_ctx.stringValue("GetPhotoProcessTaskResponse.RequestId"));
		getPhotoProcessTaskResponse.setTaskId(_ctx.stringValue("GetPhotoProcessTaskResponse.TaskId"));
		getPhotoProcessTaskResponse.setStatus(_ctx.stringValue("GetPhotoProcessTaskResponse.Status"));
		getPhotoProcessTaskResponse.setSrcUri(_ctx.stringValue("GetPhotoProcessTaskResponse.SrcUri"));
		getPhotoProcessTaskResponse.setTgtUri(_ctx.stringValue("GetPhotoProcessTaskResponse.TgtUri"));
		getPhotoProcessTaskResponse.setStyle(_ctx.stringValue("GetPhotoProcessTaskResponse.Style"));
		getPhotoProcessTaskResponse.setNotifyTopicName(_ctx.stringValue("GetPhotoProcessTaskResponse.NotifyTopicName"));
		getPhotoProcessTaskResponse.setNotifyEndpoint(_ctx.stringValue("GetPhotoProcessTaskResponse.NotifyEndpoint"));
		getPhotoProcessTaskResponse.setExternalID(_ctx.stringValue("GetPhotoProcessTaskResponse.ExternalID"));
		getPhotoProcessTaskResponse.setCreateTime(_ctx.stringValue("GetPhotoProcessTaskResponse.CreateTime"));
		getPhotoProcessTaskResponse.setFinishTime(_ctx.stringValue("GetPhotoProcessTaskResponse.FinishTime"));
		getPhotoProcessTaskResponse.setPercent(_ctx.integerValue("GetPhotoProcessTaskResponse.Percent"));
	 
	 	return getPhotoProcessTaskResponse;
	}
}