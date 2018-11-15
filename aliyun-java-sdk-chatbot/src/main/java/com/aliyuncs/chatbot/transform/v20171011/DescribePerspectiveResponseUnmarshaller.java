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

package com.aliyuncs.chatbot.transform.v20171011;

import com.aliyuncs.chatbot.model.v20171011.DescribePerspectiveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePerspectiveResponseUnmarshaller {

	public static DescribePerspectiveResponse unmarshall(DescribePerspectiveResponse describePerspectiveResponse, UnmarshallerContext context) {
		
		describePerspectiveResponse.setRequestId(context.stringValue("DescribePerspectiveResponse.RequestId"));
		describePerspectiveResponse.setModifyUserName(context.stringValue("DescribePerspectiveResponse.ModifyUserName"));
		describePerspectiveResponse.setModifyTime(context.stringValue("DescribePerspectiveResponse.ModifyTime"));
		describePerspectiveResponse.setCreateTime(context.stringValue("DescribePerspectiveResponse.CreateTime"));
		describePerspectiveResponse.setSelfDefine(context.booleanValue("DescribePerspectiveResponse.SelfDefine"));
		describePerspectiveResponse.setPerspectiveId(context.stringValue("DescribePerspectiveResponse.PerspectiveId"));
		describePerspectiveResponse.setCreateUserName(context.stringValue("DescribePerspectiveResponse.CreateUserName"));
		describePerspectiveResponse.setPerspectiveCode(context.stringValue("DescribePerspectiveResponse.PerspectiveCode"));
		describePerspectiveResponse.setStatus(context.integerValue("DescribePerspectiveResponse.Status"));
		describePerspectiveResponse.setName(context.stringValue("DescribePerspectiveResponse.Name"));
	 
	 	return describePerspectiveResponse;
	}
}