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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsTransitionQueryResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsTransitionQueryResponse.EcsTransitionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsTransitionQueryResponseUnmarshaller {

	public static InnerEcsTransitionQueryResponse unmarshall(InnerEcsTransitionQueryResponse innerEcsTransitionQueryResponse, UnmarshallerContext context) {
		
		innerEcsTransitionQueryResponse.setRequestId(context.stringValue("InnerEcsTransitionQueryResponse.RequestId"));
		innerEcsTransitionQueryResponse.setCount(context.integerValue("InnerEcsTransitionQueryResponse.Count"));
		innerEcsTransitionQueryResponse.setPageNo(context.integerValue("InnerEcsTransitionQueryResponse.PageNo"));
		innerEcsTransitionQueryResponse.setPageSize(context.integerValue("InnerEcsTransitionQueryResponse.PageSize"));

		List<EcsTransitionModel> ecsTransitionModels = new ArrayList<EcsTransitionModel>();
		for (int i = 0; i < context.lengthValue("InnerEcsTransitionQueryResponse.EcsTransitionModels.Length"); i++) {
			EcsTransitionModel ecsTransitionModel = new EcsTransitionModel();
			ecsTransitionModel.setInstanceId(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].InstanceId"));
			ecsTransitionModel.setIntranetIp(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].IntranetIp"));
			ecsTransitionModel.setInternetIp(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].InternetIp"));
			ecsTransitionModel.setStatus(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].Status"));
			ecsTransitionModel.setExpireTime(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].ExpireTime"));
			ecsTransitionModel.setResourceType(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].ResourceType"));
			ecsTransitionModel.setTransitionTime(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].TransitionTime"));
			ecsTransitionModel.setRegionId(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].RegionId"));
			ecsTransitionModel.setTransitionType(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].TransitionType"));
			ecsTransitionModel.setVmStatus(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].VmStatus"));
			ecsTransitionModel.setName(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].name"));
			ecsTransitionModel.setBusinessStatus(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].BusinessStatus"));
			ecsTransitionModel.setTargetIz(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].TargetIz"));
			ecsTransitionModel.setIntranetIpAfterTransition(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].IntranetIpAfterTransition"));
			ecsTransitionModel.setInternetIpAfterTransition(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].InternetIpAfterTransition"));
			ecsTransitionModel.setMergeProgress(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].MergeProgress"));
			ecsTransitionModel.setLoadProgress(context.stringValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].LoadProgress"));
			ecsTransitionModel.setIsSendVoucher(context.booleanValue("InnerEcsTransitionQueryResponse.EcsTransitionModels["+ i +"].IsSendVoucher"));

			ecsTransitionModels.add(ecsTransitionModel);
		}
		innerEcsTransitionQueryResponse.setEcsTransitionModels(ecsTransitionModels);
	 
	 	return innerEcsTransitionQueryResponse;
	}
}