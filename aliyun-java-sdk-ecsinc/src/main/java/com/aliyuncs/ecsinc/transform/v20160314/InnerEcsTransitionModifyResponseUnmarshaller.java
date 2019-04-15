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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsTransitionModifyResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsTransitionModifyResponse.EcsTransitionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsTransitionModifyResponseUnmarshaller {

	public static InnerEcsTransitionModifyResponse unmarshall(InnerEcsTransitionModifyResponse innerEcsTransitionModifyResponse, UnmarshallerContext context) {
		
		innerEcsTransitionModifyResponse.setRequestId(context.stringValue("InnerEcsTransitionModifyResponse.RequestId"));

		List<EcsTransitionModel> ecsTransitionModels = new ArrayList<EcsTransitionModel>();
		for (int i = 0; i < context.lengthValue("InnerEcsTransitionModifyResponse.EcsTransitionModels.Length"); i++) {
			EcsTransitionModel ecsTransitionModel = new EcsTransitionModel();
			ecsTransitionModel.setInstanceId(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].InstanceId"));
			ecsTransitionModel.setResourceType(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].ResourceType"));
			ecsTransitionModel.setRegionId(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].RegionId"));
			ecsTransitionModel.setTransitionTime(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].TransitionTime"));
			ecsTransitionModel.setIntranetIpAfterTransition(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].IntranetIpAfterTransition"));
			ecsTransitionModel.setInternetIpAfterTransition(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].InternetIpAfterTransition"));
			ecsTransitionModel.setIsSuccess(context.booleanValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].IsSuccess"));
			ecsTransitionModel.setCode(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].Code"));
			ecsTransitionModel.setMessage(context.stringValue("InnerEcsTransitionModifyResponse.EcsTransitionModels["+ i +"].Message"));

			ecsTransitionModels.add(ecsTransitionModel);
		}
		innerEcsTransitionModifyResponse.setEcsTransitionModels(ecsTransitionModels);
	 
	 	return innerEcsTransitionModifyResponse;
	}
}