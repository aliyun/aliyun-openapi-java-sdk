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
		listMotorAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Message"));
		listMotorAlgorithmResultsResponse.setCode(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListMotorAlgorithmResultsResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMotorAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setPicUrlPath(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setPlateNumber(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateNumber"));
			recordsItem.setCorpId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setMotorColor(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorColor"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setRightBottomY(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setSourceId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].SourceId"));
			recordsItem.setCalling(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].Calling"));
			recordsItem.setMotorClass(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorClass"));
			recordsItem.setMotorModel(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorModel"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setMotorBrand(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorBrand"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setMotorId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorId"));
			recordsItem.setPlateClass(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateClass"));
			recordsItem.setMotorStyle(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].MotorStyle"));
			recordsItem.setSafetyBelt(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].SafetyBelt"));
			recordsItem.setPlateColor(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].PlateColor"));
			recordsItem.setShotTime(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListMotorAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listMotorAlgorithmResultsResponse.setData(data);
	 
	 	return listMotorAlgorithmResultsResponse;
	}
}