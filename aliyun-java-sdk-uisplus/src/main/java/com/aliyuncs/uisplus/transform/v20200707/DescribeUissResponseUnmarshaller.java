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

import com.aliyuncs.uisplus.model.v20200707.DescribeUissResponse;
import com.aliyuncs.uisplus.model.v20200707.DescribeUissResponse.UissItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUissResponseUnmarshaller {

	public static DescribeUissResponse unmarshall(DescribeUissResponse describeUissResponse, UnmarshallerContext _ctx) {
		
		describeUissResponse.setRequestId(_ctx.stringValue("DescribeUissResponse.RequestId"));
		describeUissResponse.setPageSize(_ctx.longValue("DescribeUissResponse.PageSize"));
		describeUissResponse.setPage(_ctx.longValue("DescribeUissResponse.Page"));

		List<UissItem> uiss = new ArrayList<UissItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUissResponse.Uiss.Length"); i++) {
			UissItem uissItem = new UissItem();
			uissItem.setUisId(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].UisId"));
			uissItem.setNetworkMode(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].NetworkMode"));
			uissItem.setWildcardDomainState(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].WildcardDomainState"));
			uissItem.setDescription(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].Description"));
			uissItem.setSpec(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].Spec"));
			uissItem.setState(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].State"));
			uissItem.setCreateTime(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].CreateTime"));
			uissItem.setResourceGroupId(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].ResourceGroupId"));
			uissItem.setUisName(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].UisName"));
			uissItem.setRegionId(_ctx.stringValue("DescribeUissResponse.Uiss["+ i +"].RegionId"));
			uissItem.setMbpsQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].MbpsQuota"));
			uissItem.setKppsQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].KppsQuota"));
			uissItem.setFlowQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].FlowQuota"));
			uissItem.setUsedMBpsQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].UsedMBpsQuota"));
			uissItem.setUsedKPpsQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].UsedKPpsQuota"));
			uissItem.setUsedFlowQuota(_ctx.longValue("DescribeUissResponse.Uiss["+ i +"].UsedFlowQuota"));

			uiss.add(uissItem);
		}
		describeUissResponse.setUiss(uiss);
	 
	 	return describeUissResponse;
	}
}