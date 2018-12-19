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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListVpcResponse;
import com.aliyuncs.edas.model.v20170801.ListVpcResponse.VpcEntity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcResponseUnmarshaller {

	public static ListVpcResponse unmarshall(ListVpcResponse listVpcResponse, UnmarshallerContext context) {
		
		listVpcResponse.setRequestId(context.stringValue("ListVpcResponse.RequestId"));
		listVpcResponse.setCode(context.integerValue("ListVpcResponse.Code"));
		listVpcResponse.setMessage(context.stringValue("ListVpcResponse.Message"));

		List<VpcEntity> vpcList = new ArrayList<VpcEntity>();
		for (int i = 0; i < context.lengthValue("ListVpcResponse.VpcList.Length"); i++) {
			VpcEntity vpcEntity = new VpcEntity();
			vpcEntity.setVpcId(context.stringValue("ListVpcResponse.VpcList["+ i +"].VpcId"));
			vpcEntity.setVpcName(context.stringValue("ListVpcResponse.VpcList["+ i +"].VpcName"));
			vpcEntity.setRegionId(context.stringValue("ListVpcResponse.VpcList["+ i +"].RegionId"));
			vpcEntity.setUserId(context.stringValue("ListVpcResponse.VpcList["+ i +"].UserId"));
			vpcEntity.setExpired(context.booleanValue("ListVpcResponse.VpcList["+ i +"].Expired"));
			vpcEntity.setEcsNum(context.integerValue("ListVpcResponse.VpcList["+ i +"].EcsNum"));

			vpcList.add(vpcEntity);
		}
		listVpcResponse.setVpcList(vpcList);
	 
	 	return listVpcResponse;
	}
}