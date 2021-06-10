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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCronClearTaskDetailListResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCronClearTaskDetailListResponseUnmarshaller {

	public static GetDataCronClearTaskDetailListResponse unmarshall(GetDataCronClearTaskDetailListResponse getDataCronClearTaskDetailListResponse, UnmarshallerContext _ctx) {
		
		getDataCronClearTaskDetailListResponse.setRequestId(_ctx.stringValue("GetDataCronClearTaskDetailListResponse.RequestId"));
		getDataCronClearTaskDetailListResponse.setSuccess(_ctx.booleanValue("GetDataCronClearTaskDetailListResponse.Success"));
		getDataCronClearTaskDetailListResponse.setErrorMessage(_ctx.stringValue("GetDataCronClearTaskDetailListResponse.ErrorMessage"));
		getDataCronClearTaskDetailListResponse.setErrorCode(_ctx.stringValue("GetDataCronClearTaskDetailListResponse.ErrorCode"));
		getDataCronClearTaskDetailListResponse.setTotalCount(_ctx.longValue("GetDataCronClearTaskDetailListResponse.TotalCount"));

		List<DataCronClearTaskDetail> dataCronClearTaskDetailList = new ArrayList<DataCronClearTaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetailList.Length"); i++) {
			DataCronClearTaskDetail dataCronClearTaskDetail = new DataCronClearTaskDetail();
			dataCronClearTaskDetail.setDBTaskGroupId(_ctx.longValue("GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetailList["+ i +"].DBTaskGroupId"));
			dataCronClearTaskDetail.setJobStatus(_ctx.stringValue("GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetailList["+ i +"].jobStatus"));
			dataCronClearTaskDetail.setActualAffectRows(_ctx.longValue("GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetailList["+ i +"].ActualAffectRows"));
			dataCronClearTaskDetail.setCreateTime(_ctx.stringValue("GetDataCronClearTaskDetailListResponse.DataCronClearTaskDetailList["+ i +"].CreateTime"));

			dataCronClearTaskDetailList.add(dataCronClearTaskDetail);
		}
		getDataCronClearTaskDetailListResponse.setDataCronClearTaskDetailList(dataCronClearTaskDetailList);
	 
	 	return getDataCronClearTaskDetailListResponse;
	}
}