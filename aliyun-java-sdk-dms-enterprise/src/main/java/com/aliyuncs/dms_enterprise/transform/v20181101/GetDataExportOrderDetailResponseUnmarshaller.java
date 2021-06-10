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

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportOrderDetailResponse.DataExportOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportOrderDetailResponse.DataExportOrderDetail.KeyInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataExportOrderDetailResponseUnmarshaller {

	public static GetDataExportOrderDetailResponse unmarshall(GetDataExportOrderDetailResponse getDataExportOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getDataExportOrderDetailResponse.setRequestId(_ctx.stringValue("GetDataExportOrderDetailResponse.RequestId"));
		getDataExportOrderDetailResponse.setErrorCode(_ctx.stringValue("GetDataExportOrderDetailResponse.ErrorCode"));
		getDataExportOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetDataExportOrderDetailResponse.ErrorMessage"));
		getDataExportOrderDetailResponse.setSuccess(_ctx.booleanValue("GetDataExportOrderDetailResponse.Success"));

		DataExportOrderDetail dataExportOrderDetail = new DataExportOrderDetail();

		KeyInfo keyInfo = new KeyInfo();
		keyInfo.setPreCheckId(_ctx.longValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.KeyInfo.PreCheckId"));
		keyInfo.setJobStatus(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.KeyInfo.JobStatus"));
		dataExportOrderDetail.setKeyInfo(keyInfo);

		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setDbId(_ctx.integerValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.DbId"));
		orderDetail.setDatabase(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.Database"));
		orderDetail.setClassify(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.Classify"));
		orderDetail.setExeSQL(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.ExeSQL"));
		orderDetail.setLogic(_ctx.booleanValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.Logic"));
		orderDetail.setActualAffectRows(_ctx.longValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.ActualAffectRows"));
		orderDetail.setIgnoreAffectRows(_ctx.booleanValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.IgnoreAffectRows"));
		orderDetail.setIgnoreAffectRowsReason(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.IgnoreAffectRowsReason"));
		orderDetail.setEnvType(_ctx.stringValue("GetDataExportOrderDetailResponse.DataExportOrderDetail.OrderDetail.EnvType"));
		dataExportOrderDetail.setOrderDetail(orderDetail);
		getDataExportOrderDetailResponse.setDataExportOrderDetail(dataExportOrderDetail);
	 
	 	return getDataExportOrderDetailResponse;
	}
}