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

import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse;
import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse.DataItem;
import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse.DataItem.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchObjectResponseUnmarshaller {

	public static SearchObjectResponse unmarshall(SearchObjectResponse searchObjectResponse, UnmarshallerContext _ctx) {
		
		searchObjectResponse.setRequestId(_ctx.stringValue("SearchObjectResponse.RequestId"));
		searchObjectResponse.setCode(_ctx.stringValue("SearchObjectResponse.Code"));
		searchObjectResponse.setMessage(_ctx.stringValue("SearchObjectResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPageNumber(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].PageNumber"));
			dataItem.setPageSize(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].PageSize"));
			dataItem.setTotalCount(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].TotalCount"));
			dataItem.setTotalPage(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].TotalPage"));

			List<RecordsItem> records = new ArrayList<RecordsItem>();
			for (int j = 0; j < _ctx.lengthValue("SearchObjectResponse.Data["+ i +"].Records.Length"); j++) {
				RecordsItem recordsItem = new RecordsItem();
				recordsItem.setBodyShotTime(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].BodyShotTime"));
				recordsItem.setCompareResult(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].CompareResult"));
				recordsItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].DeviceID"));
				recordsItem.setFaceShotTime(_ctx.longValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].FaceShotTime"));
				recordsItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].LeftTopX"));
				recordsItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].LeftTopY"));
				recordsItem.setMotorShotTime(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].MotorShotTime"));
				recordsItem.setPassTime(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].PassTime"));
				recordsItem.setRightBtmX(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].RightBtmX"));
				recordsItem.setRightBtmY(_ctx.integerValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].RightBtmY"));
				recordsItem.setScore(_ctx.floatValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].Score"));
				recordsItem.setSourceID(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].SourceID"));
				recordsItem.setSourceImagePath(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].SourceImagePath"));
				recordsItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].SourceImageUrl"));
				recordsItem.setTargetImagePath(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].TargetImagePath"));
				recordsItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data["+ i +"].Records["+ j +"].TargetImageUrl"));

				records.add(recordsItem);
			}
			dataItem.setRecords(records);

			data.add(dataItem);
		}
		searchObjectResponse.setData(data);
	 
	 	return searchObjectResponse;
	}
}