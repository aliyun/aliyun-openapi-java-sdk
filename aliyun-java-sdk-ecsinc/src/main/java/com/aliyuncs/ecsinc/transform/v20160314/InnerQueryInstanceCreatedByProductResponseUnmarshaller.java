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

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryInstanceCreatedByProductResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryInstanceCreatedByProductResponse.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryInstanceCreatedByProductResponseUnmarshaller {

	public static InnerQueryInstanceCreatedByProductResponse unmarshall(InnerQueryInstanceCreatedByProductResponse innerQueryInstanceCreatedByProductResponse, UnmarshallerContext context) {
		
		innerQueryInstanceCreatedByProductResponse.setRequestId(context.stringValue("InnerQueryInstanceCreatedByProductResponse.RequestId"));
		innerQueryInstanceCreatedByProductResponse.setTotalCount(context.integerValue("InnerQueryInstanceCreatedByProductResponse.TotalCount"));
		innerQueryInstanceCreatedByProductResponse.setPageNumber(context.integerValue("InnerQueryInstanceCreatedByProductResponse.PageNumber"));
		innerQueryInstanceCreatedByProductResponse.setPageSize(context.integerValue("InnerQueryInstanceCreatedByProductResponse.PageSize"));

		List<InstanceInfo> instanceInfos = new ArrayList<InstanceInfo>();
		for (int i = 0; i < context.lengthValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setAliUid(context.longValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].AliUid"));
			instanceInfo.setInstanceId(context.stringValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].InstanceId"));
			instanceInfo.setStatus(context.stringValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].Status"));
			instanceInfo.setPrivateIpAddress(context.stringValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].PrivateIpAddress"));
			instanceInfo.setPublicIpAddress(context.stringValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].PublicIpAddress"));
			instanceInfo.setInstanceType(context.stringValue("InnerQueryInstanceCreatedByProductResponse.InstanceInfos["+ i +"].InstanceType"));

			instanceInfos.add(instanceInfo);
		}
		innerQueryInstanceCreatedByProductResponse.setInstanceInfos(instanceInfos);
	 
	 	return innerQueryInstanceCreatedByProductResponse;
	}
}