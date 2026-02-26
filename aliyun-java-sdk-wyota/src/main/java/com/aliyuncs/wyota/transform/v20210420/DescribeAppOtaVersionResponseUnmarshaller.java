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

import com.aliyuncs.wyota.model.v20210420.DescribeAppOtaVersionResponse;
import com.aliyuncs.wyota.model.v20210420.DescribeAppOtaVersionResponse.Data;
import com.aliyuncs.wyota.model.v20210420.DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppOtaVersionResponseUnmarshaller {

	public static DescribeAppOtaVersionResponse unmarshall(DescribeAppOtaVersionResponse describeAppOtaVersionResponse, UnmarshallerContext _ctx) {
		
		describeAppOtaVersionResponse.setRequestId(_ctx.stringValue("DescribeAppOtaVersionResponse.RequestId"));
		describeAppOtaVersionResponse.setCode(_ctx.stringValue("DescribeAppOtaVersionResponse.Code"));
		describeAppOtaVersionResponse.setMessage(_ctx.stringValue("DescribeAppOtaVersionResponse.Message"));

		Data data = new Data();

		List<AppOtaInfoDTOListItem> appOtaInfoDTOList = new ArrayList<AppOtaInfoDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList.Length"); i++) {
			AppOtaInfoDTOListItem appOtaInfoDTOListItem = new AppOtaInfoDTOListItem();
			appOtaInfoDTOListItem.setVersionUid(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].VersionUid"));
			appOtaInfoDTOListItem.setAppVersion(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].AppVersion"));
			appOtaInfoDTOListItem.setDownloadUrl(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].DownloadUrl"));
			appOtaInfoDTOListItem.setProject(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].Project"));
			appOtaInfoDTOListItem.setOsType(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].OsType"));
			appOtaInfoDTOListItem.setStatus(_ctx.integerValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].Status"));
			appOtaInfoDTOListItem.setSize(_ctx.longValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].Size"));
			appOtaInfoDTOListItem.setMd5(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].Md5"));
			appOtaInfoDTOListItem.setReleaseNote(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].ReleaseNote"));
			appOtaInfoDTOListItem.setReleaseNoteEn(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].ReleaseNoteEn"));
			appOtaInfoDTOListItem.setVersionType(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].VersionType"));
			appOtaInfoDTOListItem.setVersionCode(_ctx.longValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].VersionCode"));
			appOtaInfoDTOListItem.setChannel(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].Channel"));
			appOtaInfoDTOListItem.setSessionType(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].SessionType"));
			appOtaInfoDTOListItem.setProtocolType(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].ProtocolType"));
			appOtaInfoDTOListItem.setFullDownloadUrl(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].FullDownloadUrl"));
			appOtaInfoDTOListItem.setGmtCreate(_ctx.stringValue("DescribeAppOtaVersionResponse.Data.AppOtaInfoDTOList["+ i +"].GmtCreate"));

			appOtaInfoDTOList.add(appOtaInfoDTOListItem);
		}
		data.setAppOtaInfoDTOList(appOtaInfoDTOList);
		describeAppOtaVersionResponse.setData(data);
	 
	 	return describeAppOtaVersionResponse;
	}
}