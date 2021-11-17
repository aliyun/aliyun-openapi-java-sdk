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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryAvailableSellPointTemplateDemosResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryAvailableSellPointTemplateDemosResponse.SellPointTemplateDemoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvailableSellPointTemplateDemosResponseUnmarshaller {

	public static QueryAvailableSellPointTemplateDemosResponse unmarshall(QueryAvailableSellPointTemplateDemosResponse queryAvailableSellPointTemplateDemosResponse, UnmarshallerContext _ctx) {
		
		queryAvailableSellPointTemplateDemosResponse.setRequestId(_ctx.stringValue("QueryAvailableSellPointTemplateDemosResponse.RequestId"));
		queryAvailableSellPointTemplateDemosResponse.setErrorMessage(_ctx.stringValue("QueryAvailableSellPointTemplateDemosResponse.ErrorMessage"));
		queryAvailableSellPointTemplateDemosResponse.setSuccess(_ctx.booleanValue("QueryAvailableSellPointTemplateDemosResponse.Success"));
		queryAvailableSellPointTemplateDemosResponse.setErrorCode(_ctx.stringValue("QueryAvailableSellPointTemplateDemosResponse.ErrorCode"));

		List<SellPointTemplateDemoDTO> data = new ArrayList<SellPointTemplateDemoDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvailableSellPointTemplateDemosResponse.Data.Length"); i++) {
			SellPointTemplateDemoDTO sellPointTemplateDemoDTO = new SellPointTemplateDemoDTO();
			sellPointTemplateDemoDTO.setDemoUrl(_ctx.stringValue("QueryAvailableSellPointTemplateDemosResponse.Data["+ i +"].DemoUrl"));
			sellPointTemplateDemoDTO.setTemplateUuid(_ctx.stringValue("QueryAvailableSellPointTemplateDemosResponse.Data["+ i +"].TemplateUuid"));

			data.add(sellPointTemplateDemoDTO);
		}
		queryAvailableSellPointTemplateDemosResponse.setData(data);
	 
	 	return queryAvailableSellPointTemplateDemosResponse;
	}
}