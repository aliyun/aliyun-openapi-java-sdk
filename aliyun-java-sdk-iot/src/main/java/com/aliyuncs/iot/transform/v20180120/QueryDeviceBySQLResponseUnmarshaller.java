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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceBySQLResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceBySQLResponse.SimpleDeviceSearchInfo;
import com.aliyuncs.iot.model.v20180120.QueryDeviceBySQLResponse.SimpleDeviceSearchInfo.SimpleDeviceGroupInfo;
import com.aliyuncs.iot.model.v20180120.QueryDeviceBySQLResponse.SimpleDeviceSearchInfo.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceBySQLResponseUnmarshaller {

	public static QueryDeviceBySQLResponse unmarshall(QueryDeviceBySQLResponse queryDeviceBySQLResponse, UnmarshallerContext _ctx) {
		
		queryDeviceBySQLResponse.setRequestId(_ctx.stringValue("QueryDeviceBySQLResponse.RequestId"));
		queryDeviceBySQLResponse.setSuccess(_ctx.booleanValue("QueryDeviceBySQLResponse.Success"));
		queryDeviceBySQLResponse.setCode(_ctx.stringValue("QueryDeviceBySQLResponse.Code"));
		queryDeviceBySQLResponse.setErrorMessage(_ctx.stringValue("QueryDeviceBySQLResponse.ErrorMessage"));
		queryDeviceBySQLResponse.setTotalCount(_ctx.longValue("QueryDeviceBySQLResponse.TotalCount"));

		List<SimpleDeviceSearchInfo> data = new ArrayList<SimpleDeviceSearchInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceBySQLResponse.Data.Length"); i++) {
			SimpleDeviceSearchInfo simpleDeviceSearchInfo = new SimpleDeviceSearchInfo();
			simpleDeviceSearchInfo.setProductKey(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].ProductKey"));
			simpleDeviceSearchInfo.setDeviceName(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].DeviceName"));
			simpleDeviceSearchInfo.setNickname(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].Nickname"));
			simpleDeviceSearchInfo.setStatus(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].Status"));
			simpleDeviceSearchInfo.setActiveTime(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].ActiveTime"));
			simpleDeviceSearchInfo.setIotId(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].IotId"));
			simpleDeviceSearchInfo.setGmtCreate(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].GmtCreate"));
			simpleDeviceSearchInfo.setGmtModified(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].GmtModified"));

			List<SimpleDeviceGroupInfo> groups = new ArrayList<SimpleDeviceGroupInfo>();
			for (int j = 0; j < _ctx.lengthValue("QueryDeviceBySQLResponse.Data["+ i +"].Groups.Length"); j++) {
				SimpleDeviceGroupInfo simpleDeviceGroupInfo = new SimpleDeviceGroupInfo();
				simpleDeviceGroupInfo.setGroupId(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].Groups["+ j +"].GroupId"));

				groups.add(simpleDeviceGroupInfo);
			}
			simpleDeviceSearchInfo.setGroups(groups);

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("QueryDeviceBySQLResponse.Data["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setTagName(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].Tags["+ j +"].TagName"));
				tagInfo.setTagValue(_ctx.stringValue("QueryDeviceBySQLResponse.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagInfo);
			}
			simpleDeviceSearchInfo.setTags(tags);

			data.add(simpleDeviceSearchInfo);
		}
		queryDeviceBySQLResponse.setData(data);
	 
	 	return queryDeviceBySQLResponse;
	}
}