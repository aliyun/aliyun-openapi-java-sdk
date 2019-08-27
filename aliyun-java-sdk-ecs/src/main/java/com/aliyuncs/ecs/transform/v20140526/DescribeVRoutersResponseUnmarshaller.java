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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse.VRouter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVRoutersResponseUnmarshaller {

	public static DescribeVRoutersResponse unmarshall(DescribeVRoutersResponse describeVRoutersResponse, UnmarshallerContext _ctx) {
		
		describeVRoutersResponse.setRequestId(_ctx.stringValue("DescribeVRoutersResponse.RequestId"));
		describeVRoutersResponse.setTotalCount(_ctx.integerValue("DescribeVRoutersResponse.TotalCount"));
		describeVRoutersResponse.setPageNumber(_ctx.integerValue("DescribeVRoutersResponse.PageNumber"));
		describeVRoutersResponse.setPageSize(_ctx.integerValue("DescribeVRoutersResponse.PageSize"));

		List<VRouter> vRouters = new ArrayList<VRouter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVRoutersResponse.VRouters.Length"); i++) {
			VRouter vRouter = new VRouter();
			vRouter.setRegionId(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].RegionId"));
			vRouter.setVpcId(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VpcId"));
			vRouter.setVRouterName(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VRouterName"));
			vRouter.setDescription(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].Description"));
			vRouter.setVRouterId(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VRouterId"));
			vRouter.setCreationTime(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].CreationTime"));

			List<String> routeTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVRoutersResponse.VRouters["+ i +"].RouteTableIds.Length"); j++) {
				routeTableIds.add(_ctx.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].RouteTableIds["+ j +"]"));
			}
			vRouter.setRouteTableIds(routeTableIds);

			vRouters.add(vRouter);
		}
		describeVRoutersResponse.setVRouters(vRouters);
	 
	 	return describeVRoutersResponse;
	}
}