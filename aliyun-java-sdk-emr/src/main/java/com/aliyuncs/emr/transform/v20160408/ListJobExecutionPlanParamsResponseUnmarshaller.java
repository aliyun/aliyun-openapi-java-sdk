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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanParamsResponse;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanParamsResponse.ParamInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionPlanParamsResponseUnmarshaller {

	public static ListJobExecutionPlanParamsResponse unmarshall(ListJobExecutionPlanParamsResponse listJobExecutionPlanParamsResponse, UnmarshallerContext _ctx) {
		
		listJobExecutionPlanParamsResponse.setRequestId(_ctx.stringValue("ListJobExecutionPlanParamsResponse.RequestId"));
		listJobExecutionPlanParamsResponse.setSuccess(_ctx.stringValue("ListJobExecutionPlanParamsResponse.Success"));
		listJobExecutionPlanParamsResponse.setErrCode(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ErrCode"));
		listJobExecutionPlanParamsResponse.setErrMsg(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ErrMsg"));

		List<ParamInfo> paramInfoList = new ArrayList<ParamInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobExecutionPlanParamsResponse.ParamInfoList.Length"); i++) {
			ParamInfo paramInfo = new ParamInfo();
			paramInfo.setParamBizType(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].ParamBizType"));
			paramInfo.setRelateId(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].RelateId"));
			paramInfo.setParamName(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].ParamName"));
			paramInfo.setParamValue(_ctx.stringValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].ParamValue"));
			paramInfo.setUtcCreateTimestamp(_ctx.longValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].UtcCreateTimestamp"));
			paramInfo.setUtcModifiedTimestamp(_ctx.longValue("ListJobExecutionPlanParamsResponse.ParamInfoList["+ i +"].UtcModifiedTimestamp"));

			paramInfoList.add(paramInfo);
		}
		listJobExecutionPlanParamsResponse.setParamInfoList(paramInfoList);
	 
	 	return listJobExecutionPlanParamsResponse;
	}
}