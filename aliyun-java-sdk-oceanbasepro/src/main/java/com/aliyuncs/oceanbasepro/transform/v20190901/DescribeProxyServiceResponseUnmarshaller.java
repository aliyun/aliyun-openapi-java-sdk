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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProxyServiceResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProxyServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProxyServiceResponseUnmarshaller {

	public static DescribeProxyServiceResponse unmarshall(DescribeProxyServiceResponse describeProxyServiceResponse, UnmarshallerContext _ctx) {
		
		describeProxyServiceResponse.setRequestId(_ctx.stringValue("DescribeProxyServiceResponse.RequestId"));

		Data data = new Data();
		data.setProxyClusterId(_ctx.stringValue("DescribeProxyServiceResponse.Data.ProxyClusterId"));
		data.setProxyMode(_ctx.stringValue("DescribeProxyServiceResponse.Data.ProxyMode"));
		data.setZone(_ctx.stringValue("DescribeProxyServiceResponse.Data.Zone"));
		data.setUnitSpec(_ctx.stringValue("DescribeProxyServiceResponse.Data.UnitSpec"));
		data.setUnitNum(_ctx.longValue("DescribeProxyServiceResponse.Data.UnitNum"));
		data.setCurrentEndpointNum(_ctx.longValue("DescribeProxyServiceResponse.Data.CurrentEndpointNum"));
		data.setEndpointNumQuota(_ctx.longValue("DescribeProxyServiceResponse.Data.EndpointNumQuota"));
		data.setCreateTime(_ctx.stringValue("DescribeProxyServiceResponse.Data.CreateTime"));
		data.setStatus(_ctx.stringValue("DescribeProxyServiceResponse.Data.Status"));
		data.setProxyServiceVersion(_ctx.stringValue("DescribeProxyServiceResponse.Data.ProxyServiceVersion"));
		data.setExpireTime(_ctx.stringValue("DescribeProxyServiceResponse.Data.ExpireTime"));
		data.setUnitNumLimit(_ctx.longValue("DescribeProxyServiceResponse.Data.UnitNumLimit"));
		data.setProxyVersion(_ctx.stringValue("DescribeProxyServiceResponse.Data.ProxyVersion"));
		data.setDeployMode(_ctx.stringValue("DescribeProxyServiceResponse.Data.DeployMode"));
		data.setServerNumLimit(_ctx.longValue("DescribeProxyServiceResponse.Data.ServerNumLimit"));
		data.setAllowModifyServerNum(_ctx.booleanValue("DescribeProxyServiceResponse.Data.AllowModifyServerNum"));
		data.setSharedUnitNumLimit(_ctx.longValue("DescribeProxyServiceResponse.Data.SharedUnitNumLimit"));
		data.setExclusiveUnitNumLimit(_ctx.longValue("DescribeProxyServiceResponse.Data.ExclusiveUnitNumLimit"));
		describeProxyServiceResponse.setData(data);
	 
	 	return describeProxyServiceResponse;
	}
}