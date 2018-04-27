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

import com.aliyuncs.imm.model.v20170906.GetConvertOfficeFormatTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConvertOfficeFormatTaskResponseUnmarshaller {

	public static GetConvertOfficeFormatTaskResponse unmarshall(GetConvertOfficeFormatTaskResponse getConvertOfficeFormatTaskResponse, UnmarshallerContext context) {
		
		getConvertOfficeFormatTaskResponse.setRequestId(context.stringValue("GetConvertOfficeFormatTaskResponse.RequestId"));
		getConvertOfficeFormatTaskResponse.setTgtType(context.stringValue("GetConvertOfficeFormatTaskResponse.TgtType"));
		getConvertOfficeFormatTaskResponse.setStatus(context.stringValue("GetConvertOfficeFormatTaskResponse.Status"));
		getConvertOfficeFormatTaskResponse.setPercent(context.integerValue("GetConvertOfficeFormatTaskResponse.Percent"));
		getConvertOfficeFormatTaskResponse.setPageCount(context.integerValue("GetConvertOfficeFormatTaskResponse.PageCount"));
		getConvertOfficeFormatTaskResponse.setTaskId(context.stringValue("GetConvertOfficeFormatTaskResponse.TaskId"));
		getConvertOfficeFormatTaskResponse.setTgtUri(context.stringValue("GetConvertOfficeFormatTaskResponse.TgtUri"));
		getConvertOfficeFormatTaskResponse.setImageSpec(context.stringValue("GetConvertOfficeFormatTaskResponse.ImageSpec"));
		getConvertOfficeFormatTaskResponse.setNotifyTopicName(context.stringValue("GetConvertOfficeFormatTaskResponse.NotifyTopicName"));
		getConvertOfficeFormatTaskResponse.setNotifyEndpoint(context.stringValue("GetConvertOfficeFormatTaskResponse.NotifyEndpoint"));
		getConvertOfficeFormatTaskResponse.setExternalID(context.stringValue("GetConvertOfficeFormatTaskResponse.ExternalID"));
		getConvertOfficeFormatTaskResponse.setCreateTime(context.stringValue("GetConvertOfficeFormatTaskResponse.CreateTime"));
		getConvertOfficeFormatTaskResponse.setFinishTime(context.stringValue("GetConvertOfficeFormatTaskResponse.FinishTime"));
		getConvertOfficeFormatTaskResponse.setSrcUri(context.stringValue("GetConvertOfficeFormatTaskResponse.SrcUri"));
	 
	 	return getConvertOfficeFormatTaskResponse;
	}
}