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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestUserSellPointTemplateResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestUserSellPointTemplateResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestUserSellPointTemplateResponseUnmarshaller {

	public static RequestUserSellPointTemplateResponse unmarshall(RequestUserSellPointTemplateResponse requestUserSellPointTemplateResponse, UnmarshallerContext _ctx) {
		
		requestUserSellPointTemplateResponse.setRequestId(_ctx.stringValue("RequestUserSellPointTemplateResponse.RequestId"));
		requestUserSellPointTemplateResponse.setErrorMessage(_ctx.stringValue("RequestUserSellPointTemplateResponse.ErrorMessage"));
		requestUserSellPointTemplateResponse.setSuccess(_ctx.booleanValue("RequestUserSellPointTemplateResponse.Success"));
		requestUserSellPointTemplateResponse.setErrorCode(_ctx.stringValue("RequestUserSellPointTemplateResponse.ErrorCode"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("RequestUserSellPointTemplateResponse.Data.Url"));
		data.setTemplateConfig(_ctx.mapValue("RequestUserSellPointTemplateResponse.Data.TemplateConfig"));
		data.setTemplateUuid(_ctx.stringValue("RequestUserSellPointTemplateResponse.Data.TemplateUuid"));
		data.setDisplayConfig(_ctx.mapValue("RequestUserSellPointTemplateResponse.Data.DisplayConfig"));
		requestUserSellPointTemplateResponse.setData(data);
	 
	 	return requestUserSellPointTemplateResponse;
	}
}