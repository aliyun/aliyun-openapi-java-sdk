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
		listDBTaskSQLJobDetailResponse.setTotalCount(_ctx.longValue("ListDBTaskSQLJobDetailResponse.TotalCount"));
		listDBTaskSQLJobDetailResponse.setErrorCode(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.ErrorCode"));
		listDBTaskSQLJobDetailResponse.setErrorMessage(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.ErrorMessage"));
		listDBTaskSQLJobDetailResponse.setSuccess(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.Success"));

		List<DBTaskSQLJobDetail> dBTaskSQLJobDetailList = new ArrayList<DBTaskSQLJobDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList.Length"); i++) {
			DBTaskSQLJobDetail dBTaskSQLJobDetail = new DBTaskSQLJobDetail();
			dBTaskSQLJobDetail.setStatus(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Status"));
			dBTaskSQLJobDetail.setSkip(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Skip"));
			dBTaskSQLJobDetail.setDbId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].DbId"));
			dBTaskSQLJobDetail.setSqlType(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].SqlType"));
			dBTaskSQLJobDetail.setExecuteCount(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].ExecuteCount"));
			dBTaskSQLJobDetail.setLogic(_ctx.booleanValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].Logic"));
			dBTaskSQLJobDetail.setCurrentSql(_ctx.stringValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].CurrentSql"));
			dBTaskSQLJobDetail.setJobDetailId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].JobDetailId"));
			dBTaskSQLJobDetail.setJobId(_ctx.longValue("ListDBTaskSQLJobDetailResponse.DBTaskSQLJobDetailList["+ i +"].JobId"));

			dBTaskSQLJobDetailList.add(dBTaskSQLJobDetail);
		}
		listDBTaskSQLJobDetailResponse.setDBTaskSQLJobDetailList(dBTaskSQLJobDetailList);
	 
	 	return listDBTaskSQLJobDetailResponse;
	}
}