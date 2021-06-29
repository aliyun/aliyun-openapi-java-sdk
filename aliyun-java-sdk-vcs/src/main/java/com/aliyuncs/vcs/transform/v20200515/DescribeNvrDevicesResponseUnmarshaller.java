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

import com.aliyuncs.vcs.model.v20200515.DescribeNvrDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrDevicesResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNvrDevicesResponseUnmarshaller {

	public static DescribeNvrDevicesResponse unmarshall(DescribeNvrDevicesResponse describeNvrDevicesResponse, UnmarshallerContext _ctx) {
		
		describeNvrDevicesResponse.setRequestId(_ctx.stringValue("DescribeNvrDevicesResponse.RequestId"));
		describeNvrDevicesResponse.setCode(_ctx.stringValue("DescribeNvrDevicesResponse.Code"));
		describeNvrDevicesResponse.setMessage(_ctx.stringValue("DescribeNvrDevicesResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("DescribeNvrDevicesResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeNvrDevicesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("DescribeNvrDevicesResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeNvrDevicesResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNvrDevicesResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setChannel(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].Channel"));
			recordsItem.setCorpId(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setDatasourceType(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DatasourceType"));
			recordsItem.setDeviceId(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceId"));
			recordsItem.setDeviceName(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceName"));
			recordsItem.setDeviceSn(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceSn"));
			recordsItem.setDeviceStatus(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceStatus"));
			recordsItem.setDeviceType(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceType"));
			recordsItem.setCreateTime(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].CreateTime"));
			recordsItem.setModifyTime(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].ModifyTime"));
			recordsItem.setDeviceModel(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].DeviceModel"));
			recordsItem.setProjectName(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].ProjectName"));
			recordsItem.setRegionName(_ctx.stringValue("DescribeNvrDevicesResponse.Data.Records["+ i +"].RegionName"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeNvrDevicesResponse.setData(data);
	 
	 	return describeNvrDevicesResponse;
	}
}