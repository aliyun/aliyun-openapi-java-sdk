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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.QueryEndPointListResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.QueryEndPointListResponse.EndPointListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEndPointListResponseUnmarshaller {

	public static QueryEndPointListResponse unmarshall(QueryEndPointListResponse queryEndPointListResponse, UnmarshallerContext _ctx) {
		
		queryEndPointListResponse.setRequestId(_ctx.stringValue("QueryEndPointListResponse.RequestId"));
		queryEndPointListResponse.setRegionId(_ctx.stringValue("QueryEndPointListResponse.RegionId"));

		List<EndPointListItem> endPointList = new ArrayList<EndPointListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEndPointListResponse.EndPointList.Length"); i++) {
			EndPointListItem endPointListItem = new EndPointListItem();
			endPointListItem.setEndPointID(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].endPointID"));
			endPointListItem.setZone(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].zone"));
			endPointListItem.setVSwitch(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].vSwitch"));
			endPointListItem.setStatus(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].status"));
			endPointListItem.setVpcID(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].vpcID"));
			endPointListItem.setHost(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].host"));
			endPointListItem.setDomainURL(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].domainURL"));
			endPointListItem.setNetworkType(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].networkType"));
			endPointListItem.setAllowIP(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].allowIP"));
			endPointListItem.setPort(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].port"));
			endPointListItem.setProduct(_ctx.stringValue("QueryEndPointListResponse.EndPointList["+ i +"].product"));

			endPointList.add(endPointListItem);
		}
		queryEndPointListResponse.setEndPointList(endPointList);
	 
	 	return queryEndPointListResponse;
	}
}