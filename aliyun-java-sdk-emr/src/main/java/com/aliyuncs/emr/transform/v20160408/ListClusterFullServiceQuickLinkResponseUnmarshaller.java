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

import com.aliyuncs.emr.model.v20160408.ListClusterFullServiceQuickLinkResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterFullServiceQuickLinkResponse.QuickLink;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterFullServiceQuickLinkResponseUnmarshaller {

	public static ListClusterFullServiceQuickLinkResponse unmarshall(ListClusterFullServiceQuickLinkResponse listClusterFullServiceQuickLinkResponse, UnmarshallerContext context) {
		
		listClusterFullServiceQuickLinkResponse.setRequestId(context.stringValue("ListClusterFullServiceQuickLinkResponse.RequestId"));

		List<QuickLink> quickLinkList = new ArrayList<QuickLink>();
		for (int i = 0; i < context.lengthValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList.Length"); i++) {
			QuickLink quickLink = new QuickLink();
			quickLink.setServiceName(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].ServiceName"));
			quickLink.setServiceDisplayName(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].ServiceDisplayName"));
			quickLink.setQuickLinkAddress(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].QuickLinkAddress"));
			quickLink.setProtocol(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].Protocol"));
			quickLink.setPort(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].Port"));
			quickLink.setNote(context.stringValue("ListClusterFullServiceQuickLinkResponse.QuickLinkList["+ i +"].Note"));

			quickLinkList.add(quickLink);
		}
		listClusterFullServiceQuickLinkResponse.setQuickLinkList(quickLinkList);
	 
	 	return listClusterFullServiceQuickLinkResponse;
	}
}