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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiagnoseInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiagnoseInfoResponse.Diagnose;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiagnoseInfoResponseUnmarshaller {

	public static OpsQueryDiagnoseInfoResponse unmarshall(OpsQueryDiagnoseInfoResponse opsQueryDiagnoseInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiagnoseInfoResponse.setRequestId(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.RequestId"));
		opsQueryDiagnoseInfoResponse.setTotalCount(_ctx.integerValue("OpsQueryDiagnoseInfoResponse.TotalCount"));
		opsQueryDiagnoseInfoResponse.setPageSize(_ctx.integerValue("OpsQueryDiagnoseInfoResponse.PageSize"));
		opsQueryDiagnoseInfoResponse.setPageNumber(_ctx.integerValue("OpsQueryDiagnoseInfoResponse.PageNumber"));

		List<Diagnose> diagnoseList = new ArrayList<Diagnose>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDiagnoseInfoResponse.DiagnoseList.Length"); i++) {
			Diagnose diagnose = new Diagnose();
			diagnose.setType(_ctx.integerValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Type"));
			diagnose.setStatus(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Status"));
			diagnose.setCreationTime(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].CreationTime"));
			diagnose.setAction(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Action"));
			diagnose.setProduct(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Product"));
			diagnose.setDiagnoseId(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].DiagnoseId"));
			diagnose.setAliUid(_ctx.longValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].AliUid"));
			diagnose.setStar(_ctx.integerValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Star"));
			diagnose.setRegionId(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].RegionId"));
			diagnose.setRequestId(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].RequestId"));
			diagnose.setErrorCode(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].ErrorCode"));
			diagnose.setSolutions(_ctx.stringValue("OpsQueryDiagnoseInfoResponse.DiagnoseList["+ i +"].Solutions"));

			diagnoseList.add(diagnose);
		}
		opsQueryDiagnoseInfoResponse.setDiagnoseList(diagnoseList);
	 
	 	return opsQueryDiagnoseInfoResponse;
	}
}