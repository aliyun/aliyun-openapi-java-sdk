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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeDBNodeDirectVipInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeDBNodeDirectVipInfoResponse.VipInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBNodeDirectVipInfoResponseUnmarshaller {

	public static DescribeDBNodeDirectVipInfoResponse unmarshall(DescribeDBNodeDirectVipInfoResponse describeDBNodeDirectVipInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBNodeDirectVipInfoResponse.setRequestId(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.RequestId"));
		describeDBNodeDirectVipInfoResponse.setInstanceId(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.InstanceId"));

		List<VipInfo> directVipInfo = new ArrayList<VipInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBNodeDirectVipInfoResponse.DirectVipInfo.Length"); i++) {
			VipInfo vipInfo = new VipInfo();
			vipInfo.setNodeId(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.DirectVipInfo["+ i +"].NodeId"));
			vipInfo.setVip(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.DirectVipInfo["+ i +"].Vip"));
			vipInfo.setPort(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.DirectVipInfo["+ i +"].Port"));
			vipInfo.setNetType(_ctx.stringValue("DescribeDBNodeDirectVipInfoResponse.DirectVipInfo["+ i +"].NetType"));

			directVipInfo.add(vipInfo);
		}
		describeDBNodeDirectVipInfoResponse.setDirectVipInfo(directVipInfo);
	 
	 	return describeDBNodeDirectVipInfoResponse;
	}
}