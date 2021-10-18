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
import com.aliyuncs.vcs.model.v20200515.DescribeIpcsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpcsResponseUnmarshaller {

	public static DescribeIpcsResponse unmarshall(DescribeIpcsResponse describeIpcsResponse, UnmarshallerContext _ctx) {
		
		describeIpcsResponse.setRequestId(_ctx.stringValue("DescribeIpcsResponse.RequestId"));
		describeIpcsResponse.setCode(_ctx.stringValue("DescribeIpcsResponse.Code"));
		describeIpcsResponse.setMessage(_ctx.stringValue("DescribeIpcsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeIpcsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeIpcsResponse.Data.TotalPage"));
		data.setPageNum(_ctx.longValue("DescribeIpcsResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeIpcsResponse.Data.PageSize"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpcsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setCorpId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].CorpId"));
			record.setServerId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerId"));
			record.setServerIp(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerIp"));
			record.setServerRealm(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerRealm"));
			record.setServerPort(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ServerPort"));
			record.setDeviceId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceId"));
			record.setPassword(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Password"));
			record.setDeviceName(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceName"));
			record.setDeviceAddress(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceAddress"));
			record.setLongitude(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Longitude"));
			record.setLatitude(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Latitude"));
			record.setDeviceDirection(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceDirection"));
			record.setDeviceSite(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSite"));
			record.setDeviceResolution(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceResolution"));
			record.setDeviceRate(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceRate"));
			record.setFrameRate(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].FrameRate"));
			record.setGovLength(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].GovLength"));
			record.setEncodeFormat(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].EncodeFormat"));
			record.setAudioEnable(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].AudioEnable"));
			record.setOSDTimeEnable(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeEnable"));
			record.setOSDTimeType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeType"));
			record.setOSDTimeX(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeX"));
			record.setOSDTimeY(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].OSDTimeY"));
			record.setVendor(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Vendor"));
			record.setDeviceType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceType"));
			record.setDeviceModel(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceModel"));
			record.setInProtocol(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].InProtocol"));
			record.setDeviceSn(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSn"));
			record.setDatasourceType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DatasourceType"));
			record.setDeviceSubType(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceSubType"));
			record.setDeviceIp(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceIp"));
			record.setDeviceStatus(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].DeviceStatus"));
			record.setStreamStatus(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].StreamStatus"));
			record.setStreamAction(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].StreamAction"));
			record.setParentDeviceId(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ParentDeviceId"));
			record.setCreateTime(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].CreateTime"));
			record.setModifyTime(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].ModifyTime"));
			record.setVap(_ctx.stringValue("DescribeIpcsResponse.Data.Records["+ i +"].Vap"));

			records.add(record);
		}
		data.setRecords(records);
		describeIpcsResponse.setData(data);
	 
	 	return describeIpcsResponse;
	}
}