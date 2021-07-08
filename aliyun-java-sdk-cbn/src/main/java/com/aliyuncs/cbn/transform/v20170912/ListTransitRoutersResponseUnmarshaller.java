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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRoutersResponseUnmarshaller {

	public static ListTransitRoutersResponse unmarshall(ListTransitRoutersResponse listTransitRoutersResponse, UnmarshallerContext _ctx) {
		
		listTransitRoutersResponse.setRequestId(_ctx.stringValue("ListTransitRoutersResponse.RequestId"));
		listTransitRoutersResponse.setTotalCount(_ctx.integerValue("ListTransitRoutersResponse.TotalCount"));
		listTransitRoutersResponse.setPageNumber(_ctx.integerValue("ListTransitRoutersResponse.PageNumber"));
		listTransitRoutersResponse.setPageSize(_ctx.integerValue("ListTransitRoutersResponse.PageSize"));

		List<TransitRouter> transitRouters = new ArrayList<TransitRouter>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRoutersResponse.TransitRouters.Length"); i++) {
			TransitRouter transitRouter = new TransitRouter();
			transitRouter.setTransitRouterId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterId"));
			transitRouter.setStatus(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].Status"));
			transitRouter.setCenId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].CenId"));
			transitRouter.setRegionId(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].RegionId"));
			transitRouter.setAliUid(_ctx.longValue("ListTransitRoutersResponse.TransitRouters["+ i +"].AliUid"));
			transitRouter.setType(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].Type"));
			transitRouter.setCreationTime(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].CreationTime"));
			transitRouter.setTransitRouterName(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterName"));
			transitRouter.setTransitRouterDescription(_ctx.stringValue("ListTransitRoutersResponse.TransitRouters["+ i +"].TransitRouterDescription"));

			transitRouters.add(transitRouter);
		}
		listTransitRoutersResponse.setTransitRouters(transitRouters);
	 
	 	return listTransitRoutersResponse;
	}
}