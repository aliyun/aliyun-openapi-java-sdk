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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryUserSellPointTemplateResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryUserSellPointTemplateResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserSellPointTemplateResponseUnmarshaller {

	public static QueryUserSellPointTemplateResponse unmarshall(QueryUserSellPointTemplateResponse queryUserSellPointTemplateResponse, UnmarshallerContext _ctx) {
		
		queryUserSellPointTemplateResponse.setRequestId(_ctx.stringValue("QueryUserSellPointTemplateResponse.RequestId"));
		queryUserSellPointTemplateResponse.setErrorMessage(_ctx.stringValue("QueryUserSellPointTemplateResponse.ErrorMessage"));
		queryUserSellPointTemplateResponse.setSuccess(_ctx.booleanValue("QueryUserSellPointTemplateResponse.Success"));
		queryUserSellPointTemplateResponse.setErrorCode(_ctx.stringValue("QueryUserSellPointTemplateResponse.ErrorCode"));

		Data data = new Data();
		data.setTemplateUuid(_ctx.stringValue("QueryUserSellPointTemplateResponse.Data.TemplateUuid"));
		data.setDisplayConfig(_ctx.mapValue("QueryUserSellPointTemplateResponse.Data.DisplayConfig"));
		data.setDemoUrl(_ctx.stringValue("QueryUserSellPointTemplateResponse.Data.DemoUrl"));
		queryUserSellPointTemplateResponse.setData(data);
	 
	 	return queryUserSellPointTemplateResponse;
	}
}