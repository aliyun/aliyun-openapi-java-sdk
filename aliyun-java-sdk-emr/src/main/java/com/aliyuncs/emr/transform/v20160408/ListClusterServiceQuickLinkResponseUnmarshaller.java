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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterServiceQuickLinkResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceQuickLinkResponse.QuickLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceQuickLinkResponseUnmarshaller {

	public static ListClusterServiceQuickLinkResponse unmarshall(ListClusterServiceQuickLinkResponse listClusterServiceQuickLinkResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceQuickLinkResponse.setRequestId(_ctx.stringValue("ListClusterServiceQuickLinkResponse.RequestId"));

		List<QuickLink> quickLinkList = new ArrayList<QuickLink>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceQuickLinkResponse.QuickLinkList.Length"); i++) {
			QuickLink quickLink = new QuickLink();
			quickLink.setServiceName(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].ServiceName"));
			quickLink.setServiceDisplayName(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].ServiceDisplayName"));
			quickLink.setQuickLinkAddress(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].QuickLinkAddress"));
			quickLink.setProtocol(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].Protocol"));
			quickLink.setPort(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].Port"));
			quickLink.setType(_ctx.stringValue("ListClusterServiceQuickLinkResponse.QuickLinkList["+ i +"].Type"));

			quickLinkList.add(quickLink);
		}
		listClusterServiceQuickLinkResponse.setQuickLinkList(quickLinkList);
	 
	 	return listClusterServiceQuickLinkResponse;
	}
}