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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosisOperateRecordsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisOperateRecordsResponseUnmarshaller {

	public static DescribeDiagnosisOperateRecordsResponse unmarshall(DescribeDiagnosisOperateRecordsResponse describeDiagnosisOperateRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisOperateRecordsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.RequestId"));
		describeDiagnosisOperateRecordsResponse.setPageSize(_ctx.integerValue("DescribeDiagnosisOperateRecordsResponse.PageSize"));
		describeDiagnosisOperateRecordsResponse.setPageNumber(_ctx.integerValue("DescribeDiagnosisOperateRecordsResponse.PageNumber"));
		describeDiagnosisOperateRecordsResponse.setTotalCount(_ctx.integerValue("DescribeDiagnosisOperateRecordsResponse.TotalCount"));

		List<DiagnosisOperateRecordModel> diagnosisOperateRecordModels = new ArrayList<DiagnosisOperateRecordModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels.Length"); i++) {
			DiagnosisOperateRecordModel diagnosisOperateRecordModel = new DiagnosisOperateRecordModel();
			diagnosisOperateRecordModel.setZoneId(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].ZoneId"));
			diagnosisOperateRecordModel.setInstanceType(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].InstanceType"));
			diagnosisOperateRecordModel.setOperateRecordType(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].OperateRecordType"));
			diagnosisOperateRecordModel.setNewZoneId(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].NewZoneId"));
			diagnosisOperateRecordModel.setNewInstanceType(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].NewInstanceType"));
			diagnosisOperateRecordModel.setOperateDate(_ctx.stringValue("DescribeDiagnosisOperateRecordsResponse.DiagnosisOperateRecordModels["+ i +"].OperateDate"));

			diagnosisOperateRecordModels.add(diagnosisOperateRecordModel);
		}
		describeDiagnosisOperateRecordsResponse.setDiagnosisOperateRecordModels(diagnosisOperateRecordModels);
	 
	 	return describeDiagnosisOperateRecordsResponse;
	}
}