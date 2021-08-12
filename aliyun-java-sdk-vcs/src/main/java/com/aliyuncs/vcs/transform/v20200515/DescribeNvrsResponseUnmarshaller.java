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

import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse.Data.RecordsItem;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse.Data.RecordsItem.SubDeviceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNvrsResponseUnmarshaller {

	public static DescribeNvrsResponse unmarshall(DescribeNvrsResponse describeNvrsResponse, UnmarshallerContext _ctx) {
		
		describeNvrsResponse.setRequestId(_ctx.stringValue("DescribeNvrsResponse.RequestId"));
		describeNvrsResponse.setCode(_ctx.stringValue("DescribeNvrsResponse.Code"));
		describeNvrsResponse.setMessage(_ctx.stringValue("DescribeNvrsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeNvrsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeNvrsResponse.Data.TotalPage"));
		data.setPageNum(_ctx.longValue("DescribeNvrsResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeNvrsResponse.Data.PageSize"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNvrsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setCorpId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setServerId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerId"));
			recordsItem.setServerIp(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerIp"));
			recordsItem.setServerRealm(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerRealm"));
			recordsItem.setServerPort(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerPort"));
			recordsItem.setDeviceId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceId"));
			recordsItem.setPassword(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Password"));
			recordsItem.setDeviceName(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceName"));
			recordsItem.setDeviceAddress(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceAddress"));
			recordsItem.setLongitude(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Longitude"));
			recordsItem.setLatitude(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Latitude"));
			recordsItem.setVendor(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Vendor"));
			recordsItem.setDeviceType(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceType"));
			recordsItem.setInProtocol(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].InProtocol"));
			recordsItem.setDeviceSn(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceSn"));
			recordsItem.setDatasourceType(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DatasourceType"));
			recordsItem.setDeviceStatus(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceStatus"));
			recordsItem.setSubDeviceCount(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceCount"));
			recordsItem.setCreateTime(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].CreateTime"));
			recordsItem.setModifyTime(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ModifyTime"));
			recordsItem.setDeviceModel(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceModel"));

			List<SubDeviceInfoItem> subDeviceInfo = new ArrayList<SubDeviceInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceInfo.Length"); j++) {
				SubDeviceInfoItem subDeviceInfoItem = new SubDeviceInfoItem();
				subDeviceInfoItem.setSubDeviceId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceInfo["+ j +"].SubDeviceId"));

				subDeviceInfo.add(subDeviceInfoItem);
			}
			recordsItem.setSubDeviceInfo(subDeviceInfo);

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeNvrsResponse.setData(data);
	 
	 	return describeNvrsResponse;
	}
}