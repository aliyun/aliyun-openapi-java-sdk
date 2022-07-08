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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedIpsResponse;
import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedIpsResponse.IpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessKeyLastUsedIpsResponseUnmarshaller {

	public static GetAccessKeyLastUsedIpsResponse unmarshall(GetAccessKeyLastUsedIpsResponse getAccessKeyLastUsedIpsResponse, UnmarshallerContext _ctx) {
		
		getAccessKeyLastUsedIpsResponse.setRequestId(_ctx.stringValue("GetAccessKeyLastUsedIpsResponse.RequestId"));
		getAccessKeyLastUsedIpsResponse.setNextToken(_ctx.stringValue("GetAccessKeyLastUsedIpsResponse.NextToken"));

		List<IpsItem> ips = new ArrayList<IpsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccessKeyLastUsedIpsResponse.Ips.Length"); i++) {
			IpsItem ipsItem = new IpsItem();
			ipsItem.setUsedTimestamp(_ctx.longValue("GetAccessKeyLastUsedIpsResponse.Ips["+ i +"].UsedTimestamp"));
			ipsItem.setDetail(_ctx.stringValue("GetAccessKeyLastUsedIpsResponse.Ips["+ i +"].Detail"));
			ipsItem.setSource(_ctx.stringValue("GetAccessKeyLastUsedIpsResponse.Ips["+ i +"].Source"));
			ipsItem.setIp(_ctx.stringValue("GetAccessKeyLastUsedIpsResponse.Ips["+ i +"].Ip"));

			ips.add(ipsItem);
		}
		getAccessKeyLastUsedIpsResponse.setIps(ips);
	 
	 	return getAccessKeyLastUsedIpsResponse;
	}
}