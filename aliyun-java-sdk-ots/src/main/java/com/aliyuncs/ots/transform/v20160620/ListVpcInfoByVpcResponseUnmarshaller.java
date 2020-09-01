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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.ListVpcInfoByVpcResponse;
import com.aliyuncs.ots.model.v20160620.ListVpcInfoByVpcResponse.VpcInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcInfoByVpcResponseUnmarshaller {

	public static ListVpcInfoByVpcResponse unmarshall(ListVpcInfoByVpcResponse listVpcInfoByVpcResponse, UnmarshallerContext _ctx) {
		
		listVpcInfoByVpcResponse.setRequestId(_ctx.stringValue("ListVpcInfoByVpcResponse.RequestId"));
		listVpcInfoByVpcResponse.setTotalCount(_ctx.longValue("ListVpcInfoByVpcResponse.TotalCount"));
		listVpcInfoByVpcResponse.setPageNum(_ctx.longValue("ListVpcInfoByVpcResponse.PageNum"));
		listVpcInfoByVpcResponse.setPageSize(_ctx.longValue("ListVpcInfoByVpcResponse.PageSize"));
		listVpcInfoByVpcResponse.setVpcId(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcId"));

		List<VpcInfo> vpcInfos = new ArrayList<VpcInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcInfoByVpcResponse.VpcInfos.Length"); i++) {
			VpcInfo vpcInfo = new VpcInfo();
			vpcInfo.setInstanceName(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcInfos["+ i +"].InstanceName"));
			vpcInfo.setInstanceVpcName(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcInfos["+ i +"].InstanceVpcName"));
			vpcInfo.setEndpoint(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcInfos["+ i +"].Endpoint"));
			vpcInfo.setDomain(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcInfos["+ i +"].Domain"));
			vpcInfo.setRegionNo(_ctx.stringValue("ListVpcInfoByVpcResponse.VpcInfos["+ i +"].RegionNo"));

			vpcInfos.add(vpcInfo);
		}
		listVpcInfoByVpcResponse.setVpcInfos(vpcInfos);
	 
	 	return listVpcInfoByVpcResponse;
	}
}