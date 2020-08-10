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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListMotorAlgorithmResultsResponse;
import com.aliyuncs.vcs.model.v20200515.ListMotorAlgorithmResultsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListMotorAlgorithmResultsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMotorAlgorithmResultsResponseUnmarshaller {

	public static ListMotorAlgorithmResultsResponse unmarshall(ListMotorAlgorithmResultsResponse listMotorAlgorithmResultsResponse, UnmarshallerContext _ctx) {
		
		listMotorAlgorithmResultsResponse.setRequestId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.RequestId"));
		listMotorAlgorithmResultsResponse.setCode(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Code"));
		listMotorAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMotorAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setCorpId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setMotorId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorId"));
			recordsItem.setPicUrlPath(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setPlateNumber(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateNumber"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setRightBottomY(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setShotTime(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setMotorStyle(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorStyle"));
			recordsItem.setMotorModel(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorModel"));
			recordsItem.setMotorColor(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorColor"));
			recordsItem.setMotorClass(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorClass"));
			recordsItem.setMotorBrand(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorBrand"));
			recordsItem.setPlateColor(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateColor"));
			recordsItem.setPlateClass(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateClass"));
			recordsItem.setSafetyBelt(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].SafetyBelt"));
			recordsItem.setCalling(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].Calling"));
			recordsItem.setSourceId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].SourceId"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listMotorAlgorithmResultsResponse.setData(data);
	 
	 	return listMotorAlgorithmResultsResponse;
	}
}