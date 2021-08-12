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

import com.aliyuncs.vcs.model.v20200515.DescribeIpcsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeIpcsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeIpcsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpcsResponseUnmarshaller {

	public static DescribeIpcsResponse unmarshall(DescribeIpcsResponse describeIpcsResponse, UnmarshallerContext _ctx) {
		
		describeIpcsResponse.setRequestId(_ctx.stringValue("DescribeIpcsResponse.RequestId"));
		describeIpcsResponse.setCode(_ctx.stringValue("DescribeIpcsResponse.Code"));
		describeIpcsResponse.setMessage(_ctx.stringValue("DescribeIpcsResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("DescribeIpcsResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeIpcsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("DescribeIpcsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeIpcsResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpcsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setCorpId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setCreateTime(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].CreateTime"));
			recordsItem.setModifyTime(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ModifyTime"));
			recordsItem.setDeviceAddress(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceAddress"));
			recordsItem.setDeviceId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceId"));
			recordsItem.setDeviceName(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceName"));
			recordsItem.setDeviceType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceType"));
			recordsItem.setInProtocol(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].InProtocol"));
			recordsItem.setLatitude(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Latitude"));
			recordsItem.setLongitude(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Longitude"));
			recordsItem.setDeviceStatus(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceStatus"));
			recordsItem.setStreamStatus(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].StreamStatus"));
			recordsItem.setStreamAction(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].StreamAction"));
			recordsItem.setVendor(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Vendor"));
			recordsItem.setServerId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerId"));
			recordsItem.setPassword(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Password"));
			recordsItem.setServerPort(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerPort"));
			recordsItem.setServerIp(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerIp"));
			recordsItem.setServerRealm(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerRealm"));
			recordsItem.setDeviceSite(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSite"));
			recordsItem.setDeviceDirection(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceDirection"));
			recordsItem.setDeviceResolution(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceResolution"));
			recordsItem.setDeviceRate(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceRate"));
			recordsItem.setParentDeviceId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ParentDeviceId"));
			recordsItem.setDeviceModel(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceModel"));
			recordsItem.setDatasourceType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DatasourceType"));
			recordsItem.setRegionName(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].RegionName"));
			recordsItem.setVap(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Vap"));
			recordsItem.setDeviceSubType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSubType"));
			recordsItem.setFrameRate(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].FrameRate"));
			recordsItem.setGovLength(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].GovLength"));
			recordsItem.setEncodeFormat(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].EncodeFormat"));
			recordsItem.setAudioEnable(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].AudioEnable"));
			recordsItem.setOSDTimeEnable(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeEnable"));
			recordsItem.setOSDTimeType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeType"));
			recordsItem.setOSDTimeX(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeX"));
			recordsItem.setOSDTimeY(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeY"));
			recordsItem.setDeviceSn(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSn"));
			recordsItem.setDeviceIp(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceIp"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeIpcsResponse.setData(data);
	 
	 	return describeIpcsResponse;
	}
}