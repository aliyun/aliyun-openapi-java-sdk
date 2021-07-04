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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.DetailDigitalTemplateResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.DetailDigitalTemplateResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetailDigitalTemplateResponseUnmarshaller {

	public static DetailDigitalTemplateResponse unmarshall(DetailDigitalTemplateResponse detailDigitalTemplateResponse, UnmarshallerContext _ctx) {
		
		detailDigitalTemplateResponse.setRequestId(_ctx.stringValue("DetailDigitalTemplateResponse.RequestId"));
		detailDigitalTemplateResponse.setErrorCode(_ctx.stringValue("DetailDigitalTemplateResponse.ErrorCode"));
		detailDigitalTemplateResponse.setErrorDesc(_ctx.stringValue("DetailDigitalTemplateResponse.ErrorDesc"));
		detailDigitalTemplateResponse.setSuccess(_ctx.booleanValue("DetailDigitalTemplateResponse.Success"));
		detailDigitalTemplateResponse.setTraceId(_ctx.stringValue("DetailDigitalTemplateResponse.TraceId"));

		Data data = new Data();
		data.setId(_ctx.stringValue("DetailDigitalTemplateResponse.Data.Id"));
		data.setTemplateName(_ctx.stringValue("DetailDigitalTemplateResponse.Data.TemplateName"));
		data.setTemplateTheme(_ctx.stringValue("DetailDigitalTemplateResponse.Data.TemplateTheme"));
		data.setSmsTemplateCode(_ctx.stringValue("DetailDigitalTemplateResponse.Data.SmsTemplateCode"));
		data.setTemplateStatus(_ctx.longValue("DetailDigitalTemplateResponse.Data.TemplateStatus"));
		data.setPlatformName(_ctx.stringValue("DetailDigitalTemplateResponse.Data.PlatformName"));
		data.setPlatformId(_ctx.stringValue("DetailDigitalTemplateResponse.Data.PlatformId"));
		data.setReason(_ctx.stringValue("DetailDigitalTemplateResponse.Data.Reason"));
		data.setSupportProvider(_ctx.stringValue("DetailDigitalTemplateResponse.Data.SupportProvider"));
		data.setSign(_ctx.stringValue("DetailDigitalTemplateResponse.Data.Sign"));

		List<DigitalSmsMaterialModelsItem> digitalSmsMaterialModels = new ArrayList<DigitalSmsMaterialModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels.Length"); i++) {
			DigitalSmsMaterialModelsItem digitalSmsMaterialModelsItem = new DigitalSmsMaterialModelsItem();
			digitalSmsMaterialModelsItem.setMaterialIndex(_ctx.longValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels["+ i +"].MaterialIndex"));
			digitalSmsMaterialModelsItem.setSize(_ctx.longValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels["+ i +"].Size"));
			digitalSmsMaterialModelsItem.setSuffix(_ctx.stringValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels["+ i +"].Suffix"));
			digitalSmsMaterialModelsItem.setType(_ctx.longValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels["+ i +"].Type"));
			digitalSmsMaterialModelsItem.setContent(_ctx.stringValue("DetailDigitalTemplateResponse.Data.DigitalSmsMaterialModels["+ i +"].Content"));

			digitalSmsMaterialModels.add(digitalSmsMaterialModelsItem);
		}
		data.setDigitalSmsMaterialModels(digitalSmsMaterialModels);
		detailDigitalTemplateResponse.setData(data);
	 
	 	return detailDigitalTemplateResponse;
	}
}