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

	public static GetOfficeConversionTaskResponse unmarshall(GetOfficeConversionTaskResponse getOfficeConversionTaskResponse, UnmarshallerContext _ctx) {
		
		getOfficeConversionTaskResponse.setRequestId(_ctx.stringValue("GetOfficeConversionTaskResponse.RequestId"));
		getOfficeConversionTaskResponse.setTgtType(_ctx.stringValue("GetOfficeConversionTaskResponse.TgtType"));
		getOfficeConversionTaskResponse.setStatus(_ctx.stringValue("GetOfficeConversionTaskResponse.Status"));
		getOfficeConversionTaskResponse.setPercent(_ctx.integerValue("GetOfficeConversionTaskResponse.Percent"));
		getOfficeConversionTaskResponse.setPageCount(_ctx.integerValue("GetOfficeConversionTaskResponse.PageCount"));
		getOfficeConversionTaskResponse.setTaskId(_ctx.stringValue("GetOfficeConversionTaskResponse.TaskId"));
		getOfficeConversionTaskResponse.setTgtUri(_ctx.stringValue("GetOfficeConversionTaskResponse.TgtUri"));
		getOfficeConversionTaskResponse.setImageSpec(_ctx.stringValue("GetOfficeConversionTaskResponse.ImageSpec"));
		getOfficeConversionTaskResponse.setNotifyTopicName(_ctx.stringValue("GetOfficeConversionTaskResponse.NotifyTopicName"));
		getOfficeConversionTaskResponse.setNotifyEndpoint(_ctx.stringValue("GetOfficeConversionTaskResponse.NotifyEndpoint"));
		getOfficeConversionTaskResponse.setExternalID(_ctx.stringValue("GetOfficeConversionTaskResponse.ExternalID"));
		getOfficeConversionTaskResponse.setCreateTime(_ctx.stringValue("GetOfficeConversionTaskResponse.CreateTime"));
		getOfficeConversionTaskResponse.setFinishTime(_ctx.stringValue("GetOfficeConversionTaskResponse.FinishTime"));
		getOfficeConversionTaskResponse.setSrcUri(_ctx.stringValue("GetOfficeConversionTaskResponse.SrcUri"));

		FailDetail failDetail = new FailDetail();
		failDetail.setCode(_ctx.stringValue("GetOfficeConversionTaskResponse.FailDetail.Code"));
		getOfficeConversionTaskResponse.setFailDetail(failDetail);
	 
	 	return getOfficeConversionTaskResponse;
	}
}