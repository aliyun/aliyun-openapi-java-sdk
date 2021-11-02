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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.QueryPromotionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPromotionResponseUnmarshaller {

	public static QueryPromotionResponse unmarshall(QueryPromotionResponse queryPromotionResponse, UnmarshallerContext _ctx) {
		
		queryPromotionResponse.setRequestId(_ctx.stringValue("QueryPromotionResponse.RequestId"));
		queryPromotionResponse.setStatus(_ctx.booleanValue("QueryPromotionResponse.Status"));
		queryPromotionResponse.setMsg(_ctx.stringValue("QueryPromotionResponse.Msg"));
		queryPromotionResponse.setErrorCode(_ctx.stringValue("QueryPromotionResponse.ErrorCode"));
		queryPromotionResponse.setUrl(_ctx.stringValue("QueryPromotionResponse.Url"));
		queryPromotionResponse.setUnionAmount(_ctx.stringValue("QueryPromotionResponse.UnionAmount"));
	 
	 	return queryPromotionResponse;
	}
}