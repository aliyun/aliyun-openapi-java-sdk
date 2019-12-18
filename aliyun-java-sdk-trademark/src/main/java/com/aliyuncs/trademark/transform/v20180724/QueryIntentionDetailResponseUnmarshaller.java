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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.QueryIntentionDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIntentionDetailResponseUnmarshaller {

	public static QueryIntentionDetailResponse unmarshall(QueryIntentionDetailResponse queryIntentionDetailResponse, UnmarshallerContext _ctx) {
		
		queryIntentionDetailResponse.setRequestId(_ctx.stringValue("QueryIntentionDetailResponse.RequestId"));
		queryIntentionDetailResponse.setUserId(_ctx.stringValue("QueryIntentionDetailResponse.UserId"));
		queryIntentionDetailResponse.setRegisterNumber(_ctx.stringValue("QueryIntentionDetailResponse.RegisterNumber"));
		queryIntentionDetailResponse.setClassification(_ctx.stringValue("QueryIntentionDetailResponse.Classification"));
		queryIntentionDetailResponse.setType(_ctx.integerValue("QueryIntentionDetailResponse.Type"));
		queryIntentionDetailResponse.setBizId(_ctx.stringValue("QueryIntentionDetailResponse.BizId"));
		queryIntentionDetailResponse.setDescription(_ctx.stringValue("QueryIntentionDetailResponse.Description"));
		queryIntentionDetailResponse.setStatus(_ctx.integerValue("QueryIntentionDetailResponse.Status"));
		queryIntentionDetailResponse.setUpdateTime(_ctx.longValue("QueryIntentionDetailResponse.UpdateTime"));
		queryIntentionDetailResponse.setCreateTime(_ctx.longValue("QueryIntentionDetailResponse.CreateTime"));
		queryIntentionDetailResponse.setMobile(_ctx.stringValue("QueryIntentionDetailResponse.Mobile"));
		queryIntentionDetailResponse.setUserName(_ctx.stringValue("QueryIntentionDetailResponse.UserName"));
		queryIntentionDetailResponse.setRelationBizId(_ctx.stringValue("QueryIntentionDetailResponse.RelationBizId"));
		queryIntentionDetailResponse.setPartnerMobile(_ctx.stringValue("QueryIntentionDetailResponse.PartnerMobile"));
	 
	 	return queryIntentionDetailResponse;
	}
}