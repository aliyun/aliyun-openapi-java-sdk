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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.GrantPromotionToUserResponse;
import com.aliyuncs.linkedmall.model.v20180116.GrantPromotionToUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrantPromotionToUserResponseUnmarshaller {

	public static GrantPromotionToUserResponse unmarshall(GrantPromotionToUserResponse grantPromotionToUserResponse, UnmarshallerContext _ctx) {
		
		grantPromotionToUserResponse.setRequestId(_ctx.stringValue("GrantPromotionToUserResponse.RequestId"));
		grantPromotionToUserResponse.setCode(_ctx.stringValue("GrantPromotionToUserResponse.Code"));
		grantPromotionToUserResponse.setMessage(_ctx.stringValue("GrantPromotionToUserResponse.Message"));

		Model model = new Model();
		model.setPromotionInstanceId(_ctx.stringValue("GrantPromotionToUserResponse.Model.PromotionInstanceId"));
		model.setEffectiveStartTime(_ctx.longValue("GrantPromotionToUserResponse.Model.EffectiveStartTime"));
		model.setEffectiveEndTime(_ctx.longValue("GrantPromotionToUserResponse.Model.EffectiveEndTime"));
		model.setSubBizCode(_ctx.stringValue("GrantPromotionToUserResponse.Model.SubBizCode"));
		model.setSuccess(_ctx.booleanValue("GrantPromotionToUserResponse.Model.Success"));
		grantPromotionToUserResponse.setModel(model);
	 
	 	return grantPromotionToUserResponse;
	}
}