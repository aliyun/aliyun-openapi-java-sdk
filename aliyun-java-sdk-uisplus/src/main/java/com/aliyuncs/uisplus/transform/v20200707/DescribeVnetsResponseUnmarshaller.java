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

package com.aliyuncs.uisplus.transform.v20200707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uisplus.model.v20200707.DescribeVnetsResponse;
import com.aliyuncs.uisplus.model.v20200707.DescribeVnetsResponse.VnetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnetsResponseUnmarshaller {

	public static DescribeVnetsResponse unmarshall(DescribeVnetsResponse describeVnetsResponse, UnmarshallerContext _ctx) {
		
		describeVnetsResponse.setRequestId(_ctx.stringValue("DescribeVnetsResponse.RequestId"));
		describeVnetsResponse.setPageSize(_ctx.integerValue("DescribeVnetsResponse.PageSize"));
		describeVnetsResponse.setPageNumber(_ctx.integerValue("DescribeVnetsResponse.PageNumber"));
		describeVnetsResponse.setTotalCount(_ctx.integerValue("DescribeVnetsResponse.TotalCount"));

		List<VnetsItem> vnets = new ArrayList<VnetsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVnetsResponse.Vnets.Length"); i++) {
			VnetsItem vnetsItem = new VnetsItem();
			vnetsItem.setUisId(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].UisId"));
			vnetsItem.setKppsQuota(_ctx.integerValue("DescribeVnetsResponse.Vnets["+ i +"].KppsQuota"));
			vnetsItem.setWildcardDomainState(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].WildcardDomainState"));
			vnetsItem.setCidrs(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].Cidrs"));
			vnetsItem.setState(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].State"));
			vnetsItem.setFlowQuota(_ctx.integerValue("DescribeVnetsResponse.Vnets["+ i +"].FlowQuota"));
			vnetsItem.setMbpsQuota(_ctx.integerValue("DescribeVnetsResponse.Vnets["+ i +"].MbpsQuota"));
			vnetsItem.setVnetId(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].VnetId"));
			vnetsItem.setName(_ctx.stringValue("DescribeVnetsResponse.Vnets["+ i +"].Name"));

			vnets.add(vnetsItem);
		}
		describeVnetsResponse.setVnets(vnets);
	 
	 	return describeVnetsResponse;
	}
}