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

import com.aliyuncs.vcs.model.v20200515.DescribeChannelsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeChannelsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeChannelsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChannelsResponseUnmarshaller {

	public static DescribeChannelsResponse unmarshall(DescribeChannelsResponse describeChannelsResponse, UnmarshallerContext _ctx) {
		
		describeChannelsResponse.setRequestId(_ctx.stringValue("DescribeChannelsResponse.RequestId"));
		describeChannelsResponse.setCode(_ctx.stringValue("DescribeChannelsResponse.Code"));
		describeChannelsResponse.setMessage(_ctx.stringValue("DescribeChannelsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeChannelsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeChannelsResponse.Data.TotalPage"));
		data.setPageNum(_ctx.longValue("DescribeChannelsResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeChannelsResponse.Data.PageSize"));

		List<String> unConfigList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChannelsResponse.Data.UnConfigList.Length"); i++) {
			unConfigList.add(_ctx.stringValue("DescribeChannelsResponse.Data.UnConfigList["+ i +"]"));
		}
		data.setUnConfigList(unConfigList);

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChannelsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setCorpId(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].CorpId"));
			record.setServerId(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ServerId"));
			record.setServerIp(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ServerIp"));
			record.setServerRealm(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ServerRealm"));
			record.setServerPort(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ServerPort"));
			record.setDeviceId(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceId"));
			record.setPassword(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].Password"));
			record.setDeviceName(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceName"));
			record.setDeviceAddress(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceAddress"));
			record.setLongitude(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].Longitude"));
			record.setLatitude(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].Latitude"));
			record.setDeviceDirection(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceDirection"));
			record.setDeviceSite(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceSite"));
			record.setDeviceResolution(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceResolution"));
			record.setDeviceRate(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceRate"));
			record.setFrameRate(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].FrameRate"));
			record.setGovLength(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].GovLength"));
			record.setEncodeFormat(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].EncodeFormat"));
			record.setAudioEnable(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].AudioEnable"));
			record.setOSDTimeEnable(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].OSDTimeEnable"));
			record.setOSDTimeType(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].OSDTimeType"));
			record.setOSDTimeX(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].OSDTimeX"));
			record.setOSDTimeY(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].OSDTimeY"));
			record.setVendor(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].Vendor"));
			record.setDeviceType(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceType"));
			record.setDeviceModel(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceModel"));
			record.setInProtocol(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].InProtocol"));
			record.setDeviceSn(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceSn"));
			record.setDatasourceType(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DatasourceType"));
			record.setDeviceSubType(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceSubType"));
			record.setDeviceIp(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceIp"));
			record.setDeviceStatus(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].DeviceStatus"));
			record.setStreamStatus(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].StreamStatus"));
			record.setStreamAction(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].StreamAction"));
			record.setParentDeviceId(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ParentDeviceId"));
			record.setCreateTime(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].CreateTime"));
			record.setModifyTime(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].ModifyTime"));
			record.setVap(_ctx.stringValue("DescribeChannelsResponse.Data.Records["+ i +"].Vap"));

			records.add(record);
		}
		data.setRecords(records);
		describeChannelsResponse.setData(data);
	 
	 	return describeChannelsResponse;
	}
}