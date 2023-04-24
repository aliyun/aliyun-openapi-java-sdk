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

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackOrderDetailResponse.DataTrackOrderDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataTrackOrderDetailResponseUnmarshaller {

	public static GetDataTrackOrderDetailResponse unmarshall(GetDataTrackOrderDetailResponse getDataTrackOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getDataTrackOrderDetailResponse.setRequestId(_ctx.stringValue("GetDataTrackOrderDetailResponse.RequestId"));
		getDataTrackOrderDetailResponse.setSuccess(_ctx.booleanValue("GetDataTrackOrderDetailResponse.Success"));
		getDataTrackOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetDataTrackOrderDetailResponse.ErrorMessage"));
		getDataTrackOrderDetailResponse.setErrorCode(_ctx.stringValue("GetDataTrackOrderDetailResponse.ErrorCode"));

		DataTrackOrderDetail dataTrackOrderDetail = new DataTrackOrderDetail();
		dataTrackOrderDetail.setDbId(_ctx.longValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.DbId"));
		dataTrackOrderDetail.setLogic(_ctx.booleanValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.Logic"));
		dataTrackOrderDetail.setDatabaseSearchName(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.DatabaseSearchName"));
		dataTrackOrderDetail.setJobStartTime(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.JobStartTime"));
		dataTrackOrderDetail.setJobEndTime(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.JobEndTime"));
		dataTrackOrderDetail.setSchemaName(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.SchemaName"));
		dataTrackOrderDetail.setJobStatus(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.JobStatus"));
		dataTrackOrderDetail.setStatusDesc(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.StatusDesc"));

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.TableNames.Length"); i++) {
			tableNames.add(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.TableNames["+ i +"]"));
		}
		dataTrackOrderDetail.setTableNames(tableNames);

		List<String> trackTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.TrackTypes.Length"); i++) {
			trackTypes.add(_ctx.stringValue("GetDataTrackOrderDetailResponse.DataTrackOrderDetail.TrackTypes["+ i +"]"));
		}
		dataTrackOrderDetail.setTrackTypes(trackTypes);
		getDataTrackOrderDetailResponse.setDataTrackOrderDetail(dataTrackOrderDetail);
	 
	 	return getDataTrackOrderDetailResponse;
	}
}