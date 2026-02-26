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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.DescribeDeviceVersionDetailResponse;
import com.aliyuncs.wyota.model.v20210420.DescribeDeviceVersionDetailResponse.DeviceOtaVersionDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceVersionDetailResponseUnmarshaller {

	public static DescribeDeviceVersionDetailResponse unmarshall(DescribeDeviceVersionDetailResponse describeDeviceVersionDetailResponse, UnmarshallerContext _ctx) {
		
		describeDeviceVersionDetailResponse.setRequestId(_ctx.stringValue("DescribeDeviceVersionDetailResponse.RequestId"));
		describeDeviceVersionDetailResponse.setCode(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Code"));
		describeDeviceVersionDetailResponse.setMessage(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Message"));

		List<DeviceOtaVersionDTO> data = new ArrayList<DeviceOtaVersionDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceVersionDetailResponse.Data.Length"); i++) {
			DeviceOtaVersionDTO deviceOtaVersionDTO = new DeviceOtaVersionDTO();
			deviceOtaVersionDTO.setVersion(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Version"));
			deviceOtaVersionDTO.setDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].DownloadUrl"));
			deviceOtaVersionDTO.setVersionType(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].VersionType"));
			deviceOtaVersionDTO.setVersionCode(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].VersionCode"));
			deviceOtaVersionDTO.setSize(_ctx.longValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Size"));
			deviceOtaVersionDTO.setMd5(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Md5"));
			deviceOtaVersionDTO.setReleaseNote(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].ReleaseNote"));
			deviceOtaVersionDTO.setReleaseNoteEn(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].ReleaseNoteEn"));
			deviceOtaVersionDTO.setModel(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Model"));
			deviceOtaVersionDTO.setCreator(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Creator"));
			deviceOtaVersionDTO.setClientType(_ctx.integerValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].ClientType"));
			deviceOtaVersionDTO.setChannel(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].Channel"));
			deviceOtaVersionDTO.setCnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].CnImageDownloadUrl"));
			deviceOtaVersionDTO.setEnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].EnImageDownloadUrl"));
			deviceOtaVersionDTO.setMultiCnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].MultiCnImageDownloadUrl"));
			deviceOtaVersionDTO.setMultiEnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].MultiEnImageDownloadUrl"));
			deviceOtaVersionDTO.setAndroidHorizontalMultiCnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].AndroidHorizontalMultiCnImageDownloadUrl"));
			deviceOtaVersionDTO.setAndroidHorizontalMultiEnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].AndroidHorizontalMultiEnImageDownloadUrl"));
			deviceOtaVersionDTO.setAndroidVerticalMultiCnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].AndroidVerticalMultiCnImageDownloadUrl"));
			deviceOtaVersionDTO.setAndroidVerticalMultiEnImageDownloadUrl(_ctx.stringValue("DescribeDeviceVersionDetailResponse.Data["+ i +"].AndroidVerticalMultiEnImageDownloadUrl"));

			data.add(deviceOtaVersionDTO);
		}
		describeDeviceVersionDetailResponse.setData(data);
	 
	 	return describeDeviceVersionDetailResponse;
	}
}