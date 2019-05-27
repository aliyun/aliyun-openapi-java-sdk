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

import com.aliyuncs.imm.model.v20170906.GetOfficeConversionTaskResponse;
import com.aliyuncs.imm.model.v20170906.GetOfficeConversionTaskResponse.FailDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOfficeConversionTaskResponseUnmarshaller {

	public static GetOfficeConversionTaskResponse unmarshall(GetOfficeConversionTaskResponse getOfficeConversionTaskResponse, UnmarshallerContext context) {
		
		getOfficeConversionTaskResponse.setRequestId(context.stringValue("GetOfficeConversionTaskResponse.RequestId"));
		getOfficeConversionTaskResponse.setTgtType(context.stringValue("GetOfficeConversionTaskResponse.TgtType"));
		getOfficeConversionTaskResponse.setStatus(context.stringValue("GetOfficeConversionTaskResponse.Status"));
		getOfficeConversionTaskResponse.setPercent(context.integerValue("GetOfficeConversionTaskResponse.Percent"));
		getOfficeConversionTaskResponse.setPageCount(context.integerValue("GetOfficeConversionTaskResponse.PageCount"));
		getOfficeConversionTaskResponse.setTaskId(context.stringValue("GetOfficeConversionTaskResponse.TaskId"));
		getOfficeConversionTaskResponse.setTgtUri(context.stringValue("GetOfficeConversionTaskResponse.TgtUri"));
		getOfficeConversionTaskResponse.setImageSpec(context.stringValue("GetOfficeConversionTaskResponse.ImageSpec"));
		getOfficeConversionTaskResponse.setNotifyTopicName(context.stringValue("GetOfficeConversionTaskResponse.NotifyTopicName"));
		getOfficeConversionTaskResponse.setNotifyEndpoint(context.stringValue("GetOfficeConversionTaskResponse.NotifyEndpoint"));
		getOfficeConversionTaskResponse.setExternalID(context.stringValue("GetOfficeConversionTaskResponse.ExternalID"));
		getOfficeConversionTaskResponse.setCreateTime(context.stringValue("GetOfficeConversionTaskResponse.CreateTime"));
		getOfficeConversionTaskResponse.setFinishTime(context.stringValue("GetOfficeConversionTaskResponse.FinishTime"));
		getOfficeConversionTaskResponse.setSrcUri(context.stringValue("GetOfficeConversionTaskResponse.SrcUri"));

		FailDetail failDetail = new FailDetail();
		failDetail.setCode(context.stringValue("GetOfficeConversionTaskResponse.FailDetail.Code"));
		getOfficeConversionTaskResponse.setFailDetail(failDetail);
	 
	 	return getOfficeConversionTaskResponse;
	}
}