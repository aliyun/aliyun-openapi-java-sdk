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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectTaskDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectTaskDetailResponse.DataCorrectTaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCorrectTaskDetailResponseUnmarshaller {

	public static GetDataCorrectTaskDetailResponse unmarshall(GetDataCorrectTaskDetailResponse getDataCorrectTaskDetailResponse, UnmarshallerContext _ctx) {
		
		getDataCorrectTaskDetailResponse.setRequestId(_ctx.stringValue("GetDataCorrectTaskDetailResponse.RequestId"));
		getDataCorrectTaskDetailResponse.setSuccess(_ctx.booleanValue("GetDataCorrectTaskDetailResponse.Success"));
		getDataCorrectTaskDetailResponse.setErrorMessage(_ctx.stringValue("GetDataCorrectTaskDetailResponse.ErrorMessage"));
		getDataCorrectTaskDetailResponse.setErrorCode(_ctx.stringValue("GetDataCorrectTaskDetailResponse.ErrorCode"));

		DataCorrectTaskDetail dataCorrectTaskDetail = new DataCorrectTaskDetail();
		dataCorrectTaskDetail.setDBTaskGroupId(_ctx.longValue("GetDataCorrectTaskDetailResponse.DataCorrectTaskDetail.DBTaskGroupId"));
		dataCorrectTaskDetail.setJobStatus(_ctx.stringValue("GetDataCorrectTaskDetailResponse.DataCorrectTaskDetail.jobStatus"));
		dataCorrectTaskDetail.setActualAffectRows(_ctx.longValue("GetDataCorrectTaskDetailResponse.DataCorrectTaskDetail.ActualAffectRows"));
		dataCorrectTaskDetail.setCreateTime(_ctx.stringValue("GetDataCorrectTaskDetailResponse.DataCorrectTaskDetail.CreateTime"));
		getDataCorrectTaskDetailResponse.setDataCorrectTaskDetail(dataCorrectTaskDetail);
	 
	 	return getDataCorrectTaskDetailResponse;
	}
}