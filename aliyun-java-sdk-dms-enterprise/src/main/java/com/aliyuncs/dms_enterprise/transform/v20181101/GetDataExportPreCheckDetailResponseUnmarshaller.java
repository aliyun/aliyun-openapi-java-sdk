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

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportPreCheckDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportPreCheckDetailResponse.PreCheckResult;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportPreCheckDetailResponse.PreCheckResult.PreCheckDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataExportPreCheckDetailResponseUnmarshaller {

	public static GetDataExportPreCheckDetailResponse unmarshall(GetDataExportPreCheckDetailResponse getDataExportPreCheckDetailResponse, UnmarshallerContext _ctx) {
		
		getDataExportPreCheckDetailResponse.setRequestId(_ctx.stringValue("GetDataExportPreCheckDetailResponse.RequestId"));
		getDataExportPreCheckDetailResponse.setErrorCode(_ctx.stringValue("GetDataExportPreCheckDetailResponse.ErrorCode"));
		getDataExportPreCheckDetailResponse.setErrorMessage(_ctx.stringValue("GetDataExportPreCheckDetailResponse.ErrorMessage"));
		getDataExportPreCheckDetailResponse.setSuccess(_ctx.booleanValue("GetDataExportPreCheckDetailResponse.Success"));

		PreCheckResult preCheckResult = new PreCheckResult();
		preCheckResult.setIgnoreAffectRows(_ctx.booleanValue("GetDataExportPreCheckDetailResponse.PreCheckResult.IgnoreAffectRows"));

		List<PreCheckDetailListItem> preCheckDetailList = new ArrayList<PreCheckDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataExportPreCheckDetailResponse.PreCheckResult.PreCheckDetailList.Length"); i++) {
			PreCheckDetailListItem preCheckDetailListItem = new PreCheckDetailListItem();
			preCheckDetailListItem.setAffectRows(_ctx.longValue("GetDataExportPreCheckDetailResponse.PreCheckResult.PreCheckDetailList["+ i +"].AffectRows"));
			preCheckDetailListItem.setSQL(_ctx.stringValue("GetDataExportPreCheckDetailResponse.PreCheckResult.PreCheckDetailList["+ i +"].SQL"));

			preCheckDetailList.add(preCheckDetailListItem);
		}
		preCheckResult.setPreCheckDetailList(preCheckDetailList);
		getDataExportPreCheckDetailResponse.setPreCheckResult(preCheckResult);
	 
	 	return getDataExportPreCheckDetailResponse;
	}
}