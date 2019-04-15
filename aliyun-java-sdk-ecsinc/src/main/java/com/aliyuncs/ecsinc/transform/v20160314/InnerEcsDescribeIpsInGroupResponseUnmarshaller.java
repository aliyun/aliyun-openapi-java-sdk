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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsDescribeIpsInGroupResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsDescribeIpsInGroupResponse.Ip;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsDescribeIpsInGroupResponseUnmarshaller {

	public static InnerEcsDescribeIpsInGroupResponse unmarshall(InnerEcsDescribeIpsInGroupResponse innerEcsDescribeIpsInGroupResponse, UnmarshallerContext context) {
		
		innerEcsDescribeIpsInGroupResponse.setRequestId(context.stringValue("InnerEcsDescribeIpsInGroupResponse.RequestId"));
		innerEcsDescribeIpsInGroupResponse.setCount(context.integerValue("InnerEcsDescribeIpsInGroupResponse.Count"));
		innerEcsDescribeIpsInGroupResponse.setAliUid(context.longValue("InnerEcsDescribeIpsInGroupResponse.AliUid"));
		innerEcsDescribeIpsInGroupResponse.setGroupId(context.stringValue("InnerEcsDescribeIpsInGroupResponse.GroupId"));
		innerEcsDescribeIpsInGroupResponse.setPageNo(context.integerValue("InnerEcsDescribeIpsInGroupResponse.PageNo"));
		innerEcsDescribeIpsInGroupResponse.setPageSize(context.integerValue("InnerEcsDescribeIpsInGroupResponse.PageSize"));
		innerEcsDescribeIpsInGroupResponse.setNetworkType(context.stringValue("InnerEcsDescribeIpsInGroupResponse.NetworkType"));

		List<Ip> ips = new ArrayList<Ip>();
		for (int i = 0; i < context.lengthValue("InnerEcsDescribeIpsInGroupResponse.Ips.Length"); i++) {
			Ip ip = new Ip();
			ip.setInstanceId(context.stringValue("InnerEcsDescribeIpsInGroupResponse.Ips["+ i +"].InstanceId"));

			List<String> privateIps = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsDescribeIpsInGroupResponse.Ips["+ i +"].PrivateIps.Length"); j++) {
				privateIps.add(context.stringValue("InnerEcsDescribeIpsInGroupResponse.Ips["+ i +"].PrivateIps["+ j +"]"));
			}
			ip.setPrivateIps(privateIps);

			List<String> publicIps = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsDescribeIpsInGroupResponse.Ips["+ i +"].PublicIps.Length"); j++) {
				publicIps.add(context.stringValue("InnerEcsDescribeIpsInGroupResponse.Ips["+ i +"].PublicIps["+ j +"]"));
			}
			ip.setPublicIps(publicIps);

			ips.add(ip);
		}
		innerEcsDescribeIpsInGroupResponse.setIps(ips);
	 
	 	return innerEcsDescribeIpsInGroupResponse;
	}
}