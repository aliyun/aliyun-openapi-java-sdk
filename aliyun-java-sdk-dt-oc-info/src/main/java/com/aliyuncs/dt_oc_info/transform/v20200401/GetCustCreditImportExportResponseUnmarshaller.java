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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetCustCreditImportExportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustCreditImportExportResponseUnmarshaller {

	public static GetCustCreditImportExportResponse unmarshall(GetCustCreditImportExportResponse getCustCreditImportExportResponse, UnmarshallerContext _ctx) {
		
		getCustCreditImportExportResponse.setRequestId(_ctx.stringValue("GetCustCreditImportExportResponse.RequestId"));
		getCustCreditImportExportResponse.setCode(_ctx.integerValue("GetCustCreditImportExportResponse.Code"));
		getCustCreditImportExportResponse.setMessage(_ctx.stringValue("GetCustCreditImportExportResponse.Message"));
		getCustCreditImportExportResponse.setTotal(_ctx.integerValue("GetCustCreditImportExportResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCustCreditImportExportResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetCustCreditImportExportResponse.Data["+ i +"]"));
		}
		getCustCreditImportExportResponse.setData(data);
	 
	 	return getCustCreditImportExportResponse;
	}
}