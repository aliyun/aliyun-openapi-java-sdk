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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeDataDownloadURLResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDataDownloadURLResponse.Data;
import com.aliyuncs.ens.model.v20171110.DescribeDataDownloadURLResponse.Data.ServerListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataDownloadURLResponseUnmarshaller {

	public static DescribeDataDownloadURLResponse unmarshall(DescribeDataDownloadURLResponse describeDataDownloadURLResponse, UnmarshallerContext _ctx) {
		
		describeDataDownloadURLResponse.setRequestId(_ctx.stringValue("DescribeDataDownloadURLResponse.RequestId"));
		describeDataDownloadURLResponse.setCode(_ctx.longValue("DescribeDataDownloadURLResponse.Code"));
		describeDataDownloadURLResponse.setMessage(_ctx.stringValue("DescribeDataDownloadURLResponse.Message"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("DescribeDataDownloadURLResponse.Data.Url"));
		data.setExpireTime(_ctx.stringValue("DescribeDataDownloadURLResponse.Data.ExpireTime"));

		List<ServerListItem> serverList = new ArrayList<ServerListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataDownloadURLResponse.Data.ServerList.Length"); i++) {
			ServerListItem serverListItem = new ServerListItem();
			serverListItem.setHost(_ctx.stringValue("DescribeDataDownloadURLResponse.Data.ServerList["+ i +"].Host"));
			serverListItem.setRegionId(_ctx.stringValue("DescribeDataDownloadURLResponse.Data.ServerList["+ i +"].RegionId"));

			serverList.add(serverListItem);
		}
		data.setServerList(serverList);
		describeDataDownloadURLResponse.setData(data);
	 
	 	return describeDataDownloadURLResponse;
	}
}