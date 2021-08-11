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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDBTaskSQLJobDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDBTaskSQLJobDetailResponseUnmarshaller {

	public static ListDBTaskSQLJobDetailResponse unmarshall(ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetailResponse, UnmarshallerContext _ctx) {
		
		listDBTaskSQLJobDetailResponse.setRequestId(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.RequestId"));
		listDBTaskSQLJobDetailResponse.setSuccess(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.Success"));
		listDBTaskSQLJobDetailResponse.setErrorMessage(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.ErrorMessage"));
		listDBTaskSQLJobDetailResponse.setErrorCode(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.ErrorCode"));
		listDBTaskSQLJobDetailResponse.setTotalCount(_ctx.longValue("ListDBTaskSQLJobDetailResponse.TotalCount"));

		List<DBTaskSQLJobDetail> dBTaskSQLJobDetailList = new ArrayList<DBTaskSQLJobDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList.Length"); i++) {
			DBTaskSQLJobDetail dBTaskSQLJobDetail = new DBTaskSQLJobDetail();
			dBTaskSQLJobDetail.setJobDetailId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].JobDetailId"));
			dBTaskSQLJobDetail.setCurrentSql(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].CurrentSql"));
			dBTaskSQLJobDetail.setExecuteCount(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].ExecuteCount"));
			dBTaskSQLJobDetail.setJobId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].JobId"));
			dBTaskSQLJobDetail.setDbId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].DbId"));
			dBTaskSQLJobDetail.setLogic(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Logic"));
			dBTaskSQLJobDetail.setSkip(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Skip"));
			dBTaskSQLJobDetail.setSqlType(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].SqlType"));
			dBTaskSQLJobDetail.setStatus(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Status"));

			dBTaskSQLJobDetailList.add(dBTaskSQLJobDetail);
		}
		listDBTaskSQLJobDetailResponse.setDBTaskSQLJobDetailList(dBTaskSQLJobDetailList);
	 
	 	return listDBTaskSQLJobDetailResponse;
	}
}