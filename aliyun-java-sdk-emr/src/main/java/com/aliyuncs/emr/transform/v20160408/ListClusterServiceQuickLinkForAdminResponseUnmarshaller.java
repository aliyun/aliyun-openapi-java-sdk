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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceQuickLinkForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceQuickLinkForAdminResponse.QuickLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceQuickLinkForAdminResponseUnmarshaller {

	public static ListClusterServiceQuickLinkForAdminResponse unmarshall(ListClusterServiceQuickLinkForAdminResponse listClusterServiceQuickLinkForAdminResponse, UnmarshallerContext context) {
		
		listClusterServiceQuickLinkForAdminResponse.setRequestId(context.stringValue("ListClusterServiceQuickLinkForAdminResponse.RequestId"));

		List<QuickLink> quickLinkList = new ArrayList<QuickLink>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceQuickLinkForAdminResponse.QuickLinkList.Length"); i++) {
			QuickLink quickLink = new QuickLink();
			quickLink.setServiceName(context.stringValue("ListClusterServiceQuickLinkForAdminResponse.QuickLinkList["+ i +"].ServiceName"));
			quickLink.setServiceDisplayName(context.stringValue("ListClusterServiceQuickLinkForAdminResponse.QuickLinkList["+ i +"].ServiceDisplayName"));
			quickLink.setQuickLinkAddress(context.stringValue("ListClusterServiceQuickLinkForAdminResponse.QuickLinkList["+ i +"].QuickLinkAddress"));
			quickLink.setProtocol(context.stringValue("ListClusterServiceQuickLinkForAdminResponse.QuickLinkList["+ i +"].Protocol"));

			quickLinkList.add(quickLink);
		}
		listClusterServiceQuickLinkForAdminResponse.setQuickLinkList(quickLinkList);
	 
	 	return listClusterServiceQuickLinkForAdminResponse;
	}
}