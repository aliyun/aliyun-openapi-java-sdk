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

import com.aliyuncs.vcs.model.v20200515.DescribeCameraForInstanceResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeCameraForInstanceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeCameraForInstanceResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCameraForInstanceResponseUnmarshaller {

	public static DescribeCameraForInstanceResponse unmarshall(DescribeCameraForInstanceResponse describeCameraForInstanceResponse, UnmarshallerContext _ctx) {
		
		describeCameraForInstanceResponse.setRequestId(_ctx.stringValue("DescribeCameraForInstanceResponse.RequestId"));
		describeCameraForInstanceResponse.setCode(_ctx.stringValue("DescribeCameraForInstanceResponse.Code"));
		describeCameraForInstanceResponse.setMessage(_ctx.stringValue("DescribeCameraForInstanceResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeCameraForInstanceResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("DescribeCameraForInstanceResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("DescribeCameraForInstanceResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCameraForInstanceResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setCameraId(_ctx.stringValue("DescribeCameraForInstanceResponse.Data.Records["+ i +"].CameraId"));
			recordsItem.setCameraName(_ctx.stringValue("DescribeCameraForInstanceResponse.Data.Records["+ i +"].CameraName"));
			recordsItem.setCameraAddress(_ctx.stringValue("DescribeCameraForInstanceResponse.Data.Records["+ i +"].CameraAddress"));
			recordsItem.setCameraStatus(_ctx.longValue("DescribeCameraForInstanceResponse.Data.Records["+ i +"].CameraStatus"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeCameraForInstanceResponse.setData(data);
	 
	 	return describeCameraForInstanceResponse;
	}
}