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

package com.aliyuncs.openanalytics.transform.v20180301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics.model.v20180301.QueryEndPointListResponse;
import com.aliyuncs.openanalytics.model.v20180301.QueryEndPointListResponse.EndPointListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEndPointListResponseUnmarshaller {

	public static QueryEndPointListResponse unmarshall(QueryEndPointListResponse queryEndPointListResponse, UnmarshallerContext context) {
		
		queryEndPointListResponse.setRequestId(context.stringValue("QueryEndPointListResponse.RequestId"));
		queryEndPointListResponse.setRegionId(context.stringValue("QueryEndPointListResponse.RegionId"));

		List<EndPointListItem> endPointList = new ArrayList<EndPointListItem>();
		for (int i = 0; i < context.lengthValue("QueryEndPointListResponse.EndPointList.Length"); i++) {
			EndPointListItem endPointListItem = new EndPointListItem();
			endPointListItem.setEndPointID(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].endPointID"));
			endPointListItem.setZone(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].zone"));
			endPointListItem.setVSwitch(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].vSwitch"));
			endPointListItem.setStatus(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].status"));
			endPointListItem.setVpcID(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].vpcID"));
			endPointListItem.setHost(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].host"));
			endPointListItem.setDomainURL(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].domainURL"));
			endPointListItem.setNetworkType(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].networkType"));
			endPointListItem.setAllowIP(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].allowIP"));
			endPointListItem.setPort(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].port"));
			endPointListItem.setCloudInstanceID(context.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].cloudInstanceID"));

			endPointList.add(endPointListItem);
		}
		queryEndPointListResponse.setEndPointList(endPointList);
	 
	 	return queryEndPointListResponse;
	}
}