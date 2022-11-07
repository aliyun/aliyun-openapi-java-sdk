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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRoutersResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRoutersResponse.TransitRouter;
import com.aliyuncs.cbn.model.v20170912.ListTransitRoutersResponse.TransitRouter.TransitRouterCidrListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRoutersResponseUnmarshaller {

	public static ListTransitRoutersResponse unmarshall(ListTransitRoutersResponse listTransitRoutersResponse, UnmarshallerContext _ctx) {
		
		listTransitRoutersResponse.setRequestId(_ctx.stringValue("ListTransitRoutersResponse.RequestId"));
		listTransitRoutersResponse.setPageSize(_ctx.integerValue("ListTransitRoutersResponse.PageSize"));
		listTransitRoutersResponse.setPageNumber(_ctx.integerValue("ListTransitRoutersResponse.PageNumber"));
		listTransitRoutersResponse.setTotalCount(_ctx.integerValue("ListTransitRoutersResponse.TotalCount"));

		List<TransitRouter> transitRouters = new ArrayList<TransitRouter>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRoutersResponse.TransitRouters.Length"); i++) {
			TransitRouter transitRouter = new TransitRouter();
			transitRouter.setCreationTime(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].CreationTime"));
			transitRouter.setType(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].Type"));
			transitRouter.setStatus(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].Status"));
			transitRouter.setTransitRouterId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterId"));
			transitRouter.setTransitRouterDescription(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterDescription"));
			transitRouter.setTransitRouterName(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterName"));
			transitRouter.setCenId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].CenId"));
			transitRouter.setAliUid(_ctx.longValue("ListTransitRoutersResponse.TransitRouters["+ i +"].AliUid"));
			transitRouter.setRegionId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].RegionId"));
			transitRouter.setServiceMode(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].ServiceMode"));
			transitRouter.setSupportMulticast(_ctx.booleanValue("ListTransitRoutersResponse.TransitRouters["+ i +"].SupportMulticast"));

			List<TransitRouterCidrListItem> transitRouterCidrList = new ArrayList<TransitRouterCidrListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList.Length"); j++) {
				TransitRouterCidrListItem transitRouterCidrListItem = new TransitRouterCidrListItem();
				transitRouterCidrListItem.setCidr(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList["+ j +"].Cidr"));
				transitRouterCidrListItem.setName(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList["+ j +"].Name"));
				transitRouterCidrListItem.setDescription(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList["+ j +"].Description"));
				transitRouterCidrListItem.setTransitRouterCidrId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList["+ j +"].TransitRouterCidrId"));
				transitRouterCidrListItem.setPublishCidrRoute(_ctx.booleanValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterCidrList["+ j +"].PublishCidrRoute"));

				transitRouterCidrList.add(transitRouterCidrListItem);
			}
			transitRouter.setTransitRouterCidrList(transitRouterCidrList);

			transitRouters.add(transitRouter);
		}
		listTransitRoutersResponse.setTransitRouters(transitRouters);
	 
	 	return listTransitRoutersResponse;
	}
}