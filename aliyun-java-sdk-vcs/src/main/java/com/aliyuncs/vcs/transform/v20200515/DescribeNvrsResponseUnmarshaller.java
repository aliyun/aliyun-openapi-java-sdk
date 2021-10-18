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
import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse.Data.Record;
import com.aliyuncs.vcs.model.v20200515.DescribeNvrsResponse.Data.Record.SubDeviceInfoItem;
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

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNvrsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setCorpId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].CorpId"));
			record.setServerId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerId"));
			record.setServerIp(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerIp"));
			record.setServerRealm(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerRealm"));
			record.setServerPort(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ServerPort"));
			record.setDeviceId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceId"));
			record.setPassword(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Password"));
			record.setDeviceName(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceName"));
			record.setDeviceAddress(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceAddress"));
			record.setLongitude(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Longitude"));
			record.setLatitude(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Latitude"));
			record.setVendor(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].Vendor"));
			record.setDeviceType(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceType"));
			record.setInProtocol(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].InProtocol"));
			record.setDeviceSn(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceSn"));
			record.setDatasourceType(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DatasourceType"));
			record.setDeviceStatus(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceStatus"));
			record.setSubDeviceCount(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceCount"));
			record.setCreateTime(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].CreateTime"));
			record.setModifyTime(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].ModifyTime"));
			record.setDeviceModel(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].DeviceModel"));

			List<SubDeviceInfoItem> subDeviceInfo = new ArrayList<SubDeviceInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceInfo.Length"); j++) {
				SubDeviceInfoItem subDeviceInfoItem = new SubDeviceInfoItem();
				subDeviceInfoItem.setSubDeviceId(_ctx.stringValue("DescribeNvrsResponse.Data.Records["+ i +"].SubDeviceInfo["+ j +"].SubDeviceId"));

				subDeviceInfo.add(subDeviceInfoItem);
			}
			record.setSubDeviceInfo(subDeviceInfo);

			records.add(record);
		}
		data.setRecords(records);
		describeNvrsResponse.setData(data);
	 
	 	return describeNvrsResponse;
	}
}