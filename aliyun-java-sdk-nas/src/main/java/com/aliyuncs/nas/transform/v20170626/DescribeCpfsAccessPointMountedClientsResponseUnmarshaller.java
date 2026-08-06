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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeCpfsAccessPointMountedClientsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeCpfsAccessPointMountedClientsResponse.MountedClientItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCpfsAccessPointMountedClientsResponseUnmarshaller {

	public static DescribeCpfsAccessPointMountedClientsResponse unmarshall(DescribeCpfsAccessPointMountedClientsResponse describeCpfsAccessPointMountedClientsResponse, UnmarshallerContext _ctx) {
		
		describeCpfsAccessPointMountedClientsResponse.setRequestId(_ctx.stringValue("DescribeCpfsAccessPointMountedClientsResponse.RequestId"));
		describeCpfsAccessPointMountedClientsResponse.setTotalCount(_ctx.integerValue("DescribeCpfsAccessPointMountedClientsResponse.TotalCount"));
		describeCpfsAccessPointMountedClientsResponse.setPageSize(_ctx.integerValue("DescribeCpfsAccessPointMountedClientsResponse.PageSize"));
		describeCpfsAccessPointMountedClientsResponse.setNextToken(_ctx.stringValue("DescribeCpfsAccessPointMountedClientsResponse.NextToken"));
		describeCpfsAccessPointMountedClientsResponse.setPageNumber(_ctx.integerValue("DescribeCpfsAccessPointMountedClientsResponse.PageNumber"));
		describeCpfsAccessPointMountedClientsResponse.setMaxResults(_ctx.integerValue("DescribeCpfsAccessPointMountedClientsResponse.MaxResults"));

		List<MountedClientItem> mountedClient = new ArrayList<MountedClientItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCpfsAccessPointMountedClientsResponse.MountedClient.Length"); i++) {
			MountedClientItem mountedClientItem = new MountedClientItem();
			mountedClientItem.setClientId(_ctx.stringValue("DescribeCpfsAccessPointMountedClientsResponse.MountedClient["+ i +"].ClientId"));
			mountedClientItem.setChannelType(_ctx.stringValue("DescribeCpfsAccessPointMountedClientsResponse.MountedClient["+ i +"].ChannelType"));
			mountedClientItem.setClientIp(_ctx.stringValue("DescribeCpfsAccessPointMountedClientsResponse.MountedClient["+ i +"].ClientIp"));

			mountedClient.add(mountedClientItem);
		}
		describeCpfsAccessPointMountedClientsResponse.setMountedClient(mountedClient);
	 
	 	return describeCpfsAccessPointMountedClientsResponse;
	}
}