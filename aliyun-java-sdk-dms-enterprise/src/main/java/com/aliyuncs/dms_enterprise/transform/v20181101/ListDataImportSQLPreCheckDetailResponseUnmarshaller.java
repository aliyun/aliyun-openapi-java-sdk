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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataImportSQLPreCheckDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataImportSQLPreCheckDetailResponseUnmarshaller {

	public static ListDataImportSQLPreCheckDetailResponse unmarshall(ListDataImportSQLPreCheckDetailResponse listDataImportSQLPreCheckDetailResponse, UnmarshallerContext _ctx) {
		
		listDataImportSQLPreCheckDetailResponse.setRequestId(_ctx.stringValue("ListDataImportSQLPreCheckDetailResponse.RequestId"));
		listDataImportSQLPreCheckDetailResponse.setSuccess(_ctx.booleanValue("ListDataImportSQLPreCheckDetailResponse.Success"));
		listDataImportSQLPreCheckDetailResponse.setErrorMessage(_ctx.stringValue("ListDataImportSQLPreCheckDetailResponse.ErrorMessage"));
		listDataImportSQLPreCheckDetailResponse.setErrorCode(_ctx.stringValue("ListDataImportSQLPreCheckDetailResponse.ErrorCode"));
		listDataImportSQLPreCheckDetailResponse.setTotalCount(_ctx.longValue("ListDataImportSQLPreCheckDetailResponse.TotalCount"));

		List<PreCheckSQLDetail> preCheckSQLDetailList = new ArrayList<PreCheckSQLDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetailList.Length"); i++) {
			PreCheckSQLDetail preCheckSQLDetail = new PreCheckSQLDetail();
			preCheckSQLDetail.setSqlId(_ctx.longValue("ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetailList["+ i +"].SqlId"));
			preCheckSQLDetail.setSqlType(_ctx.stringValue("ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetailList["+ i +"].SqlType"));
			preCheckSQLDetail.setStatusCode(_ctx.stringValue("ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetailList["+ i +"].StatusCode"));
			preCheckSQLDetail.setSkip(_ctx.booleanValue("ListDataImportSQLPreCheckDetailResponse.PreCheckSQLDetailList["+ i +"].Skip"));

			preCheckSQLDetailList.add(preCheckSQLDetail);
		}
		listDataImportSQLPreCheckDetailResponse.setPreCheckSQLDetailList(preCheckSQLDetailList);
	 
	 	return listDataImportSQLPreCheckDetailResponse;
	}
}